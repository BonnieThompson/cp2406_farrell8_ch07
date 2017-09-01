/**
 * Created by jc428225 on 1/09/17.
 */
public class CountMovieSpaces
{
    public static void main(String[] args)
    {
        String aString =
            "Here is a sentance.";
        int SpaceNum = 0;
        int Length = aString.length();
        for (int i = 0; i < Length; i++)
        {
           char ch = aString.charAt(i);
           if(ch == ' ')
             SpaceNum++;
        }
    System.out.println("Number of spaces:" + SpaceNum);
    }
}
