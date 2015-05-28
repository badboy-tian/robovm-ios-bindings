package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;

public interface BmobUserResultBlock  {
	 void invoke(BmobUser user, NSError error);
}
