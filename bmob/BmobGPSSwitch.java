package net.mwplay.bmob;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class BmobGPSSwitch extends NSObject{
	/**
	 *  是否打开GPS
	 *
	 *  @param turnOn 是否打开GPS
	 */
	//+(void)gpsSwitch:(BOOL)turnOn;
	@Method(selector = "gpsSwitch:")
	public native static void gpsSwitch(boolean turnOn);
}
