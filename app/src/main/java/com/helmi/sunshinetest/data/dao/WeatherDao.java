package com.helmi.sunshinetest.data.dao;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.helmi.sunshinetest.data.entities.WeatherEntry;

import java.sql.Date;

public interface WeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void bulkInsert(WeatherEntry... weather);

    @Query("SELECT * FROM weather WHERE date = :date")
    WeatherEntry getWeatherByDate(Date date);

}
