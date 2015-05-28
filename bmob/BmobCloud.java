package net.mwplay.bmob;

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class BmobCloud extends NSObject{
	/**
	 *  传入参数同步调用云函数
	 *
	 *  @param function   函数名
	 *  @param parameters 传递给函数的参数
	 *
	 *  @return 云函数响应结果
	 */
	//+(id)callFunction:(NSString *)function withParameters:(NSDictionary *)parameters;
	@Method(selector = "callFunction:withParameters:")
	public native static BmobCloud callFunction(String function, NSDictionary parameters);
	
	/**
	 *  异步调用云函数
	 *
	 *  @param function   函数名
	 *  @param parameters 传递给函数的参数
	 *  @param block      云函数响应结果跟信息
	 */
	//+(void)callFunctionInBackground:(NSString *)function withParameters:(NSDictionary *)parameters block:(BmobIdResultBlock)block;
	@Method(selector = "callFunctionInBackground:withParameters:block:")
	public native static void callFunctionInBackground(String function, NSDictionary parameters, @Block BmobIdResultBlock block);
}
