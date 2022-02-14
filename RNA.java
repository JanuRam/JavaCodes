import java.util.*;
public class RNA {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String strand = sc.nextLine();
      String newstr = "";
      for(int i=0; i<strand.length(); i++)
      {
           if (strand.charAt(i)=='G')
           {
              newstr = newstr + 'C';
           }
           if (strand.charAt(i)=='C')
           {
              newstr = newstr + 'G';
           }
           if (strand.charAt(i)=='T')
           {
              newstr = newstr + 'A';
           }
           if (strand.charAt(i)=='A')
           {
              newstr = newstr + 'U';
           }
  
      }
    System.out.print(newstr);
    }
}