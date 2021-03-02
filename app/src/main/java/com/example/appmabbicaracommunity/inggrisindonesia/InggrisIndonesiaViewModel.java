package com.example.appmabbicaracommunity.inggrisindonesia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InggrisIndonesiaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InggrisIndonesiaViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}