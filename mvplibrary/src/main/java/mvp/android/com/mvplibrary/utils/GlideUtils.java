package mvp.android.com.mvplibrary.utils;

import android.content.Context;
import android.support.annotation.IdRes;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;


import mvp.android.com.mvplibrary.mvpbase.MyMVPApplication;


/**
 * Glide图片加载工具类
 */
public class GlideUtils {
    /**
     * 普通加载模式
     * @param
     * @param imageView
     * @param url
     */

    private static int Error;
    private static int Placeholer;

    public static void initErrorImge(@IdRes int id){
        GlideUtils.Error=id;
    }

    public static void initPlaceholerImge(@IdRes int id){
        GlideUtils.Placeholer=id;
    }
    public static void  Glide(ImageView imageView, String url){
        GlideApp.with(MyMVPApplication.getContext())
                .load(url)
                .error(Error)
                .placeholder(Placeholer)
                .into(imageView);
    }

    public static void  Glide(ImageView imageView, int url){
        GlideApp.with(MyMVPApplication.getContext())
                .load(url)
                .error(Error)
                .placeholder(Placeholer)
                .into(imageView);
    }
    /**
     * 圆形图片加载
     * @param imageView
     * @param url
     */
    public static void Round(ImageView imageView, String url){
        RequestOptions mRequestOptions = RequestOptions.circleCropTransform()
                .diskCacheStrategy(DiskCacheStrategy.ALL)//不做磁盘缓存
                .skipMemoryCache(false);//不做内存缓存
        GlideApp.with(MyMVPApplication.getContext()).load(url) .error(Error)   .placeholder(Placeholer).apply(mRequestOptions).into(imageView);
    }
    /**
     * 圆角图片加载
     * @param imageView
     * @param url
     */
    public static void Fillet( ImageView imageView, String url,int width,int height,int roundingRadius){
        RoundedCorners roundedCorners= new RoundedCorners(roundingRadius);
        RequestOptions options=RequestOptions.bitmapTransform(roundedCorners).override(width, height);
        GlideApp.with(MyMVPApplication.getContext()).load(url) .error(Error)   .placeholder(Placeholer).apply(options).into(imageView);
    }

    public static void Fillet(ImageView imageView, int url){
        RoundedCorners roundedCorners= new RoundedCorners(20);
        RequestOptions options=RequestOptions.bitmapTransform(roundedCorners).override(300, 300);
        GlideApp.with(MyMVPApplication.getContext()).load(url) .error(Error)   .placeholder(Placeholer).apply(options).into(imageView);
    }
}
