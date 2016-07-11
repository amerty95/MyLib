package com.example.zorlu.mylibrary;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by ZORLU on 30.06.2016.
 */
public class Test {
    public static String getString(Context aa) {

        PackageInfo pInfo = null;
        try {
            pInfo = aa.getPackageManager().getPackageInfo(aa.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        String version = pInfo.versionName;
        return version;
    }
}
