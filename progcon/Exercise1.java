
import java.util.Scanner; 

public class Exercise1 {
    public static void main(String[] args) {

        //Create Scanner and Initialize
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range of arrays: ");
        int size = input.nextInt();

        //Declare and initialize user-input desired arrays
        int[] age = new int[size];
        
        System.out.println("Enter Age: ");
        for (int i = 0; i < size; i++) {
            age[i] = input.nextInt();
        }

        for (int i = 0; i < age.length; i++){
        System.out.println(age[i]);

                                                        }
    }
}

/*
class Main {
 public static void main(String[] args) {
  
   // create an array
   int[] age = {12, 4, 5};

   // loop through the array
   // using for loop
   System.out.println("Using for Loop:");
   for(int i = 0; i < age.length; i++) {
     System.out.println(age[i]);
   }
 }
}
*/

/*
class Main {
 public static void main(String[] args) {
  
   // create an array
   int[] age = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

   // loop through the array
   // using for loop

   System.out.println("Using for Loop:");
   for(int i = 0; i < age.length; i++) {
     System.out.print(age[i] + ", ");
   }

    System.out.println("");
   System.out.println("Reverse Even: ");
   for(int i = age.length-1; i >= 0 ; i--) {
       if (age[i] % 2 ==0){
     System.out.print(age[i] + ", ");
       }
   }
   
   System.out.println("");
  System.out.println("Reverse Odd: ");
        for(int i = age.length-1; i >= 0 ; i--) {
       if (age[i] % 2 != 0){
     System.out.print(age[i] + ", ");
       }
   }
   
 }
}

*/

