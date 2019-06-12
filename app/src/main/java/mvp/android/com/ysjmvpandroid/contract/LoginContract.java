package mvp.android.com.ysjmvpandroid.contract;

import mvp.android.com.mvplibrary.mvpbase.BaseView;

public interface LoginContract {
    interface Model{
        int Login();
    }

    interface View extends BaseView {

    }
    interface Presenter{
        void Login(String username,String password);
    }
}
