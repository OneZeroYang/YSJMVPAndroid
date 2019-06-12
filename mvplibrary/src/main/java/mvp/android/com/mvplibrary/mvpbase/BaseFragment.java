package mvp.android.com.mvplibrary.mvpbase;


import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment extends Fragment {

    private Unbinder unBinder;
    private View view;
    /**
     * 当前屏幕宽
     */
    protected int widthPixels = 0;
    /**
     * 当前屏幕高
     */
    protected int heightPixels = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(this.setLayoutId(), container, false);
        unBinder = ButterKnife.bind(this, view);
        initView(view,savedInstanceState);
        initEvent(view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unBinder.unbind();
    }

    /**
     * 初始化视图
     *
     * @param view
     */
    protected abstract void initView(View view, Bundle savedInstanceState);

    protected abstract int setLayoutId();

    public final <T extends View> T findViewById(@IdRes int id) {
        if (view==null){
            throw new RuntimeException("BaseFragment view 为空");
        }
        return view.findViewById(id);
    }

    protected abstract void initEvent(View view);


    protected void getScreen() {
        DisplayMetrics outMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(outMetrics);
        widthPixels = outMetrics.widthPixels;
        heightPixels = outMetrics.heightPixels;
    }

}
