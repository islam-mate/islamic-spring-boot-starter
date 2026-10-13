# islamic-spring-boot-starter 🍃🕌

**Official Spring Boot 3 starter for Islamic prayer times, solar positions, and Qibla compass calculations.**

Integrates effortlessly into any **Spring Boot** microservice or web application with auto-configured beans and properties.

---

## 📦 Maven Dependency
```xml
<dependency>
    <groupId>io.github.islamictech</groupId>
    <artifactId>islamic-spring-boot-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```

Or for Gradle:
```groovy
implementation 'io.github.islamictech:islamic-spring-boot-starter:1.0.0'
```

---

## ⚙️ Configuration (`application.yml`)
```yaml
islamic:
  default-method: EGYPT          # EGYPT, MWL, ISNA, MAKKAH, KARACHI, TEHRAN, JAFARI
  default-asr: STANDARD          # STANDARD or HANAFI
  default-timezone: Africa/Cairo # Standard IANA TimeZone
  rest-api-enabled: true         # Enable built-in REST endpoints
  rest-api-prefix: /api/v1/islamic
```

---

## 🚀 Usage

### Inject into any Spring `@Service` or `@RestController`
```java
@Service
public class MosqueNotificationService {

    @Autowired
    private IslamicPrayerService prayerService;

    public void checkPrayerSchedule() {
        // Calculate daily prayer times for Cairo
        PrayerTimes times = prayerService.getPrayerTimes(30.0444, 31.2357);
        System.out.println("Fajr: " + times.fajr());
        System.out.println("Maghrib: " + times.maghrib());

        // Get Qibla angle and distance
        QiblaResult qibla = prayerService.getQibla(30.0444, 31.2357);
        System.out.printf("Qibla is %.1f° (%s)%n", qibla.bearing(), qibla.direction());
    }
}
```

---

## 📄 License
MIT License.
