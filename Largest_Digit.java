import java.util.*;
public class c{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        char max='0';
        for (int i=0;i<s.length();i++)
        {
            
            char d = s.charAt(i);
            if(d>max)
            {
                max=d;
            }
        }
        System.out.print(max);
    }
}