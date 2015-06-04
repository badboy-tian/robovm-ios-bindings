package net.mwplay.youmi;

import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.uikit.UIWindow;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class PublicCallConfig extends NSObject{

	// 应用ID
	//
	// 详解:
//	      前往有米主页:http://www.youmi.net/ 注册一个开发者帐户，同时注册一个应用，获取对应应用的ID与秘钥
	//
	//+ (void)PublicCallLaunchWithAppID:(NSString *)PublicCallAppid PublicCallAppSecret:(NSString *)PublicCallAecret;
	@Method(selector = "PublicCallLaunchWithAppID:PublicCallAppSecret:")
	public static native void PublicCallLaunchWithAppID(String PublicCallAppid, String PublicCallAecret);


	//对于在线参数的请求，我们采用的是同步请求的方式
	//设置在线参数请到http://www.youmi.net/ 网站上。广告设置->在线参数设置
	//+ (id)PublicCallOnlineValueForKey:(NSString *)PublicCallkey;
	@Method(selector = "PublicCallOnlineValueForKey:")
	public static native NSObject PublicCallOnlineValueForKey(String PublicCallkey);

	/*! 设置全屏广告显示在的window [建议设置]
	 *
	 *! 使用原生ObjectiveC代码的APP, 可以在[AppDelegate application:didFinishLaunchingWithOptions:]里[self.window makeKeyAndVisible];后设置[YouMiConfi setFullScreenWindow:self.window];
	 *
	 *! Unity3D的window代码比较隐藏得比较深，可以不设置
	 *
	 *! Cocos2d-x 可以在[AppController application:didFinishLaunchingWithOptions:]里[window makeKeyAndVisible];后设置[YouMiConfi setFullScreenWindow:window];
	 *
	 * \params window APP的主window，一般情况下每个APP有且只有一个window，在APP启动完成后生成，覆盖整个屏幕，所有视图都放在它里面.
	 */
	//+ (void)PublicCallSetFullScreenWindow:(UIWindow *)PublicCallWindow;
	@Method(selector = "PublicCallSetFullScreenWindow:")
	public static native void PublicCallSetFullScreenWindow(UIWindow PublicCallWindow);

	// 设置UserID
	//
	// 详解:
//	      可用于服务器对接获取积分
//	      详情请看：http://wiki.youmi.net/%E5%AF%B9%E5%BC%80%E5%8F%91%E8%80%85%E7%9A%84%E7%A7%AF%E5%88%86%E5%8F%8D%E9%A6%88%E6%8E%A5%E5%8F%A3
	//
	//+ (void)PublicCallSetUserID:(NSString *)PublicCallUserID;
	@Method(selector = "PublicCallSetUserID:")
	public static native void PublicCallSetUserID(String PublicCallUserID);
	//+ (NSString *)PublicCallUserID;
	@Method(selector = "PublicCallUserID")
	public static native String PublicCallUserID();

	// 请求模式
	//
	// 详解:
//	     默认->模拟器@YES 真机器@NO
	//
	// 备注:
//	     如果YES  Banner 将显示测试广告
	//
	//+ (void)PublicCallSetIsTesting:(BOOL)PublicCallkeyFlag;
	@Method(selector = "PublicCallSetIsTesting:")
	public static native void PublicCallSetIsTesting(boolean PublicCallkeyFlag);
	//+ (BOOL)PublicCallIsTesting;
	@Method(selector = "PublicCallIsTesting")
	public static native boolean PublicCallIsTesting();

	// 是否在iOS6设备上使用iOS6新特性 SKStoreProductViewController 来安装APP
	// Default:
//	      @YES
	// 详解:
//	      如果YES，则在APP没通过 appstore 发布之前没法从 SKStoreProductViewController 中下载安装APP.
//	      可以在测试期间设置为 NO, 上传到 appstore 前设置为 YES.
	//
	//+ (void)PublicCallSetUseInAppStore:(BOOL)PublicCallFlag;
	@Method(selector = "PublicCallSetUseInAppStore:")
	public static native void PublicCallSetUseInAppStore(boolean PublicCallFlag);
	//+ (BOOL)PublicCallUseInAppStore;
	@Method(selector = "PublicCallUseInAppStore")
	public static native boolean PublicCallUseInAppStore();
}
