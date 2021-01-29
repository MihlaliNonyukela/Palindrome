import java.util.Scanner;

public class Palindrome
{
    public static void main(String args[])
    {
        //checking whether the string is a palidrome or not 
        String a, b = "";

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string :");
        a = s.nextLine();
        int n = a.length();

        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");//To see whether its the string today 
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}