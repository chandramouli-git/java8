package mouli;

import java.util.ArrayList;
import java.util.Scanner;
public class App3
{
public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   ArrayList<String> l=new ArrayList<String>();
   int n=s.nextInt();
   for(int i=0;i<n;i++)
   {
       String s1="";
       l.add(s1=s.next());
   }
   System.out.print(pal(l));
}
public static ArrayList<String> pal(ArrayList<String> l)
{
   ArrayList<String> l1=new ArrayList<String>();
    for(String  i : l)
   {
       String s2="";
       for(int j=i.length()-1;j>=0;j--)
       {
           s2=s2+i.charAt(j);
       }
       if(s2.equals(i))
       {
           l1.add(s2);
       }
   }
   return l1;
}