import java.time.*;

public class dateAndTime {
    public static void main(String[] args) {
        LocalDate d=LocalDate.of(2003, Month.SEPTEMBER,7);
        System.out.println(d);
        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        for(String i:ZoneId.getAvailableZoneIds()){
            System.out.println(i);
        }
        LocalTime tz=LocalTime.now(ZoneId.of("Europe/Warsaw"));
        System.out.println(tz);
    }
}
