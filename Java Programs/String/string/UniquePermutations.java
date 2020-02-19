package string;

import java.util.Scanner;

public class UniquePermutations {

   static String sz="";
    public static String swap(String str,int l,int r)
    {
        char a[]=str.toCharArray();
        char x=a[r];
        a[r]=a[l];
        a[l]=x;
        return String.valueOf(a);
    }
    public static void permute(String str,int l,int r)
    {
        if(l>=r)
        {
                        
            if(!sz.contains(str))
            {
              sz+=" "+str;  
            }
        }
            
        else
        {
            for(int i=l;i<=r;i++)
            {
                str=swap(str,l,i);
                permute(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        permute(str,0,str.length()-1);
        String sx[]=sz.split(" ");
       for(String sd:sx)
            System.out.println(sd);
        
    }
}