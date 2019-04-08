package zs.xmx.core.wechat.templete;


import zs.xmx.core.wechat.BaseWXEntryActivity;
import zs.xmx.core.wechat.WeChatRequest;

/*
 * @创建者     默小铭
 * @博客       http://blog.csdn.net/u012792686
 * @本类描述	  WXEntryTemplate
 * @内容说明   WXEntry 模版类
 *
 *
 */
public class WXEntryTemplate extends BaseWXEntryActivity {

    @Override
    protected void onResume() {
        super.onResume();
        finish();
        overridePendingTransition(0, 0);
    }

    @Override
    protected void onSignInSuccess(String userInfo) {
        WeChatRequest.getInstance().getSignInCallback().onSignInSuccess(userInfo);
    }
}
