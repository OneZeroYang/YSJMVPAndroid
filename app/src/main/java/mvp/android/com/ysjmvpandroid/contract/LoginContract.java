package mvp.android.com.ysjmvpandroid.contract;

import mvp.android.com.mvplibrary.mvpbase.BaseView;

public interface LoginContract {
    interface Model{
        void Login(NetWorkCallback netWorkCallback);
    }

    interface View extends BaseView {

        void succeed(String s);
        void error(String s);
    }
    interface Presenter{
        void Login(String username,String password);
    }




    interface NetWorkCallback{
        void succeed(String s);
        void error(String s);
    }
}
