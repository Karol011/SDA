package WzorceProjektowe.Adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterUsage {
    public static void main(String[] args) {
        List<PCGame> pcGames = new ArrayList<>();
        pcGames.add(new ComputerGameAdapter(new ComputerGame("Withcher 3",
                PegiAgeRating.P16,
                51000000D,
                8,
                120,
                8,
                4,
                2.6
        )));
        for (final PCGame pcGame : pcGames) {
            System.out.println(pcGame.getTitle());
            System.out.println(pcGame.getPegiAllowedAge());
            System.out.println(pcGame.isTripleAGame());
            System.out.println(pcGame.getRequirements());
        }
    }
}
