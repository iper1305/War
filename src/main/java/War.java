import warMembers.*;
import weapons.Howitzer;
import weapons.Javelin;
import weapons.Tank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class War {

    public static void fight() {
        List<UkrainianSoldier> soliders = buildUkrainianPlatoon();
        List<RussianFreak> freaks = buildRussianPlatoon();

        for (int j = 0; j < soliders.size(); j++) {
            for (int i = 0; i < freaks.size(); i++) {
                if (freaks.get(i).getHealth() > 0) {
                    soliders.get(j).attackRussians(freaks.get(i));
                }
            }
        }
    }

    private static List<UkrainianSoldier> buildUkrainianPlatoon() {
        List<UkrainianSoldier> soliders = new ArrayList<>();
        int numberOfArtillerymen = getNumber("ukrainian", "artillerymen");
        int numberOfRocketman = getNumber("ukrainian", "rocketman");
        int numberOfTanker = getNumber("ukrainian", "tanker");

        for (int i = 0; i < numberOfArtillerymen; i++) {
            soliders.add(new Artilleryman("Ukrainian artilleryman" + (i + 1), new Howitzer()));
        }

        for (int i = 0; i < numberOfRocketman; i++) {
            soliders.add(new Rocketman("Ukrainian rocketman" + (i + 1), new Javelin()));
        }

        for (int i = 0; i < numberOfTanker; i++) {
            soliders.add(new Tanker("Ukrainian tanker" + (i + 1), new Tank()));
        }
        return soliders;
    }

    private static List<RussianFreak> buildRussianPlatoon() {
        List<RussianFreak> freaks = new ArrayList<>();
        int numberOfFreaks = getNumber("russian", "рассейских ванюшка");
        int health = (int) (Math.random() * (100 - 20) + 20);
        for (int i = 0; i < numberOfFreaks; i++) {
            freaks.add(new RussianFreak("рассейский ванюшка " + (i + 1), health));
        }
        return freaks;
    }

    private static int getNumber(String affiliation, String rank) {
        System.out.println("You need to create a " + affiliation + " platoon. How many " + rank + " will be in it?");
        Scanner scan = new Scanner(System.in);
        int number;
        if (scan.hasNextInt()) {
            number = scan.nextInt();
        } else {
            System.out.println("You entered incorrect data. Try again.");
            number = getNumber(affiliation, rank);
        }
        if (number <= 0) {
            System.out.println("You entered incorrect data. Try again.");
            number = getNumber(affiliation, rank);
        }
        return number;
    }
}
