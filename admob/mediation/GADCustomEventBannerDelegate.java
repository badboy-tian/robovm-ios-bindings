package net.mwplay.admob.mediation;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.apple.uikit.UIView;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

public interface GADCustomEventBannerDelegate extends NSObjectProtocol{
	/// Your Custom Event object must call this when it receives or creates an ad view.
	//- (void)customEventBanner:(id<GADCustomEventBanner>)customEvent didReceiveAd:(UIView *)view;
	@Method(selector = "customEventBanner:didReceiveAd:")
	public void customEventBanner(GADCustomEventBanner customEvent, UIView view);

	/// Your Custom Event object must call this when it fails to receive or create the ad view. Pass
	/// along any error object sent from the ad network's SDK, or an NSError describing the error. Pass
	/// nil if not available.
	//- (void)customEventBanner:(id<GADCustomEventBanner>)customEvent didFailAd:(NSError *)error;
	@Method(selector = "customEventBanner:didFailAd:")
	public void customEventBanner(GADCustomEventBanner customEvent, NSError error);
	
	/// Your Custom Event object should call this when the user touches or "clicks" the ad to initiate
	/// an action. When the SDK receives this callback, it reports the click back to the mediation
	/// server.
	//- (void)customEventBannerWasClicked:(id<GADCustomEventBanner>)customEvent;
	@Method(selector = "customEventBannerWasClicked:")
	public void customEventBannerWasClicked(GADCustomEventBanner customEvent);

	/// The rootViewController that you set in GADBannerView. Use this UIViewController to show a modal
	/// view when a user taps on the ad.
	//@property(nonatomic, readonly) UIViewController *viewControllerForPresentingModalView;
	@Property
	public UIViewController getViewControllerForPresentingModalView();

	/// Your Custom Event should call this when the user taps an ad and a modal view appears.
	//- (void)customEventBannerWillPresentModal:(id<GADCustomEventBanner>)customEvent;
	@Method(selector = "customEventBannerWillPresentModal:")
	public void customEventBannerWillPresentModal(GADCustomEventBanner customEvent);
	
	/// Your Custom Event should call this when the user dismisses the modal view and the modal view is
	/// about to go away.
	//- (void)customEventBannerWillDismissModal:(id<GADCustomEventBanner>)customEvent;
	@Method(selector = "customEventBannerWillDismissModal:")
	public void customEventBannerWillDismissModal(GADCustomEventBanner customEvent);
	
	/// Your Custom Event should call this when the user dismisses the modal view and the modal view has
	/// gone away.
	//- (void)customEventBannerDidDismissModal:(id<GADCustomEventBanner>)customEvent;
	@Method(selector = "customEventBannerDidDismissModal:")
	public void customEventBannerDidDismissModal(GADCustomEventBanner customEvent);
	
	/// Your Custom Event should call this method when a user action will result in App switching.
	//- (void)customEventBannerWillLeaveApplication:(id<GADCustomEventBanner>)customEvent;
	@Method(selector = "customEventBannerWillLeaveApplication:")
	public void customEventBannerWillLeaveApplication(GADCustomEventBanner customEvent);
}
