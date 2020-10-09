import java.util.*;
public class LengthofString
{
    public static void main(String args[])
    {
        Scanner sentence = new Scanner(System.in);
        System.out.print("Enter any sentence : ");
        String s=sentence.nextLine();
        int len=s.length();
        String x="";
	String maxword="";
	String minword="";
        char ch;
        int p,maxlength=0,minlength=len;
        StringTokenizer str = new StringTokenizer(s,";?'. :,");
        int c=str.countTokens();
        for(int i=0;i<c;i++)
        {
            x=str.nextToken();
            p=x.length();
                if(p<minlength)
                {
                    minlength=p;
                    minword=x;
                }
                if(p>maxlength)
                {
                    maxlength=p;
                    maxword=x;
                }
        }
        System.out.println("Shortest word = "+minword+"\nLength = "+minlength);
        System.out.println("Longest word = "+maxword+"\nLength = "+maxlength);
    }
}
