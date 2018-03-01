package com.example.vidya.mvpdemoapp.ui.main;

import com.example.vidya.mvpdemoapp.ui.base.MvpPresenter;
import com.example.vidya.mvpdemoapp.ui.base.MvpView;

/**
 * Created by Vidya on 3/1/2018.
 */

public interface MainMvpPresenter<V extends MainMvpView & MvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();

}