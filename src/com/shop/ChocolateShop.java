package com.shop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChocolateShop {

    public static void ReadInput() {
        String csvFile = "C:\\Users\\malavika murali\\IdeaProjects\\com.shop.ChocolateShop\\input\\orders.csv";
        String line;
        String cvsSplitBy = ",";
        String[] input;

        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            br.readLine();
            while ((line = br.readLine()) != null) {
                if(line.trim().length() > 0) {
                    Order order =new Order();
                    input = trimInputs(line.split(cvsSplitBy));

                    order.setCash(Integer.parseInt(input[0]));
                    order.setPrice(Integer.parseInt(input[1]));
                    order.setWrappersNeeded(Integer.parseInt(input[2]));
                    order.setType(input[3].toLowerCase().replace("\'", ""));;
                    order.chocoNo=(divideAndRoundDown(order.getCash(),order.getPrice()));


                    //System.out.println("Cash=" + input[0] + " , price=" + input[1] +  " , wrappers needed=" + input[2] + " , type=" + input[3] );
                    //GenerateOutputFile(input);

                    DecideOffer(order);

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void DecideOffer(Order order) {

        order.wrappersRemaining=order.chocoNo;
        if(order.wrappersRemaining>order.getWrappersNeeded()){
            calculateTotalChocolate(order);
        }

        switch (order.getType()) {
            case "milk":
                order.setMilkChocoNo(order.chocoNo);
                order.setSugarFreeNo(order.freeChocolate);
                break;

            case "white":
                //whiteChoco = chocoNo + freeChocolate;
                //sugarFree = sugarFree + freeChocolate;
                break;

            case "sugar free":

                //sugarFree = calculateTotalChocolate(chocoNo, wrappersNeeded, freeChocolate,wrappersRemaining, chocoNo);
                //darkChoco = calculateTotalChocolate(chocoNo, wrappersNeeded, freeChocolate,wrappersRemaining, chocoNo);

                break;

            case "dark":
                //darkChoco=chocoNo + freeChocolate;
                break;
        }

    }

    private static String[] trimInputs(String[] input) {
        for (int i=0; i<input.length;i++)
        {
            input[i]= input[i].trim();
        }
        return input;
    }

    private static int divideAndRoundDown(int dividend, int divisor) {

        return (dividend/divisor)-((dividend/divisor)%1);
    }

    public static void GenerateOutputFile(String[] input) {
        String redemption;
        redemption = ("Output: milk " + input[0] + " , dark " + input[1] + " , white " + input[2] + " , sugar free " + input[3]);
        System.out.println(redemption);
    }

    public static Order calculateTotalChocolate(Order order) {
        order.wrappersRemaining=order.wrappersRemaining%order.getWrappersNeeded();
        order.chocoNo+=divideAndRoundDown(order.wrappersRemaining,order.getWrappersNeeded());
        order.freeChocolate+=divideAndRoundDown(order.wrappersRemaining,order.getWrappersNeeded());
        order.wrappersRemaining=+order.freeChocolate;
        if(order.wrappersRemaining>=order.getWrappersNeeded()){
            calculateTotalChocolate(order);
        }return order;

//return ("Milk " + order.getMilkChocoNo() + " Dark " + order.getDarkChocoNo() + " White " + order.getWhiteChocoNo() + "Sugar Free " + order.getSugarFreeNo());
    }
}
    /*
    public static int calculateTotalChocolate(int wrappersNo, int wrappersNeeded,  int freeChocolate, int remainingWrappers, int totalChocolates){
          if (wrappersNeeded>0){
            freeChocolate=divideAndRoundDown(wrappersNo,wrappersNeeded);
        }
        remainingWrappers= wrappersNo%wrappersNeeded;
        totalChocolates = freeChocolate+totalChocolates;
        wrappersNo=freeChocolate+remainingWrappers;
        if (wrappersNo>=wrappersNeeded){

            totalChocolates=calculateTotalChocolate(wrappersNo, wrappersNeeded, freeChocolate,remainingWrappers, totalChocolates);
        }

        return totalChocolates;
    }
 */


/*


        int freeChocolate =0;

        int chocoNo=divideAndRoundDown(cash, price);

        int wrappersRemaining= 0;
*/




     /*   */
