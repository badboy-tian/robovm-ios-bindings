package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;

public interface BmobFileBlock {
	 void invoke(BmobFile file,NSError error);
}
