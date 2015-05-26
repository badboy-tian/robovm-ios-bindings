package net.mwplay.umenganalysics;

import java.util.List;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;


@NativeClass
public class MobClickSocialAnalytics extends NSObject{
	
	/**
	 发送统计完成的block对象
	 */
	//typedef void (^MobClickSocialAnalyticsCompletion)(NSDictionary * response, NSError *error);


	/**
	负责统计微博类。
	分享微博完成之后需要先构造`MobClickSocialWeibo`组成微博数组，然后再用类方法发送微博数组

	```
	+(void)postWeiboCounts:(NSArray *)weibos appKey:(NSString *)appKey topic:(NSString *)topic completion:(MobClickSocialAnalyticsCompletion)completion;
	```
	 
	例如
	 

	    MobClickSocialWeibo *tencentWeibo = [[MobClickSocialWeibo alloc] initWithPlatformType:UMSocialTypeTencent weiboId:nil userId:@"tencent123" param:@{@"gender":@"1"}];
	    [MobClickSocialAnalytics postWeibos:@[tencentWeibo] appKey:@"507fcab25270157b37000010" topic:@"test" completion:^(NSDictionary *result, NSError *error) {
	    NSLog(@"result is %@", result);
	    }];
	 
	 */
	
	
	/**
	 发送统计微博
	 
	 @param weibos UMSocialWeibo对象组成的数组
	 @param appKey 友盟appkey
	 @param topic 话题，可选，可以设置为nil
	 @parma completion 发送完成的事件处理block
	 
	 */
	//+(void)postWeiboCounts:(NSArray *)weibos appKey:(NSString *)appKey topic:(NSString *)topic completion:(MobClickSocialAnalyticsCompletion)completion;
	//@end
	@Method(selector = "postWeiboCounts:appKey:topic:completion:")
	public native static void postWeiboCounts(List<MobClickSocialWeibo> weibos, String appKey, String topic, @Block MobClickSocialAnalyticsCompletion completion);
}
