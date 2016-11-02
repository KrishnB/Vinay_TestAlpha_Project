package core;

/**
 * Created by vinaykumar on 31/10/16.
 */
public class Cmm {
    public Student student;
    public int total = 0, count = 1 ;
    
    public void calculateTotal(Student student){
        if(student.marks != 0){
        total = total + student.calculateMarks();
        count++;}
        else
            total = 0;
    }
    
    public void calculateAggregate() {
        total = (total / count);
    }

    public void showStudentFinalMarks(){
        System.out.println("Student average marks in : "+ total);
    }

}
