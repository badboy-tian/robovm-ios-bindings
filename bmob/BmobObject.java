package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSDate;
import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class BmobObject extends NSObject{
	/**
	 *	 BmobObject对象的id
	 */
	//@property(nonatomic,copy)NSString *objectId;
	@Property
	public native void setObjectId(String objectId);
	@Property
	public native String getObjectId();

	/**
	 *	 BmobObject对象的最后更新时间
	 */
	//@property(nonatomic,retain)NSDate *updatedAt;
	@Property
	public native void setUpdatedAt(NSDate updatedAt);
	@Property
	public native NSDate getUpdatedAt();
	
	/**
	 *	 BmobObject对象的生成时间
	 */
	//@property(nonatomic,retain)NSDate *createdAt;
	@Property
	public native void setCreatedAt(NSDate createdAt);
	@Property
	public native NSDate getCreatedAt();
	
	/**
	 *  BmobObject对象的表名
	 */
	//@property(nonatomic,copy)NSString * className;
	@Property
	public native void setClassName(String className);
	@Property
	public native String getClassName();

	/**
	 *  权限控制里列表
	 */
	//@property(nonatomic,retain)BmobACL *ACL;
	@Property
	public native void setACL(BmobACL ACL);
	@Property
	public native BmobACL getACL();

	/**
	 *	创建一个带有className的BmobObject对象
	 *
	 *	@param	className	表示对象名称(类似数据库表名)
	 *
	 *	@return	BmobObject
	 */
	//+(instancetype )objectWithClassName:(NSString*)className;
	@Method(selector = "objectWithClassName:")
	public native static BmobObject objectWithClassName(String className);

	/**
	 *  创建一个带有className 和objectId的BmobObject对象
	 *
	 *  @param className 表名
	 *  @param objectId  对象的id
	 *
	 *  @return BmobObject对象
	 */
	//+(instancetype)objectWithoutDatatWithClassName:(NSString*)className objectId:(NSString *)objectId;
	@Method(selector = "objectWithoutDatatWithClassName:objectId:")
	public native static BmobObject objectWithoutDatatWithClassName(String className, String objectId);
	
	public BmobObject(String className) {
		super((SkipInit)null);
		initObject(initWithClassName(className));
	}
	
//	public BmobObject(String className, String objectId) {
//		super((SkipInit)null);
//		initObject(registerWithAppKey(className, objectId));
//	}
	
	/**
	 *	通过对象名称（类似数据库表名）初始化BmobObject对象
	 *
	 *	@param	className	表示对象名称(类似数据库表名)
	 *
	 *	@return	BmobObject
	 */
	//-(id)initWithClassName:(NSString*)className;
	@Method(selector = "initWithClassName:")
	public native @Pointer long initWithClassName(String className);
	
	/**
	 *	向BmobObject对象添加数据
	 *
	 *	@param	obj	数据
	 *	@param	aKey	键
	 */
	//-(void)setObject:(id)obj forKey:(NSString*)aKey;
	@Method(selector = "setObject:forKey:")
	public native void setObject(NSObject obj, String aKey);

	/**
	 *  为列创建关联关系
	 *
	 *  @param relation 关联关系
	 *  @param key      列
	 */
	//-(void)addRelation:(BmobRelation *)relation forKey:(id)key;
	@Method(selector = "addRelation:forKey:")
	public native void addRelation(BmobRelation relation, String key);
	
	/**
	 *  批量向BmobObject添加数据,可与 -(void)setObject:(id)obj forKey:(NSString*)aKey;一同使用
	 *
	 *  @param dic 数据
	 */
	//-(void)saveAllWithDictionary:(NSDictionary*)dic;
	@Method(selector = "saveAllWithDictionary:")
	public native void saveAllWithDictionary(NSDictionary dic);
	
	/**
	 *	得到BombObject对象某个列的值
	 *
	 *	@param	aKey	列名
	 *
	 *	@return	该列的值
	 */
	//-(id)objectForKey:(id)aKey;
	@Method(selector = "objectForKey:")
	public native BmobObject objectForKey(String aKey);

	/**
	 *  删除BmobObject对象的某列的值
	 *
	 *  @param key 列名
	 */
	//-(void)deleteForKey:(id)key;
	@Method(selector = "deleteForKey:")
	public native void deleteForKey(NSObject key);

	//#pragma mark  array add and remove
	/**
	 *  向给定的列添加数组
	 *
	 *  @param objects 想要添加的数组
	 *  @param key     给定的列名
	 */
	//-(void)addObjectsFromArray:(NSArray *)objects forKey:(NSString *)key;
	@Method(selector = "addObjectsFromArray:forKey:")
	public native void addObjectsFromArray(List<NSObject> objects, String key);
	
	/**
	 *  向给定的列添加数组，只会在原本数组字段中没有这些对象的情形下才会添加入数组
	 *
	 *  @param objects 想要添加的数组
	 *  @param key     给定的列名
	 */
	//-(void)addUniqueObjectsFromArray:(NSArray *)objects forKey:(NSString *)key;
	@Method(selector = "addUniqueObjectsFromArray:forKey:")
	public native void addUniqueObjectsFromArray(List<NSObject> objects, String key);
	
	/**
	 *  从一个数组字段的值内移除指定的数组中的所有对象
	 *
	 *  @param objects 想要移除的数组
	 *  @param key     给定的列名
	 */
	//-(void)removeObjectsInArray:(NSArray *)objects forKey:(NSString *)key;
	@Method(selector = "removeObjectsInArray:forKey:")
	public native void removeObjectsInArray(List<NSObject> objects, String key);



	//#pragma mark increment and decrment

	/**
	 *  列的值+1
	 *
	 *  @param key 列名
	 */
	//-(void)incrementKey:(NSString *)key;
	@Method(selector = "incrementKey:")
	public native void incrementKey(String key);
	
	/**
	 *  列的值加 amount
	 *
	 *  @param key    列的值
	 *  @param amount 增加的数值
	 */
	//-(void)incrementKey:(NSString *)key byAmount:(NSInteger )amount;
	@Method(selector = "incrementKey:byAmount:")
	public native void incrementKey(String key, int amount);
	
	/**
	 *  列的值-1
	 *
	 *  @param key 列名
	 */
	//-(void)decrementKey:(NSString *)key;
	@Method(selector = "decrementKey:")
	public native void decrementKey(String key);
	
	/**
	 *  列的值减 amount
	 *
	 *  @param key    列的值
	 *  @param amount 减去的数值
	 */
	//-(void)decrementKey:(NSString *)key byAmount:(NSInteger )byAmount;
	@Method(selector = "decrementKey:byAmount:")
	public native void decrementKey(String key, int byAmount);


	//#pragma mark networking

	/**
	 *	后台保存BmobObject对象，没有返回结果
	 */
	//-(void)saveInBackground;
	@Method(selector = "saveInBackground")
	public native void saveInBackground(String key, int byAmount);
	
	/**
	 *	后台保存BmobObject对象，返回保存的结果
	 *
	 *	@param	block	返回保存的结果是成功还是失败
	 */
	//-(void)saveInBackgroundWithResultBlock:(BmobBooleanResultBlock)block;
	@Method(selector = "saveInBackgroundWithResultBlock:")
	public native void saveInBackgroundWithResultBlock(@Block BmobBooleanResultBlock block);
	
	/**
	 *	后台更新BmobObject对象，没有返回结果
	 */
	//-(void)updateInBackground;
	@Method(selector = "updateInBackground")
	public native void updateInBackground();
	
	/**
	 *	后台更新BmobObject对象
	 *
	 *	@param	block	返回更新的结果是成功还是失败
	 */
	//-(void)updateInBackgroundWithResultBlock:(BmobBooleanResultBlock)block;
	@Method(selector = "updateInBackgroundWithResultBlock:")
	public native void updateInBackgroundWithResultBlock(@Block BmobBooleanResultBlock block);
	
	/**
	 *	后台删除BmobObject对象，没有返回结果
	 */
	//-(void)deleteInBackground;
	@Method(selector = "deleteInBackground")
	public native void deleteInBackground();
	
	/**
	 *	后台删除BmobObject对象
	 *
	 *	@param	block	返回删除的结果是成功还是失败
	 */
	//-(void)deleteInBackgroundWithBlock:(BmobBooleanResultBlock)block;
	@Method(selector = "deleteInBackgroundWithBlock:")
	public native void deleteInBackgroundWithBlock(@Block BmobBooleanResultBlock block);

}
