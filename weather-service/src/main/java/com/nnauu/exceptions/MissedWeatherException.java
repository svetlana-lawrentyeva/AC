package com.nnauu.exceptions;

/**
 * Created by SLavrentyeva on 08.09.2016.
 */
public class MissedWeatherException extends RuntimeException {
    public MissedWeatherException(String message) {
        super(message);
    }
}
