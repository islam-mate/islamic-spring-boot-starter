package io.github.islamictech.spring;

import io.github.islamictech.astro.PrayerTimes;
import io.github.islamictech.astro.QiblaResult;
import java.time.LocalDate;
import java.time.ZoneId;

public interface IslamicPrayerService {

    PrayerTimes getPrayerTimes(double latitude, double longitude);

    PrayerTimes getPrayerTimes(double latitude, double longitude, LocalDate date, ZoneId zoneId);

    QiblaResult getQibla(double latitude, double longitude);
}
