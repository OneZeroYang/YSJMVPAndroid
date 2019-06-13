package mvp.android.com.mvplibrary.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.util.AttributeSet;
import android.widget.ImageView;

import mvp.android.com.mvplibrary.utils.GlideUtils;

public class MVPImageView extends ImageView {
    private MVPImageView mvpImageView=null;
    private Context context=null;
    public MVPImageView(Context context) {
        super(context);
        this.context=context;
        mvpImageView=this;
    }

    public MVPImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        mvpImageView=this;
    }

    public MVPImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context=context;
        mvpImageView=this;
    }



    public MVPImageView Load(String path){
        Check();
        GlideUtils.Glide(mvpImageView,path);
        return mvpImageView;
    }
    public MVPImageView Load(@IdRes int path){
        Check();
        GlideUtils.Glide(mvpImageView,path);
        return mvpImageView;
    }
    public MVPImageView LoadRound(String path){
        Check();
        GlideUtils.Round(mvpImageView,path);
        return mvpImageView;
    }
    public MVPImageView LoadFillet(String path,int width,int height,int roundingRadius){
        Check();
        GlideUtils.Fillet(mvpImageView,path,width,height,roundingRadius);
        return mvpImageView;
    }

    private void Check(){
        if (mvpImageView==null||context==null){
            throw new RuntimeException("MVPImageView is init?");
        }
    }

}
