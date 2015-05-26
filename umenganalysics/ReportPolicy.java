package net.mwplay.umenganalysics;

import org.robovm.rt.bro.ValuedEnum;

//typedef enum {
//    REALTIME = 0,       //实时发送              (只在测试模式下有效)
//    BATCH = 1,          //启动发送
//    SEND_INTERVAL = 6,  //最小间隔发送           ([90-86400]s, default 90s)
//    
//    // deprecated strategy:
//    SENDDAILY = 4,      //每日发送              (not available)
//    SENDWIFIONLY = 5,   //仅在WIFI下时启动发送   (not available)
//    SEND_ON_EXIT = 7    //进入后台时发送         (not avilable, will be support later)
//} ReportPolicy;

public enum ReportPolicy implements ValuedEnum{
	REALTIME(0),
	BATCH(1),
	SEND_INTERVAL(6)
	;

	private final long n;
	private ReportPolicy(long n){
		this.n = n;
	}
	@Override
	public long value() {
		return n;
	} 
}