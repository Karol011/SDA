package Kolekcje.Kolejki.Dispatcher;

import lombok.Getter;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Getter
public class Report {
    String identificator;
    ReportType reportType;
    String reportMessage;
    LocalTime reportTime;


     Report(ReportType reportType, String reportMessage, LocalTime reportTime) {
        this.identificator = UUID.randomUUID().toString();
        this.reportType = reportType;
        this.reportMessage = reportMessage;
        this.reportTime = reportTime;

    }

    @Override
    public String toString() {
        return "Type=" + reportType +
                ", Message='" + reportMessage + '\'' +" "+
                reportTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
