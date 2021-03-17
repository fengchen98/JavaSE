import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @Author:FC
 * @Date:2021/3/17
 * @Time:20:46
 * @Content:
 */
public class TestDemo {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        //1.加载驱动程序
//        Class.forName("com.mysql.jdbc.Driver");
//        //2.获取链接
//        String url="jdbc:mysql://localhost:3306/test0317?user=root&password=&useUnicode=true&characterEncoding=UTF-8";
//        Connection connection=DriverManager.getConnection(url);
//        //3.执行sql语句
//        String sql="select * from user";
//        Statement statement=connection.createStatement();
//        ResultSet resultSet=statement.executeQuery(sql);
//
////        if (resultSet.next()){
////            System.out.println(resultSet.getInt(1));
////            System.out.println(resultSet.getString(2));
////            System.out.println(resultSet.getString(3));
////        }
//        if (resultSet.next()){
//            User user=new User();
//            user.setId(resultSet.getInt(1));
//            user.setName(resultSet.getString(2));
//            user.setPassword(resultSet.getString(3));
//            System.out.println(user);
//        }
public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //1.加载驱动程序
    Class.forName("com.mysql.jdbc.Driver");
    //2.数据源
    String url="jdbc:mysql://localhost:3306/test0317?user=root&password=&useUnicode=true&characterEncoding=UTF-8";
    DataSource dataSource=new MysqlDataSource();
    ((MysqlDataSource)dataSource).setUrl(url);
    Connection connection=dataSource.getConnection();
    //3.执行sql语句
    String name="fc";
    String password="123";
    String sql="select * from user where name= ? and password=?";
    PreparedStatement preparedStatement=connection.prepareStatement(sql);
    preparedStatement.setString(1,name);
    preparedStatement.setString(2,password);
    System.out.println(preparedStatement.toString());
    ResultSet resultSet=preparedStatement.executeQuery();

//        if (resultSet.next()){
//            System.out.println(resultSet.getInt(1));
//            System.out.println(resultSet.getString(2));
//            System.out.println(resultSet.getString(3));
//        }
    if (resultSet.next()){
        User user=new User();
        user.setName(resultSet.getString(1));
        user.setPassword(resultSet.getString(2));
        System.out.println(user);
    }
    resultSet.close();
    preparedStatement.close();
    connection.close();
    }
}
