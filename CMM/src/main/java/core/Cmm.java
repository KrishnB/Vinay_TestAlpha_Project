package core;

/**
 * Created by vinaykumar on 31/10/16.
 */
public class Cmm {
    public Student student;
    public int total = 0 ,cumm = 0;
    private String marksName;
    
    public void calculateTotal(Student student){
        marksName = student.getClass().getSimpleName();
        total = total + student.calculateMarks();
    }
//
//    public void calculateAggregate(Student student) {
//        total = (total / 3);
//    }

    public void showStudentYearlyMarks(Student student){
        total = (total / 3);
        System.out.println(String.format("%s Student Aggregate marks is : %s",marksName,total));
        cumm = cumm +total;
    }

    public void showCummulative()
    {
        cumm = cumm/4;
        System.out.println("Student Cummulative Marks is : " +cumm);
    }


}
