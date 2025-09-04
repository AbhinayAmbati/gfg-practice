class ReverseAString {
    static String revStr(String s) {
        // code here
        int len = s.length();
        StringBuilder st = new StringBuilder();
        for(int i=len-1; i >= 0;i--){
            st.append(s.charAt(i));
        }
        
        return st.toString();
    }
}