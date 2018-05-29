import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Quiz {
	public static class QuestionNode{
		String Question;//question being asked
		String Answer;//actual answer
		String [] possible= new String [3];//false answers for multiple choice
		boolean Correct;//if the user got the question right or wrong
		QuestionNode next;//the proceeding question
		public static String[] getQ(String Question, String Answer, String [] possible){
			String [] qArray={Question,Answer,possible[0],possible[2],possible[3]};
			return qArray;
		}
		public static void writeResults(boolean Correct,RandomAccessFile raf) throws IOException{
			raf.writeBoolean(Correct);
		}
		public static void addQuestion(QuestionNode Runner,Scanner input){
			if (Runner.next!=null){
				addQuestion(Runner.next,input);
			}
			else{
				System.out.println("Please Enter a Question");
				Runner.next.Question=input.nextLine();
				System.out.println("Please Answer the Ccorrect Answer");
				Runner.next.Answer=input.nextLine();
				for (int i=0;i<3;i++){
					System.out.println("Please Enter an incorrect Answer");
					Runner.next.possible[i]=input.nextLine();
				}
			}
		}
		
		
	}
}
