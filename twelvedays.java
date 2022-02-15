import java.util.*;
public class twelvedays
{
   public static void main(String[] args)
   {
     String numlist[] = {"first",
     "second","third","fourth","fifth","sixth","seventh","eighth","ninth",
      "tenth","eleventh","twelfth"};

     String gifts[] = {"a Partridge in a Pear Tree","two Turtle Doves",
      "three French Hens","four Calling Birds","five Gold Rings","six Geese-a-Laying",
       "seven Swans-a-Swimming","eight Maids-a-Milking","nine Ladies Dancing",
       "ten Lords-a-Leaping","eleven Pipers Piping","twelve Drummers Drumming"};
      
      for(int i=0;i<12;i++)
      {
        System.out.print("On the" + " " + numlist[i] + "  day of Christmas my true love gave to me :" );
        for(int j=i;j>=0;j--)
        {
         System.out.print(gifts[j]+ " ");
        }
       System.out.print("\n");
     }
    }
}
     