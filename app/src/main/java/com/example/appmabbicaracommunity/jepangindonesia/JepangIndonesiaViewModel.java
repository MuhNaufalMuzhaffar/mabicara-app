package com.example.appmabbicaracommunity.jepangindonesia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JepangIndonesiaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JepangIndonesiaViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}