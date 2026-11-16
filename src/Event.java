import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {

    private String name;
    private LocalDateTime dateTime;
    private WeekDay weekDay;

    public Event(String name, LocalDateTime dateTime, WeekDay weekDay) {
        this.name = name;
        this.dateTime = dateTime;
        this.weekDay = weekDay;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void displayEvent() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("\n=== Event Details ===");
        System.out.println("Name: " + name);
        System.out.println("Date and Time: " + dateTime.format(formatter));
        System.out.println("Day of the Week: " + weekDay);
    }
}