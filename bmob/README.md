###当前的bmob IOS SDK 版本为(Version):1.7.2###
# bmob IOS绑定(bmob)
bmob是一个后端提供商,为用户提供

数据服务

支持丰富的数据类型，灵活方便的增删改查，可视化的数据操作，安全的角色和ACL管理，多表关联处理，数据的批量处理，本地数据缓存，开发者们无需关注服务器后端，就可以实现多平台的同步开发。


文件服务
文件服务允许上传任何的文件类型，支持分片断点续传，此外，针对移动端对图片业务的需求，还提供了生成高压缩比的缩略图服务。
推送服务
提供了Android和iOS两个版本的推送服务，采用Websocket保持长连接，稳定性更好，目前，64GB的单机能够支撑600万的用户长连接。
扩展服务
提供APP官网、计划任务、地理位置、云端代码等扩展服务，确保您的个性化业务逻辑能够在云端更好的运转。


## 1.把GoogleMobileAds.framework放入到build/libs里面,并在xml指定framework寻找路径(必须要加入这些framework才行哟) ##
    <framework>CoreLocation</framework>
    <framework>Security</framework>
     <framework>CoreGraphics</framework>
    <framework>MobileCoreServices</framework>
    <framework>CFNetwork</framework>
    <framework>CoreTelephony</framework>
    <framework>SystemConfiguration</framework>
    <framework>AVFoundation</framework>
     <framework>MediaPlayer</framework>
    <framework>BmobSDK</framework>
    //放入libs
    <libs>
       <lib>icucore</lib>   
       <lib>sqlite3</lib>  
       <lib>z.1.2.5</lib>  
    </libs>

## 2.使用方法 ##
    private void add() {
    	// bmob
    	Bmob.registerWithAppKey("34b7704a3b372576a732b7675abce9e8");
    	// Gdx.app.log("xxx", "showInterAd");
    	System.out.println("showInterAd");
    	final BmobObject gameScore = new BmobObject("GameScore");
    	gameScore.setObject(new NSString("小明"), "playerName");
    	gameScore.setObject(NSNumber.valueOf(100), "playerScore");
    	gameScore.setObject(NSNumber.valueOf(true), "cheatMode");
    
    	gameScore.saveInBackgroundWithResultBlock(new BmobBooleanResultBlock() {
    		@Override
    		public void invoke(boolean isSuccessful, NSError error) {
    			if (isSuccessful) {
    				System.out.println("success");
    				System.out.println(gameScore.getObjectId());
    				System.out.println(Bmob.getServerTimestamp());
    				query();
    			} else {
    				System.out.println(error.getErrorCode() + error.getDomain());
    			}
    		}
    	});
    	System.out.println("showInterAd ---- end");
    }
    
    private void query() {
    	BmobQuery mBmobQuery = new BmobQuery("GameScore");
    	mBmobQuery.getObjectInBackgroundWithId("bad60c9b08",
    			new BmobObjectResultBlock() {
    
    				@Override
    				public void invoke(BmobObject object, NSError error) {
    					String name = object.objectForKey("playerName")
    							.toString();
    					System.out.println("name = " + name);
    
    					change(object);
    				}
    			});
    }
    
    private void change(final BmobObject object) {
    	BmobObject obj = BmobObject.objectWithoutDatatWithClassName(
    			object.getClassName(), object.getObjectId());
    	obj.setObject(new NSString("改过的小明"), "playerName");
    	obj.updateInBackgroundWithResultBlock(new BmobBooleanResultBlock() {
    
    		@Override
    		public void invoke(boolean isSuccessful, NSError error) {
    			// TODO Auto-generated method stub
    			System.out.println("修改成功....");
    
    			delete(object);
    		}
    	});
    }
    
    private void delete(BmobObject object) {
    	object.deleteInBackgroundWithBlock(new BmobBooleanResultBlock() {
    
    		@Override
    		public void invoke(boolean isSuccessful, NSError error) {
    			System.out.println("删除成功....");
    		}
    	});
    }
    
####至此书写完毕,可以运行了..如果您觉得对你有帮助的话请点赞,谢谢!####
## 详细教程请看博客地址: http://blog.csdn.net/qq634416025/article/details/46120397 ##