package operation;

import book.BookList;

/**
 * @Author:FC
 * @Date:2021/1/18
 * @Time:10:04
 * @Content:
 */
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
