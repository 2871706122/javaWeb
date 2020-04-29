package package1;

class SuperClass {
    private int n;
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

//注意：不论子类的构造函数有没有参数，如果不手动写调用父类的构造函数，那么就是自动调用无参的哪个，
// 如果要手动，那么都可以调用，而不是说子类的有参才可以调父类的有参，这个是没有关系的，想怎么调就怎么调

// SubClass 类继承
class SubClass extends SuperClass{
    private int n;
    SubClass(){ // 自动调用父类的无参数构造器
        super();//可以不写这行，不写的话系统自动调用父类的无参构造函数        同时子类的构造函数在调用父类的构造函数的时候，必须写在子类构造函数的第一行
        System.out.println("SubClass");
    }

    public SubClass(int n){
        super(300);  // 调用父类中带有参数的构造器，如果要调用父类的有参的构造函数，那么必须手动书写，且传相应数据类型的参数进去
        System.out.println("SubClass(int n):"+n);
        this.n = n;
    }
}

// SubClass2 类继承
class SubClass2 extends SuperClass{
    private int n;

    SubClass2(){
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("SubClass2");
    }

    public SubClass2(int n){ // 自动调用父类的无参数构造器
        System.out.println("SubClass2(int n):"+n);
        this.n = n;
    }
}
public class Index{
    public static void main (String args[]){
        System.out.println("------SubClass 类继承------");
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(100);
        System.out.println("------SubClass2 类继承------");
        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(200);
    }
}
