class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        int[] characterCount = new int[26];

        for(int i = 0; i < s.length(); i++){
            // to get the position 
            // it will return 2 the position of character b 
            //Character.toLowerCase(b) - 'a' + 1
            int sPosition = s.charAt(i) - 'a';
            characterCount[sPosition] = characterCount[sPosition] + 1;
            int tPosition = t.charAt(i) - 'a';
            characterCount[tPosition] = characterCount[tPosition] - 1;
        }

        for(int i = 0; i < characterCount.length; i++)
        {
            if(characterCount[i] > 0) return false;
        }
        return true;
    }
}
