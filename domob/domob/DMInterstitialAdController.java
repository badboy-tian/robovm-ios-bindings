package net.mwplay.domob;

import org.robovm.apple.corelocation.CLLocation;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.apple.uikit.UIWindow;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class DMInterstitialAdController extends UIViewController{
	@Property
	public native boolean getIsReady( );
	
	@Property
	public native void setDelegate(DMInterstitialAdControllerDelegate delegate);
	@Property
	public native DMInterstitialAdControllerDelegate getDelegate();
	
	//@property (nonatomic, assign) BOOL shouldHiddenStatusBar;
	@Property
	public native void setShouldHiddenStatusBar(boolean shouldHiddenStatusBar);
	@Property
	public native boolean getShouldHiddenStatusBar( );
	
	// init an Interstitial ad viewController。deafult size:
	// iPhone/iPod: 300x250
	// iPad:        600x500
	//- (id)initWithPublisherId:(NSString *)publisherId                   // Domob PublisherId
	////              placementId:(NSString *)placementId                   // Domob PlacementId
	//       rootViewController:(UIViewController *)rootViewController;   // set RootViewController
	
	@Method(selector = "initWithPublisherId:placementId:rootViewController:")
	public native @Pointer long initWithPublisherId(String publisherId, String placementId, UIViewController UIViewController);

	public DMInterstitialAdController(String publisherId, String placementId, UIViewController UIViewController) {
		super((SkipInit)null);
	
		initObject(initWithPublisherId(publisherId, placementId, UIViewController));
	}
	
	
	// load ad
	//- (void)loadAd;

	// present ad
	//- (void)present;

	// The user's current location
	//- (void)setLocation:(CLLocation *)location;

	// The user's postcode
	//- (void)setPostcode:(NSString *)postcode;

	// The keyword of current activity
	//- (void)setKeywords:(NSString *)keywords;

	// The user's birthday
	//- (void)setUserBirthday:(NSString *)userBirthday;

	// The user's gender
	//- (void)setUserGender:(DMUserGenderType)userGender;
	
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
