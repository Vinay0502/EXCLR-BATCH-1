class Solution {
    public int myAtoi(String s) {
      
        s = s.trim();
        
        if (s.isEmpty()) {
            return 0;
        }
        
        int sign = 1; 
        int i = 0;
        long result = 0; 
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
     
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            i++;
            
     
            if (result > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        

        return (int) (sign * result);
    }
}

public class LTCode003 {
    public static void main(String[] args) {
        Solution s = new Solution();
        
        // Test cases
        System.out.println(s.myAtoi("42"));
        System.out.println(s.myAtoi(" -042"));
        System.out.println(s.myAtoi("1337c0d3")); 
        System.out.println(s.myAtoi("0-1")); 
        System.out.println(s.myAtoi("words and 987")); 
        System.out.println(s.myAtoi("21474836460"));
        System.out.println(s.myAtoi("-2147483649"));
    }
}