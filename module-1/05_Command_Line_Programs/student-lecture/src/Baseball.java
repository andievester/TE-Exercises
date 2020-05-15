import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		System.out.println("Enter number of players on your team:");
		Scanner input = new Scanner(System.in);
		String strNumPlayers = input.nextLine();
		
		int numPlayers = Integer.parseInt(strNumPlayers);
		System.out.println("you entered " + numPlayers + "players");
		
		String[] playerNames = new String[numPlayers];
		int[] playerAtBats = new int[numPlayers];
		int[] playerHits = new int[numPlayers];
		
		for (int i = 0; i < numPlayers; i++) {
		System.out.println("Enter player name: ");
		String name = input.nextLine();
		playerNames[i] = name;
		System.out.println("Enter number of times at bat for " + name);
		String strAtBat = input.nextLine();
		int atBats = Integer.parseInt(strAtBat);
		playerAtBats[i] = atBats;
		
		int hits = atBats + 1;
		while (hits > atBats) {
		System.out.println("Enter number of hits for " + name);
		String strHits = input.nextLine();
		hits = Integer.parseInt(strHits);
		playerHits[i] = hits;
		}
		}
		
		System.out.println("Your player list: ");
		
		int indexHighestBattingAverage = 0;
		for (int i = 0; i < numPlayers; i++) {
			double battingAverage = CalculateBattingAverage(playerHits[i] , playerAtBats[i]);
			if (battingAverage > CalculateBattingAverage(playerHits[indexHighestBattingAverage], playerAtBats[indexHighestBattingAverage]))
					indexHighestBattingAverage = i;
			System.out.format("Player name: %-10s Batting average: %0.3f \n",  playerNames[i], battingAverage);
			
		}
		
	}
	public static double CalculateBattingAverage(int hits, int timesAtBat) {
		if (timesAtBat == 0)
		{
			return 0;
		}
		double battingAverage = hits / timesAtBat;
		return battingAverage;
	}

}