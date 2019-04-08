package zs.xmx.core.wechat.generators;


import zs.xmx.core.wechat.templete.WXEntryTemplate;
import zs.xmx.wxannotations.EntryGenerator;

/*
 * @创建者     默小铭
 * @博客       http://blog.csdn.net/u012792686
 * @本类描述	   WXEntry模版注解调用
 * @内容说明
 *
 */
@SuppressWarnings("unused")
@EntryGenerator(
        packageName = "zs.xmx.marker",
        entryTemplate = WXEntryTemplate.class
)
public interface WeChatEntry {
}
