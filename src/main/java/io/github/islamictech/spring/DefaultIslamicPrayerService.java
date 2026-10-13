package io.github.islamictech.spring;

import io.github.islamictech.astro.*;
import java.time.LocalDate;
import java.time.ZoneId;

public class DefaultIslamicPrayerService implements IslamicPrayerService {

    private final IslamicProperties properties;

    public DefaultIslamicPrayerService(IslamicProperties properties) {
        this.properties = properties;
    }

    @Override
    public PrayerTimes getPrayerTimes(double latitude, double longitude) {
        ZoneId zoneId = ZoneId.of(properties.getDefaultTimezone());
        return getPrayerTimes(latitude, longitude, LocalDate.now(zoneId), zoneId);
    }

    @Override
    public PrayerTimes getPrayerTimes(double latitude, double longitude, LocalDate date, ZoneId zoneId) {
        CalculationMethod method = CalculationMethod.valueOf(properties.getDefaultMethod().toUpperCase());
        AsrMethod asrMethod = AsrMethod.valueOf(properties.getDefaultAsr().toUpperCase());
        return PrayerTimesCalculator.calculate(latitude, longitude, date, zoneId, method, asrMethod, false);
    }

    @Override
    public QiblaResult getQibla(double latitude, double longitude) {
        return QiblaCalculator.calculate(latitude, longitude);
    }
}
