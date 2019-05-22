package dicegame;
import java.util.Random;
import java.util.Scanner;


public class Dicegame {
	
	public static void six(){
		   System.out.print("---------\n| *   * |\n| *   * |\n| *   * |\n---------\n");
		}

		public static void five(){
		   System.out.print("---------\n| *   * |\n|   *   |\n| *   * |\n---------\n");
		}

		public static void four(){
		   System.out.print("---------\n| *   * |\n|       |\n| *   * |\n---------\n");
		}

		public static void three(){
		   System.out.print("---------\n|     * |\n|   *   |\n| *     |\n---------\n");
		}

		public static void two(){
		   System.out.print("---------\n|     * |\n|       |\n| *     |\n---------\n");
		}

		public static void one(){
		   System.out.print("---------\n|       |\n|   *   |\n|       |\n---------\n");
		}

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		int player = random();
		int computer = random();
		
		System.out.println("WELCOME TO SUMMER DESTROYER 1.0");
		options();
		
		int difficulty = lukija.nextInt();
		
		
		
		if(difficulty > 0 && difficulty < 4) {
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
		
		if(difficulty == 1) {
			easy(roundcount, player, computer, wins, draws, losses);
		} else if (difficulty == 2) {
			normal(roundcount, player, computer, wins, draws, losses);
		} else if (difficulty == 3) {
			hard(roundcount, player, computer, wins, draws, losses);
		}
		
		
		System.out.println("You finished the game, you are such a warrior :D");
		
		
		System.out.println("Want to play again??? y/n");
		String selection = lukija.next();
		
	
	   if(selection.equalsIgnoreCase("Y")){
	      main(null); 
	}
	}
	
	
	private static int random() {
		 Random r = new Random();
		 int a = r.nextInt(6)+1;
		 return a;
	}
	
	private static void options() {
		System.out.println("");
		System.out.println("Choose difficulty: ");
		System.out.println("1. Easy");
		System.out.println("2. Normal");
		System.out.println("3. Hard");
		System.out.println("");
	}
	
	private static void selectionMessage(int difficulty) {
		

		switch(difficulty) {
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
	
	private static void easy (int roundcount, int player, int computer, int wins, int draws, int losses) {
		
		int roundCounter = roundcount;
		
		for(int i = 0; roundcount > i; i++ ) {
		System.out.println("you");
        
        player = random();
        computer = random();
        int dicescore = player;
        
		switch(player){
           case 1: one();   break;
           case 2: two();   break;
           case 3: three(); break;
           case 4: four();  break;
           case 5: five();  break;
           case 6: six();   break;
        }
		
		player = random();
		dicescore += player;
		
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
        
       
        
        switch(computer){
           case 1: one();   break;
           case 2: two();   break;
           case 3: three(); break;
           case 4: four();  break;
           case 5: five();  break;
           case 6: six();   break;
        }
        
        if(dicescore>computer){
            System.out.println("\nYou won, I bet it feels better than winning the lottery (: ");
            System.out.println("");
            wins += 1;
           
        }
        if(computer>dicescore){
            System.out.println("\nYou lost :(, try harder please. ");
            System.out.println("");
            losses += 1;
            
        }
        if(dicescore==computer){
           System.out.println("\nDraw! What a joke. ");
           System.out.println("");
           draws += 1;
          
	}
        roundCounter = roundCounter - 1;
        System.out.println("Wins: " +wins);
        System.out.println("Draws: " +draws);
        System.out.println("Losses: "+losses);
        System.out.println("Rounds left: " + roundCounter);
        System.out.println("");
}
		
	return;
		
}
private static void normal (int roundcount, int player, int computer, int wins, int draws, int losses) {
		
		int roundCounter = roundcount;
		
		for(int i = 0; roundcount > i; i++ ) {
		System.out.println("you");
        
        player = random();
        computer = random();
        int dicescore = player;
        
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
        
       
        
        switch(computer){
           case 1: one();   break;
           case 2: two();   break;
           case 3: three(); break;
           case 4: four();  break;
           case 5: five();  break;
           case 6: six();   break;
        }
        
        if(dicescore>computer){
            System.out.println("\nYou won, I bet it feels better than winning the lottery (: ");
            System.out.println("");
            wins += 1;
           
        }
        if(computer>dicescore){
            System.out.println("\nYou lost :(, try harder please. ");
            System.out.println("");
            losses += 1;
            
        }
        if(dicescore==computer){
           System.out.println("\nDraw! What a joke. ");
           System.out.println("");
           draws += 1;
          
	}
        roundCounter = roundCounter - 1;
        System.out.println("Wins: " +wins);
        System.out.println("Draws: " +draws);
        System.out.println("Losses: "+losses);
        System.out.println("Rounds left: " + roundCounter);
        System.out.println("");
}
		
	return;
		
}

private static void hard (int roundCount, int player, int computer, int wins, int draws, int losses) {
	
	int roundCounter = roundCount;
	
	for(int i = 0; roundCount > i; i++ ) {
	System.out.println("you");
    
    player = random();
    computer = random();
    int dicescore = computer;
    
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
    
   
    
    switch(computer){
       case 1: one();   break;
       case 2: two();   break;
       case 3: three(); break;
       case 4: four();  break;
       case 5: five();  break;
       case 6: six();   break;
    }
    
    computer = random();
    dicescore += computer;
    
    switch(computer){
    case 1: one();   break;
    case 2: two();   break;
    case 3: three(); break;
    case 4: four();  break;
    case 5: five();  break;
    case 6: six();   break;
 }
    
    if(player>dicescore){
        System.out.println("\nYou won, I bet it feels better than winning the lottery (: ");
        System.out.println("");
        wins += 1;
       
    }
    if(dicescore>player){
        System.out.println("\nYou lost :(, try harder please. ");
        System.out.println("");
        losses += 1;
        
    }
    if(dicescore==player){
       System.out.println("\nDraw! What a joke. ");
       System.out.println("");
       draws += 1;
      
}
    roundCounter = roundCounter - 1;
    System.out.println("Wins: " +wins);
    System.out.println("Draws: " +draws);
    System.out.println("Losses: "+losses);
    System.out.println("Rounds left: " + roundCounter);
    System.out.println("");
}
	
return;
	
}
	
}
