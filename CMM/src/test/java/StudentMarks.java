import Types.First;
import core.Cmm;
import core.FirstYear;
import core.Student;
import org.testng.annotations.Test;

/**
 * Created by vinaykumar on 31/10/16.
 */
public class StudentMarks {

    Cmm cmm = new Cmm();
    Student firstyear, secondyear, thirdyear, fourthyear;

    @Test
    public void totalMarks() {

        firstyear = new FirstYear(First.Subject1,50);
        cmm.calculateTotal(firstyear);

        firstyear = new FirstYear(First.Subject2,50);
        cmm.calculateTotal(firstyear);

        firstyear = new FirstYear(First.Subject3,50);
        cmm.calculateTotal(firstyear);

        firstyear = new FirstYear(First.Subject4,20);
        cmm.calculateTotal(firstyear);

        firstyear = new FirstYear(First.Subject5,50);
        cmm.calculateTotal(firstyear);

//        secondyear = new SecondYear(Second.Subject6);
//        cmm.calculateTotal(secondyear);

        cmm.calculateAggregate();

        cmm.showStudentFinalMarks();






    }
}
