package net.mwplay.youmi;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class PublicCallList extends NSObject{
	/*! 启动有米积分墙
	 */
	//+ (void)PublicCallMyEnable;
	@Method(selector = "PublicCallMyEnable")
	public static native void PublicCallMyEnable();

	/*! 显示积分墙
	 * \param rewarded 是不是有积分模式
	 * \param didShowBlockIn 成功显示积分墙时执行的block
	 * \param didDismissBlockIn 关闭积分墙后执行的block
	 * \returns 是否显示积分墙成功，积分墙显示不成功并不会调用didShowBlockIn和didDismissBlockIn
	 */
	//+ (BOOL)PublicCallShowOffers:(BOOL)PublicRewarded PublicCallDidShowBlock:(void (^)(void))PublicCallDidShowBlock PublicDidDismissBlock:(void (^)(void))PublicDidDismissBlockIn;
	@Method(selector = "PublicCallShowOffers:PublicCallDidShowBlock:PublicDidDismissBlock:")
	public static native boolean PublicCallShowOffers(boolean PublicRewarded, @Block Runnable PublicCallDidShowBlock,@Block Runnable PublicDidDismissBlockIn);
	
	
	/*! 获取积分墙的App广告列表
	 * \param rewarded 是不是有积分模式
	 * \param page 请求的数据第几页
	 * \param count 每页有多少个广告（比如设置的requestPage为1，adCountPage为3.那么数据就可以看成是每页3个应用的形式在服务器上，每次请求服务器就把对应页的3个应用返回）
	 * \param recievedBlock 接收广告列表的block, 其中NSArray的内容是 @[PublicCallListAppModel, PublicCallListAppModel...]; 获取列表失败, 在NSError里有记录.
	 */
	//+ (void)PublicRequestOffersOpenData:(BOOL)PublicCallRewarded PublicCallPage:(NSInteger)PublicCallRequestPage PublicCallCount:(NSInteger)PublicCallAdCountPage PublicCallRevievedBlock:(void (^)(NSArray*, NSError *))PublicCallRecievedBlock;
	@Method(selector = "PublicRequestOffersOpenData:PublicCallPage:PublicCallCount:PublicCallRevievedBlock:")
	public static native void PublicCallShowOffers(boolean PublicCallRewarded, int PublicCallRequestPage, int PublicCallAdCountPage, @Block PublicCallRevievedBlock PublicCallRecievedBlock);
	
	/*
	 *\这个默认请求第1页数据，每页10个
	 */
	//+ (void)PublicCallRequestOffersOpenData:(BOOL)PublicCallRewarded PublicCallRevievedBlock:(void (^)(NSArray*, NSError *))PublicRecievedBlock;
	@Method(selector = "PublicCallRequestOffersOpenData:PublicCallRevievedBlock:")
	public static native void PublicCallRequestOffersOpenData(boolean PublicCallRewarded,@Block PublicCallRevievedBlock PublicRecievedBlock);

	/*! 安装积分墙中的APP
	 * \param app 通过requestOffersOpenData获得的APP
	 */
	//+ (void)PublicCallUserInstallApp:(PublicCallListAppModel *)PublicCallApp;
	@Method(selector = "PublicCallUserInstallApp:")
	public static native void PublicCallUserInstallApp(PublicCallListAppModel PublicCallApp);

	/*
	 *关闭积分墙
	 */
	//+ (void)PublicCallClose;
	@Method(selector = "PublicCallClose")
	public static native void PublicCallClose();
}
