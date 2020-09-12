import java.util.*;
public class Brac_Balance
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        String brac = scan.next();
        Stack<Character> lis = new Stack<Character>();
        for(int i=0;i<brac.length();i++)
        {
            if(brac.charAt(i)=='(' || brac.charAt(i)=='{' || brac.charAt(i)=='[')
            {
                lis.push(brac.charAt(i));
            }
            else if(brac.charAt(i)==')' && lis.peek()=='(')
            {
                lis.pop();
            }
            else if(brac.charAt(i)=='}' && lis.peek()=='{')
            {
                lis.pop();
            }
            else if(brac.charAt(i)==']' && lis.peek()=='[')
            {
                lis.pop();
            }
            else
            {
                break;
            }
        }
        if(lis.isEmpty())
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}
