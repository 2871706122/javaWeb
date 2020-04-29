package pagckage1;

//重写就是父类的方法在子类里面重新构建
//重载就是方法名相同，参数个数、参数类型不同来区分函数的表现形式

class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }

}

class Dog extends Animal{
    public void move(){
        System.out.println("狗可以跑和走");
    }

    public void eat(){
        System.out.println("狗可以吃东西");
    }
}

public class Index{
    public static void main(String args[]){
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象  父类引用指向子类对象

        a.move();// 执行 Animal 类的方法

        b.move();//执行 Dog 类的方法

        //b.eat();
    }
}
