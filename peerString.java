import java.util.*;
public class peerString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s1=scan.next();
        String s2=scan.next();
        int size1=subsSize(s1);
        int size2=subsSize(s2);
        if(size1==size2)
        {
            System.out.println("Companion");
        }
        else
        {
            System.out.println("Non Companion");
        }

    }
    public static int subsSize(String s)
    {
        Set<String> set=new HashSet<String>();
        for(int i=0;i<=s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                set.add(s.substring(i,j ));
            }
        }
        return set.size();
    }
}
