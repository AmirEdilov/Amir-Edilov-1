import java.util.Scanner;

public class Menu extends Definition, Questionary, Prophylaxy, Advice, Consultation {

	public static void Choose( int n) {		   
		String [] s1, s2, s3, s4, s5;
		    switch (n) {
			case 1: System.out.println(s1);
			case 2: System.out.println(s2);
			case 3: System.out.println(s3);
			case 4: System.out.println(s4);
			case 5: System.out.println(s5);
		    }
	}


    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
			String [] s1, s2, s3, s4, s5;
			int n1, n2, n3, n4, n5;
			//String [] s1, String [] s2, String s3, String s4
			int n = in.nextInt();
            Choose(n);
			
	}
}


