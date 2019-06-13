package mvp.android.com.mvplibrary.mvpbase;

import android.app.Application;
import android.content.Context;

public class MyMVPApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
    public static Context getContext() {
        return context;
    }
}
