package net.mwplay.bmob;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class BmobGeoPoint extends NSObject{
	/// 纬度，有效范围 (-90.0, 90.0)
	//@property(nonatomic)double latitude;
	@Property
	public native void setLatitude(double latitude);
	@Property
	public native double getLatitude();
	
	/// 经度，有效范围 (-180.0, 180.0).
	//@property(nonatomic)double longitude;
	@Property
	public native void setLongitude(double longitude);
	@Property
	public native double getLongitude();
	
	/**
	 *	初始化BmobGeoPoint
	 *
	 *  @param	mylongitude	经度
	 *	@param	mylatitude	纬度
	 *
	 *	@return	返回BmobGeoPoint对象
	 */
	//-(id)initWithLongitude:(double)mylongitude   WithLatitude:(double)mylatitude;
	@Method(selector = "initWithLongitude:WithLatitude:")
	public native @Pointer long initWithLongitude(double mylongitude, double mylatitude);
	
	private BmobGeoPoint() {
	}
	
	public BmobGeoPoint(double latitude, double longitude) {
		super((SkipInit)null);
		initObject(initWithLongitude(latitude, longitude));
	}

	/**
	 *	设置经纬度
	 *
	 *	@param	mylongitude	经度
	 *  @param	mylatitude	纬度
	 */
	//-(void)setLongitude:(double)mylongitude Latitude:(double)mylatitude ;
	@Method(selector = "setLongitude:Latitude:")
	public native void setLongitude(double mylongitude, double mylatitude);
}
