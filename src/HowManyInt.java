import java.util.*;

public class HowManyInt {

    HashMap<Integer, Integer> result = new HashMap<>();

    public void findInt(ArrayList<Integer> list){
        for(Integer in : list){
            if(!result.containsKey(in)){
                result.put(in, 1);
            }
            else{
                result.put(in, result.get(in) + 1);
            }
        }
        result.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
