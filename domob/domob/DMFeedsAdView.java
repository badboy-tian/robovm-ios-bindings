package net.mwplay.domob;

import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.coregraphics.CGSize;
import org.robovm.apple.corelocation.CLLocation;
import org.robovm.apple.uikit.UIView;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class DMFeedsAdView extends UIView {
	// set delegate
	// @property (nonatomic, assign) id <DMFeedsAdViewDelegate>delegate;
	// set rootViewController
	// @property (nonatomic, retain) UIViewController *rootViewController;

	// init FeedsAdView with size 320*240 only support for iPhone/iPod

	// - (id)initWithPublisherId:(NSString *)publisherId // Domob PublisherId
	// placementId:(NSString *)placementId // Domob PlacementId
	// origin:(CGPoint)adOrigin; // origin for FeedsAdView

	@Property
	public native void setDelegate(DMFeedsAdViewDelegate delegate);

	@Property
	public native DMFeedsAdViewDelegate getDelegate();

	@Property
	public native void setRootViewController(UIViewController rootViewController);

	@Property
	public native UIViewController getRootViewController();

	@Method(selector = "initWithPublisherId:placementId:origin:")
	public native @Pointer
	long initWithPublisherId(String publisherId, String placementId,
			CGPoint adOrigin);

	public DMFeedsAdView(String publisherId, String placementId,
			CGPoint adOrigin) {
		super((SkipInit) null);
		initObject(initWithPublisherId(publisherId, placementId, adOrigin));
	}

	// load ad
	// - (void)loadAd;
	// present ad
	// - (void)present;
	// / close the ad view
	// - (void)closeAd;

	// The user's current location
	// - (void)setLocation:(CLLocation *)location;

	// The user's postcode
	// - (void)setPostcode:(NSString *)postcode;

	// The keyword of current activity
	// - (void)setKeywords:(NSString *)keywords;

	// The user's birthday
	// - (void)setUserBirthday:(NSString *)userBirthday;

	// The user's gender
	// - (void)setUserGender:(DMUserGenderType)userGender;

	// 新增设置size方法
	// - (void)setAdSize:(CGSize)adSize;
	@Method(selector = "setAdSize:")
	public native void setAdSize(CGSize adSize);

	// load ad view
	// - (void)loadAd;
	@Method(selector = "loadAd")
	public native void loadAd();

	// Flexible专用的方法 用于横竖屏切换 移除原有视图 并重新请求
	// - (void)orientationChanged;
	@Method(selector = "orientationChanged")
	public native void orientationChanged();

	// The user's current location
	// - (void)setLocation:(CLLocation *)location;
	@Method(selector = "setLocation:")
	public native void setLocation(CLLocation location);

	// The user's postcode
	// - (void)setPostcode:(NSString *)postcode;
	@Method(selector = "setPostcode:")
	public native void setPostcode(String postcode);

	// The keyword of current activity
	// - (void)setKeywords:(NSString *)keywords;
	@Method(selector = "setKeywords:")
	public native void setKeywords(String keywords);

	// The user's birthday
	// - (void)setUserBirthday:(NSString *)userBirthday;
	@Method(selector = "setUserBirthday:")
	public native void setUserBirthday(String userBirthday);

	// The user's gender
	// - (void)setUserGender:(DMUserGenderType)userGender;
	@Method(selector = "setUserGender:")
	public native void setUserGender(DMUserGenderType userGender);
}
