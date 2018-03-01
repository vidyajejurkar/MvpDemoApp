package com.example.vidya.mvpdemoapp.ui.spalsh;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.vidya.mvpdemoapp.MvpApp;
import com.example.vidya.mvpdemoapp.R;
import com.example.vidya.mvpdemoapp.data.DataManager;
import com.example.vidya.mvpdemoapp.ui.base.BaseActivity;
import com.example.vidya.mvpdemoapp.ui.login.LoginActivity;
import com.example.vidya.mvpdemoapp.ui.main.MainActivity;

/**
 * Created by Vidya on 3/1/2018.
 */

public class SpalshActivity extends BaseActivity implements SpalshMvpView {

    SpalshPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SpalshActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();

        mSplashPresenter = new SpalshPresenter(dataManager);

        mSplashPresenter.onAttach(this);

        mSplashPresenter.decideNextActivity();

    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}