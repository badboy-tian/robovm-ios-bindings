package net.mwplay.admob.mediation;

import java.util.List;

import net.mwplay.admob.GADGender;

import org.robovm.apple.coregraphics.CGFont;
import org.robovm.apple.foundation.NSDate;
import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class GADCustomEventRequest extends NSObject{
	/// The end user's gender set in GADRequest. If not specified, returns kGADGenderUnknown.
	//@property(nonatomic, readonly, assign) GADGender userGender;
	  @Property
	  public native GADGender getUserGender ();
	/// The end user's birthday set in GADRequest. If not specified, returns nil.
	//@property(nonatomic, readonly, copy) NSDate *userBirthday;
	  @Property
	  public native NSDate getUserBirthday ();
	  
	/// The end user's latitude, longitude, and accuracy, set in GADRequest. If not specified,
	/// userHasLocation returns NO, and userLatitude, userLongitude and userLocationAccuracyInMeters
	/// will all return 0.
	//@property(nonatomic, readonly, assign) BOOL userHasLocation;
	//@property(nonatomic, readonly, assign) CGFloat userLatitude;
	//@property(nonatomic, readonly, assign) CGFloat userLongitude;
	//@property(nonatomic, readonly, assign) CGFloat userLocationAccuracyInMeters;
	  @Property
	  public native boolean getUserHasLocation ();
	  @Property
	  public native CGFont getUserLatitude ();
	  @Property
	  public native CGFont getUserLongitude ();
	  @Property
	  public native CGFont getUserLocationAccuracyInMeters ();

	/// Description of the user's location, in free form text, set in GADRequest. If not available,
	/// returns nil. This may be set even if userHasLocation is NO.
	//@property(nonatomic, readonly, copy) NSString *userLocationDescription;

	/// Keywords set in GADRequest. Returns nil if no keywords are set.
	//@property(nonatomic, readonly, copy) NSArray *userKeywords;
	  @Property
	  public native List<String> getUserKeywords ();

	/// The additional parameters set by the application. This property allows you to pass additional
	/// information from your application to your Custom Event object. To do so, create an instance of
	/// GADCustomEventExtras to pass to GADRequest -registerAdNetworkExtras:. The instance should have
	/// an NSDictionary set for a particular custom event label. That NSDictionary becomes the
	/// additionalParameters here.
	//@property(nonatomic, readonly, copy) NSDictionary *additionalParameters;
	  @Property
	  public native NSDictionary getAdditionalParameters ();

	/// Indicates if the testing property has been set in GADRequest.
	//@property(nonatomic, readonly, assign) BOOL isTesting;
	  @Property
	  public native boolean getIsTesting ();
}
