import java.util.Scanner;


public class CardGame {
	public static void main(String[] args){
		
		final String ANSI_CLS = "\u001b[2J";
		final String ANSI_HOME = "\u001b[H";
		System.out.print(ANSI_CLS + ANSI_HOME);
		System.out.flush();
		String trash = "";
				
		Scanner sc = new Scanner(System.in);
		int suite = 0;
		int cardNumber = 0;
		String answer = "yes";
		String suiteS = " ";
		String cardNumberS = " ";
		String cardS = " ";
		int count = 0;
		int countS = 0;
		int card1 = 0;
		int card2 = 0;
		int card3 = 0;
		int card4 = 0;
		int card5 = 0;
		int cardCurrent = 500;
		boolean flag = true;
		
		
		System.out.println("Welcome to the poker hand generator! Enter anything to continue.");
				trash = sc.nextLine();
				
		
		while(answer.contains("yes") || answer.contains("Yes")){
			System.out.print(ANSI_CLS + ANSI_HOME);
			System.out.flush();
			
			count = 5;
			System.out.println("Your hand is:");
			card1 = 0;
			card2 = 0;
			card3 = 0;
			card4 = 0;
			card5 = 0;
			cardCurrent = 500;
			
			while(count != 0){
								
				suite = (int)(Math.random() * 4 + 1);
				cardNumber = (int)(Math.random()* 13 + 1);
				switch(suite){
				case 1: suiteS = " of Hearts";
					break;
				case 2: suiteS = " of Diamonds";
					break;
				case 3: suiteS = " of Spades";
					break;
				case 4: suiteS = " of Clubs";
					break;
				}
				if(cardNumber > 10){
					switch(cardNumber){
					case 11: cardNumberS = "Jack";
						break;
					case 12: cardNumberS = "Queen";
						break;
					case 13: cardNumberS = "King";
						break;
					}
				}
				else {
						if(cardNumber == 1){
							cardNumberS = "Ace";
						}
				
						else {
							cardNumberS = cardNumber + "";
						}
				}
					
					
				cardCurrent = (int)(suite * 100 + cardNumber);
				flag = true;
				if(cardCurrent == card1){
					flag = false;
				}
				if(cardCurrent == card2){
					flag = false;
				}
				if(cardCurrent == card3){
					flag = false;
				}
				if(cardCurrent == card4){
					flag = false;
				}
				if(cardCurrent == card5){
					flag = false;
				}
				
				if(flag) {
					switch(count){
						case 5: card5 = (int)(suite * 100 + cardNumber);
							break;
						case 4: card4 = (int)(suite * 100 + cardNumber);
							break;
						case 3: card3 = (int)(suite * 100 + cardNumber);
							break;
						case 2: card2 = (int)(suite * 100 + cardNumber);
							break;
						case 1: card1 = (int)(suite * 100 + cardNumber);
							break;
					}
					
					System.out.println(cardNumberS + suiteS);
					count--;
					}
					flag = true;
				}
				
				System.out.println("");
				System.out.println("Do you want another hand?(yes / no)");
				answer = sc.nextLine();
						
			}
					
					
	}
}

				

