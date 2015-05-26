package net.mwplay.umenganalysics;

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSError;

public interface MobClickSocialAnalyticsCompletion {
	 void invoke(NSDictionary response, NSError error);
}
