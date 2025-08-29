class Solution {
    public String reverseVowels(String s) {
        char[]ch=s.toCharArray();
        int st=0;
        int en=ch.length-1;
        while(st<en){
            while( st<en && !(ch[st]=='A'||ch[st]=='E'||ch[st]=='I'||ch[st]=='O'||ch[st]=='U'||ch[st]=='a'||ch[st]=='e'||ch[st]=='i'||ch[st]=='o'||ch[st]=='u')){
              st++;}
              while( st<en && !(ch[en]=='A'||ch[en]=='E'||ch[en]=='I'||ch[en]=='O'||ch[en]=='U'||ch[en]=='a'||ch[en]=='e'||ch[en]=='i'||ch[en]=='o'||ch[en]=='u')){
              en--;}

                char temp = ch[st];
                ch[st] = ch[en];
                ch[en] = temp;
                st++;
                en--;
                
                
            
        }
        return new String(ch);
    }
}