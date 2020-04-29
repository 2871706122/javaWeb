package packge1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {
    public Sql(int userId){
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:8411/my001001","root","8411");

            statement=connection.createStatement();
            String sql="select * from users where id="+userId;	//发出查询指令

            resultSet=statement.executeQuery(sql);//执行语句后得到的结果很多，存到定义的集合中，再用循环输出。
            while(resultSet.next()) {	//相当于迭代器循环。判断是否存在，当存在时调用getString();方法得到值。
                String id=resultSet.getString("id");
                String userName=resultSet.getString("name");
                String password=resultSet.getString("age");
                System.out.println("id:"+id+"\t"+"name:"+userName+"\t"+"age:"+password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {	//释放资源：首先关闭循环，再关闭窗口，最后关闭连接。
//            System.out.println(resultSet);
            try {
                if(resultSet!=null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if(statement!=null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if(connection!=null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
