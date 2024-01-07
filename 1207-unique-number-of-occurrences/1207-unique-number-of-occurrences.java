class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // declare hashmap
        HashMap<Integer,Integer> fmap = new HashMap<>();
        // example-1 => keys->vlaues 1->3 2->2 3->1
        for(int i:arr){
            if(fmap.containsKey(i)){
                int of = fmap.get(i); //of=old frequency
                int nf = of + 1;  //nf= new frequency
                fmap.put(i , nf);
            }else{
                fmap.put(i,1);
            }
        }
        // declase hashset
        // for checking value of hashmap we use hashset 
        // HashSet always takes unique element
        HashSet<Integer> set = new HashSet<>();
        for(int i : fmap.values()){
            if(!set.contains(i)){  //exam-1 => 1->3 2->2 3->1 rightnow in set ,3 is not present so it accept it as a unique element then add and then add 3 ......but in exam-2=> 1->1 2-> so set accept 1 as it is a unique element for key 1 but when it comes to 2 then it will not accept as 1 is already present in the set
                set.add(i);
            }else{
                return false;
            }
        }
        return true;
    }
}