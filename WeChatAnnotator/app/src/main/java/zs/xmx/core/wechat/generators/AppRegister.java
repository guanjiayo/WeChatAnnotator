package zs.xmx.core.wechat.generators;


import zs.xmx.core.wechat.templete.AppRegisterTemplate;
import zs.xmx.wxannotations.AppRegisterGenerator;

/*
 * @创建者     默小铭
 * @博客       http://blog.csdn.net/u012792686
 * @本类描述	   AppRegister模版注解调用
 * @内容说明
 *
 */
@SuppressWarnings("unused")
@AppRegisterGenerator(
        packageName = "zs.xmx.marker",
        registerTemplate = AppRegisterTemplate.class
)
public interface AppRegister {
}
