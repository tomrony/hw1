import java.util.*;

public class Encoding {
    public static Set<String> morseCodes(int m, int n) {
        Set<String> result = new TreeSet<>();
        if (m == 0 && n == 0) {
            result.add("");
        } else if(m==0) {
            String out = "";
            for(int i = 0; i < n; i++)
            {
                out+="-";
            }
            result.add(out);
        } else if(n==0) {
           String out = "";
            for(int i = 0; i < m; i++)
            {
                out+=".";
            }
            result.add(out);
        } else {
            Set<String> subresult1 = morseCodes(m - 1, n);
            Set<String> subresult2 = morseCodes(m, n - 1);
            
            for (String str : subresult1) {
                result.add(str + ".");
            }
            for (String str : subresult2) {
                result.add(str + "-");
            }
        
        }
        return result;
    }
}