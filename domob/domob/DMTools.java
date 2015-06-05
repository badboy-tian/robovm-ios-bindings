package net.mwplay.domob;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class DMTools extends NSObject{
	// init user tool
	//- (id)initWithPublisherId:(NSString *)publisherId;
	@Method(selector = "initWithPublisherId:")
	public native @Pointer long initWithPublisherId(String publisherId);

	// check rate information
	//- (void)checkRateInfo;
	@Method(selector = "checkRateInfo")
	public native void checkRateInfo();
	
	public DMTools(String publisherId) {
		super((SkipInit)null);
		initObject(initWithPublisherId(publisherId));
	}
}
