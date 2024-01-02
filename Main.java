import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Quiz quiz1 = new Quiz("Name the state next to New York.", "Pennsylvania");
    
    int score = 0;
    int finishedquestions = 0;
    System.out.println("Welcome to the geography quiz. You have to answer 10 questions. You must get atleast 6 correct to pass.")");
      while (finishedquestions < 10){
      System.out.println(quiz1 + "Type 1 if you need a hint");
      
    
    
    
  

    quiz1.giveHint();
  }
  }
      
