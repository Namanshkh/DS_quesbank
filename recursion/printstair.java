import java.io.*;
import java.util.*;

public class Main {

public static void main(String[] args) throws Exception
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
printStairPaths(n,"");
}

public static void printStairPaths(int n, String path)
{
if(n < 0)
{
return;
}
if(n == 0)
{
System.out.println(path);
return;
}

int x1 = n-1;
int x2 = n-2;
int x3 = n-3;

printStairPaths(x1,path+"1");
printStairPaths(x2,path+"2");
printStairPaths(x3,path+"3");
}

}
