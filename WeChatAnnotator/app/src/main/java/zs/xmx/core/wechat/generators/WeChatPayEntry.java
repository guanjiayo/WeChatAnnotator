package zs.xmx.core.wechat.generators;


import zs.xmx.core.wechat.templete.WXPayEntryTemplate;
import zs.xmx.wxannotations.PayEntryGenerator;

/*
 * @创建者     默小铭
 * @博客       http://blog.csdn.net/u012792686
 * @本类描述	   WXPayEntry模版注解调用
 * @内容说明
 *
 */
@SuppressWarnings("unused")
@PayEntryGenerator(
        packageName = "zs.xmx.marker",
        payEntryTemplate = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
}
