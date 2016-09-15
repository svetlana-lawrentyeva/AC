package com.nnauu.weatherservice

import spock.lang.Specification

/**
 * Created by SLavrentyeva on 08.09.2016.
 */
class WeatherConnectorTest extends Specification {

    def "get weather data"() {
        setup:
        def weatherConnector = new WeatherConnector()

        when:
        def weatherData = weatherConnector.getWeatherData()

        then:
        weatherData.size() > 0
    }
}
