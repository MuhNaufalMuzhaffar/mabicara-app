package com.example.appmabbicaracommunity.simulasiinggris;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SimulasiInggrisViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SimulasiInggrisViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}