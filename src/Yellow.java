import java.util.Scanner;

public class Yellow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner (System.in);
		
		System.out.println("Please enter a number");
		int boy = Scan.nextInt();
		for (int i = 1; i <= 10; i++){
			System.out.println(boy*i);
		}
		
	}

}
