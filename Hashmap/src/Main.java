import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void HashmapMethods(){
        //Syntax
        Map<String,Integer> mp = new HashMap<>();
        HashMap<String,Integer> kp = new HashMap<>();

        //Adding entry using put method
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Luv",17);
        mp.put("Rishika",18);
        mp.put("Harry",19);

        //Getting value of a key from the hashmap
        System.out.println(mp.get("Akash"));
        System.out.println(mp.get("Sona"));

        //changing and updating the value in hashmap uses put fn
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));

        //removing a pair from hashmap
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("Sona"));

        //checking the key exists in the map
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Yash"));

        //Adding new entry if and only if the entry doesnt exist
        mp.putIfAbsent("Yash",40);
        mp.putIfAbsent("Yashika",40);

        //Getting all the keys in the hashmap
        System.out.println();
        System.out.println(mp.keySet());

        //Getting all the values in the hashmap
        System.out.println();
        System.out.println(mp.values());

        //Getting all the key value pairs in the hashmap
        System.out.println();
        System.out.println(mp.entrySet());

        //Traversing all entries of the hashmap  -  multiple methods
        System.out.println();
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

        System.out.println(" ");
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }







    }

    public static void main(String[] args) {
        HashmapMethods();
    }
}