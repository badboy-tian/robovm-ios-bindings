package net.mwplay.bmob;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;

public interface BmobBooleanResultBlock {
	 void invoke(boolean isSuccessful, NSError error);
}
