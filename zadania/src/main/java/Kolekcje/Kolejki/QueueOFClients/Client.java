package Kolekcje.Kolejki.QueueOFClients;

import lombok.Getter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Getter
public class Client implements Comparable<Client> {
    private String name;
    private LocalTime timeOFArrival;
    private boolean isPriority;
    private DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Client(String name, boolean isPriority) {
        this.name = name;
        this.timeOFArrival = LocalTime.now();
        this.isPriority = isPriority;
    }


    @Override
    public String toString() {
        return name +
                ": " + getTimeOFArrival().format(timeFormatter) +
                ", Priority: " + isPriority;
    }

    @Override
    public int compareTo(Client c) {
        if (isPriority && !c.isPriority)
            return -1;
        if (!isPriority && c.isPriority)
            return 1;
        if (timeOFArrival.isBefore(c.timeOFArrival))
            return -1;
        if (timeOFArrival.isAfter(c.timeOFArrival))
            return 1;
        return 0;


    }
}
