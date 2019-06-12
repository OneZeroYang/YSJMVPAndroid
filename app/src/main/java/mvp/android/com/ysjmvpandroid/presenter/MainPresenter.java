package mvp.android.com.ysjmvpandroid.presenter;


import mvp.android.com.mvplibrary.mvpbase.BasePresenter;
import mvp.android.com.ysjmvpandroid.contract.MainContract;
import mvp.android.com.ysjmvpandroid.model.MainModel;



public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {


    private MainContract.Model model;

    public MainPresenter() {
        model = new MainModel();
    }

    @Override
    public void login(String username, String password) {
        mView.showLoading();
        String login = model.login(username, password);
        mView.onSucceed(login);
    }
}
