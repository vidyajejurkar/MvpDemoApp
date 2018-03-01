package com.example.vidya.mvpdemoapp.ui.login;

import com.example.vidya.mvpdemoapp.data.DataManager;
import com.example.vidya.mvpdemoapp.ui.base.BasePresenter;

/**
 * Created by Vidya on 3/1/2018.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }

}