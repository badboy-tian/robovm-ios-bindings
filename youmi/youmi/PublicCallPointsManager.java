package net.mwplay.youmi;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.GlobalValue;
import org.robovm.rt.bro.annotation.Library;

@NativeClass
public class PublicCallPointsManager extends NSObject {
	//extern NSString *PublicCallKPointsManagerRecivedPointsNotification;
	
//	@GlobalValue(symbol = "PublicCallKPointsManagerRecivedPointsNotification", optional = true)
//	public static native @ByVal String PublicCallKPointsManagerRecivedPointsNotification();
//	// 使用下面这个 key 从 Notification userInfo 中获得积分 [适用于自动积分管理]
//	// 不要消耗从这个Key获取到的积分，如果使用自动积分管理请使用[PublicCallPointsManager spendPoints:]来消耗积分
//	//extern NSString *PublicCallKPointsManagerFreshPointsKey;
//	@GlobalValue(symbol = "PublicCallKPointsManagerFreshPointsKey", optional = true)
//	public static native @ByVal String PublicCallKPointsManagerFreshPointsKey();
//	
//	// 获得每一份积分的相关信息的列表 [适用于手动积分管理]
//	//extern NSString *PublicCallKPointsManagerPointInfosKey;
//	@GlobalValue(symbol = "PublicCallKPointsManagerPointInfosKey", optional = true)
//	public static native @ByVal String PublicCallKPointsManagerPointInfosKey();
//
//	// 获得获得积分的用户，对应[PublicCallConfig setUserID:]
//	//extern NSString *PublicCallKPointsManagerPointUserIDKey;
//	@GlobalValue(symbol = "PublicCallKPointsManagerPointUserIDKey", optional = true)
//	public static native @ByVal String PublicCallKPointsManagerPointUserIDKey();
//	
//	// 获得这一份积分的数量
//	//extern NSString *PublicCallKPointsManagerPointAmountKey;
//	@GlobalValue(symbol = "PublicCallKPointsManagerPointAmountKey", optional = true)
//	public static native @ByVal String PublicCallKPointsManagerPointAmountKey();
//
//	// 获得积分来源，比如下载安装了 WY新闻 则这份积分来自 WY新闻
//	//extern NSString *PublicCallKPointsManagerPointProductNameKey;
//	@GlobalValue(symbol = "PublicCallKPointsManagerPointProductNameKey", optional = true)
//	public static native @ByVal String PublicCallKPointsManagerPointProductNameKey();
	
	
	// ///////////// 自动积分管理 ///////////////

	// 开启自动积分管理
	// YouMiSDK从服务器接收到积分后会把积分存起来，开发者需要使用[PublicCallPointsManager
	// spendPoints:]来消耗积分，还有自动积分管理相关参数
	// + (void)PublicCallEnable;
	@Method(selector = "PublicCallEnable")
	public static native void PublicCallEnable();

	// [自动积分管理]使用积分, 积分不足时返回NO
	// + (BOOL)PublicCallDescreesePoints:(NSUInteger)PublicCallPoints;
	@Method(selector = "PublicCallDescreesePoints:")
	public static native boolean PublicCallDescreesePoints(
			long PublicCallPoints);

	// [自动积分管理]奖励积分, 不会发送 Notification, 如果整型越界则返回NO
	// + (BOOL)PublicCallAddPoints:(NSUInteger)PublicCallPoints;
	@Method(selector = "PublicCallAddPoints:")
	public static native boolean PublicCallAddPoints(long PublicCallPoints);

	// [自动积分管理]剩余积分
	// /调用了这个函数后记得free()一下返回值的指针
	// + (int *)PublicCallPointsRemained;
	@Method(selector = "PublicCallPointsRemained")
	public static native int PublicCallPointsRemained();

	// ///////////// 手动积分管理 ///////////////

	// 开启手动积分管理。
	// + (void)PublicCallEnableManually;
	@Method(selector = "PublicCallEnableManually")
	public static native void PublicCallEnableManually();

	// [手动查询积分]
	// 查询积分。使用手动查询积分依然需要监听PublicCallKPointsManagerRecivedPointsNotification，在这个nitification中拿积分
	// + (void)PublicCallCheckPoints;
	@Method(selector = "PublicCallCheckPoints")
	public static native void PublicCallCheckPoints();

	// 如果要手动查询积分，传YES。
	// 自动查询积分，传NO。
	// 不设置，默认是自动查询积分
	// + (void)PublicCallSetManualCheck:(BOOL)PublicCallManualCheck;
	@Method(selector = "PublicCallSetManualCheck:")
	public static native void PublicCallSetManualCheck(
			boolean PublicCallManualCheck);
}
