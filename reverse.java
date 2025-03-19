class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int digit = x % 10; 
            x /= 10; 
            
            
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return 0; 
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < Integer.MIN_VALUE % 10)) {
                return 0; 
            }
            
            rev = rev * 10 + digit; 
        }
        
        return rev;
    }
    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            
            System.out.println(solution.reverse(123));         
            System.out.println(solution.reverse(-123));         
            System.out.println(solution.reverse(120));         
            System.out.println(solution.reverse(0));            
            System.out.println(solution.reverse(1534236469));   
        }
    }
    
}
