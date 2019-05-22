package dicegame;
import java.util.Random;
import java.util.Scanner;


public class Dicegame {
	
	public static void six(){
		   System.out.print("---------\n| *   * |\n| *   * |\n| *   * |\n---------");
		}

		public static void five(){
		   System.out.print("---------\n| *   * |\n|   *   |\n| *   * |\n---------");
		}

		public static void four(){
		   System.out.print("---------\n| *   * |\n|       |\n| *   * |\n---------");
		}

		public static void three(){
		   System.out.print("---------\n|     * |\n|   *   |\n| *     |\n---------");
		}

		public static void two(){
		   System.out.print("---------\n|     * |\n|       |\n| *     |\n---------");
		}

		public static void one(){
		   System.out.print("---------\n|       |\n|   *   |\n|       |\n---------");
		}

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		int player = random();
		int computer = random();
		
		System.out.println("Choose difficulty: ");
		System.out.println("1. Easy");
		System.out.println("2. Normal");
		System.out.println("3. Hard");
		System.out.println("");
		
		int vaikeustaso = lukija.nextInt();
		
		pelinaloitus(vaikeustaso);
		
		System.out.println("");
		System.out.println("How many rounds?");
		
		int kierrosmaara = lukija.nextInt();
		int wins = 0;
		int draws = 0;
		int losses = 0;
		
		if(vaikeustaso == 1) {
			easy(kierrosmaara, player, computer, wins, draws, losses);
		} 
		
		
		
	
		}
	private static int random() {
		 Random r = new Random();
		 int a = r.nextInt(6)+1;
		 return a;
	}
	
	
	private static void pelinaloitus(int vaikeustaso) {
		

		switch(vaikeustaso) {
		case 1:
			System.out.println("You choosed 1. Easy");
			break;
		case 2:
			System.out.println("You choosed 2. Normal");
			break;
		case 3:
			System.out.println("You choosed 3. Hard");
			break;
		}
			
	}
	
	private static void easy (int kierrosmaara, int player, int computer, int wins, int draws, int losses) {
		
		int kierroslaskuri = kierrosmaara;
		
		for(int i = 0; kierrosmaara > i; i++ ) {
		System.out.println("you");
        
		for(int index = 0; 2 >= 0; index++)
		player = random();
        computer = random();
        
		switch(player){
           case 1: one();   break;
           case 2: two();   break;
           case 3: three(); break;
           case 4: four();  break;
           case 5: five();  break;
           case 6: six();   break;
        }
        System.out.println("\n");
        System.out.println("computer");
		}
       
        
        switch(computer){
           case 1: one();   break;
           case 2: two();   break;
           case 3: three(); break;
           case 4: four();  break;
           case 5: five();  break;
           case 6: six();   break;
        }
        
        if(player>computer){
            System.out.println("\nYou won, I bet it feels better than winning the lottery (: ");
            System.out.println("");
            wins += 1;
           
        }
        if(computer>player){
            System.out.println("\nYou lost :(, try harder please. ");
            System.out.println("");
            losses += 1;
            
        }
        if(player==computer){
           System.out.println("\nDraw! What a joke. ");
           System.out.println("");
           draws += 1;
          
	}
        kierroslaskuri = kierroslaskuri - 1;
        System.out.println("Wins: " +wins);
        System.out.println("Draws: " +draws);
        System.out.println("Losses: "+losses);
        System.out.println("Rounds left: " + kierroslaskuri);
        System.out.println("");
}
	
	
	return;
		
}
	
	
}
