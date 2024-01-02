public class Quiz{
  private String question;
  private String answer;
  
  public Quiz(String question, String answer){
    this.question = question;
    this.answer = answer;
  }
  
  public String toString(){
    return question;
  }
  
  public void giveHint(){
    System.out.println("The first character of the word is " + answer.substring(0, 1));
}
}
