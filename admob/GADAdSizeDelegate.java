package net.mwplay.admob;

import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface GADAdSizeDelegate extends NSObjectProtocol{
	/// Called before the ad view changes to the new size.
	//- (void)adView:(GADBannerView *)bannerView willChangeAdSizeTo:(GADAdSize)size;
	@Method(selector = "adView:willChangeAdSizeTo:")
	public void adView(GADBannerView bannerView, GADAdSize size);
}
