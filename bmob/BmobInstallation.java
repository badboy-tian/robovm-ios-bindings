package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSData;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class BmobInstallation extends BmobObject{

	public BmobInstallation(String className) {
		super(className);
	}
	
	/**
	 *  Installation表查询
	 *
	 *  @return 查询Installation表的类
	 */
	//+(BmobQuery *)query;
	@Method(selector = "query")
	public native static BmobQuery query();


	/**
	 * BmobInstallation实例
	 *
	 *  @return BmobInstallation实例
	 */
	//+(instancetype)currentInstallation;
	@Method(selector = "currentInstallation")
	public native static BmobInstallation currentInstallation();
	
	/**
	 *  绑定设备DeviceToken
	 *
	 *  @param deviceTokenData APNS返回的deviceToken
	 */
	//- (void)setDeviceTokenFromData:(NSData *)deviceTokenData;
	@Method(selector = "setDeviceTokenFromData:")
	public native void setDeviceTokenFromData(NSData deviceTokenData);

	//@property (nonatomic,readonly,copy) NSString *deviceType;
	//@property (nonatomic,copy) NSString          *deviceToken;
	//@property (nonatomic,assign) int               badge;
	//@property (nonatomic, retain) NSArray          *channels;

	@Property
	public native String getDeviceType();
	
	@Property
	public native void setDeviceToken(String deviceToken);
	@Property
	public native String getDeviceToken();
	
	@Property
	public native void setBadge(int badge);
	@Property
	public native int getBadge();
	
	@Property
	public native void setChannels(List<String> channels);
	@Property
	public native List<String> getChannels();
	
	/**
	 *  注册订阅频道
	 *
	 *  @param channels 订阅频道
	 */
	//-(void)subsccribeToChannels:(NSArray*)channels;
	@Method(selector = "subsccribeToChannels:")
	public native void subsccribeToChannels(List<String> channels);
	
	/**
	 *  取消订阅频道
	 *
	 *  @param channels 订阅频道数组
	 */
	//-(void)unsubscribeFromChannels:(NSArray*)channels;
	@Method(selector = "unsubscribeFromChannels:")
	public native void unsubscribeFromChannels(List<String> channels);

}
