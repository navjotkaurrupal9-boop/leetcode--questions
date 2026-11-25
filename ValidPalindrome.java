class Solution {
    public boolean isPalindrome(String s) {
        String lS=s.toLowerCase();
        String newS="";
        for(char ch: lS.toCharArray()){
            if((ch>= 'a' && ch<='z') || (ch>='0' && ch<='9')){
                newS+=ch;
            }
        }

        int st=0;
        int end=newS.length()-1;

        while(st<end){
            if(newS.charAt(st) != newS.charAt(end)){
                return false;
            }
            st++;
            end--;
        }

        return true;
    }
}
