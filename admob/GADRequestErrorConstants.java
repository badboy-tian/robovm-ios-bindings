package net.mwplay.admob;

import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass("GADRequestErrorWrapped")
class GADRequestErrorConstants {
	private GADRequestErrorConstants () {
	}

	@Method(selector = "kGADErrorDomain")
	public static native String errorDomain ();
}
