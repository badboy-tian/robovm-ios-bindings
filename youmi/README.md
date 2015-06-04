###有米(youmi) IOS SDK 版本为(Version):4.7###
# 有米 IOS绑定(youmi)
youmi 是一个广告平台, 在国内用的人还不少

## 1.把.a放入到build/libs里面,并在xml指定framework寻找路径(必须要加入这些framework才行哟) ##
    <frameworkPaths>
    	<path>build/libs</path>
    </frameworkPaths>
    <frameworks>
        <!-- 有些libgdx必要的framework没有加进来,请自行添加-->
        <framework>QuartzCore</framework>
        <framework>Security</framework>
        <framework>CFNetwork</framework>
        <framework>SystemConfiguration</framework>
    </frameworks>
    <weakFrameworks>
        <framework>StoreKit</framework>
    </weakFrameworks>
    //放入libs
    <libs>
      <lib>sqlite3</lib>  
      <lib>build/libs/GitHubProjectStatic.a</lib>
    </libs>

## 2.使用方法 ##
    private void youmi() {
    	//初始化
    	PublicCallConfig.PublicCallLaunchWithAppID("2eb39466ebdcaa64",
    			"89d4c4baf4a92078");
    	
    	//积分墙,推广墙初始化
    	PublicCallList.PublicCallMyEnable();
    	//展示积分墙
    	PublicCallList.PublicCallShowOffers(true, new Runnable() {
    
    		@Override
    		public void run() {
    			System.out.println("youmi show");
    		}
    	}, new Runnable() {
    
    		@Override
    		public void run() {
    			System.out.println("youmi exit");
    		}
    	});
    
    	PublicCallList.PublicCallShowOffers(false, new Runnable() {
    
    		@Override
    		public void run() {
    			System.out.println("youmi tuijian show");
    		}
    	}, new Runnable() {
    
    		@Override
    		public void run() {
    			System.out.println("youmi tuijian exit");
    		}
    	});
    	
    	//使用积分
    	PublicCallPointsManager.PublicCallEnable();
    	//打印积分
    	int points = PublicCallPointsManager.PublicCallPointsRemained();
    	System.out.println("points = " + points);
    	//消耗积分
    	PublicCallPointsManager.PublicCallDescreesePoints(10);
    }
    
####至此书写完毕,可以运行了..如果您觉得对你有帮助的话请点赞,谢谢!####
## 详细教程请看博客地址:http://www.i7play.com/archives/107 ##