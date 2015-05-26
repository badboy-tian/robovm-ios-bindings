package net.mwplay.admob;

import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface GADInAppPurchaseDelegate extends NSObjectProtocol {
    /** Called when the user clicks on the buy button of an in-app purchase ad. After the receiver handles the purchase, it must
     * call the {@link GADInAppPurchase#reportPurchaseStatus(GADInAppPurchaseStatus)} method.
     * @param purchase */
    @Method(selector = "didReceiveInAppPurchase:")
    void didReceiveInAppPurchase (GADInAppPurchase purchase);
}
