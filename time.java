import java.time.Duration;
import java.time.Instant;

public class time {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant start = Instant.EPOCH;

        Duration duration = Duration.between(start, now);

        long days = duration.toDays();

        System.out.println(days);
    }
}