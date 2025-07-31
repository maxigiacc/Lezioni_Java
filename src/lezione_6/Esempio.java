import java.time.*;

public class Esempio {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime date_time = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(date_time);
    }
}
