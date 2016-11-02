package core;

import Types.ElectronicsType;
import Types.ICategory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vinaykumar on 25/10/16.
 */

public class Electronics extends Category {

    public ICategory category;
    public double cost;
    private float quantity;
    private Map<ElectronicsType,Integer> emap;
    private Integer price;

    public Electronics(){
        initMap();
    }

    private void initMap() {
        emap = new HashMap();

        //inserting Some Electronic Items in the Map
        emap.put(ElectronicsType.TV,1000);
        emap.put(ElectronicsType.AC,2000);

    }

        public double costCalculation() {

        if(emap.containsKey(category))
        {
            price = emap.get(category);
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

    public ICategory getElectronicsType() {
        return category;
    }

    public void setElectronicsType(ElectronicsType electronicsType) {
        this.category = electronicsType;
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
