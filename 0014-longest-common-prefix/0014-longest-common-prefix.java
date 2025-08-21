class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs ==null || strs.length==0){
            return "";
        }
        String p=strs[0];
        for(String s:strs)
            while(s.indexOf(p)!=0)
                p = p.substring(0,p.length()-1);
                return p;
            
    
        
    }
}