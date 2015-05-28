package net.mwplay.bmob;

import org.robovm.rt.bro.ValuedEnum;

//typedef enum {
//    BmobActionTypeUpdateTable = 0,  //表更新
//    BmobActionTypeUpdateRow,        //行更新
//    BmobActionTypeDeleteTable,      //表删除
//    BmobActionTypeDeleteRow         //行删除
//}BmobActionType;
public enum BmobActionType implements ValuedEnum{
	BmobActionTypeUpdateTable,
	BmobActionTypeUpdateRow,
	BmobActionTypeDeleteTable,
	BmobActionTypeDeleteRow
	;

	@Override
	public long value() {
		return ordinal();
	}

}
