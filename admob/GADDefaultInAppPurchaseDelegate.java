package net.mwplay.admob;

import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface GADDefaultInAppPurchaseDelegate extends NSObjectProtocol{
	/// Called when the user successfully paid for a purchase. You must first deliver the purchased
	/// item to the user, then call defaultInAppPurchase's finishTransaction method.
	//- (void)userDidPayForPurchase:(GADDefaultInAppPurchase *)defaultInAppPurchase;
	@Method(selector = "userDidPayForPurchase:")
	public void userDidPayForPurchase(GADDefaultInAppPurchase defaultInAppPurchase);

	/// Called when the user clicks on the buy button of an in-app purchase ad. Return YES if the
	/// default purchase flow should be started to purchase the item, otherwise return NO. If not
	/// implemented, defaults to YES.
	//- (BOOL)shouldStartPurchaseForProductID:(NSString *)productID quantity:(NSInteger)quantity;
	@Method(selector = "shouldStartPurchaseForProductID:quantity:")
	public boolean userDidPayForPurchase(String productID, int quantity);
}
