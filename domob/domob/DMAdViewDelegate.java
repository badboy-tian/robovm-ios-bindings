package net.mwplay.domob;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface DMAdViewDelegate extends NSObjectProtocol{
	// Sent when an ad request success to loaded an ad
	//- (void)dmAdViewSuccessToLoadAd:(DMAdView *)adView;
	@Method(selector = "dmAdViewSuccessToLoadAd:")
	public void dmAdViewSuccessToLoadAd(DMAdView adView);
	
	// Sent when an ad request fail to loaded an ad
	//- (void)dmAdViewFailToLoadAd:(DMAdView *)adView withError:(NSError *)error;
	@Method(selector = "dmAdViewFailToLoadAd:withError:")
	public void dmAdViewFailToLoadAd(DMAdView adView, NSError error);
	// Sent when the ad view is clicked
	//- (void)dmAdViewDidClicked:(DMAdView *)adView;
	@Method(selector = "dmAdViewDidClicked:")
	public void dmAdViewDidClicked(DMAdView adView);
	// Sent just before presenting the user a modal view
	//- (void)dmWillPresentModalViewFromAd:(DMAdView *)adView;
	@Method(selector = "dmWillPresentModalViewFromAd:")
	public void dmWillPresentModalViewFromAd(DMAdView adView);
	// Sent just after dismissing the modal view
	//- (void)dmDidDismissModalViewFromAd:(DMAdView *)adView;
	@Method(selector = "dmDidDismissModalViewFromAd:")
	public void dmDidDismissModalViewFromAd(DMAdView adView);
	// Sent just before the application will background or terminate because the user's action
	// (Such as the user clicked on an ad that will launch App Store).
	//- (void)dmApplicationWillEnterBackgroundFromAd:(DMAdView *)adView;
	@Method(selector = "dmApplicationWillEnterBackgroundFromAd:")
	public void dmApplicationWillEnterBackgroundFromAd(DMAdView adView);
}
