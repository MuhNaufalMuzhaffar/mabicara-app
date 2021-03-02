package com.example.appmabbicaracommunity.indonesiajepang;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IndonesiaJepangViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IndonesiaJepangViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}