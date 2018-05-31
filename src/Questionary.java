import java.util.Scanner;
public class Questionary {	
	public static Scanner in = new Scanner(System.in);
	public void Name_Surname(String q1) {
	System.out.println("Здравствуйте, а как Вас зовут?");
	q1 = in.nextLine();
	}
    public static void main(String[] args) {
	String q1;
	Name_Surname(q1);
	}

}
}
