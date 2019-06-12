package mvp.android.com.ysjmvpandroid.activity;

import android.support.annotation.Nullable;
import android.os.Bundle;

import mvp.android.com.mvplibrary.mvpbase.BaseMvpActivity;
import mvp.android.com.ysjmvpandroid.R;
import mvp.android.com.ysjmvpandroid.contract.MainContract;
import mvp.android.com.ysjmvpandroid.presenter.MainPresenter;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.View{


    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        mPresenter = new MainPresenter();
        mPresenter.attachView(this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {
        mPresenter. login("","");
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onSucceed(String s) {

    }
}
