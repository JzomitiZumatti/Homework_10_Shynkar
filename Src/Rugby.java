import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        Random random = new Random();
        int genNumberOfPlayer = 25;
        int minAge = 18;
        int maxAge = 40;
        int genAgeFirstTeam = 0;
        int genAgeSecondTeam = 0;
        double avgAgeFirstTeam;
        double avgAgeSecondTeam;

        int[] firstTeamPlayersAge = new int[genNumberOfPlayer];
        for (int i = 0; i < firstTeamPlayersAge.length; i++) {
            int temp = random.nextInt(maxAge - minAge + 1) + minAge;
            firstTeamPlayersAge[i] = temp;
            genAgeFirstTeam += temp;
        }

        for (int age : firstTeamPlayersAge) {
            System.out.print(age + " ");
        }

        int[] secondTeamPlayersAge = new int[genNumberOfPlayer];
        for (int i = 0; i < secondTeamPlayersAge.length; i++) {
            secondTeamPlayersAge[i] = random.nextInt(maxAge - minAge + 1) + minAge;
            genAgeSecondTeam += secondTeamPlayersAge[i];
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
