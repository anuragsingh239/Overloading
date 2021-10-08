package P2;

public class Test {
    public static void main(String[] args) {
        Exam obj1=new Exam();
        Exam obj2=new Exam(20);
        Exam obj3=new Exam(30,"LLB",70);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
