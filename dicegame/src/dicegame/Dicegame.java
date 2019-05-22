package dicegame;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Lari Vesterinen
 * @since 22.5.2019
 */

public class Dicegame { // Luokka jonka sisälle koko ohjelma rakentuu

	/**
	 * 
	 * @return palauttaa randomoidun noppaluvun arvon
	 */
	public static int random() {
		Random r = new Random();
		int a = r.nextInt(6) + 1;
		return a;
	}

	/**
	 * Metodi vaikeustason valitsemiselle, kätevä olla omana metodina koska
	 * vaihtoehtolistaa voidaan tarvita useammin kuin kerran
	 */
	public static void options() {
		System.out.println("");
		System.out.println("Choose difficulty: ");
		System.out.println("1. Easy");
		System.out.println("2. Normal");
		System.out.println("3. Hard");
		System.out.println("");
	}

	/**
	 * 
	 * @param difficulty on käyttäjän valitsema vaikeustaso, switch-casella saa
	 *                   selkännäköisen koodin sekä virheilmoituksen (default)
	 */

	public static void selectionMessage(int difficulty) {

		switch (difficulty) {
		case 1:
			System.out.println("You choosed 1. Easy");
			break;
		case 2:
			System.out.println("You choosed 2. Normal");
			break;
		case 3:
			System.out.println("You choosed 3. Hard");
			break;
		default:
			System.out.println("You must choose difficulty between 1-3.");
		}

	}

	/**
	 * 
	 * @param roundcount valittujen kierrosten määrä
	 * @param player     pelaajan noppaluku
	 * @param computer   tietokoneen noppaluku
	 * @param wins       voittolaskin
	 * @param draws      tasapelilaskin
	 * @param losses     häviölaskin
	 * @roundCounter kierroslaskin
	 * 
	 * @param dicescore tarvitaan jotta saadaan helposti kahden nopan luvut laskettua yhteen
	 * 
	 * for loop ajaa metodia kunnes valittu kierrosmäärä tulee täyteen
	 */
	public static void easy(int roundcount, int player, int computer, int wins, int draws, int losses) {

		int roundCounter = roundcount;

		for (int i = 0; roundcount > i; i++) {
			System.out.println("you");
			player = random();
			computer = random();
			int dicescore = player;

			switch (player) {
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six();
				break;
			}

			player = random();
			dicescore += player;

			switch (player) {
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six();
				break;
			}
			System.out.println("\n");
			System.out.println("computer");

			switch (computer) {
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six();
				break;
			}

			if (dicescore > computer) {
				System.out.println("\nYou won, I bet it feels better than winning the lottery (: ");
				System.out.println("");
				wins += 1;

			}
			if (computer > dicescore) {
				System.out.println("\nYou lost :(, try harder please. ");
				System.out.println("");
				losses += 1;

			}
			if (dicescore == computer) {
				System.out.println("\nDraw! What a joke. ");
				System.out.println("");
				draws += 1;

			}
			roundCounter = roundCounter - 1;
			System.out.println("Wins: " + wins);
			System.out.println("Draws: " + draws);
			System.out.println("Losses: " + losses);
			System.out.println("Rounds left: " + roundCounter);
			System.out.println("");
		}

		return;

	}
/**
 * 
 * Samanlainen kuin easy metodi, olisi voinut tehdä ilman dicescorea mutta kävi nopeasti kopioimalla aikaisempaa metodia
 * lisäksi ohjelman ja rasituksen kannalta ei merkitystä
 */
	public static void normal(int roundcount, int player, int computer, int wins, int draws, int losses) {

		int roundCounter = roundcount;

		for (int i = 0; roundcount > i; i++) {
			System.out.println("you");

			player = random();
			computer = random();
			int dicescore = player;

			switch (player) {
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six();
				break;
			}

			System.out.println("\n");
			System.out.println("computer");

			switch (computer) {
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six();
				break;
			}

			if (dicescore > computer) {
				System.out.println("\nYou won, I bet it feels better than winning the lottery (: ");
				System.out.println("");
				wins += 1;

			}
			if (computer > dicescore) {
				System.out.println("\nYou lost :(, try harder please. ");
				System.out.println("");
				losses += 1;

			}
			if (dicescore == computer) {
				System.out.println("\nDraw! What a joke. ");
				System.out.println("");
				draws += 1;

			}
			roundCounter = roundCounter - 1;
			System.out.println("Wins: " + wins);
			System.out.println("Draws: " + draws);
			System.out.println("Losses: " + losses);
			System.out.println("Rounds left: " + roundCounter);
			System.out.println("");
		}

		return;

	}
/**
 * 
 * Samanlainen kuin easy mutta nyt tietokoneella kaksi randomoitua noppaulukua sekä dicescore-laskurin käyttö tietokoneelle pelaajan sijasta
 */
	public static void hard(int roundCount, int player, int computer, int wins, int draws, int losses) {

		int roundCounter = roundCount;

		for (int i = 0; roundCount > i; i++) {
			System.out.println("you");

			player = random();
			computer = random();
			int dicescore = computer;

			switch (player) {
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six();
				break;
			}

			System.out.println("\n");
			System.out.println("computer");

			switch (computer) {
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six();
				break;
			}

			computer = random();
			dicescore += computer;

			switch (computer) {
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six();
				break;
			}

			if (player > dicescore) {
				System.out.println("\nYou won, I bet it feels better than winning the lottery (: ");
				System.out.println("");
				wins += 1;

			}
			if (dicescore > player) {
				System.out.println("\nYou lost :(, try harder please. ");
				System.out.println("");
				losses += 1;

			}
			if (dicescore == player) {
				System.out.println("\nDraw! What a joke. ");
				System.out.println("");
				draws += 1;

			}
			roundCounter = roundCounter - 1;
			System.out.println("Wins: " + wins);
			System.out.println("Draws: " + draws);
			System.out.println("Losses: " + losses);
			System.out.println("Rounds left: " + roundCounter);
			System.out.println("");
		}

		return;

	}

	/**
	 * tekstipohjaiset noppaluvut erillisinä metodeina
	 */
	public static void six() {
		System.out.print("---------\n| *   * |\n| *   * |\n| *   * |\n---------\n");
	}

	public static void five() {
		System.out.print("---------\n| *   * |\n|   *   |\n| *   * |\n---------\n");
	}

	public static void four() {
		System.out.print("---------\n| *   * |\n|       |\n| *   * |\n---------\n");
	}

	public static void three() {
		System.out.print("---------\n|     * |\n|   *   |\n| *     |\n---------\n");
	}

	public static void two() {
		System.out.print("---------\n|     * |\n|       |\n| *     |\n---------\n");
	}

	public static void one() {
		System.out.print("---------\n|       |\n|   *   |\n|       |\n---------\n");
	}

	/**
	 * 
	 * main metodi jossa hyödynnetty runsaasti valmistettuja metodeja, if-lausekkeilla saadaan varmistutta ohjelman toiminnan jatkuvuus poikkeukset huomioiden
	 * lopun main(null) saa aikaan main metodin käynnistymisen alusta jos siihen asti päädytään.
	 */
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);

		int player = random();
		int computer = random();

		System.out.println("WELCOME TO SUMMER DESTROYER 1.0");
		options();

		int difficulty = lukija.nextInt();

		if (difficulty > 0 && difficulty < 4) {
			selectionMessage(difficulty);
			System.out.println("");
			System.out.println("How many rounds?");

		} else {
			selectionMessage(difficulty);
			options();
			difficulty = lukija.nextInt();
			selectionMessage(difficulty);
			System.out.println("");
			System.out.println("How many rounds?");
		}

		int roundcount = lukija.nextInt();
		int wins = 0;
		int draws = 0;
		int losses = 0;

		if (difficulty == 1) {
			easy(roundcount, player, computer, wins, draws, losses);
		} else if (difficulty == 2) {
			normal(roundcount, player, computer, wins, draws, losses);
		} else if (difficulty == 3) {
			hard(roundcount, player, computer, wins, draws, losses);
		}

		System.out.println("You finished the game, you are such a warrior :D");

		System.out.println("Want to play again??? y/n");
		String selection = lukija.next();

		if (selection.equalsIgnoreCase("Y")) {
			main(null);
		}
	}
}
