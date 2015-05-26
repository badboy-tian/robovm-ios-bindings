package net.mwplay.admob;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.MachineSizedSInt;

@NativeClass
public class GADInAppPurchase extends NSObject {

    /** @return the in-app purchase product ID. */
    @Property
    public native String getProductID ();

    /** @return the product quantity. */
    @Property
    public native @MachineSizedSInt long getQuantity ();

    /** The GADInAppPurchaseDelegate object must call this method after handling the in-app purchase for both successful and
     * unsuccessful purchase attempts. This method reports ad conversion and purchase status information to Google. */
    @Method(selector = "reportPurchaseStatus:")
    public native void reportPurchaseStatus (GADInAppPurchaseStatus purchaseStatus);
}