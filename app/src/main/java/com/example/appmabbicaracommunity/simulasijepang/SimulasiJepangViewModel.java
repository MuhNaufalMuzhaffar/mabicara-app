package com.example.appmabbicaracommunity.simulasijepang;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SimulasiJepangViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SimulasiJepangViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}