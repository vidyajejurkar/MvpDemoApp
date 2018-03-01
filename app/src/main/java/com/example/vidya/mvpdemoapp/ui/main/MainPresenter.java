package com.example.vidya.mvpdemoapp.ui.main;

import com.example.vidya.mvpdemoapp.data.DataManager;
import com.example.vidya.mvpdemoapp.ui.base.BasePresenter;

/**
 * Created by Vidya on 3/1/2018.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }

}