package cn.edu.gdmec.android.weatherdemo.mvp.model;

import cn.edu.gdmec.android.weatherdemo.mvp.model.ILoadListener;

/**
 * Created by apple on 18/5/15.
 */

public interface IWeatherModel {
    void loadWeather(String url,ILoadListener loadListener);
}
