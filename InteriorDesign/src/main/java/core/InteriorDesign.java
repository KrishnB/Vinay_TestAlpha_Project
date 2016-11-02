package core;

/**
 * Created by vinaykumar on 25/10/16.
 */
public class InteriorDesign {

    public Category category;
    private double total;

    public void calculateTotalAmount(Category category)
    {
        total = total + category.costCalculation();
    }
    public void showTotalAmount()
    {
        System.out.println("Total Purchase is :" +total +"$");
    }
}
