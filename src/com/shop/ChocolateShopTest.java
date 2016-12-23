package com.shop;

public class ChocolateShopTest {
    @org.junit.Test
    public void test_read_input_file() {
        ChocolateShop.ReadInput();
    }

    @org.junit.Test

    public void calculateTotalChocolateTest() {
    Order testorder = new Order();
    testorder.setCash(6);
    testorder.setPrice(2);
    testorder.setWrappersNeeded(2);
    testorder.setType("sugar free");

        Order testoutput = new Order();
        testoutput= ChocolateShop.calculateTotalChocolate(testorder);
        //System.out.println(testoutput);

        //System.out.println("TotalChocolate = " + com.shop.ChocolateShop.calculateTotalChocolate( wrappersNo, wrappersNeeded, freeChocolate,remainingWrappers, totalChocolates));
    }

    @org.junit.Test
    public void test_generate_output_file() {
        String input[]=new String[]{"6","2","2", "sugar free"};
        System.out.println("Input- Cash=" + input[0] + " , price=" + input[1] +  " , wrappers needed=" + input[2] + " , type=" + input[3] );
        ChocolateShop.GenerateOutputFile(input);
    }

}