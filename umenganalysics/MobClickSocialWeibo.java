package net.mwplay.umenganalysics;

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.GlobalValue;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.Pointer;

@Library(Library.INTERNAL)
@NativeClass
public class MobClickSocialWeibo extends NSObject {
//	typedef NSString * MobClickSocialTypeString;
//
//	extern MobClickSocialTypeString const MobClickSocialTypeSina;                //新浪微博
//	extern MobClickSocialTypeString const MobClickSocialTypeTencent;             //腾讯微博
//	extern MobClickSocialTypeString const MobClickSocialTypeRenren;              //人人网
//	extern MobClickSocialTypeString const MobClickSocialTypeQzone;               //Qzone
//	extern MobClickSocialTypeString const MobClickSocialTypeRenren;              //人人网
//	extern MobClickSocialTypeString const MobClickSocialTypeDouban;              //douban
//	extern MobClickSocialTypeString const MobClickSocialTypeWxsesion;            //微信好友分享
//	extern MobClickSocialTypeString const MobClickSocialTypeWxtimeline;          //微信朋友圈
//	extern MobClickSocialTypeString const MobClickSocialTypeHuaban;              //花瓣
//	extern MobClickSocialTypeString const MobClickSocialTypeKaixin;              //开心
//	extern MobClickSocialTypeString const MobClickSocialTypeFacebook;            //facebook
//	extern MobClickSocialTypeString const MobClickSocialTypeTwitter;             //twitter
//	extern MobClickSocialTypeString const MobClickSocialTypeInstagram;           //instagram
//	extern MobClickSocialTypeString const MobClickSocialTypeFlickr;              //flickr
//	extern MobClickSocialTypeString const MobClickSocialTypeQQ;                  //qq
//	extern MobClickSocialTypeString const MobClickSocialTypeWxfavorite;          //微信收藏
//	extern MobClickSocialTypeString const MobClickSocialTypeLwsession;           //来往
//	extern MobClickSocialTypeString const MobClickSocialTypeLwtimeline;          //来往动态
//	extern MobClickSocialTypeString const MobClickSocialTypeYxsession;           //易信
//	extern MobClickSocialTypeString const MobClickSocialTypeYxtimeline;          //易信朋友圈
//	
	@GlobalValue(symbol = "MobClickSocialTypeSina", optional=true)
	public static native  @ByVal String MobClickSocialTypeSina();

	@GlobalValue(symbol = "MobClickSocialTypeTencent", optional=true)
	public static native  @ByVal String MobClickSocialTypeTencent();
	
	@GlobalValue(symbol = "MobClickSocialTypeRenren", optional=true)
	public static native  @ByVal String MobClickSocialTypeRenren();
	
	@GlobalValue(symbol = "MobClickSocialTypeQzone", optional=true)
	public static native  @ByVal String MobClickSocialTypeQzone();
	
	@GlobalValue(symbol = "MobClickSocialTypeDouban", optional=true)
	public static native  @ByVal String MobClickSocialTypeDouban();
	
	@GlobalValue(symbol = "MobClickSocialTypeWxsesion", optional=true)
	public static native  @ByVal String MobClickSocialTypeWxsesion();
	
	@GlobalValue(symbol = "MobClickSocialTypeWxtimeline", optional=true)
	public static native  @ByVal String MobClickSocialTypeWxtimeline();
	
	@GlobalValue(symbol = "MobClickSocialTypeHuaban", optional=true)
	public static native  @ByVal String MobClickSocialTypeHuaban();
	
	@GlobalValue(symbol = "MobClickSocialTypeKaixin", optional=true)
	public static native  @ByVal String MobClickSocialTypeKaixin();
	
	@GlobalValue(symbol = "MobClickSocialTypeFacebook", optional=true)
	public static native  @ByVal String MobClickSocialTypeFacebook();
	
	@GlobalValue(symbol = "MobClickSocialTypeTwitter", optional=true)
	public static native  @ByVal String MobClickSocialTypeTwitter();
	
	@GlobalValue(symbol = "MobClickSocialTypeInstagram", optional=true)
	public static native  @ByVal String MobClickSocialTypeInstagram();
	
	@GlobalValue(symbol = "MobClickSocialTypeFlickr", optional=true)
	public static native  @ByVal String MobClickSocialTypeFlickr();
	
	@GlobalValue(symbol = "MobClickSocialTypeQQ", optional=true)
	public static native  @ByVal String MobClickSocialTypeQQ();
	
	@GlobalValue(symbol = "MobClickSocialTypeWxfavorite", optional=true)
	public static native  @ByVal String MobClickSocialTypeWxfavorite();
	
	@GlobalValue(symbol = "MobClickSocialTypeLwsession", optional=true)
	public static native  @ByVal String MobClickSocialTypeLwsession();
	
	@GlobalValue(symbol = "MobClickSocialTypeYxsession", optional=true)
	public static native  @ByVal String MobClickSocialTypeYxsession();
	
	@GlobalValue(symbol = "MobClickSocialTypeYxtimeline", optional=true)
	public static native  @ByVal String MobClickSocialTypeYxtimeline();
	
	@GlobalValue(symbol = "MobClickSocialTypeLwtimeline", optional=true)
	public static native  @ByVal String MobClickSocialTypeLwtimeline();
	
	/**
	 * 微博平台类型，使用上面定义的几种常量字符串
	 */
	// @property (nonatomic, copy) NSString *platformType;
	@Property(selector = "platformType")
	public native String getPlatformType();

	@Property(selector = "setPlatformType:")
	public native void setDelegate(String platformType);

	/**
	 * 微博id
	 */
	// @property (nonatomic, copy) NSString *weiboId;
	@Property(selector = "weiboId")
	public native String getWeiboId();

	@Property(selector = "setWeiboId:")
	public native void setWeiboId(String weiboId);
	
	/**
	 * 用户在微博平台的id
	 */
	// @property (nonatomic, copy) NSString *userId;
	@Property(selector = "userId")
	public native String getUserId();

	@Property(selector = "setUserId:")
	public native void setUserId(String userId);
	
	/**
	 * 微博平台的自定义字段，例如定义{‘gender’:0,’name’:’xxx’}
	 */
	// @property (nonatomic, strong) NSDictionary *param;
	@Property(selector = "param")
	public native String getParam();

	@Property(selector = "setParam:")
	public native void setParam(NSDictionary param);
	
	/**
	 * 初始化方法，在发送微博结束的回调方法使用此初始化方法
	 * 
	 * @param platformType
	 *            微博平台类型
	 * @param weiboId
	 *            微博id,可以设置为nil
	 * @param userId
	 *            用户id
	 * @param param
	 *            微博平台自定义字段，可以设置为nil
	 * @return 微博对象
	 */
	// -(id)initWithPlatformType:(MobClickSocialTypeString)platformType
	// weiboId:(NSString *)weiboId usid:(NSString *)usid param:(NSDictionary
	// *)param;
	@Method(selector = "initWithPlatformType:weiboId:usid:param:")
	public native  @Pointer long init(String platformType, String weiboId, String usid, NSDictionary param);

	public MobClickSocialWeibo() {
	}
	
	public MobClickSocialWeibo(String platformType, String weiboId, String usid, NSDictionary param) {
		super((SkipInit)null);
		initObject(init(platformType, weiboId, usid, param));
	}
	// @end
}
