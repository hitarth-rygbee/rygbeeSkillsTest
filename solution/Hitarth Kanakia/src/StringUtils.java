/**
 * Created by Hitarth on 26-09-2014.
 */
public class StringUtils {

    public static String removeDuplicateChar(String str)
    {
        String ans = "";
        int maxASCIIvalue = 125;
        boolean[] hasCome = new boolean[maxASCIIvalue];
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int ASCII = (int)c;
            if(!hasCome[ASCII])
                ans += c;
            hasCome[ASCII] = true;
        }
        return ans;
    }

    public static String removeDuplicateConsecutiveChar(String str){
        String ans = "";
        for(int i=0;i<str.length();){
            char c = str.charAt(i);
            ans += c;
            i++;
            while( i<str.length() && str.charAt(i)==c )
                i++;
        }
        return ans;
    }

}
