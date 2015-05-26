package net.mwplay.admob;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class GADDefaultInAppPurchase extends NSObject{
	/// The consumable in-app purchase item that has been purchased by the user. The purchase flow is
	/// handled by the Google Mobile Ads SDK.
	/// Instances of this class are created and passed to your in-app purchase delegate after the user
	/// has successfully paid for a product. Your code must correctly deliver the product to the user
	/// and then call the didCompletePurchase method to finish the transaction.
	/// Enables the default consumable product in-app purchase flow handled by the Google Mobile Ads
	/// SDK. The GADDefaultInAppPurchaseDelegate object is retained while the default purchase flow is
	/// enabled. This method adds a SKPaymentTransactionObserver to the default SKPaymentQueue. Remove
	/// any existing transaction observers before calling this method.
	///
	/// Call this method early in your application to handle unfinished transactions from previous
	/// application sessions. For example, call this method in your application delegate's
	/// application:didFinishLaunchingWithOptions: method.
	//+ (void)enableDefaultPurchaseFlowWithDelegate:(id<GADDefaultInAppPurchaseDelegate>)delegate;
	@Method(selector = "enableDefaultPurchaseFlowWithDelegate:")
	public native static void enableDefaultPurchaseFlowWithDelegate(GADDefaultInAppPurchaseDelegate delegate);
	
	/// Disables the default in-app purchase flow handled by the Google Mobile Ads SDK and releases the
	/// associated GADDefaultInAppPurchaseDelegate object.
	//+ (void)disableDefaultPurchaseFlow;

	/// The in-app purchase product ID.
	//@property(nonatomic, readonly, copy) NSString *productID;
	@Property
	public native void setProductID(String productID);
	@Property
	public native String getProductID();

	/// The product quantity.
	//@property(nonatomic, readonly, assign) NSInteger quantity;
	@Property
	public native void setQuantity(int quantity);
	@Property
	public native int getQuantity();

	/// The purchased item's completed payment transaction. Your application can use this property's
	/// data to save a permanent record of the completed payment. The default purchase flow will finish
	/// the transaction on your behalf. Do not finish the transaction yourself.
	//@property(nonatomic, readonly, strong) SKPaymentTransaction *paymentTransaction;

	/// The in-app purchase delegate object must first deliver the user's item and then call this
	/// method. Failure to call this method will result in duplicate purchase notifications.
	//- (void)finishTransaction;
	@Method(selector = "finishTransaction")
	public native void finishTransaction();
}
