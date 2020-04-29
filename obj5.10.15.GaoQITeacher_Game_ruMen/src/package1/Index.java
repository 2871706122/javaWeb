package package1;

import java.awt.*;
import javax.swing.*;

public class Index extends JFrame{
    //图片
    Image img1 = Toolkit.getDefaultToolkit().getImage("src/imgs/grace.png");
    Image img2 = Toolkit.getDefaultToolkit().getImage("src/imgs/timg.png");

    double x = 100;
    double y = 100;
    //水平移动的控制变量
    int x1 = 0;

    //自由弹体移动的控制变量
    double deg1 = 3.14/3; //使用弧度

    //画窗口 的系统方法：paint
    public void paint(Graphics box) {
        System.out.println("调用一次哦！");
        //注意这个先后顺序和图层的叠加是一个原理
        box.drawImage(img1,0,0,null);
        box.drawImage(img2,(int)x,(int)y,null);

        //水平方向上控制左右移动
//        if(x<500&&x1==0){
//            x+=10;
//            if(x==500-50){
//                x1=500;
//            }
//        }else if(x1==500){
//            x-=10;
//            if(x==0){
//                x1=0;
//            }
//        }

        //下面介绍自由弹体运动
        x = x+10*Math.cos(deg1);
        y = y+10*Math.sin(deg1);

        if(y>350||y<25){
            deg1 = -deg1;
        }

        if(x<0||x>450){
            deg1 = 3.14-deg1;
        }

    }

    //弹窗属性设置
    void GetFrame(){
        setSize(500,400);
        setLocation(700,200);
        setVisible(true);

        //重复画
        while (true) {
            repaint();
            try{
                Thread.sleep(40);//40毫秒调用一次
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Index Index1 = new Index();
        Index1.GetFrame();
    }
}
