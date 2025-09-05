class ArrayDuplicates{
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> added = new HashSet<>();
        
        for(int num : arr){
            if(seen.contains(num) && !added.contains(num)){
                al.add(num);
                added.add(num);
            }else{
                seen.add(num);
            }
        }
        return al;
    }
}