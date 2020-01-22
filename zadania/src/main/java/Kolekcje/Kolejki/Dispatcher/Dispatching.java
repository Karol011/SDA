package Kolekcje.Kolejki.Dispatcher;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

class Dispatching {
    private Map<String, Report> reportMap;

    Dispatching() {
        this.reportMap = new HashMap<>();
    }

    void addReport(String message, ReportType type) {
        Report report = new Report(type, message, LocalTime.now());
        reportMap.put(report.getIdentificator(), report);
    }

    void showReports() {
        for (Map.Entry element : reportMap.entrySet()) {
            System.out.println("uuid: " + element.getKey().toString()
                    + " " + element.getValue().toString());
        }
    }

    void showMostRecentReport() {
        List<Report> reportList = new LinkedList<>();
        Comparator<LocalTime> timeComparator = new Comparator<LocalTime>() {
            @Override
            public int compare(LocalTime localTime, LocalTime t1) {
                return 0;
            }
        };

        Optional<LocalTime> first = reportMap.entrySet().stream()
                .map(e -> e.getValue().
                        getReportTime())
                .min((r1, r2) -> timeComparator.compare(r1, r2));

        System.out.println(first);
    }

    void listReportType(ReportType type) {
        reportMap.entrySet().stream()
                .filter(r -> r.getValue().getReportType().equals(type))
                .forEach(r -> System.out.println(r.getKey() + " " + r.getValue()));
    }

}







