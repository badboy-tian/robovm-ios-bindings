package net.mwplay.domob;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface DMSplashAdControllerDelegate extends NSObjectProtocol{
	// Sent when an splash ad request success to loaded an ad
	//- (void)dmSplashAdSuccessToLoadAd:(DMSplashAdController *)dmSplashAd;
	@Method(selector = "dmSplashAdSuccessToLoadAd:")
	public void dmSplashAdSuccessToLoadAd(DMSplashAdController dmSplashAd);
	// Sent when an ad request fail to loaded an ad
	//- (void)dmSplashAdFailToLoadAd:(DMSplashAdController *)dmSplashAd withError:(NSError *)err;
	@Method(selector = "dmSplashAdFailToLoadAd:withError:")
	public void dmSplashAdFailToLoadAd(DMSplashAdController dmSplashAd, NSError err);

	// Sent just before presenting an splash ad view
	//- (void)dmSplashAdWillPresentScreen:(DMSplashAdController *)dmSplashAd;
	@Method(selector = "dmSplashAdWillPresentScreen:")
	public void dmSplashAdWillPresentScreen(DMSplashAdController dmSplashAd);
	// Sent just after dismissing an splash ad view
	//- (void)dmSplashAdDidDismissScreen:(DMSplashAdController *)dmSplashAd;
	@Method(selector = "dmSplashAdDidDismissScreen:")
	public void dmSplashAdDidDismissScreen(DMSplashAdController dmSplashAd);
}
