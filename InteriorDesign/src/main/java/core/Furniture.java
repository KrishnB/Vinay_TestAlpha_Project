package core;

import Types.FurnitureType;
import Types.ICategory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vinaykumar on 25/10/16.
 */
public class Furniture extends Category {

    public ICategory category;
    public double cost;
    private Map<FurnitureType,Integer> fmap;
    private Integer price;
    private float quantity;



    public Furniture() {
        init();
    }

    private void init(){

        fmap = new HashMap();

        //Inserting Some Furniture Items in the Map
        fmap.put(FurnitureType.Chair,100);
        fmap.put(FurnitureType.DiningTable,500);
    }

    public ICategory getFurnitureType() {
        return category;
    }

    public void setFurnitureType(FurnitureType furnitureType){this.category = furnitureType;
    }

    public double costCalculation() {

        if(fmap.containsKey(category))
        {
            price = fmap.get(category);
        }

        try{
            if(quantity >0){
                cost = price * quantity;
            }
        }catch(Exception e)
        {
            System.out.println("Quantity Sould Not be 0....Please Provide the quantity greater than 0");
        }
        return cost;
    }

    public double getCost() {
        return cost;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public ICategory getCategory() {
        return category;
    }

    @Override
    public void setCategory(ICategory category) {
        this.category = category;
    }

    @Override
    public float getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
