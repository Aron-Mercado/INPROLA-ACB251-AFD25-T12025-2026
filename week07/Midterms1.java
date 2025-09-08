import java.util.Scanner;

public class Midterms1 {
  public static void main(String[] args) {

    Scanner text = new Scanner(System.in);
    System.out.println("Enter desired word: ");
    String word = text.nextLine(); 
    String reverseStr = "";
    
    int wordLength = word.length();
    int i = wordLength -1;	


    while (i >= 0) {
	reverseStr = reverseStr + word.charAt(i);
	--i;
}


    if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(word + " is a Palindrome.");
    }
    else {
      System.out.println(word + " is not a Palindrome.");
    }
    

  }
}