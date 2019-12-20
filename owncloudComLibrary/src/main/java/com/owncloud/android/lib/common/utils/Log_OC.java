package com.owncloud.android.lib.common.utils;

import timber.log.Timber;

import java.io.File;

public class Log_OC {

    public static void i(String message) {
        Timber.i(message);
    }

    public static void d(String message) {
        Timber.d(message);
    }

    public static void d(String message, Exception e) {
        Timber.d(e, message);
    }

    public static void e(String message) {
        Timber.e(message);
    }

    public static void e(String message, Throwable e) {
        Timber.e(e, message);
    }

    public static void v(String message) {
        Timber.v(message);
    }

    public static void w(String message) {
        Timber.w(message);
    }

    @Deprecated
    public static void i(String tag, String message) {
        Timber.i(message);
    }

    @Deprecated
    public static void d(String TAG, String message) {
        Timber.d(message);
    }

    @Deprecated
    public static void d(String TAG, String message, Exception e) {
        Timber.d(e, message);
    }

    @Deprecated
    public static void e(String TAG, String message) {
        Timber.e(message);
    }

    @Deprecated
    public static void e(String TAG, String message, Throwable e) {
        Timber.e(e, message);
    }

    @Deprecated
    public static void v(String TAG, String message) {
        Timber.v(message);
    }

    @Deprecated
    public static void w(String TAG, String message) {
        Timber.w(message);
    }
}
