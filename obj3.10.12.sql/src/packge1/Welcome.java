package packge1;
//import ../packge1.*

public class Welcome {
    public Welcome(String name){
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name );
    }

    public static void main(String[] args){
        System.out.println("hello java,我要开始重新对你的认识了哦！");

        // 下面的语句将创建一个对象
        Welcome myPuppy = new Welcome( "tommy" );

        //dog
        Dog myDog = new Dog("joker");

        //数据库
        int id = 2;
        Sql user = new Sql(id);
    }
}
