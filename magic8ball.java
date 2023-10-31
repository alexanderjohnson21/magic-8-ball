package Notes;
import java.util.Scanner;

public class magic8ball {
    public static void main(String[] args){
            
            Scanner userInput = new Scanner(System.in);
           System.out.print("What is your favorite holiday?: ");
           userInput.nextLine();
           
           
           
           int input = (int)(Math.random()*6);
                
            
            
            if(input == 0){
                    System.out.println("I strongly disagree with you");
                }
                else if(input == 1){
                    System.out.println("I strongly disagree with you");
                }
                else if (input == 2){
                    System.out.println("I disagree with you");
                }
                else if (input == 3){
                    System.out.println("I'm okay with the choice");
                }
                else if (input == 4){
                    System.out.println("I agree with you");
                }
                else{
                    System.out.println("I strongly agree with you");
                }
                userInput.close();
            }

         

    }
