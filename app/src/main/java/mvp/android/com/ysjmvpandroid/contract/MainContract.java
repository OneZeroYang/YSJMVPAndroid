package mvp.android.com.ysjmvpandroid.contract;


import mvp.android.com.mvplibrary.mvpbase.BaseView;



public interface MainContract {
    interface Model {
        String login(String username, String password);
    }

    interface View extends BaseView {
        @Override
        void showLoading();

        @Override
        void hideLoading();

        @Override
        void onError(Throwable throwable);

        void onSucceed(String s);
    }

    interface Presenter {
        /**
         * 登陆
         *
         * @param username
         * @param password
         */
        void login(String username, String password);
    }
}
