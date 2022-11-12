import java.util.Scanner;

public class Test2292{

	public static void main(String[] args) {
		int roomaddress =1; 
		int count =1;  
		
        int number= 0;  
		Scanner sc = new Scanner(System.in);
		roomaddress=sc.nextInt();
		
		
		for ( int i=0; i<100000000; i++) {
			number+=i*6;
			if((number)<roomaddress) {
				count++;
			}else {
				break;
			}
	}
		System.out.println(count);
}
}
