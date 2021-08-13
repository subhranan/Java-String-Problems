//WAP to count occurences of a certain character in a given string

import java.util.*;
class first
{
    static int count(String str, char ch)
    {
        int count=0;
        str=str.toLowerCase() ;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String :");
        String s=sc.nextLine();
        System.out.println("Enter a character :");
        char c=sc.next().charAt(0);
        int result=count(s,c);
        System.out.println("The no. of occurences are :"+result);
    }
}