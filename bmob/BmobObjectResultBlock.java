package net.mwplay.bmob;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;

public interface BmobObjectResultBlock {
	 void invoke(BmobObject object, NSError error);
}
