package com.example.vidya.mvpdemoapp.ui.base;

/**
 * Created by Vidya on 3/1/2018.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

}