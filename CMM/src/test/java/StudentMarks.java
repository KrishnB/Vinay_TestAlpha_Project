import Types.First;
import Types.Fourth;
import Types.Second;
import Types.Third;
import core.*;
import org.testng.annotations.Test;

/**
 * Created by vinaykumar on 31/10/16.
 */
public class StudentMarks {

    Cmm cmm = new Cmm();
    Student firstyear, secondyear, thirdyear, fourthyear;

    @Test
    public void totalMarks() {

        //First Year Marks Inserting and Calculating the Total,Aggregate
        firstyear = new FirstYear(First.Subject1);
        cmm.calculateTotal(firstyear);

        firstyear = new FirstYear(First.Subject2);
        cmm.calculateTotal(firstyear);

        firstyear = new FirstYear(First.Subject3);
        cmm.calculateTotal(firstyear);

        //cmm.calculateAggregate(firstyear);
        cmm.showStudentYearlyMarks(firstyear);

        //Second Year Marks Inserting and Calculating the Total,Aggregate
        secondyear = new SecondYear(Second.Subject6);
        cmm.calculateTotal(secondyear);

        secondyear = new SecondYear(Second.Subject7);
        cmm.calculateTotal(secondyear);

        secondyear = new SecondYear(Second.Subject8);
        cmm.calculateTotal(secondyear);

        //cmm.calculateAggregate(secondyear);
        cmm.showStudentYearlyMarks(secondyear);

        //Third Year Marks Inserting and Calculating the Total,Aggregate
        thirdyear = new ThirdYear(Third.Subject11);
        cmm.calculateTotal(thirdyear);

        thirdyear = new ThirdYear(Third.Subject12);
        cmm.calculateTotal(thirdyear);

        thirdyear = new ThirdYear(Third.Subject13);
        cmm.calculateTotal(thirdyear);

        //cmm.calculateAggregate(thirdyear);
        cmm.showStudentYearlyMarks(thirdyear);

        //Fourth Year Marks Inserting and Calculating the Total,Aggregate
        fourthyear = new FourthYear(Fourth.Subject16);
        cmm.calculateTotal(fourthyear);

        fourthyear = new FourthYear(Fourth.Subject17);
        cmm.calculateTotal(fourthyear);

        fourthyear = new FourthYear(Fourth.Subject18);
        cmm.calculateTotal(fourthyear);

        //cmm.calculateAggregate(fourthyear);
        cmm.showStudentYearlyMarks(fourthyear);

        //Calculating the Cummulative marks of the Student
        cmm.showCummulative();


   }
}
