package net.mwplay.admob;

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class GADExtras extends GADAdNetworkExtras{
	/// Additional parameters to be sent to Google networks.
	//@property(nonatomic, copy) NSDictionary *additionalParameters;
	@Property
	public native void setAdditionalParameters(NSDictionary additionalParameters);
	@Property
	public native NSDictionary getAdditionalParameters();
}
