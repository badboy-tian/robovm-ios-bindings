###当前的友盟游戏数据分析版本为:3.5.8.0###
# 友盟游戏数据分析IOS绑定(umenganalysics)
这是一个关于游戏友盟分析的IOS SDK的绑定(This is a umenganalysics for Chinese Developers)
为了支持libgdx游戏引擎的推广,本人会定期编写IOS SDK绑定,并且分享给大家.
## 1.在robovm.xml里面配置你的.a路径(自己在data目录下创建一个libs目录,放入,a) ##
    <libs>
      <lib>z</lib>   
       <lib>data/libs/libMobClickGameLibrary.a</lib>   
    </libs>
## 2.由于使用的全局变量,所以要现在robovm.xml里面定义一下才行 ##
    <libs>
      <lib>z</lib>   
       <lib>data/libs/libMobClickGameLibrary.a</lib>   
    </libs>
    <frameworks>
    <framework>UIKit</framework>
    <framework>OpenGLES</framework>
    <framework>QuartzCore</framework>
    <framework>CoreGraphics</framework>
    <framework>OpenAL</framework>
    <framework>AudioToolbox</framework>
    <framework>AVFoundation</framework>
    </frameworks>
    <exportedSymbols>
    	<symbol>MobClickSocialType*</symbol>
    </exportedSymbols>
    </config>
    
## 3.使用方法(只测试了部分) ##
    @Override
    public boolean didFinishLaunching(UIApplication application,
    		UIApplicationLaunchOptions launchOptions) {
    
    	MobClick.startWithAppkey("your key",
    			ReportPolicy.BATCH, "ios");
    
    	MobClickGameAnalytics.pay(100, 1, 200);
    	MobClickGameAnalytics.buy("xxoo", 1, 100);
    	MobClickGameAnalytics.use("xxoo", 1, 100);
    
    	MobClickGameAnalytics.startLevel("1");
    	MobClickGameAnalytics.finishLevel("1");
    	MobClickGameAnalytics.failLevel("1");
    
    	final NSDictionary<NSString, NSString> dic = new NSDictionary<NSString, NSString>();
    	dic.setAssociatedObject(new NSString("1"), new NSString("1"));
    	dic.setAssociatedObject(new NSString("2"), new NSString("2"));
    
    	MobClickSocialWeibo weibo = new MobClickSocialWeibo(MobClickSocialWeibo.MobClickSocialTypeSina(),
    			"xxxxxxxooooo", "12345", dic);
    	List<MobClickSocialWeibo> weibos = new ArrayList<MobClickSocialWeibo>();
    	weibos.add(weibo);
    
    	MobClickSocialAnalytics.postWeiboCounts(weibos,
    			"your key", "测试", null);
    
    	return super.didFinishLaunching(application, launchOptions);
    }

## 博客地址: [http://blog.csdn.net/qq634416025/article/details/46009043]() ##