package net.mwplay.admob.mediation;

import net.mwplay.admob.GADAdSize;

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class GADCustomEventExtras extends NSObject{
	/// Set additional parameters for the custom event with label |label|. To remove additional
	/// parameters associated with |label|, pass in nil for |extras|.
	//- (void)setExtras:(NSDictionary *)extras forLabel:(NSString *)label;
	@Method(selector = "setExtras:forLabel:")
	public native void setExtras(NSDictionary extras, String label);

	/// Retrieve the extras for |label|.
	//- (NSDictionary *)extrasForLabel:(NSString *)label;
	@Method(selector = "extrasForLabel:")
	public native NSDictionary extrasForLabel(String label);

	/// Removes all the extras set on this instance.
	//- (void)removeAllExtras;
	@Method(selector = "removeAllExtras")
	public native void removeAllExtras();

	/// Returns all the extras set on this instance.
	//- (NSDictionary *)allExtras;
	@Method(selector = "allExtras")
	public native NSDictionary allExtras();
}
