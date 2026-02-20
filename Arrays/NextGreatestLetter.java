class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int c=(int)target;
        for(int i=0;i<letters.length;i++){

            if((int)letters[i]>c){
                return (char)letters[i];

            }
        }
         return letters[0];
    }
}
