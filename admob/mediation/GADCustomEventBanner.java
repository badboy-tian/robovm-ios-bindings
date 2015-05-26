package net.mwplay.admob.mediation;

import net.mwplay.admob.GADAdSize;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class GADCustomEventBanner extends NSObject{
	/// This method is called by mediation when your Custom Event is scheduled to be executed. Results
	/// of the execution should be reported back via the delegate. |adSize| is the size of the ad as
	/// configured in the mediation UI for the mediation placement. |serverParameter| and |serverLabel|
	/// are the parameter and label configured in the mediation UI for the Custom Event. |request|
	/// contains information about the ad request, some of those are from GADRequest.
	//- (void)requestBannerAd:(GADAdSize)adSize
	//              parameter:(NSString *)serverParameter
	//                  label:(NSString *)serverLabel
	//                request:(GADCustomEventRequest *)request;
	@Method(selector = "requestBannerAd:parameter:label:request:")
	public native void requestBannerAd(GADAdSize size, String serverParameter, String serverLabel, GADCustomEventRequest request);

	/// You should call back to the |delegate| with the results of the execution to ensure mediation
	/// behaves correctly. The delegate is weakly referenced to prevent memory leaks caused by circular
	/// retention.
	///
	/// Define the -delegate and -setDelegate: methods in your class.
	///
	/// In your class's -dealloc method, remember to nil out the delegate.
	//@property(nonatomic, weak) id<GADCustomEventBannerDelegate> delegate;
	@Property
    public native GADCustomEventBannerDelegate getDelegate ();
    @Property
    public native void setDelegate (GADCustomEventBannerDelegate delegate);
}
