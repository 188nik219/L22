import java.util.HashMap;

public class Garage {
    public HashMap<Car, Integer> hashMap;
    public static HashMap departure (HashMap<Car, Integer> hashMap, Car<? extends Car> car){
        Integer numberOfSameCars=1;
        if (hashMap.containsKey(car)){
            hashMap.put(car, numberOfSameCars++);
        } else hashMap.put(car, numberOfSameCars);
        return hashMap;
    }
    public static HashMap entry (HashMap<Car, Integer> hashMap, Car<? extends Car> car){
        if (hashMap.containsKey(car)){
            if (hashMap.get(car)>0) hashMap.put(car, hashMap.get(car)--);
        }
        return hashMap;
    }

}
