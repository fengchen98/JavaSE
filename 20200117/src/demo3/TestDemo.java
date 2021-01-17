package demo3;

/**
 * @Author:FC
 * @Date:2021/1/17
 * @Time:10:57
 * @Content:
 */
interface A{
    void funcA();
}

interface B{
    void funcB();
}

interface C{
    void funcC();
}

interface D extends A,B,C{
    void funcD();
}

class F implements A,B,C,D{
    @Override
    public void funcA() {

    }

    @Override
    public void funcB() {

    }

    @Override
    public void funcC() {

    }

    @Override
    public void funcD() {

    }
}

abstract class TestAbstract{
    public abstract void funcTestAbstract();
}
class Test extends TestAbstract implements A,B,C{
    @Override
    public void funcA() {

    }

    @Override
    public void funcB() {

    }

    @Override
    public void funcC() {

    }

    @Override
    public void funcTestAbstract() {

    }
}
public class TestDemo {
}
