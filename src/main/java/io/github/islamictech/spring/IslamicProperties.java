package io.github.islamictech.spring;

/**
 * Configuration properties for Islamic services.
 * Configured in application.yml or application.properties under "islamic.*"
 */
public class IslamicProperties {

    private String defaultMethod = "EGYPT";
    private String defaultAsr = "STANDARD";
    private String defaultTimezone = "Africa/Cairo";
    private boolean restApiEnabled = true;
    private String restApiPrefix = "/api/v1/islamic";

    public String getDefaultMethod() { return defaultMethod; }
    public void setDefaultMethod(String defaultMethod) { this.defaultMethod = defaultMethod; }

    public String getDefaultAsr() { return defaultAsr; }
    public void setDefaultAsr(String defaultAsr) { this.defaultAsr = defaultAsr; }

    public String getDefaultTimezone() { return defaultTimezone; }
    public void setDefaultTimezone(String defaultTimezone) { this.defaultTimezone = defaultTimezone; }

    public boolean isRestApiEnabled() { return restApiEnabled; }
    public void setRestApiEnabled(boolean restApiEnabled) { this.restApiEnabled = restApiEnabled; }

    public String getRestApiPrefix() { return restApiPrefix; }
    public void setRestApiPrefix(String restApiPrefix) { this.restApiPrefix = restApiPrefix; }
}
