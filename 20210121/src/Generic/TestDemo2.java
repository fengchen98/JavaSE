package Generic;

/**
 * @Author:FC
 * @Date:2021/1/21
 * @Time:14:59
 * @Content:
 */



public class TestDemo2 <T>{
    T value;

    TestDemo2(T value) {
        this.value=value;
    }

    T get() {
        return value;
    }

    public static void main(String[] args) {
        TestDemo2<Integer> testDemo2=new TestDemo2<>(10);
        int ret=testDemo2.get();
        System.out.println(ret);
    }
}
