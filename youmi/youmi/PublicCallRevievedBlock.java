package net.mwplay.youmi;

import java.util.List;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSObjectProtocol;

public interface PublicCallRevievedBlock extends NSObjectProtocol{
	public void invote(List<NSObject> data, NSError error);
}
