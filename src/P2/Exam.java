package P2;

public class Exam {
    int rollno;
    String course;
    int marks;
    Exam()
    {
        rollno =0;
        course ="Unknown";
        marks= 0;
    }
    public void setvalue(int rollno,int marks)
    {
        this.marks=marks;
        this.rollno=rollno;
    }
    public void setvalue(int rollno,int marks,String course) {
        this.marks=marks;
        this.rollno=rollno;
        this.course=course;
    }
        public void display()
        {
            System.out.println(rollno+"  "+course+ "  "+ marks);
        }
    }


