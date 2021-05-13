import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class mavenPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        if(StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is not a string...");
        }else{
            System.out.println(userInput + " is a String");
        }
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }
}
