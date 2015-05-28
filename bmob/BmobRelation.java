package net.mwplay.bmob;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class BmobRelation extends NSObject{
	/**
	 *  创建BmobRelation对象实例
	 *
	 *  @return BmobRelation对象实例
	 */
	//+(instancetype)relation;
	@Method(selector = "relation")
	public native static BmobRelation relation();
	
	/**
	 *  添加关联关系
	 *
	 *  @param object 添加关系的对象
	 */
	//-(void)addObject:(BmobObject *)object;
	@Method(selector = "addObject:")
	public native void addObject(BmobObject object);
	
	/**
	 *  移除关联关系
	 *
	 *  @param object 移除关系的对象
	 */
	//-(void)removeObject:(BmobObject *)object;
	@Method(selector = "removeObject:")
	public native void removeObject(BmobObject object);
}
