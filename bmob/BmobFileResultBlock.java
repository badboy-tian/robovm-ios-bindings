package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSObjectProtocol;

public interface BmobFileResultBlock  {
	 void invoke(boolean isSuccessful,NSError error,String filename,String url);
}
