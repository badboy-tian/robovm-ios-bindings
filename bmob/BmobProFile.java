package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSData;
import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class BmobProFile extends NSObject{

/**
 *  上传文件
 *
 *  @param path          路径
 *  @param block         上传的结果
 *  @param progressBlock 上传的进度
 */
//+(void)uploadFileWithPath:(NSString *)path
 //                   block:(BmobFileResultBlock)block
//                 progress:(BmobProgressBlock)progressBlock;
	@Method(selector = "uploadFileWithPath:block:progress:")
	public native static void uploadFileWithPath(String path, @Block BmobFileResultBlock block, @Block BmobProgressBlock progressBlock);
	
/**
 *  上传文件
 *
 *  @param filename      文件名(带后缀)
 *  @param data          文件的数据
 *  @param block         上传的结果
 *  @param progressBlock 上传的进度
 */
//+(void)uploadFileWithFilename:(NSString *)filename
//                     fileData:(NSData *)data
//                        block:(BmobFileResultBlock)block
//                     progress:(BmobProgressBlock)progressBlock;
	@Method(selector = "uploadFileWithFilename:fileData:block:progress:")
	public native static void uploadFileWithFilename(String filename, NSData data, @Block BmobFileResultBlock block, @Block BmobProgressBlock progressBlock);
	
/**
 *  批量上传文件
 *
 *  @param array 文件的路径
 */
//+(void)uploadFilesWithPaths:(NSArray *)array
//                resultBlock:(BmobBatchFileUploadResultBlock)block
//                   progress:(BmobIndexAndProgressBlock)progress;
	@Method(selector = "uploadFileWithPaths:resultBlock:progress:")
	public native static void uploadFileWithPaths(List<String> paths,@Block BmobBatchFileUploadResultBlock block,@Block  BmobIndexAndProgressBlock progressBlock);

/**
 *  批量上传文件
 *
 *  @param dataArray 数组中存放的NSDictionary，NSDictionary里面的格式为@{@"filename":@"你的文件名",@"data":文件的data}
 *  文件名需要带后缀
 *  @param block     上传文件的结果回调
 *  @param progress  上传文件的进度回调，表示当前是第几个，进度多少
 */
//+(void)uploadFilesWithDatas:(NSArray *)dataArray
//                resultBlock:(BmobBatchFileUploadResultBlock)block 
//                   progress:(BmobIndexAndProgressBlock)progress;
	@Method(selector = "uploadFilesWithDatas:resultBlock:progress:")
	public native static void uploadFilesWithDatas(List<NSDictionary> dataArray,@Block BmobBatchFileUploadResultBlock block,@Block BmobIndexAndProgressBlock progressBlock);

/**
 *  下载文件
 *
 *  @param filename      文件名
 *  @param block         下载的结果
 *  @param progressBlock 下载的进度
 */
//+(void)downloadFileWithFilename:(NSString *)filename
//                          block:(BmobFileDownloadResultBlock)block
//                       progress:(BmobProgressBlock)progressBlock;
	@Method(selector = "downloadFileWithFilename:block:progress:")
	public native static void downloadFileWithFilename(String filename,@Block BmobFileDownloadResultBlock block,@Block BmobProgressBlock progressBlock);

/**
 *  存放下载文件的图片的文件夹的大小
 *
 *  @return 文件夹的大小
 */
//+(long long)cacheFizesSize;
	@Method(selector = "cacheFizesSize")
	public native static long cacheFizesSize();
	
/**
 *  清除下载的图片跟缩略图图片
 */
//+(void)cleanCache;
@Method(selector = "cleanCache")
public native static void cleanCache();

/**
 *  缩略图处理
 *
 *  @param filename 图片的文件名
 *  @param ruleID   规格ID
 *  @param block    处理的结果信息，包括是否成功，错误信息，文件名，文件的url地址
 */
//+(void)thumbnailImageWithFilename:(NSString *)filename
 //                          ruleID:(NSUInteger)ruleID
 //                     resultBlock:(BmobFileResultBlock)block;
@Method(selector = "thumbnailImageWithFilename:ruleID:resultBlock:")
public native static void thumbnailImageWithFilename(String filename, int ruleID,@Block BmobFileResultBlock block);

/**
 *  本地缩略图处理
 *
 *  @param filepath 图片的路径
 *  @param ruleID   规格ID
 *  @param block    处理的结果信息，包括是否成功，错误信息，文件的地址
 */
//+(void)localThumbnailImageWithFilepath:(NSString *)filepath
//                               ruleID:(NSUInteger)ruleID
//                           resultBlock:(BmobLocalImageResultBlock)block;
@Method(selector = "localThumbnailImageWithFilepath:ruleID:resultBlock:")
public native static void localThumbnailImageWithFilepath(String filepath, int ruleID,@Block BmobFileResultBlock block);

/**
 *  本地缩略图处理
 *
 *  @param filepath 图片的路径
 *  @param m        图片处理的模式
 *  @param w        宽度
 *  @param h        高度
 *  @param block    处理的结果信息，包括是否成功，错误信息，文件的地址
 */
//+(void)localThumbnailImageWithFilepath:(NSString *)filepath
//                                  mode:(ThumbnailImageScaleMode )m
//                                 width:(CGFloat)w
//                                height:(CGFloat)h
//                           resultBlock:(BmobLocalImageResultBlock)block;
@Method(selector = "localThumbnailImageWithFilepath:mode:width:height:resultBlock:")
public native static void localThumbnailImageWithFilepath(String filepath, ThumbnailImageScaleMode m, float w, float h,@Block BmobLocalImageResultBlock block);

/**
 *  开启安全验证后的url签名
 *
 *  @param filename  文件名
 *  @param urlString 文件的url地址
 *  @param validTime 有效时间 单位：秒
 *  @param a         accessKey
 *  @param s         secretKey
 *
 *  @return 签名后的url地址
 */
//+(NSString *)signUrlWithFilename:(NSString *)filename
 //                            url:(NSString *)urlString
 //                      validTime:(int)validTime
//                       accessKey:(NSString *)a
 //                      secretKey:(NSString *)s;
@Method(selector = "signUrlWithFilename:url:validTime:accessKey:secretKey:")
public native static String signUrlWithFilename(String filename, String urlString, int validTime, String a, String s);
}
