package com.example.vidya.mvpdemoapp.ui.login;

import com.example.vidya.mvpdemoapp.ui.base.MvpPresenter;

/**
 * Created by Vidya on 3/1/2018.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);

}