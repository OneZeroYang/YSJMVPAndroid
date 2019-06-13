package mvp.android.com.ysjmvpandroid.presenter;

import mvp.android.com.mvplibrary.mvpbase.BasePresenter;
import mvp.android.com.ysjmvpandroid.contract.LoginContract;
import mvp.android.com.ysjmvpandroid.model.LoginModel;

public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {
    private LoginContract.Model model;

    public LoginPresenter() {
        model = new LoginModel();
    }

    @Override
    public void Login(String username, String password) {
        mView.showLoading();
        model.Login(new LoginContract.NetWorkCallback() {
            @Override
            public void succeed(String s) {
                mView.succeed(s);
            }

            @Override
            public void error(String s) {
                mView.error(s);
            }
        });

    }
}
