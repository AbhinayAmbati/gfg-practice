import java.util.*;

class ReverseWords {
    public ArrayList<String> split(String s) {
        String temp = "";
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '.') {
                if(!temp.equals(""))
                    ans.add(temp);
                temp = "";
            } else temp += s.charAt(i);
        }
        ans.add(temp);
        return ans;
    }
    public String reverseWords(String s) {
        // Code here
        ArrayList<String> words = split(s);
        StringBuilder sb = new StringBuilder();
        for(int i=words.size()-1; i >= 0;i--){
            sb.append(words.get(i));
            // if(i != 0){}
            if(!words.get(i).equals("") && i != 0){
                sb.append('.');
            }
        }
        return sb.toString();
    }
}
