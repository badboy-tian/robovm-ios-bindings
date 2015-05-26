package net.mwplay.admob;

import org.robovm.apple.foundation.NSError;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.GlobalValue;
import org.robovm.rt.bro.annotation.Library;

/** This class represents the error generated due to invalid request parameters. */
@Library(Library.INTERNAL)
@NativeClass
public class GADRequestError extends NSError {
    protected GADRequestError (SkipInit skipInit) {
        super(skipInit);
    }

    /** Google AdMob Ads error domain. */
    public static String getErrorDomain () {
        return GADRequestErrorConstants.errorDomain();
    }

    public GADErrorCode getErrorCode () {
        long code = getCode();
        if (code >= 0 && code < GADErrorCode.values().length) {
            return GADErrorCode.values()[(int)code];
        }
        return null;
    }
}