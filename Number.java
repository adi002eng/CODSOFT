import java.util.Random;
import java.util.Scanner;

// number game random;

     class Number  {

    public int number;
    public int inputNumber;
    public int  noOfGuesses = 0;
    
    
     public int getnoOfGuesses(){
        return noOfGuesses ;
    }

        public void setnoOfGuesses(int noOfGuesses){
            this.noOfGuesses = noOfGuesses;
        }

        Number(){
        Random rand = new Random();
        this.number = rand.nextInt( 100);
        
    }

        void takeUserInput(){
        System.out.println("Guess the number:");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
           
    }
        boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber== number){
            System.out.format("Yes guessed right, it was %d you guessed it in %d attempts",number, noOfGuesses);
            return true ;
            
        } else if(inputNumber<number){
            System.out.println("Too small:");
        } else if(inputNumber>number){
            System.out.println("Too large:");
        }
        return false;
    }

     

    public static void main(String[] args) {

        Number g = new Number();
        boolean b =false;
        while(!b){

        g.takeUserInput();
        b = g.isCorrectNumber();
       
        }
    }

}