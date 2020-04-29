package package1;

public class Father {
    public String name = "小明";
    public Father(String Myname){
        name = Myname;
    }

    public void setC(String name) {
        System.out.println(name);
    }

    void fn(){
        setC("小明");
    }
}
