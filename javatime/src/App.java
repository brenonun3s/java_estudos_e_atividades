import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fm4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fm5 = DateTimeFormatter.ISO_INSTANT;

        

        LocalDate d01 = LocalDate.now();

        LocalDateTime d02 = LocalDateTime.now();

        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-07-03");
        LocalDateTime d05 = LocalDateTime.parse("2025-07-03T16:46:36");

        Instant d06 = Instant.parse("2025-07-03T16:46:36Z");

        Instant d07 = Instant.parse("2025-07-03T16:46:36-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2025", fm1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2025 01:30", fm2);

        LocalDate d10 = LocalDate.of(2025, 7, 03);

        System.out.println(d01);
        System.out.println("--------------");
        System.out.println(d02);
        System.out.println("--------------");
        System.out.println(d03);
        System.out.println("--------------");
        System.out.println(d04);
        System.out.println("--------------");
        System.out.println(d05);
        System.out.println("--------------");
        System.out.println(d06);
        System.out.println("--------------");
        System.out.println(d07);
        System.out.println("--------------");
        System.out.println(d08);
        System.out.println("--------------");
        System.out.println(d09);
        System.out.println("--------------");
        System.out.println(d10);





    }
}
