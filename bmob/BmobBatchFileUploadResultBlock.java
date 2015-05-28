package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSObjectProtocol;

public interface BmobBatchFileUploadResultBlock  {
	 void invoke(List<String> filenameArray,List<String>urlArray,NSError error);
}
