package com.example.appmabbicaracommunity.kebudayaanjepang;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KebudayaanJepangViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KebudayaanJepangViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}