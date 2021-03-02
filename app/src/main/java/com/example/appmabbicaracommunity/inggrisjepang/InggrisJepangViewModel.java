package com.example.appmabbicaracommunity.inggrisjepang;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InggrisJepangViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InggrisJepangViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}