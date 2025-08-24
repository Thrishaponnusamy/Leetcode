class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> ch= new Stack<>();
        for(char m:s.toCharArray()){
      if(!ch.empty() && ch.peek()==m){
        ch.pop();
      }
      else{
        ch.push(m);
      }
        }
        StringBuilder sb=new StringBuilder();
        for( char a:ch){
            sb.append(a);
        }
        return sb.toString();
    }
}