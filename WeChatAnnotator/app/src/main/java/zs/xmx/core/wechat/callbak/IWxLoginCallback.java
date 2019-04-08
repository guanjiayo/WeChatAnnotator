package zs.xmx.core.wechat.callbak;

/*
 * @创建者     默小铭
 * @博客       http://blog.csdn.net/u012792686
 * @本类描述	  微信登录结果调回接口
 * @内容说明   为了方便登录页面统一处理登录成功的用户信息
 *
 */
public interface IWxLoginCallback {

    void onSignInSuccess(String userInfo);
}
