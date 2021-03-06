package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class BeveragesTest {
    @Test
    public void dispense_returns_you_have_selected_message_given_valid_slotID_1() {
        // Arrange
        Beverages myBeverages = new Beverages();
        String message = "You have selected: null $0.00";
        // Act
        String dispense = myBeverages.dispense("C1");
        // Assert
        Assert.assertEquals(message, dispense);
    }

    @Test
    public void dispense_returns_this_item_is_sold_out_message_given_maxCapacity_is_0() {
        // Arrange
        Beverages myBeverages = new Beverages();
        String message = "This Item is Sold Out.";
        myBeverages.setMaxCapacity(0);
        // Act
        String dispense = myBeverages.dispense("C1");
        // Assert
        Assert.assertEquals(message, dispense);
    }

    @Test
    public void dispense_prints_soundMessage() {
        // Arrange
        Beverages myBeverages = new Beverages();
        String mySoundMessage = myBeverages.getSoundMessage();
        String expected = "Glugg, Glugg, Yum!";
        // Act
        String dispense = myBeverages.dispense("C1");
        // Assert
        Assert.assertEquals(expected, mySoundMessage);
    }

}
