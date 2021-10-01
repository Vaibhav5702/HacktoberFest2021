import java.util.*;
public class substring {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s=scan.next();
        Set<String> set=new HashSet();
        int a[]=new int[s.length()];
        for(int i=0;i<=s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                set.add(s.substring(i,j ));
            }
        }
        for(String sub:set)
        {
            a[sub.length()-1]=a[sub.length()-1]+1;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
