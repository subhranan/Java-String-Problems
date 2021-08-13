//WAP to concatenate a given String with itself a given number of times.

import java.util.*;
class second
{
    static String perform(String str, int n)
    {
        int count=n-1+1;
        if(n!=0)
        {
            String demo=str;
             while(count>0)
            {
                str=str.concat(demo);
                count-=1;
            }
        return str;
        }
        else
        {
            return "error";
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String :");
        String s=sc.nextLine();
        System.out.println("Enter no. :");
        int no = sc.nextInt();
        String result=perform(s,no);
        System.out.println(result);
    }
}