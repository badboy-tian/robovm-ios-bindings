package net.mwplay.bmob;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class BmobACL extends NSObject{
	/**
	 *  创建BmobACL对象
	 *
	 *  @return BmobACL对象
	 */
	//+(instancetype)ACL;
	@Method(selector = "ACL")
	public native static BmobACL ACL();

	/**
	 *  设置所有人读权限为true
	 */
	//-(void)setPublicReadAccess;
	@Method(selector = "setPublicReadAccess")
	public native void setPublicReadAccess();

	/**
	 *  设置所有人写权限为true
	 */
	//-(void)setPublicWriteAccess;
	@Method(selector = "setPublicWriteAccess")
	public native void setPublicWriteAccess();

	/**
	 *  设置某个用户读权限为true
	 *
	 *  @param userId 用户的objectId
	 */
	//-(void)setReadAccessForUserId:(NSString *)userId;
	@Method(selector = "setReadAccessForUserId:")
	public native void setReadAccessForUserId(String userId);
	
	/**
	 *  设置某个用户写权限为true
	 *
	 *  @param userId 用户的objectId
	 */
	//-(void)setWriteAccessForUserId:(NSString *)userId;
	@Method(selector = "setWriteAccessForUserId:")
	public native void setWriteAccessForUserId(String userId);
	
	/**
	 *  设置某个用户的读权限为true
	 *
	 *  @param user 某个BmobUser用户
	 */
	//-(void)setReadAccessForUser:(BmobUser *)user;
	@Method(selector = "setReadAccessForUser:")
	public native void setReadAccessForUser(BmobUser user);

	/**
	 *  设置某个用户的写权限为true
	 *
	 *  @param user BmobUser用户对象
	 */
	//-(void)setWriteAccessForUser:(BmobUser *)user;
	@Method(selector = "setWriteAccessForUser:")
	public native void setWriteAccessForUser(BmobUser user);
	
	/**
	 *  设置角色的读权限为true
	 *
	 *  @param name 角色名
	 */
	//-(void)setReadAccessForRoleWithName:(NSString *)name;
	@Method(selector = "setReadAccessForRoleWithName:")
	public native void setReadAccessForRoleWithName(String name);
	
	/**
	 *  设置角色的写权限为true
	 *
	 *  @param name 角色名
	 */
	//-(void)setWriteAccessForRoleWithName:(NSString *)name;
	@Method(selector = "setWriteAccessForRoleWithName:")
	public native void setWriteAccessForRoleWithName(String name);

	/**
	 *  设置角色的读权限为true
	 *
	 *  @param role BmobRole角色对象
	 */
	//-(void)setReadAccessForRole:(BmobRole *)role;
	@Method(selector = "setReadAccessForRole:")
	public native void setReadAccessForRole(BmobRole role);
	
	/**
	 *  设置角色的写权限为true
	 *
	 *  @param role BmobRole角色对象
	 */
	//-(void)setWriteAccessForRole:(BmobRole *)role;
	@Method(selector = "setWriteAccessForRole:")
	public native void setWriteAccessForRole(BmobRole role);
}
