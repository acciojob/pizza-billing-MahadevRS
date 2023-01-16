package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price=300;
        else this.price=400;

        if(isVeg) this.bill="Base Price Of The Pizza: 300\n";
                else this.bill="Base Price Of The Pizza: 400\n";
                billvalue=this.price;
    }

    int billvalue=this.price;
    boolean calledcheese=false;
    boolean calledtoppings=false;
    boolean calledtakeaway=false;
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        calledcheese=true;
    }

    public void addExtraToppings(){
        // your code goes here


        calledtoppings=true;
    }

    public void addTakeaway(){
        // your code goes here


        calledtakeaway=true;
    }

    public String getBill(){
        // your code goes here
        if(calledcheese) {
            bill+="Extra Cheese Added: 80\n";
            billvalue+=80;
        }
        if(calledtoppings && isVeg) {
            bill+="Extra Toppings Added: 70\n";
            billvalue+=70;
        }
        if(calledtoppings && !isVeg) {
            bill+="Extra Toppings Added: 120\n";
            billvalue+=120;
        }
        if(calledtakeaway) {
            bill+="Paperbag Added: 20\n";
            billvalue+=20;
        }
        bill+="Total Price: ";
        bill+=Integer.toString(billvalue);
        return this.bill;
    }
}
