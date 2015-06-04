package net.mwplay.youmi;

import org.robovm.apple.foundation.NSDate;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class PublicCallListAppModel extends NSObject{
	/*
	 * 以下id类型属性的值保证不为nil，有可能为@""
	 */

	// 该开放源应用的标示
	//@property(nonatomic, retain, readonly)    NSString    *PublicCallstoreID;
	@Property
	public native String getPublicCallstoreID();

	// 应用名称
	//@property(nonatomic, retain, readonly)    NSString    *PublicCallname;
	@Property
	public native String getPublicCallname();

	// 应用的类别
	//@property(nonatomic, retain, readonly)    NSString    *PublicCallcategory;
	@Property
	public native String getPublicCallcategory();

	// 应用的详细描述
	//@property(nonatomic, retain, readonly)    NSString    *PublicCalldesc;
	@Property
	public native String getPublicCalldesc();

	// 应用版权所有者
	//@property(nonatomic, retain, readonly)    NSString    *PublicCallauthor;
	@Property
	public native String getPublicCallauthor();

	// 应用的大小
	//@property(nonatomic, retain, readonly)    NSString    *PublicCallsize;
	@Property
	public native String getPublicCallsize();

	// 应用的小图标
	//@property(nonatomic, retain, readonly)    NSString    *PublicCallsmallIconURL;
	@Property
	public native String getPublicCallsmallIconURL();

	// 应用的大图标
	//@property(nonatomic, retain, readonly)    NSString    *PublicCalllargeIconURL;
	@Property
	public native String getPublicCalllargeIconURL();

	// 简短广告词
	//@property(nonatomic, retain, readonly)    NSString    *PublicCalladText;
	@Property
	public native String getPublicCalladText();

	//提示语（例如：首次安装并创建新角色获取积分）
	//@property(nonatomic, retain, readonly)     NSString   *PublicCalltask_brief;
	@Property
	public native String getPublicCalltask_brief();

	//步骤提示（例如：打开游戏创建新角色并体验3分钟 回到本应用即可获取{积分单位}）
	//@property(nonatomic, retain, readonly)     NSString   *PublicCalltask_steps;
	@Property
	public native String getPublicCalltask_steps();

	// 过期时间
	//@property(nonatomic, retain, readonly)    NSDate      *PublicCallexpiredDate;
	@Property
	public native NSDate getPublicCallexpiredDate();

	// 积分值[该值对有积分应用有效，无积分应用默认为0]。。已经完成的任务，points也会为0
	//@property(nonatomic, assign, readonly)    NSInteger   PublicCallpoints;
	@Property
	public native long getPublicCallpoints();

	//appStoreID
	//@property(nonatomic, assign, readonly)     NSInteger    PublicCallappStoreID;
	@Property
	public native long getPublicCallappStoreID();

	//appStoreURL
	//@property(nonatomic, retain, readonly)     NSString    *PublicCalllinkURL;
	@Property
	public native String getPublicCalllinkURL();

	//bundleID
	//@property(nonatomic, retain, readonly)     NSString    *PublicCallidentifier;
	@Property
	public native String getPublicCallidentifier();
}
