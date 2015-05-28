package net.mwplay.bmob;

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class BmobUser extends BmobObject{

	public BmobUser(String className) {
		super(className);
	}

	/**
	 *  查询用户表
	 *
	 *  @return 创建用户表的查询
	 */
	//+(BmobQuery *)query;
	@Method(selector = "query")
	public native static BmobQuery query();

	//#pragma mark set
	/**
	 *	设置用户名
	 *
	 *	@param	username	提供的用户名
	 */
	//-(void)setUserName:(NSString*)username;
	@Method(selector = "setUserName:")
	public native void setUserName(String username);

	/**
	 *	设置密码
	 *
	 *	@param	password	提供的密码
	 */
	//-(void)setPassword:(NSString*)password;
	@Method(selector = "setPassword:")
	public native void setPassword(String password);

	/**
	 *	设置邮箱
	 *
	 *	@param	email	提供的邮箱
	 */
	//-(void)setEmail:(NSString *)email;
	@Method(selector = "setEmail:")
	public native void setEmail(String setEmail);

	/**
	 *  用户登陆
	 *
	 *  @param username 用户名
	 *  @param password 密码
	 */
	//+(void)loginWithUsernameInBackground:(NSString*)username
	 //                           password:(NSString*)password;
	@Method(selector = "loginWithUsernameInBackground:password:")
	public native static void loginWithUsernameInBackground(String username, String password);

	/**
	 *  登陆后返回用户信息
	 *
	 *  @param username 用户名
	 *  @param password 密码
	 *  @param block    是否成功登陆，若成功登陆返回用户信息
	 */
	//+(void)loginWithUsernameInBackground:(NSString *)username
	//                             password:(NSString *)password
	//                                block:(BmobUserResultBlock)block;
	@Method(selector = "loginWithUsernameInBackground:password:block:")
	public native static void loginWithUsernameInBackground(String username, String password, @Block BmobUserResultBlock block);

	
	/**
	 *	注销登陆账号,删除本地账号
	 */
	//+(void)logout;
	@Method(selector = "logout")
	public native static void logout();

	/**
	 *	后台注册
	 */
	//-(void)signUpInBackground;
	@Method(selector = "signUpInBackground")
	public native void signUpInBackground();

	/**
	 *	后台注册,返回注册结果
	 *
	 *	@param	block	返回成功还是失败
	 */
	//-(void)signUpInBackgroundWithBlock:(BmobBooleanResultBlock)block;
	@Method(selector = "signUpInBackgroundWithBlock:")
	public native void signUpInBackgroundWithBlock(@Block BmobBooleanResultBlock block);
	
	/**
	 *  邮件认证，在web端应用设置中又开启邮箱验证
	 *
	 *  @param email 邮箱地址
	 */
	//-(void)verifyEmailInBackgroundWithEmailAddress:(NSString *)email;
	@Method(selector = "verifyEmailInBackgroundWithEmailAddress:")
	public native void verifyEmailInBackgroundWithEmailAddress(String email);

	/**
	 *	通过邮件设置密码
	 *
	 *	@param	email	提供的邮件地址
	 */
	//+(void)requestPasswordResetInBackgroundWithEmail:(NSString *)email;
	@Method(selector = "requestPasswordResetInBackgroundWithEmail:")
	public native static void requestPasswordResetInBackgroundWithEmail(String email);

	/**
	 *  得到邮箱验证的结果
	 *
	 *  @param block 邮箱验证的结果及其信息
	 */
	//-(void)userEmailVerified:(BmobBooleanResultBlock)block;
	@Method(selector = "userEmailVerified:")
	public native void userEmailVerified(@Block BmobBooleanResultBlock block);

	/**
	 *  第三方授权登录后，在Bmob生成一个bmob用户
	 *
	 *  @param infoDictionary  授权信息，格式为@{@"access_token":@"获取的token",@"uid":@"授权后获取的id",@"expirationDate":@"获取的过期时间（NSDate）"}
	 *  @param platform        新浪微博，或者腾讯qq
	 *  @param block           生成新的用户，跟结果信息
	 */

	//+ (void)signUpInBackgroundWithAuthorDictionary:(NSDictionary *)infoDictionary
	//                                     platform:(BmobSNSPlatform)platform
	//                                        block:(BmobUserResultBlock)block;
	@Method(selector = "signUpInBackgroundWithAuthorDictionary:platform:block:")
	public native static void signUpInBackgroundWithAuthorDictionary(NSDictionary infoDictionary,BmobSNSPlatform platform,@Block BmobUserResultBlock block);
	
	/**
	 *  第三方授权登录后，在Bmob生成一个bmob用户
	 *
	 *  @param infoDictionary  授权信息，格式为@{@"access_token":@"获取的token",@"uid":@"授权后获取的id",@"expirationDate":@"获取的过期时间（NSDate）"}
	 *  @param platform        新浪微博，或者腾讯qq
	 *  @param block           生成新的用户，跟结果信息
	 */

	//+ (void)loginInBackgroundWithAuthorDictionary:(NSDictionary *)infoDictionary
	//                                      platform:(BmobSNSPlatform)platform
	 //                                        block:(BmobUserResultBlock)block;
	@Method(selector = "loginInBackgroundWithAuthorDictionary:platform:block:")
	public native static void loginInBackgroundWithAuthorDictionary(NSDictionary infoDictionary,BmobSNSPlatform platform,@Block BmobUserResultBlock block);
	
	/**
	 *  登录用户关联第三方账号
	 *
	 *  @param infoDictionary  授权信息，格式为@{@"access_token":@"获取的token",@"uid":@"授权后获取的id",@"expirationDate":@"获取的过期时间（NSDate）"}
	 *  @param platform        新浪微博，或者腾讯qq
	 *  @param block           关联结果跟信息
	 */
	//-(void)linkedInBackgroundWithAuthorDictionary:(NSDictionary *)infoDictionary
	//                                     platform:(BmobSNSPlatform)platform
	 //                                       block:(BmobBooleanResultBlock)block;
	@Method(selector = "linkedInBackgroundWithAuthorDictionary:platform:block:")
	public native void linkedInBackgroundWithAuthorDictionary(NSDictionary infoDictionary,BmobSNSPlatform platform,@Block BmobBooleanResultBlock block);

	/**
	 *  登录用户取消关联第三方账号
	 *
	 *  @param platform 新浪微博，或者腾讯qq
	 *  @param block    取消关联结果跟信息
	 */
	//-(void)cancelLinkedInBackgroundWithPlatform:(BmobSNSPlatform)platform
	//                                      block:(BmobBooleanResultBlock)block;
	@Method(selector = "cancelLinkedInBackgroundWithPlatform:block:")
	public native void cancelLinkedInBackgroundWithPlatform(BmobSNSPlatform platform,@Block BmobBooleanResultBlock block);

	/**
	 *	得到当前BmobUser
	 *
	 *	@return	返回BmobUser对象
	 */
	//+(BmobUser*)getCurrentObject;
	@Method(selector = "getCurrentObject")
	public native static BmobUser getCurrentObject();
	
	/**
	 *	得到当前BmobUser
	 *
	 *	@return	返回BmobUser对象
	 */
	//+(BmobUser*)getCurrentUser;
	@Method(selector = "getCurrentUser")
	public native static BmobUser getCurrentUser();
}
