import java.util.Scanner;

/**
 * Created by Hitarth on 26-09-2014.
 */
public class Test {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String str = sc.nextLine();
        String duplicateCharRemoved = StringUtils.removeDuplicateChar(str);
        System.out.println("The string "+"\""+str+"\" after removing duplicate characters is "+"\""+duplicateCharRemoved+"\"");
        String consecutiveDuplicateCharRemoved = StringUtils.removeDuplicateConsecutiveChar(str);
        System.out.println("The string "+"\""+str+"\" after removing consecutive duplicate characters is "+"\""+consecutiveDuplicateCharRemoved+"\"");
    }
}
