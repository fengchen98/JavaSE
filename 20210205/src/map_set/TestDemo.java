package map_set;

import java.util.*;

/**
 * @Author:FC
 * @Date:2021/2/4
 * @Time:10:25
 * @Content:
 */
public class TestDemo {
    public static void func(){
        Random random=new Random();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            arrayList.add(random.nextInt(10));
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <arrayList.size(); i++) {
            Integer key=arrayList.get(i);
            if (map.get(key)==null){
                map.put(key,1);
            }else {
                Integer num=map.get(key);
                map.put(key,num+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry :map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }
    
    
    
    //找出10W个数据当中，第一个重复的数据
    public static int findFirstRepeatNumber(){
        Random random=new Random();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <100000 ; i++) {
            arrayList.add(random.nextInt(10000));
        }
        HashSet<Integer> set=new HashSet<>();
        for (int x:arrayList) {
            if (set.contains(x)){
                return x;
            }
            set.add(x);
        }
        return -1;
    }

    //把十万个数据中重复的去掉
    public static Set<Integer> deputil(){
        HashSet<Integer> set=new HashSet<>();
        Random random=new Random();
        for (int i = 0; i <100000 ; i++) {
            set.add(random.nextInt(10000));
        }
        return set;
    }


    public static void main4(String[] args) {
        
    }



    public static void main3(String[] args) {
        System.out.println(TestDemo.findFirstRepeatNumber());
        System.out.println(TestDemo.deputil());
        func();

    }



    public static void main2(String[] args) {
        //set中不能存储相同的元素
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(2);
        set.add(21);
        set.add(12);
        set.add(null);
        System.out.println(set);
        System.out.println(set.size());
    }


    public static void main1(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        map.put("fc",18);
        map.put("xx",16);
        map.put(null,null);
        System.out.println(map);
        System.out.println(map.get("fc"));
        System.out.println(map.getOrDefault("fcc", 20));
        Set<String> set=map.keySet();
        System.out.println(set);
        Set<Map.Entry<String,Integer>> set1=map.entrySet();
        for (Map.Entry<String,Integer> entry:set1) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }


}
