package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSObjectProtocol;

public interface BmobFileDownloadResultBlock  {
	 void invoke(boolean isSuccessful,NSError error,String filename,String filepath);
}
