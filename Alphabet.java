import java.util.*;
public class Alphabet
{
    public static void main(String args[])
    {
        char i=0;
        Scanner io=new Scanner(System.in);
        char ch=io.next().charAt(0);
        if((ch>'a'&&ch<'z')||ch>'A'&&ch<'Z')
        {
            System.out.println("Yes");
        }
        else
        {
        System.out.println("No");
        }
        
    }
}
