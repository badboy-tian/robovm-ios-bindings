package net.mwplay.bmob;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class BmobEvent extends NSObject{
	//@property(assign)id<BmobEventDelegate>delegate;
	@Property
	public native void setDelegate(BmobEventDelegate delegate);
	@Property
	public native BmobEventDelegate getDelegate();

	//-(instancetype)init;
	@Method(selector = "init")
	public native @Pointer long init();

	public BmobEvent() {
		super((SkipInit)null);
		initObject(init());
	}
	
	/**
	 *  单例模式创建BmobEvent对象
	 *
	 *  @return 创建BmobEvent对象
	 */
	//+(instancetype)defaultBmobEvent;
	@Method(selector = "defaultBmobEvent")
	private native static  BmobEvent defaultBmobEvent();

	/**
	 *  启动
	 */
	//-(void)start;
	@Method(selector = "start")
	public native void start();
	
	/**
	 *  停止
	 */
	//-(void)stop;
	@Method(selector = "stop")
	public native void stop();

	/**
	 *  订阅表的变化事件
	 *
	 *  @param actionType 包括表更新，表删除
	 *  @param tableName  表名
	 */
	//-(void)listenTableChange:(BmobActionType)actionType tableName:(NSString *)tableName;
	@Method(selector = "listenTableChange:tableName:")
	public native void listenTableChange(BmobActionType actionType, String tableName);

	/**
	 *  订阅行的变化事件
	 *
	 *  @param actionType 包含行更新，行删除
	 *  @param tableName  表名
	 *  @param objectId   行的objectId
	 */
	//-(void)listenRowChange:(BmobActionType)actionType tableName:(NSString *)tableName objectId:(NSString *)objectId;
	@Method(selector = "listenRowChange:tableName:objectId:")
	public native void listenRowChange(BmobActionType actionType, String tableName, String objectId);

	/**
	 *  取消订阅表的变化事件
	 *
	 *  @param actionType 包括表更新，表删除
	 *  @param tableName  表名
	 */
	//-(void)cancelListenTableChange:(BmobActionType)actionType tableName:(NSString *)tableName;
	@Method(selector = "cancelListenTableChange:tableName:")
	public native void cancelListenTableChange(BmobActionType actionType, String tableName);

	/**
	 *  取消订阅行的变化事件
	 *
	 *  @param actionType 包含行更新，行删除
	 *  @param tableName  表名
	 *  @param objectId   行的objectId
	 */
	//-(void)cancelListenRowChange:(BmobActionType)actionType tableName:(NSString *)tableName objectId:(NSString *)objectId;
	@Method(selector = "cancelListenRowChange:tableName:objectId:")
	public native void cancelListenRowChange(BmobActionType actionType, String tableName, String objectId);

	//@end
}
