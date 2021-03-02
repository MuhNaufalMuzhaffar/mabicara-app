package com.example.appmabbicaracommunity.indonesiainggris;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IndonesiaInggrisViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IndonesiaInggrisViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }


}