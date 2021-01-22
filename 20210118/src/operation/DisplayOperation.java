package operation;

import book.BookList;

/**
 * @Author:FC
 * @Date:2021/1/18
 * @Time:10:03
 * @Content:
 */
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("展示图书");
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
