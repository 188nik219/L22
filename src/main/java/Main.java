import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        extracted();
        HashMap<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("A","Q");
        stringStringMap.put("W","S");
        stringStringMap.put("E","D");
        stringStringMap.put("R","F");
        stringStringMap.put("T","G");
        stringStringMap.put("Y","H");
        isUnique(stringStringMap);
    }

    private static boolean isUnique(HashMap<String, String> stringStringMap) {
        int number =0;
        ArrayList<String> arrayList = (ArrayList<String>) stringStringMap.keySet();
        for (int i = 0; i < arrayList.size(); i++) {
            if (stringStringMap.containsValue(arrayList.get(i))){
                number++;
                stringStringMap.get
            }
        }
    }


    private static void extracted() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "USA");
        hashMap.put(2, "UK");
        hashMap.put(3, "Belarus");
        hashMap.put(4, "Ukrain");
        hashMap.put(5, "Brazil");
        hashMap.remove(1);
        hashMap.remove(2);
        System.out.println(hashMap.get(3));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.containsKey(4));
        System.out.println(hashMap.containsValue("Brazil"));
        System.out.println(hashMap.isEmpty());
    }
}
