package P2;

public class Test {
    public static void main(String[] args) {
        Exam obj1=new Exam();
        Exam obj2=new Exam();
        Exam obj3=new Exam();
        obj1.setvalue(10,890);
        obj2.setvalue(20,900,"B.Tech");
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
