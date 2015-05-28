package net.mwplay.bmob;

import org.robovm.rt.bro.ValuedEnum;

//typedef enum {
//    BmobSNSPlatformQQ = 0,          //qq平台
//    BmobSNSPlatformSinaWeibo        //新浪微博
//}BmobSNSPlatform;
public enum BmobSNSPlatform implements ValuedEnum{
	BmobSNSPlatformQQ,
	BmobSNSPlatformSinaWeibo
	;

	@Override
	public long value() {
		return ordinal();
	}

}
