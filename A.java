package ppp;

import java.util.HashSet;
import java.util.TreeSet;

public class A {
    
    public static void main(String[] args) {
        
        TreeSet  obj1= new TreeSet();
        obj1.add("is");
        obj1.add(1);
        obj1.add("");
        System.out.println(obj1);
        
        HashSet obj2= new HashSet();
        obj2.add("");
        obj2.add("orm");
        obj2.add("Awesome");
        System.out.println(obj2);
        
        
    }
    
}