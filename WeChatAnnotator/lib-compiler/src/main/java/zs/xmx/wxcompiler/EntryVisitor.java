package zs.xmx.wxcompiler;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Modifier;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleAnnotationValueVisitor7;

/*
 * @创建者     默小铭
 * @博客       http://blog.csdn.net/u012792686
 * @本类描述	  EntryVisitor
 * @内容说明   用于取出被注解类/方法等,传入的值,然后生成想要的类
 *            这里生成WXEntryActivity类
 *
 */
public class EntryVisitor extends SimpleAnnotationValueVisitor7<Void, Void> {
    private final Filer  FILER;
    private       String mPackageName = null;

    EntryVisitor(Filer FILER) {
        this.FILER = FILER;
    }

    @Override
    public Void visitString(String s, Void p) {
        mPackageName = s;
        return p;
    }

    //注解传过来的TypeMirror(类..)
    @Override
    public Void visitType(TypeMirror t, Void p) {
        generateJavaCode(t);
        return p;
    }

    /**
     * 生成微信模版代码
     *
     */
    private void generateJavaCode(TypeMirror typeMirror) {
        //生成WXEntryActivity类
        final TypeSpec targetActivity =
                TypeSpec.classBuilder("WXEntryActivity")
                        .addModifiers(Modifier.PUBLIC)
                        .addModifiers(Modifier.FINAL)
                        .superclass(TypeName.get(typeMirror))
                        .build();

        final JavaFile javaFile =
                //传过来的包名,微信指定的包名,微信指定的类名
                JavaFile.builder(mPackageName + ".wxapi", targetActivity)
                .addFileComment("微信入口文件")//添加注释
                .build();
        try {
            javaFile.writeTo(FILER);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
