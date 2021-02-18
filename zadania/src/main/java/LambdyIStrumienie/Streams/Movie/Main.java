package LambdyIStrumienie.Streams.Movie;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static List<Episode> showListOfAllEpisodes(List<Season> seasons) {
        return seasons.stream()
                .flatMap(s -> s.getEpisodes().stream())
                .collect(Collectors.toList());
    }

    public static List<Video> showListOfAllVideos(List<Season> seasons) {
        return seasons.stream()
                .flatMap(s -> s.getEpisodes().stream())
                .flatMap(e -> e.getVideos().stream())
                .collect(Collectors.toList());
    }

    public static List<String> showListOfAllSeasonNames(List<Season> seasons) {
        return seasons.stream()
                .map(Season::getSeasonName)
                .collect(Collectors.toList());
    }

    public static void showListOfAllSeasonNumbers(List<Season> seasons) {
        seasons.stream()
                .map(Season::getSeasonNumber)
                .forEach(System.out::println);
    }

    public static List<String> showListOfAllEpisodesNames(List<Season> seasons) {
        return seasons.stream()
                .flatMap(s -> s.getEpisodes().stream())
                .map(Episode::getEpisodeName)
                .collect(Collectors.toList());
    }

    public static List<Integer> showListOfAllEpisodesNumbers(List<Season> seasons) {
        return seasons.stream()
                .flatMap(s -> s.getEpisodes().stream())
                .map(Episode::getEpisodeNumber)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> showListOfAllVideosNames(List<Season> seasons) {
        return seasons.stream()
                .flatMap(s -> s.getEpisodes().stream())
                .flatMap(e -> e.getVideos().stream())
                .map(Video::getTitle)
                .collect(Collectors.toList());
    }

    public static void showEpisodesFromEvenSeasons(List<Season> seasons) {
        seasons.stream()
                .filter(s -> s.getSeasonNumber() % 2 == 0)
                .flatMap(s -> s.getEpisodes().stream())
                .map(Episode::getEpisodeName)
                .forEach(System.out::println);
    }

    //tylko video typu Clip z parzystych epizodów i nieparzystych sezonów
    public static List<Video> showListOFClipsFromUnevenSeasonsAndEvenEpisodes(List<Season> seasons) {
        return seasons.stream()
                .filter(s -> s.getSeasonNumber() % 2 != 0)
                .flatMap(s -> s.getEpisodes().stream())
                .filter(e -> e.getEpisodeNumber() % 2 == 0)
                .flatMap(e -> e.getVideos().stream())
                .filter(v -> v.getVideoType().equals(VideoType.CLIP))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Video video = new Video("GOT1", "got1.com", VideoType.CLIP);
        Video video1 = new Video("GOT2", "got2.com", VideoType.EPISODE);
        Video video2 = new Video("GOT3", "got3.com", VideoType.PREVIEW);
        Video video3 = new Video("GOT4", "got4.com", VideoType.PREVIEW);
        Video video4 = new Video("GOT5", "got5.com", VideoType.CLIP);
        Video video5 = new Video("GOT6", "got6.com", VideoType.EPISODE);

        Episode episode = new Episode("got1", 1, Arrays.asList(video, video1));
        Episode episodel = new Episode("got2", 2, Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 1, Arrays.asList(video4, video5));

        Season season = new Season("GOTS1", 1, Arrays.asList(episode, episodel));
        Season season1 = new Season("GOTS1", 2, Arrays.asList(episode2));

        List<Season> seasons = Arrays.asList(season, season1);

        // System.out.println(showListOfAllEpisodes(seasons));
        // System.out.println(showListOfAllSeasonNames(seasons));
        //System.out.println(showListOfAllVideos(seasons));
        // showListOfAllSeasonNumbers(seasons);
        //System.out.println(showListOfAllEpisodesNames(seasons));
        //System.out.println(showListOfAllEpisodesNumbers(seasons));
        // System.out.println(showListOfAllVideosNames(seasons));
        //showEpisodesFromEvenSeasons(seasons);
        System.out.println(showListOFClipsFromUnevenSeasonsAndEvenEpisodes(seasons));
    }
/*
Wykorzystując mechanizmy programowania funkcyjnego na podstawie zadanej
struktury wyświetl:
listę wszystkich epizodów
listę wszystkich nazw sezonów
listę wszystkich numerów sezonów
listę wszystkich nazw epizodów
listę wszystkich numerów epizodów
listę wszystkich nazw video
listę wszystkich adresów url dla każdego video
tylko epizody z parzystych sezonów
tylko video z parzystych sezonów
tylko video z parzystych epizodów i sezonów
tylko video typu Clip z parzystych epizodów i nieparzystych sezonów
tylko video typu Preview z nieparzystych epizodów i parzystych sezonów
 */

}
