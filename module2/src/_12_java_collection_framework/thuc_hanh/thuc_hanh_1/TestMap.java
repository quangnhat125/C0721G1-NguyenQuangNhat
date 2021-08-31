package _12_java_collection_framework.thuc_hanh.thuc_hanh_1;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nhật", 23);
        hashMap.put("Tân", 28);
        hashMap.put("Phước", 30);
        hashMap.put("Huy", 24);
        hashMap.put("Sang", 26);
        hashMap.put("Hải", 23);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap +"\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Yến", 20);
        linkedHashMap.put("Linh", 21);
        linkedHashMap.put("Thư", 18);
        linkedHashMap.put("Thảo", 18);
        System.out.println("The age for" + " Thư is " + linkedHashMap.get("Thư"));
    }
}
