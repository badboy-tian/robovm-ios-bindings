package net.mwplay.admob;

import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class DFPInterstitial extends GADInterstitial{

	public DFPInterstitial(String adUnitID) {
		super(adUnitID);
	}

	//@property(nonatomic, copy) NSString *adUnitID;
	//@Property
    //public native String getAdUnitID ();
   // @Property
   // public native void setAdUnitID (String adUnitID);
    
	/// Optional delegate that is notified when creatives send app events.
	//@property(nonatomic, weak) id<GADAppEventDelegate> appEventDelegate;
    @Property
    public native GADAppEventDelegate getAppEventDelegate ();
    @Property
    public native void setAppEventDelegate (GADAppEventDelegate appEventDelegate);
    
	/// Optional delegate object for custom rendered ads.
	//@property(nonatomic, weak)
	//    id<DFPCustomRenderedInterstitialDelegate> customRenderedInterstitialDelegate;
    @Property
    public native DFPCustomRenderedInterstitialDelegate getCustomRenderedInterstitialDelegate ();
    @Property
    public native void setCustomRenderedInterstitialDelegate (DFPCustomRenderedInterstitialDelegate customRenderedInterstitialDelegate);
}
