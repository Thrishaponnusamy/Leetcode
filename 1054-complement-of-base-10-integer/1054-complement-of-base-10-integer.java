class Solution {
    public int bitwiseComplement(int n) {
        String m=Integer.toBinaryString(n);
        char ch[]=m.toCharArray();
        StringBuilder mm=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){
                mm.append("1");

            }
            else{
                mm.append("0");
            }
        }
        String my=mm.toString();
        int mk=Integer.parseInt(my,2);
        return mk;

    }
}