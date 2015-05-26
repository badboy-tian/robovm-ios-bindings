package net.mwplay.admob;

import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.uikit.UIView;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class DFPCustomRenderedAd extends NSObject{
	/// The ad's HTML.
	//@property(nonatomic, copy, readonly) NSString *adHTML;
	@Property
    public native String getAdHTML ();

	/// The base URL of the ad's HTML.
	//@property(nonatomic, copy, readonly) NSURL *adBaseURL;
    @Property
    public native String getAdBaseURL ();
    
	/// Call this method when the user clicks the ad.
	//- (void)recordClick;
    @Method(selector = "recordClick")
    public native void recordClick();

	/// Call this method when the ad is visible to the user.
	//- (void)recordImpression;
    @Method(selector = "recordImpression")
    public native void recordImpression();

	/// Call this method after the ad has been rendered in a UIView object.
	//- (void)finishedRenderingAdView:(UIView *)view;
    @Method(selector = "finishedRenderingAdView:")
    public native void finishedRenderingAdView(UIView view);
}
