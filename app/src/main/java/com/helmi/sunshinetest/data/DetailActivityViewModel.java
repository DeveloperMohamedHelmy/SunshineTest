package com.helmi.sunshinetest.data;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.helmi.sunshinetest.data.entities.WeatherEntry;

public class DetailActivityViewModel extends ViewModel {

    // Weather forecast the user is looking at
    private MutableLiveData<WeatherEntry> mWeather;

    public DetailActivityViewModel() {
        mWeather = new MutableLiveData<>();

    }

    public MutableLiveData<WeatherEntry> getWeather() {
        return mWeather;
    }

    public void setWeather(MutableLiveData<WeatherEntry> weatherEntry) {
        mWeather = weatherEntry;
    }
}