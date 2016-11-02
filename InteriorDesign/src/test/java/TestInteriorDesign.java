import Types.CarpetType;
import Types.CategoryType;
import Types.ElectronicsType;
import Types.FurnitureType;
import builders.CategoryBuilder;
import core.Category;
import core.InteriorDesign;
import org.testng.annotations.Test;

/**
 * Created by vinaykumar on 25/10/16.
 */
public class TestInteriorDesign {

    InteriorDesign interiorDesign = new InteriorDesign();
    Category category1,category2,category3;

    @Test
    public void totalPurchase(){

        category1 = new CategoryBuilder(CategoryType.ELECTRONICS)
                .withCategoryType(ElectronicsType.AC).withQuantity(1).build();

        interiorDesign.calculateTotalAmount(category1);

        category2 = new CategoryBuilder(CategoryType.FURNITURE).
                withCategoryType(FurnitureType.Chair).withQuantity(1).build();

        interiorDesign.calculateTotalAmount(category2);

        category3 = new CategoryBuilder(CategoryType.CARPET)
                .withCategoryType(CarpetType.Squared).withQuantity(1000).build();

        interiorDesign.calculateTotalAmount(category3);

        interiorDesign.showTotalAmount();
    }
}
