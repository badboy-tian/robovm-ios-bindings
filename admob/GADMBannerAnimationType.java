package net.mwplay.admob;

import org.robovm.rt.bro.ValuedEnum;
//
//typedef NS_ENUM(NSInteger, GADMBannerAnimationType) {
//	  kGADMBannerAnimationTypeNone = 0,            ///< No animation.
//	  kGADMBannerAnimationTypeFlipFromLeft = 1,    ///< Flip from left.
//	  kGADMBannerAnimationTypeFlipFromRight = 2,   ///< Flip from right.
//	  kGADMBannerAnimationTypeCurlUp = 3,          ///< Curl up.
//	  kGADMBannerAnimationTypeCurlDown = 4,        ///< Curl down.
//	  kGADMBannerAnimationTypeSlideFromLeft = 5,   ///< Slide from left.
//	  kGADMBannerAnimationTypeSlideFromRight = 6,  ///< Slide from right.
//	  kGADMBannerAnimationTypeFadeIn = 7,          ///< Fade in.
//	  kGADMBannerAnimationTypeRandom = 8,          ///< Random animation.
//	};
//	
public enum GADMBannerAnimationType implements ValuedEnum{
	kGADMBannerAnimationTypeNone(0),
	kGADMBannerAnimationTypeFlipFromLeft(1),
	kGADMBannerAnimationTypeFlipFromRight(2),
	kGADMBannerAnimationTypeCurlUp(3),
	kGADMBannerAnimationTypeCurlDown(4),
	kGADMBannerAnimationTypeSlideFromLeft(5),
	kGADMBannerAnimationTypeSlideFromRight(6),
	kGADMBannerAnimationTypeFadeIn(7),
	kGADMBannerAnimationTypeRandom(8)
	;

	private final long n;
	private GADMBannerAnimationType(long n){
		this.n = n;
	}
	@Override
	public long value() {
		return n;
	} 
}
