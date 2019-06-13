package mvp.android.com.mvplibrary.utils;

import android.content.Context;
import android.util.Log;

/**
 * 日志打印工具
 */
public class LogUtils {
    /**
     * 是否debug模式
     */
    private static boolean isDeBug=true;

    public static void setIsDeBug(boolean isDeBug) {
        LogUtils.isDeBug = isDeBug;
    }

    public static void i (String var0, String var1){
        if (isDeBug){
            Log.i(var0, var1);

        }
    }

    public static void d (String var0, String var1){
        if (isDeBug){
            Log.d(var0,var1);
        }
    }



    public static void deBugToast(Context context, String var){
        if (isDeBug){
            ToastUtils.showToast(context,var);
        }
    }

}
