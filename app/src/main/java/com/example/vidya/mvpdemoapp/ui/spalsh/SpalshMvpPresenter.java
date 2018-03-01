package com.example.vidya.mvpdemoapp.ui.spalsh;

import com.example.vidya.mvpdemoapp.ui.base.MvpPresenter;

/**
 * Created by Vidya on 3/1/2018.
 */

public interface SpalshMvpPresenter<V extends SpalshMvpView> extends MvpPresenter<V> {

    void decideNextActivity();

}