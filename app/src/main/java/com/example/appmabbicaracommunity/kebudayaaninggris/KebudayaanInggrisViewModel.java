package com.example.appmabbicaracommunity.kebudayaaninggris;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KebudayaanInggrisViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KebudayaanInggrisViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}