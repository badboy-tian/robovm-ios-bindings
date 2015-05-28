package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;

public interface BmobObjectArrayResultBlock  {
	 void invoke(List<BmobObject> objects, NSError error);
}
