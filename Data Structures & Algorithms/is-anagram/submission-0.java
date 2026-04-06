class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character, Integer> strMap1 = new HashMap<Character, Integer>();

        for(char c : s.toCharArray()){
            if(strMap1.containsKey(c)){
                    int curr = strMap1.get(c);
                    strMap1.put(c, 1+curr);
            }else strMap1.put(c, 1);
        } 
            

        for(char c : t.toCharArray()){
                if(strMap1.containsKey(c)){
                    int curr = strMap1.get(c);
                    strMap1.put(c, curr-1);
                }else strMap1.put(c, 1);
        }

        boolean allZero = true;
        for (int v : strMap1.values()) {
            if (v != 0) { 
                allZero = false; 
                break; 
            }
        }
            
        return allZero;

    }
}
