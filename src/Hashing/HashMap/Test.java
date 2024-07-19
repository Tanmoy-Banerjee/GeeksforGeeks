package Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("GFG", 10);
        m.put("ide", 15);
        m.put("courses",30);


        System.out.println(m);
        System.out.println(m.size());

        for(Map.Entry<String, Integer> e : m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());

        }

        if(m.containsKey("GFG")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        m.remove("GFG");
        System.out.println(m.size());
    }
}
