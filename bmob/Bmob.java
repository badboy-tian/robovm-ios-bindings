package net.mwplay.bmob;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.GlobalValue;
import org.robovm.rt.bro.annotation.Library;

@Library(Library.INTERNAL)
@NativeClass
public class Bmob extends NSObject{
	/**
	 *  初始化成功的通知，注册该通知可以在初始化成功后执行需要的动作，最新版本的初始化过程已经修改成同步，因此该通过可以不作处理
	 */
	//extern NSString *const  kBmobInitSuccessNotification;
	@GlobalValue(symbol = "kBmobInitSuccessNotification", optional = true)
	public native static @ByVal String kBmobInitSuccessNotification();
	
	/**
	 *  初始化失败的通知
	 */
	//extern NSString *const  kBmobInitFailNotification;
	@GlobalValue(symbol = "kBmobInitFailNotification", optional = true)
	public native static @ByVal String kBmobInitFailNotification();
	
	/**
	 *	向Bmob注册应用
	 *
	 *	@param	appKey	在网站注册的appkey
	 */
	//+(void)registerWithAppKey:(NSString*)appKey;
	@Method(selector = "registerWithAppKey:")
	public native static void registerWithAppKey(String appKey);
	
	/**
	 *  得到服务器时间戳
	 *
	 *  @return 时间戳字符串 (到秒)
	 */
	//+(NSString*)getServerTimestamp;
	@Method(selector = "getServerTimestamp")
	public native static String getServerTimestamp();

	/**
	 *  在应用进入前台是调用
	 */
	//+(void)activateSDK;
	@Method(selector = "activateSDK")
	public native static void activateSDK();

}
