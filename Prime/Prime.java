import java.util.*; public class Prime {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int count = 0;
		boolean isPrime;
		System.out.println("Please enter the target number. ");
		num = input.nextInt();
		
		for(int i = 0; i <= num; i++){
			isPrime = true;
			for(int n = 2; n < i; n++){
				if(i%n == 0){
					isPrime = false;
				}
			}
			if(isPrime){
				System.out.println(i);
			
			
			}
			
			
		}
		
	}
}
