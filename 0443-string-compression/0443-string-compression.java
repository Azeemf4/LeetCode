class Solution {
    public int compress(char[] chars) {
        int readIndex=0;
        int writeIndex=0;
        while(readIndex<chars.length){
            int c=0;
            char currentchar=chars[readIndex];
            while(readIndex<chars.length && currentchar == chars[readIndex]){
                readIndex++;
                c++;
            }
            chars[writeIndex]=currentchar;
            writeIndex++;
            if(c>1){
                String s=""+c;
                for(int i=0;i<s.length();i++){
                    chars[writeIndex++]=s.charAt(i);
                                    }
            }

        }
     return writeIndex;   
    }
}