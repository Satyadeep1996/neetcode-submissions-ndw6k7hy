class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, ArrayList<String>> checkArray = new 
                                        HashMap<String, ArrayList<String>>();

        // approach 1
        // iterate through the strs array
        // sort each string -> check if the sorted is present as a key
        // if present add it in array list value
        // if not put the key and value
        // in the end return the maps values
        for(String s :  strs){
            String sorted = sort(s);
            if(checkArray.containsKey(sorted)){
                ArrayList<String> list = checkArray.get(sorted);
                list.add(s);
                checkArray.put(sorted, list);
            }else{
                ArrayList<String> list = new ArrayList<String>();
                list.add(s);
                checkArray.put(sorted, list);
            }
        }
        return new ArrayList<>(checkArray.values());   
        
    }
    public String sort(String s){
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
