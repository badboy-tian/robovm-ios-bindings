package net.mwplay.domob;

import org.robovm.apple.coregraphics.CGSize;
import org.robovm.apple.corelocation.CLLocation;
import org.robovm.apple.uikit.UIColor;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.apple.uikit.UIWindow;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class DMSplashAdController extends UIViewController{
	// For iPhone
	public static CGSize DOMOB_AD_SIZE_320x240 = new CGSize(320, 240);
	public static CGSize DOMOB_AD_SIZE_320x400 = new CGSize(320, 400);
	// For iPad
	public static CGSize DOMOB_AD_SIZE_768x576 = new CGSize(768, 576);
	public static CGSize DOMOB_AD_SIZE_768x960 = new CGSize(768, 960);
	
	
	//@property (nonatomic, assign) BOOL isReady; // if it is ready for presenting
	//@property (nonatomic, assign) NSObject <DMSplashAdControllerDelegate> *delegate; // set delegate
	//@property (nonatomic, assign) UIViewController *rootViewController; // set rootViewController
	@Property
	public native void setIsReady(boolean isReady);
	@Property
	public native boolean getIsReady( );
	
	@Property
	public native void setDelegate(DMSplashAdControllerDelegate delegate);
	@Property
	public native DMSplashAdControllerDelegate getDelegate( );
	
	@Property
	public native void setRootViewController(UIViewController rootViewController);
	@Property
	public native UIViewController getRootViewController( );

	// init splash viewController
	//- (id)initWithPublisherId:(NSString *)publisherId   // Domob PublisherId
	//              placementId:(NSString *)placementId   // Domob PlacementId
	//                   window:(UIWindow *)window;       // Key Window for presenting the ad
	@Method(selector = "initWithPublisherId:placementId:window:")
	public native @Pointer long initWithPublisherId(String publisherId, String placementId, UIWindow window);

	// init splash viewController
	//- (id)initWithPublisherId:(NSString *)publisherId   // Domob PublisherId
	 //             placementId:(NSString *)placementId   // Domob PlacementId
	//                   window:(UIWindow *)window        // Key Window for presenting the ad
	//               background:(UIColor *)background;    // background color/Image before the ad view appear, deafult is black
	@Method(selector = "initWithPublisherId:placementId:window:background:")
	public native @Pointer long initWithPublisherId(String publisherId, String placementId, UIWindow window, UIColor UIColor);

	// init splash viewController
	//- (id)initWithPublisherId:(NSString *)publisherId   // Domob PublisherId
	 //             placementId:(NSString *)placementId   // Domob PlacementId
	 //                  window:(UIWindow *)keyWindow     // Key Window for presenting the ad
	 //              background:(UIColor *)background     // background color/Image before the ad view appear, deafult is black
	 //               animation:(BOOL)animation;          // animation for close,deafult is yes
	@Method(selector = "initWithPublisherId:placementId:window:background:animation:")
	public native @Pointer long initWithPublisherId(String publisherId, String placementId, UIWindow window, UIColor UIColor, boolean animation);

	// init splash viewController
	// You can specify ad size, and display position. So that a better combination of advertising and default.png
//	- (id)initWithPublisherId:(NSString *)publisherId   // Domob PublisherId
//	              placementId:(NSString *)placementId   // Domob PlacementId
	//                     size:(CGSize)adSize            // size for Vertical screen ,full screen size for Horizontal screen
	//                   offset:(CGFloat)offset           // offset in origin.y only support Vertical screen
	//                   window:(UIWindow *)keyWindow     // Key Window for presenting the ad
	//               background:(UIColor *)background     /* background color/Image before the ad view appear, deafult is black，
	  //                                                     Proposal set to "Launch Images" same picture。*/
	//                animation:(BOOL)animation;          // animation for close,deafult is yes
	@Method(selector = "initWithPublisherId:placementId:size:offset:window:background:animation:")
	public native @Pointer long initWithPublisherId(String publisherId, String placementId, CGSize adSize, float offset, UIWindow window, UIColor UIColor, boolean animation);

	
	public DMSplashAdController(String publisherId, String placementId, UIWindow window) {
		super((SkipInit)null);
		initObject(initWithPublisherId(publisherId, placementId, window));
	}
	
	public DMSplashAdController(String publisherId, String placementId, UIWindow window, UIColor UIColor) {
		super((SkipInit)null);
		initObject(initWithPublisherId(publisherId, placementId, window, UIColor));
	}

	public DMSplashAdController(String publisherId, String placementId, CGSize adSize, float offset, UIWindow window, UIColor UIColor, boolean animation) {
		super((SkipInit)null);
		initObject(initWithPublisherId(publisherId, placementId, adSize, offset, window, UIColor, animation));
	}
	
	// present ad
	//- (void)present;
	@Method(selector = "present")
	public native void present();

	// The user's current location
	//- (void)setLocation:(CLLocation *)location;
	@Method(selector = "setLocation:")
	public native void setLocation(CLLocation location);

	// The user's postcode
	//- (void)setPostcode:(NSString *)postcode;
	@Method(selector = "setPostcode:")
	public native void setPostcode(String postcode);
	
	// The keyword of current activity
	//- (void)setKeywords:(NSString *)keywords;
	@Method(selector = "setKeywords:")
	public native void setKeywords(String keywords);

	// The user's birthday
	//- (void)setUserBirthday:(NSString *)userBirthday;
	@Method(selector = "setUserBirthday:")
	public native void setUserBirthday(String userBirthday);


	// The user's gender
	//- (void)setUserGender:(DMUserGenderType)userGender;
	@Method(selector = "setUserGender:")
	public native void setUserGender(DMUserGenderType userGender);
}
