import java.util.*;

public class Maps {
    //Maps store functional relationships
    //Maps are a relationship between 2 things - not a collection, and not iterable with an iterator (unless the map is converted into a collection)
    public static void main(String[] args) {
        /*
        //HashMap - runs fast
        //TreeMap - is sorted (by "x" value) */
        Map<String, Integer> map = new TreeMap<String, Integer>();
        //map.put(key,value);
        map.put("KZ", 3);
        map.put("RM", 16);
        map.put("SV", 8);
        map.put("BM", 3);
        /*
        if (map.containsKey("SV")) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        System.out.println();

        //turn the map into a bunch of entries (to parse the map)
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println();

        //parse the map with an iterator
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println();
        */

        
        //Maps as a frequency counter
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,9,2,7,3,8,2,7,7));
        //First, create a map (item to frequency)
        //Parse the list and do the following for each element in the list:
        //  1. if its already in the map: fetch the frequency, add one to it,
        //     and store the new frequency
        //  2.it its not in the map, create a new entry in the map and set the frequency to 1
        //after the list has been parsed, iterate through the map and print the key value pairs
        Map<Integer, Integer> frequencyCounter = new HashMap<Integer, Integer>();
        for (Integer num : list) {
            if (frequencyCounter.containsKey(num)) {
                frequencyCounter.put(num,frequencyCounter.get(num)+1);//
            } else {
                frequencyCounter.put(num,1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : frequencyCounter.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println();

        //Map methods:
        //get(key) - returns the value at the provided key //getting a value that isn't in the map returns null
        //put(key, value) - adds the key and value to the map //if the key already exists in the map, it'll be replaced by the new pair
        //entrySet - returns a set of key-value pairs in the map
        //keySet - returns a set of keys in the map
        //containsKey(key) - returns a boolean whether the provided key exists in the map
        //containsValue(value) - returns a boolean whether the provided value exists in the map
        //clear - clears the whole map
        //remove(key) - removes the key value pair with the provided key

        //[values - returns a collection of values in the map (if a value occurs more than once in the map it will
        // occur more than once in the returned collection)]
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println();

        //Create a set of entries from the map
        //Take the set and use it to seed a list
        //list.sort(Map.Entry.comparingByValue());
        mapToList();
    }

    public static void mapToList() {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("KZ", 3);
        map.put("RM", 16);
        map.put("SV", 8);
        map.put("BM", 3);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        System.out.println(list);
    }
    //Quiz next class on Maps (Featuring Maps as frequency counters?)- 12/6/23
}