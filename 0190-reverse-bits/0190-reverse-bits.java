class Solution {
    public int reverseBits(int n) {
        // String m=Integer.toBinaryString(n);
        // StringBuilder mk= new StringBuilder();
        // char ch[]=m.toCharArray();
        // for(int i=ch.length-1;i>=0;i--){
        //     mk.append(ch[i]);
             
        // }
        // String y= mk.toString();
        // int mm=Integer.parseInt(y,2);
        // return mm;
        
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;         
            result |= (n & 1);    
            n >>= 1;             
        }
        return result;
    

    }
}