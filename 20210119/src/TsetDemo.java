import java.util.Scanner;

/**
 * @Author:FC
 * @Date:2021/1/19
 * @Time:9:50
 * @Content:
 */

//运行时期异常
class MyException extends RuntimeException{

    public MyException(String message) {
        super(message);
    }

}
//编译时期异常
class MyException2 extends Exception{

    public MyException2(String message) {
        super(message);
    }
}


class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}
public class TsetDemo {
    private float f = 1.0f;
    int m = 12;
    static int n = 1;
    public static void main (String args[]) {
        TsetDemo t = new TsetDemo();
        
    }
    public static void reverse(char[] arr,int left,int right)
    {
        while(left<right){
            char tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
    }

    public static void main6(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String chas=sc.next();
        char[] arr=chas.toCharArray();
        int len=arr.length;
        reverse(arr,0,size-1);
        reverse(arr,size,len-1);
        reverse(arr,0,len-1);
        String str=new String(arr);
        System.out.println(str);
    }



    public static void main5 (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName=scanner.nextLine();
        System.out.println("请输入密码：");
        String password=scanner.nextLine();
        try {
            login(userName,password);
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }
    }

    public static void main4 (String[] args) {
        try {
            throw new MyException("hahaha");
        }catch (MyException e) {
            e.printStackTrace();
        }
    }



    private static String userName = "admin";
    private static String password = "123456";
    public static void login(String userName, String password) throws UserError, PasswordError {
        if (!TsetDemo.userName.equals(userName)) {
            throw new UserError("用户名错误");
        }
        if (!TsetDemo.password.equals(password)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }
    public static void main3(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }
    }

    public static void main2(String[] args) {
        String str1="abcde";
        String str2=new String("abcde");
        System.out.println(str1==str2); //false

        String str3="abc"+"de";
        System.out.println(str1==str3);  //true

        String str4=new String("abc")+new String("de");
        System.out.println(str1==str4);  //false

        String str5=new String("abc")+"de";
        System.out.println(str1==str5);  //false
    }

    public static void main1(String[] args) {
        String str1="hello";

        String str2=new String("hello");

        char[] value={'h','e','l','l','o'};
        String str3=new String(value);

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);

    }
}
