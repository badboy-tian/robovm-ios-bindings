package net.mwplay.bmob;

import org.robovm.rt.bro.ValuedEnum;

/**
缓存策略

kBmobCachePolicyIgnoreCache:只从网络获取数据，且数据不会缓存在本地，这是默认的缓存策略。

kBmobCachePolicyCacheOnly:只从缓存读数据，如果缓存没有数据，返回一个空数组。

kBmobCachePolicyNetworkOnly:只从网络获取数据，同时会在本地缓存数据。

kBmobCachePolicyCacheElseNetwork:先从缓存读取数据，如果没有再从网络获取。

kBmobCachePolicyNetworkElseCache:先从网络获取数据，如果没有，此处的没有可以理解为访问网络失败，再从缓存读取。

kBmobCachePolicyCacheThenNetwork:先从缓存读取数据，无论结果如何都会再次从网络获取数据，在这种情况下，Block将产生两次调用。通常这种做法是先快速从缓存读取数据显示在界面，然后在后台连接网络获取最新数据，取到后再更新界面。
*/
public enum BmobCachePolicy implements ValuedEnum{
	kBmobCachePolicyIgnoreCache,
	kBmobCachePolicyCacheOnly,
	kBmobCachePolicyNetworkOnly,
	kBmobCachePolicyCacheElseNetwork,
	kBmobCachePolicyNetworkElseCache,
	kBmobCachePolicyCacheThenNetwork
	;

	@Override
	public long value() {
		return ordinal();
	}

}
