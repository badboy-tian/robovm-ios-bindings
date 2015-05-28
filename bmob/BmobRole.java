package net.mwplay.bmob;

import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class BmobRole extends BmobObject{
	
	public BmobRole(String className) {
		super(className);
	}
	/**
	 *  角色名
	 */
	//@property (nonatomic, copy) NSString *name;
	@Property
	public native void setName(String name);
	@Property
	public native String getName();
	
	/**
	 *  查询Role表
	 *
	 *  @return BmobQuery查询对象
	 */
	//+(BmobQuery *)query;
	@Method(selector = "query")
	public native static BmobQuery query();
	
	/**
	 *  创建BmobRole对象
	 *
	 *  @param name 角色名
	 *
	 *  @return BmobRole对象
	 */
	//-(instancetype)initWithName:(NSString *)name;
	@Method(selector = "initWithName:")
	public native BmobRole initWithName(String name);
	
	/**
	 *  创建BmobRole对象
	 *
	 *  @param name 角色名
	 *  @param acl  ACL权限
	 *
	 *  @return BmobRole对象
	 */
	//-(instancetype)initWithName:(NSString *)name acl:(BmobACL *)acl;
	@Method(selector = "initWithName:acl:")
	public native BmobRole initWithName(String name, BmobACL acl);
	
	/**
	 *  创建BmobRole对象
	 *
	 *  @param name 角色名
	 *
	 *  @return BmobRole对象
	 */
	//+(instancetype)roleWithName:(NSString *)name;
	@Method(selector = "roleWithName:")
	public static native BmobRole roleWithName(String name);

	/**
	 *  创建BmobRole对象
	 *
	 *  @param name 角色名
	 *  @param acl  ACL权限
	 *
	 *  @return  BmobRole对象
	 */
	//+(instancetype)roleWithName:(NSString *)name acl:(BmobACL *)acl;
	@Method(selector = "roleWithName:acl:")
	public static native BmobRole roleWithName(String name, BmobACL acl);
	
	/**
	 *  角色表里面的users列
	 *
	 *  @param relation 关联user表的关联对象
	 */
	//-(void)addUsersRelation:(BmobRelation*)relation;
	@Method(selector = "addUsersRelation:")
	public native void addUsersRelation(BmobRelation relation);
	
	/**
	 *  角色表里面的roles列
	 *
	 *  @param relation 关联roles表的关联对象
	 */
	//-(void)addRolesRelation:(BmobRelation*)relation;
	@Method(selector = "addRolesRelation:")
	public native void addRolesRelation(BmobRelation relation);
}
