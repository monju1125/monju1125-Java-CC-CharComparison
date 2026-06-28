import java.util.HashMap;
import java.util.Map;

public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * car < care < cat
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i< a.length; i++){
            if(map1.containsKey(a[i])){
            map1.put(a[i], map1.get(a[i])+1);  
            } else {
                map1.put(a[i], 1);
            }
        }

        for(int j=0; j<b.length; j++){
            if(map2.containsKey(b[j])){
                map2.put(b[j], map2.get(b[j])+1);
            }
            else {
                map2.put(b[j], 1);
            }
        }

        if (map1.equals(map2)) {
            return 0;            
        } else if (map1.size() > map2.size()) {
            return 1;
        } else 
            return -1;

    }
}
