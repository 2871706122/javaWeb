package package1;

import java.util.Scanner;

public class Scanner_nextInt {
    public Scanner_nextInt(){//输入整数        浮点数也是这个道理
        //int*******************************************
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {
            // 判断输入的是否是整数
            i = scan.nextInt();
            // 接收整数
            System.out.println("整数数据：" + i);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是整数！");
        }

        //float*************************************
        Scanner scan2 = new Scanner(System.in);
        System.out.print("输入小数：");
        if (scan2.hasNextFloat()) {
            // 判断输入的是否是小数
            f = scan2.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }

        //double************************************
        System.out.println("输入n个任意数，回车结束该数的输入,也可以用空格分隔，输入任意字符表示停止输入,最后得到总和与平均值");
        Scanner scan3 = new Scanner(System.in);
        double sum = 0;
        int m = 0;

        while (scan3.hasNextDouble()) {//如果继续输入double类型的数据，就会一直在这个里面运行，反之则会不运行while了
            double x = scan3.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));

        scan.close();
        scan2.close();
        scan3.close();
    }
}
