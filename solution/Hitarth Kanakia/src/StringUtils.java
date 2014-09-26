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
}
