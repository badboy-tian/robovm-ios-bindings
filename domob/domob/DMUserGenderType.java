package net.mwplay.domob;

import org.robovm.rt.bro.ValuedEnum;

public enum DMUserGenderType implements ValuedEnum{
	 Female,
	 Male
	;

	@Override
	public long value() {
		return ordinal();
	}

}
