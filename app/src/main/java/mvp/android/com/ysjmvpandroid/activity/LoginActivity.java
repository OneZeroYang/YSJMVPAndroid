package mvp.android.com.ysjmvpandroid.activity;

import android.support.annotation.Nullable;
import android.os.Bundle;

import butterknife.ButterKnife;
import mvp.android.com.mvplibrary.mvpbase.BaseMvpActivity;
import mvp.android.com.ysjmvpandroid.R;
import mvp.android.com.ysjmvpandroid.contract.LoginContract;
import mvp.android.com.ysjmvpandroid.presenter.LoginPresenter;

public class LoginActivity extends BaseMvpActivity<LoginPresenter> implements LoginContract.View {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        mPresenter=new LoginPresenter();
        mPresenter.attachView(this);
        mPresenter.Login("","");
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

    @Override
    public void succeed(String s) {

    }

    @Override
    public void error(String s) {

    }
}
