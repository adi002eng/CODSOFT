import java.util.Scanner;


 public class  Word{

    public static void main(String[] args) {
    
        System.out.println("Type your paragraph");
        try (Scanner sc = new Scanner(System.in)) {
            String userInput = sc.nextLine();
            sc.close();

            userInput = userInput.trim();
            int count = 0;

            if (userInput.length() == 0) {
                count = 0;
            }
                else{
                    // count the first word

                    count ++;
                    for (int i = 0; i < userInput.length(); i++) {
                        
                        if (userInput.charAt(i) == ' '  && userInput.charAt(i+1) != ' ') {


                        count ++;

                        }


                    }
                }
                    System.out.println("Words count:" + count);
        }


    }


 }