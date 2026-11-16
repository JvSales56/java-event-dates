import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EventScheduler {

    public static void main(String[] args) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime currentDate = LocalDateTime.now();

        WeekDay weekDay = convertWeekDay(currentDate);

        Event event = new Event(
                "Java Programming Meeting",
                currentDate,
                weekDay
        );

        event.displayEvent();

        // Add five days to the event date
        LocalDateTime newDate = event.getDateTime().plusDays(5);

        System.out.println("\n=== Date After Five Days ===");
        System.out.println(newDate.format(formatter));

        // Convert the event date and time to São Paulo time
        ZonedDateTime saoPauloTime = event.getDateTime()
                .atZone(ZoneId.of("America/Sao_Paulo"));

        // Convert the same instant to GMT
        ZonedDateTime gmtTime = saoPauloTime
                .withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println("\n=== Time Zone Conversion ===");
        System.out.println("São Paulo: " + saoPauloTime.format(formatter));
        System.out.println("GMT: " + gmtTime.format(formatter));
    }

    private static WeekDay convertWeekDay(LocalDateTime date) {

        switch (date.getDayOfWeek()) {
            case MONDAY:
                return WeekDay.MONDAY;
            case TUESDAY:
                return WeekDay.TUESDAY;
            case WEDNESDAY:
                return WeekDay.WEDNESDAY;
            case THURSDAY:
                return WeekDay.THURSDAY;
            case FRIDAY:
                return WeekDay.FRIDAY;
            case SATURDAY:
                return WeekDay.SATURDAY;
            default:
                return WeekDay.SUNDAY;
        }
    }
}