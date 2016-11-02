package core;

import Types.ICategory;

/**
 * Created by vinaykumar on 25/10/16.
 */

public class Category
{

    public ICategory category;
    public float quantity;
    public double cost;
    public double price;

    public double costCalculation(){
        return cost;
    }

    public double getCost(){
        return cost;
    }

    public double getPrice(){
        return  price;
    }

    public ICategory getCategory(){
        return category;
    }

    public void setCategory(ICategory category){
        this.category = category;
    }

    public float getQuantity(){
        return quantity;
    }

    public void setQuantity(float quantity){
        this.quantity = quantity;
    }
}
