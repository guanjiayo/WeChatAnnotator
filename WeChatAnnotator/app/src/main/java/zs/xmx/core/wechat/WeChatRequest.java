package zs.xmx.core.wechat;

import android.app.Activity;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import zs.xmx.core.wechat.callbak.IWxLoginCallback;


/*
 * @创建者     默小铭
 * @博客       http://blog.csdn.net/u012792686
 * @本类描述	  微信SDK框架实现类
 * @内容说明  todo 这个类建议按自己项目业务实现,这里就不写了(重点不在这)
 *
 */
public class WeChatRequest {
    static final String APP_ID = "微信开放平台注册的AppID";
    static final String APP_SECRET = "微信开放平台注册的AppID";
    private final IWXAPI WXAPI;
    private IWxLoginCallback mSignInCallback = null;

    private static final class Holder {
        private static final WeChatRequest INSTANCE = new WeChatRequest();
    }

    public static WeChatRequest getInstance() {
        return Holder.INSTANCE;
    }

    private WeChatRequest() {
        //todo 这个参数自己传,这里就不写了
        // final Activity activity = ProjectInit.getConfiguration(ConfigKeys.ACTIVITY);
        Activity activity = new Activity();
        WXAPI = WXAPIFactory.createWXAPI(activity, APP_ID, true);
        WXAPI.registerApp(APP_ID);
    }

    final IWXAPI getWXAPI() {
        return WXAPI;
    }

    public WeChatRequest onSignSuccess(IWxLoginCallback callback) {
        this.mSignInCallback = callback;
        return this;
    }

    public IWxLoginCallback getSignInCallback() {
        return mSignInCallback;
    }

    public final void signIn() {
        final SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "random_state";
        WXAPI.sendReq(req);
    }

}
