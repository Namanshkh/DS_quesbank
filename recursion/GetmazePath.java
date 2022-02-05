import java.io.*;
import java.util.*;

public class Main {

public static void main(String[] args) throws Exception
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
ArrayList List = getMazePaths(1,1,n,m);
System.out.println(List);
}

public static ArrayList getMazePaths(int sr, int sc, int dr, int dc)
{
if(sc == dc && sr == dr)
{
ArrayList bres = new ArrayList<>();
bres.add("");
return bres;
}
ArrayList fstrh = new ArrayList<>();
ArrayList fstrv = new ArrayList<>();
if(sc < dc)
{
fstrh = getMazePaths(sr,sc+1,dr,dc);
}
if(sr < dr)
{
fstrv = getMazePaths(sr+1,sc,dr,dc);
}

ArrayList mstr = new ArrayList<>();
for(String rstr: fstrh)
{
mstr.add("h"+rstr);
}
for(String rstr: fstrv)
{
mstr.add("v"+rstr);
}

return mstr;
}

}
