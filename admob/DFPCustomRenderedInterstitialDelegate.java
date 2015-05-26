package net.mwplay.admob;

import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface DFPCustomRenderedInterstitialDelegate extends NSObjectProtocol{
	/// Called after ad data has been received. You must construct an interstitial from
	/// |customRenderedAd| and call the |customRenderedAd| object's finishedRenderingAdView: method when
	/// the ad has been rendered.
	//- (void)interstitial:(DFPInterstitial *)interstitial
	 //   didReceiveCustomRenderedAd:(DFPCustomRenderedAd *)customRenderedAd;
	@Method(selector = "interstitial:didReceiveCustomRenderedAd:")
	public void  interstitial(DFPInterstitial interstitial, DFPCustomRenderedAd customRenderedAd);
}
