/**
 * @Author:FC
 * @Date:2021/1/22
 * @Time:12:06
 * @Content:
 */
public class MyStack {
    private int [] elem;
    private int top;  //既可以代表下标  也可以代表栈顶

    public MyStack(){
        this.elem=new int[10];
    }

    public boolean isFull(){
        return this.top==this.elem.length;
    }

    public int push(int elem){
        if (isFull()){
            throw new RuntimeException("栈为满");
        }
        this.elem[this.top]=elem;
        top++;
        return this.elem[top-1];
    }

    public int pop(){
        if (empty()){
            throw new RuntimeException("栈为空");
        }
        this.top--;
        return this.elem[top];
    }

    public int peek(){
        if (empty()){
           throw new RuntimeException("栈为空");
        }
        return this.elem[top-1];
    }

    public boolean empty(){
        return  this.top==0;
    }

    public int size(){
        return this.top;
    }


}
