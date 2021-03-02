package com.example.appmabbicaracommunity.jepanginggris;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JepangInggrisViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JepangInggrisViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}