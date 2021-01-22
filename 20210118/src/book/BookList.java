package book;

/**
 * @Author:FC
 * @Date:2021/1/18
 * @Time:9:49
 * @Content:
 */
public class BookList {
    private int usedSize;
    private Book[] books;

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public void setBooks(int pos, Book book) {
        books[pos] = book;
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }


    public BookList() {
        this.books = new Book[10];
        books[0] = new Book("三国演义", "罗贯中", 56, "小说");
        books[1] = new Book("西游记", "吴承恩", 32, "小说");
        books[2] = new Book("水浒传", "施耐庵", 66, "小说");
        this.usedSize = 3;
    }
}

