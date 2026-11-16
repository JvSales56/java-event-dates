# Event Scheduler

A simple Java application that demonstrates object-oriented programming, date manipulation, and time zone conversion using the Java Date and Time API.

## Technologies

- Java
- LocalDateTime
- ZonedDateTime
- ZoneId
- DateTimeFormatter
- Enums

## Features

- Create an event with a name, date, time, and day of the week.
- Display event details.
- Add five days to the original event date using `plusDays()`.
- Convert the event time to the São Paulo time zone.
- Convert the same instant to GMT using `withZoneSameInstant()`.

## Project Structure

```text
EventScheduler/
├── src/
│   ├── Event.java
│   ├── EventScheduler.java
│   └── WeekDay.java
└── README.md
```

## How to Run

1. Clone this repository:

   ```bash
   git clone <repository-url>
   ```

2. Open the project in your preferred Java IDE.

3. Compile and run `EventScheduler.java`.

## Concepts Practiced

- Classes and objects
- Constructors and encapsulation
- Enums
- Java Date and Time API
- Date manipulation with `plusDays()`
- Time zone conversion with `ZoneId` and `ZonedDateTime`

## Author

João Sales