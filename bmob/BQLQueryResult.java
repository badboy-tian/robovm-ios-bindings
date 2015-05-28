package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSDate;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class BQLQueryResult extends NSObject{
	/**
	 *  查询结果的 className
	 */
	//@property(nonatomic, strong) NSString *className;
	@Property
	public native void setClassName(String className);
	@Property
	public native String getClassName();
	
	/**
	 *  查询的结果 BmobObject 对象列表
	 */
	//@property(nonatomic, strong) NSArray *resultsAry;
	@Property
	public native void setResultsAry(List<BmobObject> resultsAry);
	@Property
	public native List<BmobObject> getResultsAry();

	/**
	 *  查询 count 结果, 只有使用 select count(*) ... 时该值信息才是有效的
	 */
	//@property(nonatomic) int count;
	@Property
	public native void setCount(int count);
	@Property
	public native int getCount();

}
