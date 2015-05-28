package net.mwplay.bmob;

import org.robovm.rt.bro.ValuedEnum;

//typedef enum {
//    ThumbnailImageScaleModeWidth    = 1,//指定宽，高自适应，等比例缩放;
//    ThumbnailImageScaleModeHeight   = 2,//指定高， 宽自适应，等比例缩放
//    ThumbnailImageScaleModeLongest  = 3,//指定最长边，短边自适应，等比例缩放;
//    ThumbnailImageScaleModeShortest = 4,//指定最短边，长边自适应，等比例缩放;
//    ThumbnailImageScaleModeMax      = 5,//指定最大宽高， 等比例缩放;
//    ThumbnailImageScaleModeFixed    = 6 //固定宽高， 居中裁剪
//}ThumbnailImageScaleMode;
public enum ThumbnailImageScaleMode implements ValuedEnum{
	ThumbnailImageScaleModeNone,
	ThumbnailImageScaleModeWidth,
	ThumbnailImageScaleModeHeight,
	ThumbnailImageScaleModeLongest,
	ThumbnailImageScaleModeShortest,
	ThumbnailImageScaleModeMax,
	ThumbnailImageScaleModeFixed
	;

	@Override
	public long value() {
		return ordinal();
	}

}
