package mvp.android.com.ysjmvpandroid.activity;

import android.support.annotation.Nullable;
import android.os.Bundle;

import mvp.android.com.mvplibrary.mvpbase.BaseMvpActivity;
import mvp.android.com.ysjmvpandroid.contract.LoginContract;
import mvp.android.com.ysjmvpandroid.presenter.LoginPresenter;

public class LoginActivity extends BaseMvpActivity<LoginPresenter> implements LoginContract.View {


    @Override
    protected int setLayoutId() {
        return 0;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        mPresenter=new LoginPresenter();
        mPresenter.attachView(this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError(Throwable throwable) {

    }
}
