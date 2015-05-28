package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;

public interface BmobGeoPointBlock  {
	 void invoke(BmobGeoPoint geoPoint, NSError error);
}
