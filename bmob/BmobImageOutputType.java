package net.mwplay.bmob;

import org.robovm.rt.bro.ValuedEnum;
//typedef enum {
//    kBmobImageOutputBmobFile = 0,   //图片处理后返回BmobFile对象
//    kBmobImageOutputStringStream    //图片处理后输出base64编码的字符串流
//}BmobImageOutputType;
public enum BmobImageOutputType implements ValuedEnum{
	kBmobImageOutputBmobFile,
	kBmobImageOutputStringStream
	;

	@Override
	public long value() {
		return ordinal();
	}

}
