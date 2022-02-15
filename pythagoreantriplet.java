import java.util.*;

public class pythagoreantriplet
{
  public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int maxValue=sc.nextInt();
   ArrayList<Integer> results=new ArrayList<Integer>();
   int i=0;
   for (int c = 1; c <= maxValue; c++) 
    {
         for (int b = 1; b <= c; b++)
          {
             for(int a = 1;a <= b;a++)
               {
                System.out.print(a+" "+b+" "+c+" "+"\n");
                if (a*a + b*b == c*c) 
                {
                  results.add(a);
                  results.add(b);
                  results.add(c);
                }
               }
          }
     }
   System.out.print(results);
       
}
}