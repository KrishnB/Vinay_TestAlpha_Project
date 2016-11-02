package builders;

import Types.CategoryType;
import Types.ICategory;
import core.Carpet;
import core.Category;
import core.Electronics;
import core.Furniture;


/**
 * Created by vinaykumar on 25/10/16.
 */
public class CategoryBuilder {

    private Category category = new Category();

    public CategoryBuilder(CategoryType categoryType) {
        switch (categoryType) {
            case ELECTRONICS:
                category = new Electronics();
                break;
            case FURNITURE:
                category = new Furniture();
                break;
            case CARPET:
                category = new Carpet();
                break;
        }
    }

    public CategoryBuilder withCategoryType(ICategory categoryType) {
        category.setCategory(categoryType);
        return this;
    }

    public CategoryBuilder withQuantity(float quantity) {
        category.setQuantity(quantity);
        return this;
    }
    public Category build()
    {
        return category;
    }
}
