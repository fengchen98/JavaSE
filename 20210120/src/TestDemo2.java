import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:FC
 * @Date:2021/1/20
 * @Time:11:47
 * @Content:
 */

class MyArrayList{
    public int usedSize;
    public int[] elem;
}
public class TestDemo2 {
    public static void main2(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("雪雪","猪");
        String ret=map.get("雪雪");
        System.out.println(ret);
    }


    public static void main1(String[] args) {
        Collection<String> collection=new ArrayList<String>();
        //collection.add(1);
        collection.add("asda");
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
    }
}
