package com.example.appmabbicaracommunity.kebudayaanindonesia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KebudayaanIndonesiaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KebudayaanIndonesiaViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}