package net.mwplay.admob;

import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class DFPBannerView extends GADBannerView{

	public DFPBannerView(GADAdSize size, CGPoint origin) {
		super(size, origin);
	}

	public DFPBannerView(GADAdSize size) {
		super(size);
	}

	//@property(nonatomic, weak) IBOutlet id<GADAppEventDelegate> appEventDelegate;
	@Property
    public native GADAppEventDelegate getAppEventDelegate ();
    @Property
    public native void setAppEventDelegate (GADAppEventDelegate GADAppEventDelegate);

	/// Optional delegate that is notified when creatives cause the banner to change size. To avoid
	/// crashing the app, remember to nil this property before releasing the object that implements the
	/// GADAdSizeDelegate protocol.
	//@property(nonatomic, weak) IBOutlet id<GADAdSizeDelegate> adSizeDelegate;
    @Property
    public native GADAdSizeDelegate getAdSizeDelegate ();
    @Property
    public native void setAdSizeDelegate (GADAdSizeDelegate adSizeDelegate);
}
