package package1;

import java.util.Scanner;

public class Scanner_next {
    public Scanner_next(){
        // 从键盘接收数据
        Scanner scan = new Scanner(System.in);

        // next方式接收字符串
        System.out.println("next方式接收：");//中间如果有空格，只会记录空格前的数据

        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }
}
