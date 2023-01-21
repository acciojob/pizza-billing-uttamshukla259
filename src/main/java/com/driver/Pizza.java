package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;
    private int cheese;
    boolean isExtraCheeseAdded;
    boolean isextraToppingAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;
    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.isExtraCheeseAdded = false;
        this.isextraToppingAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;
        this.bill = "";
        if (isVeg) {
            this.price = 300;

            this.topping = 70;
        }
        else {
            this.price = 400;
            this.topping = 120;
        }
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";
        this.cheese = 80;
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price = this.price + cheese;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isextraToppingAdded){
            this.price = this.price + topping;
            isextraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price += 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isExtraCheeseAdded)
                this.bill += "Extra Cheese Added: " + this.cheese +"\n";
            if(isextraToppingAdded)
                this.bill += "Extra Toppings Added: " + this.topping + "\n";
            if(isTakeAwayAdded)
                this.bill += "Paperbag Added: " + "20" + "\n";
            this.bill += "Total Price: " + this.price +"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
