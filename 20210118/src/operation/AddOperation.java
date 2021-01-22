package operation;

import book.Book;
import book.BookList;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * @Author:FC
 * @Date:2021/1/18
 * @Time:10:02
 * @Content:
 */
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name=scanner.nextLine();
        System.out.println("请输入图书的作者");
        String author=scanner.nextLine();
        System.out.println("请输入图书的价格");
        int price=scanner.nextInt();
        System.out.println("请输入图书的类型");
        String type=scanner.next();

        Book book=new Book(name,author,price,type);
        int currentSize=bookList.getUsedSize();
        bookList.setBooks(currentSize,book);
        bookList.setUsedSize(currentSize+1);
    }
}
