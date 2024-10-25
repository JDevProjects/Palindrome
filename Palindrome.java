import java.util.Scanner;

public class Palindrome{

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your word: ");

        String str=sc.next();
        String org_str=str;

        String rev="";

        int len=str.length();

        for(int i=len-1; i>=0; i--)
        {
            rev=rev+str.charAt(i);
        }

        if(org_str.equals(rev))
        {
            System.out.println(org_str+" is a palindrome word");
        }
        else
        {
            System.out.println(org_str+ "is not a palindrome word");
        }
    }
}