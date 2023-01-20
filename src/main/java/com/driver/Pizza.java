package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    private boolean calledcheese;
    private boolean calledtoppings;
    private boolean calledtakeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price=300;
        else this.price=400;
        cheese=80;
        if(isVeg) toppings=70;
        else toppings=120;
        calledcheese=false;
        calledtoppings=false;
        calledtakeaway=false;

        if(isVeg) this.bill="Base Price Of The Pizza: 300\n";
                else this.bill="Base Price Of The Pizza: 400\n";

    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!calledcheese){
            this.price+=cheese;
        }
        calledcheese=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!calledtoppings){
            this.price+=toppings;
        }


        calledtoppings=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!calledtakeaway){
            this.price+=20;
        }
        calledtakeaway=true;
    }

    public String getBill(){
        // your code goes here
        if(calledcheese) {
            bill+="Extra Cheese Added: 80"+"\n";
        }
        if(calledtoppings && isVeg) {
            bill+="Extra Toppings Added: 70\n";
        }
        if(calledtoppings && !isVeg) {
            bill+="Extra Toppings Added: 120\n";
        }
        if(calledtakeaway) {
            bill+="Paperbag Added: 20\n";
        }
        bill+="Total Price: ";
        bill+=Integer.toString(price);
        return this.bill;
    }
}
