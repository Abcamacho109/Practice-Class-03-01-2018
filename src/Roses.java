import java.util.Scanner;

public class Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
System.out.println("Please Enter A Number");
int color  = scan.nextInt();

 

if(color%2==0){
	if(color%3==0){
		System.out.println("True");
	}
}else{
	System.out.println("false");
}

	}

}
