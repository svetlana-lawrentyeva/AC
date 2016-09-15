package com.nnauu.weatherservice;

import com.nnauu.exceptions.MissedWeatherException;
import org.bitpipeline.lib.owm.*;
import org.json.JSONException;

import java.io.IOException;
import java.util.List;

/**
 * Created by SLavrentyeva on 08.09.2016.
 */
public class WeatherConnector {

    // days = 1 - 16

    public List<ForecastWeatherData> getWeatherData() throws IOException, JSONException {
        OwmClient owm = new OwmClient();
//        WeatherStatusResponse curreentWeather = owm.currentWeatherAroundPoint(latitude, longitude, days);
        WeatherForecastResponse currentWeather = owm.forecastWeatherAtCity(709930);
        if (currentWeather.hasForecasts()) {
            return currentWeather.getForecasts();
        }

        throw new MissedWeatherException("Current weather forecast is unavailable");
    }
}
