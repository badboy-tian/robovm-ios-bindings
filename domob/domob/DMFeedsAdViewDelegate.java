package net.mwplay.domob;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface DMFeedsAdViewDelegate extends NSObjectProtocol{
	// Sent when an ad request success to load an ad
	//- (void)dmFeedsSuccessToLoadAd:(DMFeedsAdView *)dmFeeds;
	@Method(selector = "dmFeedsSuccessToLoadAd:")
	public void dmFeedsSuccessToLoadAd(DMFeedsAdView dmFeeds);
	// Sent when an ad request fail to load an ad
	//- (void)dmFeedsFailToLoadAd:(DMFeedsAdView *)dmFeeds withError:(NSError *)err;
	@Method(selector = "dmFeedsFailToLoadAd:withError:")
	public void dmFeedsFailToLoadAd(DMFeedsAdView dmFeeds, NSError err);
	// Sent when the feeds ad is clicked
	//- (void)dmFeedsDidClicked:(DMFeedsAdView *)dmFeeds;
	@Method(selector = "dmFeedsDidClicked:")
	public void dmFeedsDidClicked(DMFeedsAdView dmFeeds);

	// Sent just before presenting the user a modal view
	//- (void)dmFeedsWillPresentModalView:(DMFeedsAdView *)dmFeeds;
	@Method(selector = "dmFeedsWillPresentModalView:")
	public void dmFeedsWillPresentModalView(DMFeedsAdView dmFeeds);
	// Sent just after dismissing the modal view
	//- (void)dmFeedsDidDismissModalView:(DMFeedsAdView *)dmFeeds;
	@Method(selector = "dmFeedsDidDismissModalView:")
	public void dmFeedsDidDismissModalView(DMFeedsAdView dmFeeds);
	// Sent just before the application will background or terminate because the user's action
	// (Such as the user clicked on an ad that will launch App Store).
	//- (void)dmFeedsApplicationWillEnterBackground:(DMFeedsAdView *)dmFeeds;
	@Method(selector = "dmFeedsApplicationWillEnterBackground:")
	public void dmFeedsApplicationWillEnterBackground(DMFeedsAdView dmFeeds);

	// Sent just before presenting an feeds ad view
	//- (void)dmFeedsWillPresentScreen:(DMFeedsAdView *)dmFeeds;
	@Method(selector = "dmFeedsWillPresentScreen:")
	public void dmFeedsWillPresentScreen(DMFeedsAdView dmFeeds);
	// Sent just after dismissing a feeds ad view
	//- (void)dmFeedsDidDismissScreen:(DMFeedsAdView *)dmFeeds;
	@Method(selector = "dmFeedsDidDismissScreen:")
	public void dmFeedsDidDismissScreen(DMFeedsAdView dmFeeds);
}
