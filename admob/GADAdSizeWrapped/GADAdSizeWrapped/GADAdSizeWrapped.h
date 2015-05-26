//
//  GADAdSizeWrapped.h
//  GADAdSizeWrapped
//
//  Created by tian on 15/5/27.
//  Copyright (c) 2015年 tian. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "GoogleMobileAds/GADAdSize.h"

@interface GADAdSizeWrapped : NSObject

+ (const struct GADAdSize) banner;
+ (const struct GADAdSize) mediumRectangle;
+ (const struct GADAdSize) fullBanner;
+ (const struct GADAdSize) leaderboard;
+ (const struct GADAdSize) skyscraper;
+ (const struct GADAdSize) smartBannerPortrait;
+ (const struct GADAdSize) smartBannerLandscape;
+ (const struct GADAdSize) invalid;

+ (const struct GADAdSize) fromCGSize:(CGSize)size;
+ (const struct GADAdSize) fullWidthPortraitWithHeight:(CGFloat)height;
+ (const struct GADAdSize) fullWidthLandscapeWithHeight:(CGFloat)height;
+ (BOOL) equalToSize:(GADAdSize)size1 and:(GADAdSize)size2;
+ (CGSize) fromAdSize:(GADAdSize) size;
+ (BOOL) isValid:(GADAdSize)size;
+ (NSString *) toString:(GADAdSize)size;
@end