import java.io.*;
import java.util.*;

public class Main {

public static void main(String[] args) throws Exception
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
ArrayList list = getMazePaths(1,1,n,m);
System.out.println(list);
}
public static ArrayList getMazePaths(int sr, int sc, int dr, int dc)
{
if(sr > dr || sc > dc)
{
ArrayList bres = new ArrayList<>();
return bres;
}
if(sr == dr && sc == dc)
{
ArrayList base = new ArrayList<>();
base.add("");
return base;
}
ArrayList mstr = new ArrayList<>();
for(int ms = 1 ; ms <= dc-sc ; ms ++)
{
ArrayList strh = getMazePaths(sr,sc+ms,dr,dc);
for(String rres : strh)
{
mstr.add("h"+ms+rres);
}
}
for(int ms = 1 ; ms <= dr-sr ; ms ++)
{
ArrayList strv = getMazePaths(sr+ms,sc,dr,dc);
for(String rres : strv)
{
mstr.add("v"+ms+rres);
}
}
for(int ms = 1 ; ms <= dc-sc&& ms<= dr-sr ; ms ++)
{
ArrayList strd = getMazePaths(sr+ms,sc+ms,dr,dc);
for(String rres : strd)
{
mstr.add("d"+ms+rres);
}
}
return mstr;
}
}

