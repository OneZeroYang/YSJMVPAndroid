package mvp.android.com.ysjmvpandroid.model;



import mvp.android.com.ysjmvpandroid.contract.MainContract;

public class MainModel implements MainContract.Model {

    @Override
    public String login(String username, String password) {
        //具体实现
        return username;
    }


}
