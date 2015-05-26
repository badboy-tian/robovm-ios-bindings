package net.mwplay.admob;

import java.util.List;

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class DFPRequest extends NSObject{
	/// Publisher provided user ID.
	//@property(nonatomic, copy) NSString *publisherProvidedID;
	@Property
    public native String getPublisherProvidedID ();
    @Property
    public native void setPublisherProvidedID (String publisherProvidedID);
    
	/// Array of strings used to exclude specified categories in ad results.
	//@property(nonatomic, copy) NSArray *categoryExclusions;
    @Property
    public native List<String> getCategoryExclusions ();
    @Property
    public native void setCategoryExclusions (List<String> categoryExclusions);

	/// Key-value pairs used for custom targeting.
	//@property(nonatomic, copy) NSDictionary *customTargeting;
    @Property
    public native NSDictionary getCustomTargeting ();
    @Property
    public native void setCustomTargeting (NSDictionary customTargeting);

	/// Update the ad correlator. Ad slots with the same correlation value are grouped for roadblocking.
	/// After updating the correlator, load new requests in all DFP ads.
	//+ (void)updateCorrelator;
    @Method(selector = "updateCorrelator")
    public native void updateCorrelator();

}
