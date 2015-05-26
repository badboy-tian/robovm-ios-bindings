package net.mwply.bangdings;

import java.util.ArrayList;
import java.util.List;

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSString;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIApplicationLaunchOptions;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;

import net.mwplay.umenganalysics.MobClick;
import net.mwplay.umenganalysics.MobClickGameAnalytics;
import net.mwplay.umenganalysics.MobClickSocialAnalytics;
import net.mwplay.umenganalysics.MobClickSocialWeibo;
import net.mwplay.umenganalysics.ReportPolicy;
import net.mwply.bangdings.GdxGame;

public class IOSLauncher extends IOSApplication.Delegate {
	@Override
	protected IOSApplication createApplication() {
		IOSApplicationConfiguration config = new IOSApplicationConfiguration();
		return new IOSApplication(new GdxGame(), config);
	}

	public static void main(String[] argv) {
		NSAutoreleasePool pool = new NSAutoreleasePool();
		UIApplication.main(argv, null, IOSLauncher.class);
		pool.close();
	}

	@Override
	public boolean didFinishLaunching(UIApplication application,
			UIApplicationLaunchOptions launchOptions) {

		MobClick.startWithAppkey("549fbc52fd98c5ca3600092b",
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
				"549fbc52fd98c5ca3600092b", "测试", null);

		return super.didFinishLaunching(application, launchOptions);
	}
}