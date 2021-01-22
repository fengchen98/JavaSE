package user;

import book.BookList;
import operation.IOperation;

/**
 * @Author:FC
 * @Date:2021/1/18
 * @Time:9:49
 * @Content:
 */
public abstract class User {
    public String name;
    public IOperation[] operations;

    public User(String name) {
        this.name = name;

    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList){
        this.operations[choice].work(bookList);
    }

}
