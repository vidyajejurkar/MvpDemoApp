package com.example.vidya.mvpdemoapp.ui.spalsh;

import com.example.vidya.mvpdemoapp.data.DataManager;
import com.example.vidya.mvpdemoapp.ui.base.BasePresenter;

/**
 * Created by Vidya on 3/1/2018.
 */

public class SpalshPresenter<V extends SpalshMvpView> extends BasePresenter<V> implements SpalshMvpPresenter<V> {

    public SpalshPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}