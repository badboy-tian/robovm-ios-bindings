package net.mwplay.admob;

import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface DFPCustomRenderedBannerViewDelegate extends NSObjectProtocol{
	/// Called after ad data has been received. You must construct a banner from |customRenderedAd| and
	/// call the |customRenderedAd| object's finishedRenderingAdView: when the ad is rendered.
	//- (void)interstitial:(DFPInterstitial *)interstitial
	 //   didReceiveCustomRenderedAd:(DFPCustomRenderedAd *)customRenderedAd;
	@Method(selector = "bannerView:didReceiveCustomRenderedAd:")
	public void  bannerView(DFPBannerView bannerView, DFPCustomRenderedAd customRenderedAd);
}
