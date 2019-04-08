package zs.xmx.wxannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * @创建者     默小铭
 * @博客       http://blog.csdn.net/u012792686
 * @本类描述   WXEntryActivity注解
 * @内容说明   用于传入微信和微信模版代码(用于绕过微信包名认证)
 *            注意包名一定要和applicationID和App启动module的清单文件包名保持一致
 */
//声明方法使用在类上
@Target(ElementType.TYPE)
//声明这个注解在源码阶段进行处理
@Retention(RetentionPolicy.SOURCE)
public @interface EntryGenerator {
    String packageName();//包名(这里指代在微信平台注册的包名)
    Class<?> entryTemplate();//自定义的模版类
}
