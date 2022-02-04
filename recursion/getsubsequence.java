import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception 
    {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       ArrayList<String> List = gss(str);
       System.out.println(List);
    }

    public static ArrayList<String> gss(String str) 
    {
        if(str.length()==0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String rests = str.substring(1);
        ArrayList<String> faiths = gss(rests);
        ArrayList<String> mains = new ArrayList<>();
        for(String mstr: faiths)
        {
            mains.add(""+mstr);
        }
        for(String mstr: faiths)
        {
            mains.add(ch+mstr);
        }
        
        return mains;
    }

}
