public class StringIsPalindrome{
    boolean isPalindrome(String s) {
        // code here
        int len = s.length();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<len;i++){
            sb.append(s.charAt(i));
        }
        
        sb.reverse();
        
        String s2 = sb.toString();
        
        if(s.equals(s2)){
            return true;
        }
        return false;
    }
}