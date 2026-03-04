// HashMap in java and inbuilt functions of hashmap

import java.util.HashMap;
import java.util.Map;

public class A_HashMap{
    public static void main(String[] args) {
        
        HashMap<Character,Integer>map = new HashMap<>();

        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);

        System.err.println(map.get('a'));
        System.err.println(map.get('b'));
        System.err.println(map.get('c'));
        System.err.println(map.get('d'));

        // Size-> no of entries
        System.err.println("Size:"+map.size());

        // Iterating and reading over hash map

        // 1. entrySet -> return key-value set

        System.err.println("All key-value using entrySet:");

        for(Map.Entry<Character,Integer>entry : map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        //2. keySet() -> return all key set

        System.err.println("All key-value using keySet:");
        for(Character key: map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }

        //3. values -> return all values as collection

        System.err.println("All value collection:");
        for(int value: map.values()){
            System.out.println(value);
        }

        // Containskey

        System.out.println("containsKey or not:"+map.containsKey('b'));  //true
        System.out.println("containsKey or not:"+map.containsKey('h'));  //true

        //ContainsValue
        
        System.out.println("containsValue or not:"+map.containsValue(4));  //true
        System.out.println("containsValue or not:"+map.containsValue(10));  //true


        //Remove key

        System.out.println("Remove key:"+map.remove('a')); // key removed a->1

          for(Map.Entry<Character,Integer>entry : map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        // getOrDefault -> if available then return else default value
        System.out.println("getOrdefault:"+map.getOrDefault('a', 0)); //0 as a is deleted not there
        System.out.println("getOrdefault:"+map.getOrDefault('b', 0)); //2 value of key b

        // Put if absent
        System.out.println("putyIfAbsent:"+map.putIfAbsent('a', 10)); //0 as a is deleted not there
        System.out.println("putIfAbsent:"+map.putIfAbsent('b', 10)); //2 value of key b

        for(Map.Entry<Character,Integer>entry : map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        // isEmpty -> true if empty else false
        System.err.println("Is empty:"+map.isEmpty());

        // clear
        map.clear(); // remove all mappings
        System.err.println("Is empty:"+map.isEmpty());



    }
}