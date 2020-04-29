package package1;

public class Child1 extends Father{
    public Child1(String Myname){
        super(Myname);
    }

    void fn(){
        setC("小花");
    }

    void fm(){
        this.fn();
        super.fn();
    }

}
