package net.mwplay.domob;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface DMInterstitialAdControllerDelegate extends NSObjectProtocol{
	// Sent when an ad request success to loaded an ad
	//- (void)dmInterstitialSuccessToLoadAd:(DMInterstitialAdController *)dmInterstitial;
	@Method(selector = "dmInterstitialSuccessToLoadAd:")
	public void dmInterstitialSuccessToLoadAd(DMInterstitialAdController dmInterstitial);
	// Sent when an ad request fail to loaded an ad
	//- (void)dmInterstitialFailToLoadAd:(DMInterstitialAdController *)dmInterstitial withError:(NSError *)err;
	@Method(selector = "dmInterstitialFailToLoadAd:withError:")
	public void dmInterstitialFailToLoadAd(DMInterstitialAdController dmInterstitial, NSError err);
	// Sent when the ad is clicked
	//- (void)dmInterstitialDidClicked:(DMInterstitialAdController *)dmInterstitial;
	@Method(selector = "dmInterstitialDidClicked:")
	public void dmInterstitialDidClicked(DMInterstitialAdController dmInterstitial);

	// Sent just before presenting an interstitial
	//- (void)dmInterstitialWillPresentScreen:(DMInterstitialAdController *)dmInterstitial;
	@Method(selector = "dmInterstitialWillPresentScreen:")
	public void dmInterstitialWillPresentScreen(DMInterstitialAdController dmInterstitial);
	// Sent just after dismissing an interstitial
	//- (void)dmInterstitialDidDismissScreen:(DMInterstitialAdController *)dmInterstitial;
	@Method(selector = "dmInterstitialDidDismissScreen:")
	public void dmInterstitialDidDismissScreen(DMInterstitialAdController dmInterstitial);
	// Sent just fail to present an interstitial because of error orientation
	//- (void)dmInterstitialFailToPresentScreenForErrorOrientation:(DMInterstitialAdController *)dmInterstitial;
	@Method(selector = "dmInterstitialFailToPresentScreenForErrorOrientation:")
	public void dmInterstitialFailToPresentScreenForErrorOrientation(DMInterstitialAdController dmInterstitial);

	// Sent just before presenting the user a modal view
	//- (void)dmInterstitialWillPresentModalView:(DMInterstitialAdController *)dmInterstitial;
	@Method(selector = "dmInterstitialWillPresentModalView:")
	public void dmInterstitialWillPresentModalView(DMInterstitialAdController dmInterstitial);
	// Sent just after dismissing the modal view.
	//- (void)dmInterstitialDidDismissModalView:(DMInterstitialAdController *)dmInterstitial;
	@Method(selector = "dmInterstitialDidDismissModalView:")
	public void dmInterstitialDidDismissModalView(DMInterstitialAdController dmInterstitial);
	// Sent just before the application will background or terminate because the user's action
	// (Such as the user clicked on an ad that will launch App Store).
	//- (void)dmInterstitialApplicationWillEnterBackground:(DMInterstitialAdController *)dmInterstitial;
	@Method(selector = "dmInterstitialApplicationWillEnterBackground:")
	public void dmInterstitialApplicationWillEnterBackground(DMInterstitialAdController dmInterstitial);
}
