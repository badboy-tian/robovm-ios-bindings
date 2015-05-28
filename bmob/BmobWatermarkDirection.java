package net.mwplay.bmob;

import org.robovm.rt.bro.ValuedEnum;

//typedef enum {
//    kBmobDirectionNorthWest = 0,    //水印图在原图的西北位置
//    kBmobDirectionNorth,            //水印图在原图的正北位置
//    kBmobDirectionNorthEast,        //水印图在原图的东北位置
//    kBmobDirectionWest,             //水印图在原图的正西位置
//    kBmobDirectionCenter,           //水印图在原图的中心位置
//    kBmobDirectionEast,             //水印图在原图的正东位置
//    kBmobDirectionSouthWest,        //水印图在原图的西南位置
//    kBmobDirectionSouth,            //水印图在原图的正南位置
//    kBmobDirectionSouthEast         //水印图在原图的东南位置
//}BmobWatermarkDirection;
public enum BmobWatermarkDirection implements ValuedEnum{
	kBmobDirectionNorthWest,
	kBmobDirectionNorth,
	kBmobDirectionNorthEast,
	kBmobDirectionWest,
	kBmobDirectionCenter,
	kBmobDirectionEast,
	kBmobDirectionSouthWest,
	kBmobDirectionSouth,
	kBmobDirectionSouthEast
	;

	@Override
	public long value() {
		return ordinal();
	}

}
