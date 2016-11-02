package core;

import Types.CarpetType;
import Types.ICategory;

import java.util.HashMap;
import java.util.Map;


public class Carpet extends Category {

    public double cost;
    private Map<CarpetType,Double> cmap;
    private double price;
    public ICategory category;
    public float quantity;


    public Carpet() {
        init();
    }

    private void init()
    {
        cmap = new HashMap();

        //Inserting Some Carpet Types in the Map
        cmap.put(CarpetType.Squared,1.04);
        cmap.put(CarpetType.Circle,1.02);
    }

    public ICategory getCarpettype() {
        return category;
    }

    public void setCarpettype(CarpetType carpettype) {
        this.category = carpettype;
    }

    public double costCalculation() {

        if(cmap.containsKey(category))
        {
            price = cmap.get(category);
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
