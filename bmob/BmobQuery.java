package net.mwplay.bmob;

import java.util.List;

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

@NativeClass
public class BmobQuery extends NSObject{
	//放在这里可以允许用户直接设置
	/**
	 *	限制得到多少个结果
	 */
	//@property (nonatomic) NSInteger limit;
	@Property
	public native void setLimit(int limit);
	@Property
	public native int getLimit();
	
	/**
	 *	查询结果跳到第几个
	 */
	//@property (nonatomic) NSInteger skip;
	@Property
	public native void setSkip(int skip);
	@Property
	public native int getSkip();
	
	/**
	 *	缓存策略
	 */
	//@property(assign)BmobCachePolicy cachePolicy;
	@Property
	public native void setCachePolicy(BmobCachePolicy cachePolicy);
	@Property
	public native BmobCachePolicy getCachePolicy();
	
	/**
	 *	缓存有效时间
	 */
	//@property (readwrite, assign) NSTimeInterval maxCacheAge;
	@Property
	public native void setMaxCacheAge(double maxCacheAge);
	@Property
	public native double getMaxCacheAge();

	/**
	 *  统计时是否返回记录数
	 */
	//@property BOOL isGroupcount;
	@Property
	public native void setIsGroupcount(boolean isGroupcount);
	@Property
	public native boolean getIsGroupcount();

	/**
	 *	查询对象
	 *
	 *	@param	className	对象名称（数据库表名）
	 *
	 *	@return	BmobQuery查询对象
	 */
	//+(BmobQuery*)queryWithClassName:(NSString *)className;
	@Method(selector = "queryWithClassName:")
	private native static  BmobQuery queryWithClassName(String className);

	/**
	 *  查询用户表
	 *
	 *  @return BmobQuery查询对象
	 */
	//+(BmobQuery*)queryForUser;
	@Method(selector = "queryForUser")
	private native static  BmobQuery queryForUser();

	/**
	 *	通过className初始化BmobQuery对象
	 *
	 *	@param	className	对象名称（数据库表名）
	 *
	 *	@return	BmobQuery查询对象
	 */
	//-(id)initWithClassName:(NSString *)className;
	@Method(selector = "initWithClassName:")
	private native @Pointer long initWithClassName(String className);

	public BmobQuery(String className) {
		super((SkipInit)null);
		initObject(initWithClassName(className));
	}

	//#pragma mark 排序



	/**
	 *	按key进行升序排序
	 *
	 *	@param	key	列名
	 */
	//-(void)orderByAscending:(NSString *)key ;
	@Method(selector = "orderByAscending:")
	public native void orderByAscending(String key);
	
	/**
	 *	按key进行降序排序
	 *
	 *	@param	key	列名
	 */
	//-(void)orderByDescending:(NSString *)key ;
	@Method(selector = "orderByDescending:")
	public native void orderByDescending(String key);


	//#pragma mark 查询条件

	/**
	 *  添加需要返回类型的列名
	 *
	 *  @param key 列名
	 */
	//-(void)includeKey:(NSString *)key;
	@Method(selector = "includeKey:")
	public native void includeKey(String key);

	/**
	 *  设置查询后要返回的key
	 *
	 *  @param keys key数组
	 */
	//-(void)selectKeys:(NSArray*)keys;
	@Method(selector = "selectKeys:")
	public native void selectKeys(List<String> keys);

	/**
	 *	添加key的值等于object的约束条件
	 *
	 *	@param	key	键
	 *	@param	object	提供的值
	 */
	//-(void)whereKey:(NSString *)key equalTo:(id)object;
	@Method(selector = "whereKey:equalTo:")
	public native void whereKeyEqualTo(String key, NSObject object);

	/**
	 *	添加key的值不为object的约束条件
	 *
	 *	@param	key	键
	 *	@param	object	提供的值
	 */
	//-(void)whereKey:(NSString *)key notEqualTo:(id)object;
	@Method(selector = "whereKey:notEqualTo:")
	public native void whereKeyNotEqualTo(String key, NSObject object);

	/**
	 *	添加key的值大于object的约束条件
	 *
	 *	@param	key	键
	 *	@param	object	提供的值
	 */
	//-(void)whereKey:(NSString *)key greaterThan:(id)object;
	@Method(selector = "whereKey:greaterThan:")
	public native void whereKeyGreaterThan(String key, NSObject object);

	/**
	 *	添加key的值大于或等于提供的object的约束条件
	 *
	 *	@param	key	键
	 *	@param	object	提供的值
	 */
	//-(void)whereKey:(NSString *)key greaterThanOrEqualTo:(id)object;
	@Method(selector = "whereKey:greaterThanOrEqualTo:")
	public native void whereKeyGreaterThanOrEqualTo(String key, NSObject object);

	/**
	 *	添加key的值小于提供的object的约束条件
	 *
	 *	@param	key	键
	 *	@param	object	提供的值
	 */
	//-(void)whereKey:(NSString *)key lessThan:(id)object;
	@Method(selector = "whereKey:lessThan:")
	public native void whereKeyLessThan(String key, NSObject object);

	/**
	 *	添加key的值小于或等于提供的object的约束条件
	 *
	 *	@param	key	键
	 *	@param	object	提供的值
	 */
	//-(void)whereKey:(NSString *)key lessThanOrEqualTo:(id)object;
	@Method(selector = "whereKey:lessThanOrEqualTo:")
	public native void whereKeyLessThanOrEqualTo(String key, NSObject object);

	/**
	 *	添加key的值包含array的约束条件
	 *
	 *	@param	key	键
	 *	@param	array	提供的数组
	 */
	//-(void)whereKey:(NSString *)key containedIn:(NSArray *)array;
	@Method(selector = "whereKey:containedIn:")
	public native void whereKeyContainedIn(String key, List<NSObject> array);

	/**
	 *	添加key的值不包含array的约束条件
	 *
	 *	@param	key	键
	 *	@param	array	提供的数组
	 */
	//-(void)whereKey:(NSString *)key notContainedIn:(NSArray *)array;
	@Method(selector = "whereKey:notContainedIn:")
	public native void whereKeyNotContainedIn(String key, List<NSObject> array);

	/**
	 *  指定的key是存在的
	 *
	 *  @param key 键
	 */
	//-(void)whereKeyExists:(NSString *)key;
	@Method(selector = "whereKeyExists:")
	public native void whereKeyExists(String key);

	/**
	 *  keys数组内的各列的值是存在的
	 *
	 *  @param keys 多个列组成的数组
	 */
	//-(void)whereKeySExists:(NSArray *)keys;
	@Method(selector = "whereKeySExists:")
	public native void whereKeySExists(List<String> keys);


	/**
	 *  指定的key是不存在的
	 *
	 *  @param key 键
	 */
	//-(void)whereKeyDoesNotExist:(NSString *)key;
	@Method(selector = "whereKeyDoesNotExist:")
	public native void whereKeyDoesNotExist(String key);

	/**
	 *  keys数组中的各列的值是不存在的
	 *
	 *  @param keys 多个列组成的数组
	 */
	//-(void)whereKeysDoesNotExist:(NSArray *)keys;
	@Method(selector = "whereKeysDoesNotExist:")
	public native void whereKeysDoesNotExist(List<String> keys);
	
	/**
	 *  查询的对象某个列符合另一个查询
	 *
	 *  @param key   列名
	 *  @param query 另一个查询
	 */
	//-(void)whereKey:(NSString *)key matchesQuery:(BmobQuery *)query;
	@Method(selector = "whereKey:matchesQuery:")
	public native void whereKeyMatchesQuery(BmobQuery query);

	/**
	 *  查询的对象某个列不符合另一个查询
	 *
	 *  @param key   列名
	 *  @param query 另一个查询
	 */
	//-(void)whereKey:(NSString *)key doesNotMatchQuery:(BmobQuery *)query;
	@Method(selector = "whereKey:doesNotMatchQuery:")
	public native void whereKeyDoesNotMatchQuery(BmobQuery query);

	/**
	 *  获取object的关系成员的对象
	 *
	 *  @param key    object所在表的列名，为Relation类型
	 *  @param object Bmobject对象
	 */
	//-(void)whereObjectKey:(NSString *)key relatedTo:(BmobObject*)object;
	@Method(selector = "whereObjectKey:relatedTo:")
	public native void whereObjectKey(String key, BmobObject object);

	//#pragma mark 统计查询
	/**
	 * 设置需要计算总和的列名数组
	 * 
	 * @param keys 需要计算总和的列名称数组
	 */
	//-(void)sumKeys:(NSArray*)keys;
	@Method(selector = "sumKeys:")
	public native void sumKeys(List<String> keys);

	/**
	 * 设置需要计算平均值的列名数组
	 *
	 * @param keys 需要计算平均值的列名称数组
	 */
	//-(void)averageKeys:(NSArray*)keys;
	@Method(selector = "averageKeys:")
	public native void averageKeys(List<String> keys);

	/**
	 * 设置需要计算最大值的列名数组
	 *
	 * @param keys 需要计算最大值的列名称数组
	 */
	//-(void)maxKeys:(NSArray*)keys;
	@Method(selector = "maxKeys:")
	public native void maxKeys(List<String> keys);

	/**
	 * 设置需要计算最小值的列名数组
	 *
	 * @param keys 需要计算最小值的列名称数组
	 */
	//-(void)minKeys:(NSArray*)keys;
	@Method(selector = "minKeys:")
	public native void minKeys(List<String> keys);

	/**
	 * 设置需要分组的列名数组
	 *
	 * @param key 需要计算进行分组的列名称数组
	 */
	//-(void)groupbyKeys:(NSArray*)keys;
	@Method(selector = "groupbyKeys:")
	public native void groupbyKeys(List<String> keys);

	/**
	 * 设置having条件字典
	 *
	 * @param havingDic having条件字典
	 */
	//-(void)constructHavingDic:(NSDictionary*)havingDic;
	@Method(selector = "constructHavingDic:")
	public native void constructHavingDic(NSDictionary havingDic);

	//#pragma mark 地理位置查询
	/**
	 *
	 *
	 *	@param	key	键
	 *	@param	geopoint	位置信息
	 */
	//-(void)whereKey:(NSString *)key nearGeoPoint:(BmobGeoPoint *)geopoint;
	@Method(selector = "whereKey:nearGeoPoint:")
	public native void whereKeyNearGeoPoint(String key, BmobGeoPoint geopoint);

	/**
	 *
	 *
	 *	@param	key	键
	 *	@param	geopoint	位置信息
	 *	@param	maxDistance	最大长度（单位：英里）
	 */
	//-(void)whereKey:(NSString *)key nearGeoPoint:(BmobGeoPoint *)geopoint withinMiles:(double)maxDistance;
	@Method(selector = "whereKey:nearGeoPoint:withinMiles:")
	public native void whereKeyNearGeoPointWithinMiles(String key, BmobGeoPoint geopoint, double maxDistance);
	
	/**
	 *
	 *
	 *	@param	key	键
	 *	@param	geopoint	位置信息
	 *	@param	maxDistance	最大长度（单位：公里）
	 */
	//-(void)whereKey:(NSString *)key nearGeoPoint:(BmobGeoPoint *)geopoint withinKilometers:(double)maxDistance;
	@Method(selector = "whereKey:nearGeoPoint:withinKilometers:")
	public native void whereKeyNearGeoPointWithinKilometers(String key, BmobGeoPoint geopoint, double maxDistance);
	

	/**
	 *
	 *
	 *	@param	key	键
	 *	@param	geopoint	位置信息
	 *	@param	maxDistance	最大半径
	 */
	//-(void)whereKey:(NSString *)key nearGeoPoint:(BmobGeoPoint *)geopoint withinRadians:(double)maxDistance;
	@Method(selector = "whereKey:nearGeoPoint:withinRadians:")
	public native void whereKeyNearGeoPointWithinRadians(String key, BmobGeoPoint geopoint, double maxDistance);


	/**
	 *
	 *
	 *	@param	key	键
	 *	@param	southwest	西南方向位置
	 *	@param	northeast	东北方向位置
	 */
	//-(void)whereKey:(NSString *)key withinGeoBoxFromSouthwest:(BmobGeoPoint *)southwest toNortheast:(BmobGeoPoint *)northeast;
	@Method(selector = "whereKey:withinGeoBoxFromSouthwest:toNortheast:")
	public native void whereKeyWithinGeoBoxFromSouthwestToNortheast(String key, BmobGeoPoint southwest, BmobGeoPoint northeast);

	//#pragma mark 组合查询
	/**
	 *  组合并查询
	 *
	 *  @param array 约束条件数组
	 */
	//-(void)addTheConstraintByAndOperationWithArray:(NSArray*)array;
	@Method(selector = "addTheConstraintByAndOperationWithArray:")
	public native void addTheConstraintByAndOperationWithArray(List<NSObject> array);

	/**
	 *  组合或查询
	 *
	 *  @param array 约束条件数组
	 */
	//-(void)addTheConstraintByOrOperationWithArray:(NSArray *)array;
	@Method(selector = "addTheConstraintByOrOperationWithArray:")
	public native void addTheConstraintByOrOperationWithArray(List<NSObject> array);

	/**
	 *  构造查询条件,一旦设置，查询的条件即为conDictionary
	 *
	 *  @param conDictionary 构造查询条件
	 */
	//-(void)queryWithAllConstraint:(NSDictionary*)conDictionary;
	@Method(selector = "queryWithAllConstraint:")
	public native void queryWithAllConstraint(NSDictionary conDictionary);

	//#pragma mark 缓存方面的函数

	/**
	 *	查看是否有查询的缓存
	 *
	 *	@return	查询结果 有为YES 没有为NO
	 */
	//-(BOOL)hasCachedResult;
	@Method(selector = "queryWithAllConstraint")
	public native boolean queryWithAllConstraint();

	/**
	 *	清理查询的缓存
	 */
	//-(void)clearCachedResult;
	@Method(selector = "clearCachedResult")
	public native void clearCachedResult();

	/**
	 *	清理所有查询的缓存
	 */
	//+(void)clearAllCachedResults;
	@Method(selector = "clearAllCachedResults")
	public native void clearAllCachedResults();

	
	//#pragma mark 网络访问

	/**
	 *	通过id查找BmobObject对象
	 *
	 *	@param	objectId	BmobObject对象的id
	 *	@param	block	得到的BmobObject对象
	 */
	//-(void)getObjectInBackgroundWithId:(NSString *)objectId
	//                             block:(BmobObjectResultBlock)block;
	@Method(selector = "getObjectInBackgroundWithId:block:")
	public native void getObjectInBackgroundWithId(String objectId,@Block BmobObjectResultBlock block);
	
	/**
	 *	查找BmobObject对象数组，该方法可查询多条数据
	 *
	 *	@param	block	得到BmobObject对象数组
	 */
	//-(void)findObjectsInBackgroundWithBlock:(BmobObjectArrayResultBlock)block;
	@Method(selector = "findObjectsInBackgroundWithBlock:")
	public native void findObjectsInBackgroundWithBlock(@Block BmobObjectArrayResultBlock block);

	/**
	 *	统计表数据
	 *
	 *	@param	block 得到字典数组
	 */
	//-(void)calcInBackgroundWithBlock:(BmobObjectArrayResultBlock)block;
	@Method(selector = "calcInBackgroundWithBlock:")
	public native void calcInBackgroundWithBlock(@Block BmobObjectArrayResultBlock block);

	/**
	 *	查找表中符合条件的个数
	 *
	 *	@param	block	得到个数
	 */
	//-(void)countObjectsInBackgroundWithBlock:(BmobIntegerResultBlock)block;
	@Method(selector = "countObjectsInBackgroundWithBlock:")
	public native void countObjectsInBackgroundWithBlock(@Block BmobIntegerResultBlock block);

	//#pragma mark BQL 查询方法
	/**
	 *  使用 BQL 异步查询
	 *  @param bql BQL 字符串
	 *  @param block 查询结果回调
	 */
	//- (void)queryInBackgroundWithBQL:(NSString *)bql block:(BmobBQLObjectResultBlock)block;
	@Method(selector = "queryInBackgroundWithBQL:block:")
	public native void queryInBackgroundWithBQL(String bql, @Block  BmobBQLObjectResultBlock block);

	/**
	 *  使用BQL异步查询，该方法是使用占位符时的调用方法
	 *
	 *  @param bql     BQL字符串
	 *  @param pvalues 占位符的值
	 *  @param block   查询结果回调
	 */
	//- (void)queryInBackgroundWithBQL:(NSString *)bql  pvalues:(NSArray*)pvalues block:(BmobBQLObjectResultBlock)block;
	@Method(selector = "queryInBackgroundWithBQL:pvalues:block:")
	public native void queryInBackgroundWithBQL(String bql, List<NSObject> pvalues,@Block  BmobBQLObjectResultBlock block);
	
	/**
	 * 使用 BQL 异步统计查询
	 *
	 *  @param bql   BQL 统计查询字符串
	 *  @param block 查询结果回调
	 */
	//- (void)statisticsInBackgroundWithBQL:(NSString *)bql block:(BmobBQLArrayResultBlock)block;
	@Method(selector = "statisticsInBackgroundWithBQL:block:")
	public native void statisticsInBackgroundWithBQL(String bql,@Block BmobBQLArrayResultBlock block);

	/**
	 *  使用BQL异步统计查询，该方法是使用占位符时的调用方法
	 *
	 *  @param bql     BQL字符串
	 *  @param pvalues 占位符的值
	 *  @param block   查询结果回调
	 */
	//- (void)statisticsInBackgroundWithBQL:(NSString *)bql pvalues:(NSArray*)pvalues block:(BmobBQLArrayResultBlock)block;
	@Method(selector = "statisticsInBackgroundWithBQL:pvalues:block:")
	public native void statisticsInBackgroundWithBQL(String bql, List<NSObject> pvalues,@Block BmobBQLArrayResultBlock block);
	
	/**
	 *  取消查询
	 */
	//-(void)cancle;
	@Method(selector = "cancle")
	public native void cancle();

	//# pragma mark 模糊查询
	/**
	 *  正则表达式查询
	 *
	 *  @param key   字段名
	 *  @param regex 正则表达式
	 */
	//-(void)whereKey:(NSString*)key matchesWithRegex:(NSString*)regex;
	@Method(selector = "whereKey:matchesWithRegex:")
	public native void whereKeyMatchesWithRegex(String key, String regex);

	/**
	 *  查询以特定字符串开头的数据
	 *
	 *  @param key   字段名
	 *  @param start 想要查询的开头的字符串
	 */
	//-(void)whereKey:(NSString *)key startWithString:(NSString*)start;
	@Method(selector = "whereKey:startWithString:")
	public native void whereKeyStartWithString(String key, String start);
	
	/**
	 *  查询以特定字符串结尾的数据
	 *
	 *  @param key 字段名
	 *  @param end 想要查询的结尾的字符串
	 */
	//-(void)whereKey:(NSString *)key endWithString:(NSString*)end;
	@Method(selector = "whereKey:endWithString:")
	public native void whereKeyEndWithString(String key, String end);

}
