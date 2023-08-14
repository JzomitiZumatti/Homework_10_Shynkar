import java.util.Random;

public class Rugby {
    final static int genNumberOfPlayer = 25;
    final static int minAge = 18;
    final static int maxAge = 40;
    public static void main(String[] args) {
        Random random = new Random();

        int genAgeFirstTeam = 0;
        int genAgeSecondTeam = 0;
        double avgAgeFirstTeam;
        double avgAgeSecondTeam;

        int[] firstTeamPlayersAge = new int[genNumberOfPlayer];
        int[] secondTeamPlayersAge = new int[genNumberOfPlayer];

        for (int i = 0; i < genNumberOfPlayer; i++) {
            int firstTemp = random.nextInt(maxAge - minAge + 1) + minAge;
            int secondTemp = random.nextInt(maxAge - minAge + 1) + minAge;
            firstTeamPlayersAge[i] = firstTemp;
            secondTeamPlayersAge[i] = secondTemp;
            genAgeFirstTeam += firstTemp;
            genAgeSecondTeam += secondTemp;
        }

        for (int age : firstTeamPlayersAge) {
            System.out.print(age + " ");
        }

        System.out.println();
        for (int age : secondTeamPlayersAge) {
            System.out.print(age + " ");
        }

        avgAgeFirstTeam = (double)genAgeFirstTeam / firstTeamPlayersAge.length;
        avgAgeSecondTeam = (double)genAgeSecondTeam / secondTeamPlayersAge.length;

        System.out.printf("\nThe average age of players in the first team is: %.1f y.o., when in the second" +
                " team is: %.1f y.o.", avgAgeFirstTeam, avgAgeSecondTeam);
    }
}
