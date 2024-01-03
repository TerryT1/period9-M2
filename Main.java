import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Quiz quiz1 = new Quiz("Name the state next to New York.", "Pennsylvania");
    String answer1 = quiz1.giveAnswer();
    Scanner scanner = new Scanner(System.in);
    int score = 0;
    int finishedquestions = 0;
    System.out.println("Welcome to the geography quiz. You have to answer 10 questions. You must get atleast 6 correct to pass.");
    while (finishedquestions < 10){
      System.out.println(quiz1 + " Type h if you need a hint");
      String choice = scanner.nextLine();
      if (choice.equals("h")){
        quiz1.giveHint();
        System.out.println(quiz1);
      }
      else if (choice.equals(answer1)){
        System.out.println("You are correct");
      }
      System.out.println(quiz1.Wrong());
    }
  }
}
