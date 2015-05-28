package net.mwplay.bmob;

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class BmobObjectsBatch extends NSObject{
	/**
	 *  创建某条数据，可多次调用
	 *
	 *  @param className 表名
	 *  @param para      要创建的列名跟列的值
	 */
	//-(void)saveBmobObjectWithClassName:(NSString *)className parameters:(NSDictionary*)para;
	@Method(selector = "saveBmobObjectWithClassName:parameters:")
	public native void getServerTimestamp(String className, NSDictionary para);
	
	/**
	 *  更新某条数据，可多次调用
	 *
	 *  @param className 表名
	 *  @param objectId  某行数据的objectId
	 *  @param para      要更新的列和列的值
	 */
	//-(void)updateBmobObjectWithClassName:(NSString*)className objectId:(NSString*)objectId parameters:(NSDictionary*)para;
	@Method(selector = "updateBmobObjectWithClassName:objectId:parameters:")
	public native void updateBmobObjectWithClassName(String className, String objectId, NSDictionary para);
	
	/**
	 *  删除某条数据，可多次调用
	 *
	 *  @param className 表名
	 *  @param objectId  某条数据的objectId
	 */
	//-(void)deleteBmobObjectWithClassName:(NSString *)className objectId:(NSString*)objectId;
	@Method(selector = "deleteBmobObjectWithClassName:objectId:")
	public native void deleteBmobObjectWithClassName(String className, String objectId);
	
	/**
	 *  批量修改数据
	 *
	 *  @param block 返回操作的的结果和信息
	 */

	//-(void)batchObjectsInBackgroundWithResultBlock:(void(^)(BOOL isSuccessful,NSError *error))block;
	@Method(selector = "batchObjectsInBackgroundWithResultBlock:")
	public native void batchObjectsInBackgroundWithResultBlock(@Block BmobBooleanResultBlock block);

	//再加一个方法
}
