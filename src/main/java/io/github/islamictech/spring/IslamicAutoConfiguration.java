package io.github.islamictech.spring;

/**
 * Spring Boot 3 auto-configuration class.
 * Automatically defines beans for IslamicPrayerService when on classpath.
 */
public class IslamicAutoConfiguration {

    public IslamicProperties islamicProperties() {
        return new IslamicProperties();
    }

    public IslamicPrayerService islamicPrayerService(IslamicProperties properties) {
        return new DefaultIslamicPrayerService(properties);
    }
}
