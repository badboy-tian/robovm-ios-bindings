package net.mwplay.domob;

import org.robovm.apple.coregraphics.CGSize;
import org.robovm.apple.corelocation.CLLocation;
import org.robovm.apple.uikit.UIInterfaceOrientation;
import org.robovm.apple.uikit.UIView;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class DMAdView extends UIView {
	// For iPhone
	public static CGSize DOMOB_AD_SIZE_320x50 = new CGSize(320, 50);
	public static CGSize DOMOB_AD_SIZE_300x250 = new CGSize(300, 250);
	// For iPad
	public static CGSize DOMOB_AD_SIZE_488x80 = new CGSize(488, 80);
	public static CGSize DOMOB_AD_SIZE_728x90 = new CGSize(728, 90);
	public static CGSize DOMOB_AD_SIZE_600x500 = new CGSize(600, 500);

	// @property (nonatomic, assign) id <DMAdViewDelegate> delegate;
	// @property (nonatomic, assign) UIViewController *rootViewController;
	@Property
	public native void setDelegate(DMAdViewDelegate delegate);

	@Property
	public native DMAdViewDelegate getDelegate();

	@Property
	public native void setRootViewController(UIViewController rootViewController);

	@Property
	public native UIViewController getRootViewController();

	// init ad view
	// - (id)initWithPublisherId:(NSString *)publisherId // Publisher ID
	// placementId:(NSString *)placementId; // Placement ID
	@Method(selector = "initWithPublisherId:placementId:")
	public native @Pointer
	long initWithPublisherId(String publisherId, String placementId);

	// - (id)initWithPublisherId:(NSString *)publisherId // Publisher ID
	// placementId:(NSString *)placementId // Placement ID
	// autorefresh:(BOOL)autorefresh; // set auto refresh
	@Method(selector = "initWithPublisherId:placementId:autorefresh:")
	public native @Pointer
	long initWithPublisherId(String publisherId, String placementId,
			boolean autorefresh);

	public DMAdView(String publisherId, String placementId) {
		super((SkipInit) null);
		initObject(initWithPublisherId(publisherId, placementId));
	}

	public DMAdView(String publisherId, String placementId, boolean autorefresh) {
		super((SkipInit) null);
		initObject(initWithPublisherId(publisherId, placementId, autorefresh));
	}

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

	// Notification AdView, device orientation changes. If you need AdView
	// automatically adjust itself attributes to support the direction of the
	// change, you need to call this method when the device change the direction
	// in your app
	// - (void)rotateToOrientation:(UIInterfaceOrientation)newOrientation;
	@Method(selector = "rotateToOrientation:")
	public native void rotateToOrientation(UIInterfaceOrientation newOrientation);
}
