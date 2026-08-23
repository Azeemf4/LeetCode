class Solution {
    public String capitalizeTitle(String title) {
        String[] s=title.split(" ");
        String res="";
        for(int i=0;i<s.length;i++){
            String word=s[i].toLowerCase();

        if(word.length()>=3){
            word=Character.toUpperCase(word.charAt(0))+word.substring(1);
        }
        res=res+word+" ";
        }
        return res.trim();
    }
}