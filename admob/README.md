###当前的admob IOS SDK 版本为(Version):7.2.2###
# admob IOS绑定(admob)
IOS里面主要的广告平台就是用的是ADMOB, 在最新的ADMOB采用的是framework的方式,在绑定项目https://github.com/BlueRiverInteractive/robovm-ios-bindings/tree/master/admob已经不能正常使用了. 看到大家都有需求, 加班到凌晨1点钟,总算把它搞定了. 遇到了有些问题始终解决不了. 下面来介绍下怎么使用.
## 1.因为自定义了一个.a文件, 所以把libGADAdSizeWrapped.a文件放入iOS项目的build/libs下面,并写入xml ##
    <libs>
      <lib>z</lib>   
       <lib>build/libs/libGADAdSizeWrapped.a</lib>     
    </libs>
## 2.把GoogleMobileAds.framework放入到build/libs里面,并在xml指定framework寻找路径(必须要加入这些framework才行哟) ##
     <frameworkPaths>
    	<path>build/libs</path>
    </frameworkPaths>
    <frameworks>
    <framework>UIKit</framework>
    <framework>OpenGLES</framework>
    <framework>QuartzCore</framework>
    <framework>CoreGraphics</framework>
    <framework>OpenAL</framework>
    <framework>AudioToolbox</framework>
    <framework>AVFoundation</framework>
    <framework>CoreTelephony</framework>
    <framework>EventKit</framework>
    <framework>MessageUI</framework>
    <framework>EventKitUI</framework>
    <framework>SystemConfiguration</framework>
    <framework>CoreMedia</framework>
    <framework>GoogleMobileAds</framework>
    </frameworks>
    <weakFrameworks>
    <framework>AdSupport</framework>
    <framework>StoreKit</framework>
    </weakFrameworks>
    
## 3.使用方法 ##
    //定义接口
    public interface ITools {
        public void showInterAd();
    	public void showBanner();
    }

    //在core中传入
    public class GdxGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;
    ITools tools;
    
    public GdxGame(ITools tools) {
    	this.tools = tools;
    }
    
    @Override
    public void create () {
    	batch = new SpriteBatch();
    	img = new Texture("badlogic.jpg");
    	
    	tools.showInterAd();
    	tools.showBanner();
    }
    
    //在IOS中实现接口并传入接口
    public class IOSLauncher extends IOSApplication.Delegate implements ITools{
    private static final String AD_UNIT_ID = "ca-app-pub-1743332321423234/7283499900";
    static IOSLauncher instance;
    
    @Override
    protected IOSApplication createApplication() {
    	IOSApplicationConfiguration config = new IOSApplicationConfiguration();
    	return new IOSApplication(new GdxGame(instance), config);
    }
    
    public static void main(String[] argv) {
    	instance = new IOSLauncher();
    	NSAutoreleasePool pool = new NSAutoreleasePool();
    	UIApplication.main(argv, null, IOSLauncher.class);
    	pool.close();
    }
    
    @Override
    public void showInterAd() {
    	final GADInterstitial interstitial = new GADInterstitial(AD_UNIT_ID);
        interstitial.setDelegate(new GADInterstitialDelegateAdapter(){
        	@Override
        	public void didReceiveAd(GADInterstitial ad) {
        		super.didReceiveAd(ad);
        		interstitial.present(((IOSApplication) Gdx.app).getUIViewController());
        	}
        	
        	@Override
        	public void didFailToReceiveAd(GADInterstitial ad,
        			GADRequestError error) {
        		Gdx.app.log("xxx", error.getCode() + "");
        		super.didFailToReceiveAd(ad, error);
        	}
        });
        
        GADRequest request = GADRequest.create();
        List<String> devices = new ArrayList<String>();
        devices.add(GADRequest.GAD_SIMULATOR_ID);
        
        request.setTestDevices(devices);
        interstitial.loadRequest(request);
    }
    
    @Override
    public void showBanner() {
    	 final GADBannerView mBannerView = new GADBannerView(GADAdSize.smartBannerPortrait());
            mBannerView.setAdUnitID("ca-app-pub-1743332321423234/2574098708");
    
            final UIViewController controller = ((IOSApplication) Gdx.app).getUIViewController();
            
            GADRequest request = GADRequest.create();
            List<String> devices = new ArrayList<String>();
            devices.add(GADRequest.GAD_SIMULATOR_ID);
            mBannerView.setRootViewController(controller);	        
            controller.getView().addSubview(mBannerView);
            
            mBannerView.loadRequest(request);
    }
    }
    
####至此书写完毕,可以运行了.......为了那个自定义.a我还去注册了个开发者账号呢,....蛋疼  99刀大洋 心痛如果您觉得对你有帮助的话请点赞,谢谢!####
## 详细教程请看博客地址: [http://blog.csdn.net/qq634416025/article/details/46040089]() ##