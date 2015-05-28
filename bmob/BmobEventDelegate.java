package net.mwplay.bmob;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface BmobEventDelegate extends NSObjectProtocol{
	/**
	 *  连接上服务器
	 *
	 *  @param event BmobEvent对象
	 */
	//-(void)bmobEventDidConnect:(BmobEvent *)event;
	@Method(selector = "bmobEventDidConnect:")
	public void bmobEventDidConnect(BmobEvent event);

	/**
	 *  连接不了服务器
	 *
	 *  @param event BmobEvent对象
	 *  @param error 错误信息
	 */
	//-(void)bmobEventDidDisConnect:(BmobEvent *)event error:(NSError *)error;
	@Method(selector = "bmobEventDidDisConnect:error:")
	public void bmobEventDidDisConnect(BmobEvent event, NSError error);
	
	/**
	 *  可以订阅或者取消订阅
	 *
	 *  @param event BmobEvent对象
	 */
	//-(void)bmobEventCanStartListen:(BmobEvent*)event;
	@Method(selector = "bmobEventCanStartListen:")
	public void bmobEventCanStartListen(BmobEvent event);

	/**
	 *  BmobEvent发生错误时
	 *
	 *  @param event BmobEvent对象
	 *  @param error 错误信息
	 */
	//-(void)bmobEvent:(BmobEvent*)event error:(NSError *)error;
	@Method(selector = "bmobEvent:error:")
	public void bmobEvent(BmobEvent event, NSError error);

	/**
	 *  订阅事件时，接收信息
	 *
	 *  @param event   BmobEvent对象
	 *  @param message 消息内容
	 */
	//-(void)bmobEvent:(BmobEvent *)event didReceiveMessage:(NSString *)message;
	@Method(selector = "bmobEvent:didReceiveMessage:")
	public void bmobEvent(BmobEvent event, String  message);
}
