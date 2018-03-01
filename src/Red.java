import java.util.Scanner;
public class Red {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
System.out.println("Please enter a number");
String yellow = scan.nextLine();
System.out.println(EvenOdd(yellow));

	}
public static boolean EvenOdd(String Mold ){
int length = Mold.length();
if(length%2==0){
	return true;
}else{
	return false;
}
}
	

}
