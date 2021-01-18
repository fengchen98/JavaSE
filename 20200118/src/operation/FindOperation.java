package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author:FC
 * @Date:2021/1/18
 * @Time:10:02
 * @Content:
 */
public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍：");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name=scanner.nextLine();
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getBook(i);
            if (book.getName().equals(name)){
                System.out.println("找到了");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有找到这本书");
    }
}
