import java.util.Scanner ; 
public class Loop {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n<100) {
			System.out.println("Enter a number");
			int z = sc.nextInt();
			n = n + z;
			System.out.println("Now your number is:" + n);
		}
	}
}

