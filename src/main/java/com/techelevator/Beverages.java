package com.techelevator;

public class Beverages implements Items {
    private String soundMessage = "Glugg, Glugg, Yum!";
    private int maxCapacity = 5;
    private double price;
    private String slotID;
    private String name;
    private String type;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getSlotID() {
        return slotID;
    }

    @Override
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public String getType(){
        return type;
    }


    public String getSoundMessage() {
        return soundMessage;
    }

    public void setSoundMessage(String soundMessage) {
        this.soundMessage = soundMessage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSlotID(String slotID) {
        this.slotID = slotID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


    @Override
    public String dispense(String getSlotID) {
        String message = "";
        if (maxCapacity == 0) {
            message = message + "This Item is Sold Out.";
        } else {
            maxCapacity = (maxCapacity - 1);
            System.out.println(soundMessage);
            message = message + "You have selected: " + getName() + " $" + String.format("%.2f", getPrice());


        }
        return message;



    }

}
