import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChocolateShop {

    public static void ReadInput() {
        String csvFile = "/home/dev/github/ChocolateShop/input/orders.csv";
        String line;
        String cvsSplitBy = ",";
        String[] input;
        String[] inputArray;

        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            br.readLine();
            while ((line = br.readLine()) != null) {
                if(line.trim().length() > 0) {
                    // split with a separator
                    input = trimInputs(line.split(cvsSplitBy));
                    System.out.println("Cash=" + input[0] + " , price=" + input[1] +  " , wrappers needed=" + input[2] + " , type=" + input[3] );
                    GenerateOutput(input);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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

    public static void GenerateOutput(String[] input) {

        String type = input[3].toLowerCase();
        type=type.replace("\'", "");
        int milkChoco=0;
        int sugarFree=0;
        int whiteChoco=0;
        int darkChoco=0;
        int freeChocolate =0;

        int cash = Integer.parseInt(input[0]);
        int price = Integer.parseInt(input[1]);

        int chocoNo=divideAndRoundDown(cash, price);

        int wrappersNeeded= Integer.parseInt(input[2]);
        if(wrappersNeeded>0){
            freeChocolate=divideAndRoundDown(chocoNo,wrappersNeeded);
        }

        String redemption;

        switch (type) {
            case "milk":
                milkChoco = chocoNo + freeChocolate;
                sugarFree = sugarFree + freeChocolate;
                break;

            case "white":
                whiteChoco = chocoNo + freeChocolate;
                sugarFree = sugarFree + freeChocolate;
                break;

            case "sugar free":
                sugarFree = chocoNo + freeChocolate;
                darkChoco = darkChoco + freeChocolate;
                break;

            case "dark":
                darkChoco=chocoNo + freeChocolate;
                break;
        }
        redemption =("milk " + milkChoco + " , dark " + darkChoco +  " , white " + whiteChoco + " , sugar free " + sugarFree );
        System.out.println(redemption);
    }
}

