package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author:FC
 * @Date:2021/1/18
 * @Time:10:03
 * @Content:
 */
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要借阅的书籍");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            Book book=bookList.getBook(i);
            if (book.getName().equals(name)){
                book.setStatus(true);
                System.out.println(book);
                return;
            }
        }
        System.out.println("没找到你要借阅的书籍！");
    }
}
