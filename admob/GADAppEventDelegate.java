package net.mwplay.admob;

import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface GADAppEventDelegate extends NSObjectProtocol{
	/// Called when the banner receives an app event.
	//- (void)adView:(GADBannerView *)banner
	//    didReceiveAppEvent:(NSString *)name
	//              withInfo:(NSString *)info;
	@Method(selector = "adView:didReceiveAppEvent:withInfo:")
	public void adView(GADBannerView banner, String name, String info);

	/// Called when the interstitial receives an app event.
	//- (void)interstitial:(GADInterstitial *)interstitial
	//    didReceiveAppEvent:(NSString *)name
	//              withInfo:(NSString *)info;
	@Method(selector = "interstitial:didReceiveAppEvent:withInfo:")
	public void interstitial(GADInterstitial interstitial, String name, String info);
}
