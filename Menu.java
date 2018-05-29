import java.util.Scanner;

public class Menu {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int Choice;
		boolean contin=true;
		while (contin){
			System.out.println("Enter 1 to add a post \n Enter 2 to Display Posts \n Enter 3 to Create/Add to a Quiz \n Enter 4 to play Quiz");
			Choice=Integer.parseInt(input.nextLine());
			switch (Choice){
			case 1:
				break;
			case 2:
				break;
			case 3:
				
				break;
			case 4:
				break;
			default:
				break;
			}
		}
		
	}

}
