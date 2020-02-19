package string;

import java.util.Scanner;

public class KeyPadValue {


    public static void main(String[] args) {
        String val[]={"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char a[]=str.toCharArray();
        int count=0,i;
        for(i=0;i<str.length()-1;i++)
        { 
          if(a[i]=='_')
          {
              continue;
          }
          else if(a[i]=='0')
          {
              System.out.print(" ");
          }
          else if(a[i]==a[i+1])
          {
             count++; 
              //System.out.println(count);
          }
          else
          {
              System.out.print(val[Integer.parseInt(""+a[i])].charAt(count));
              count=0;
          }
        }
        System.out.print(val[Integer.parseInt(""+a[i])].charAt(count));
        
    }
}