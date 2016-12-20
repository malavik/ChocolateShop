import static org.junit.Assert.*;

public class ChocolateShopTest {
    @org.junit.Test
    public void test_read_input_file() {
        ChocolateShop.ReadInput();
    }



    @org.junit.Test
    public void generate_output() {
        String input[]=new String[]{"6","2","2", "sugar free"};
        System.out.println("Cash=" + input[0] + " , price=" + input[1] +  " , wrappers needed=" + input[2] + " , type=" + input[3] );
        ChocolateShop.GenerateOutput(input);
    }

    @org.junit.Test
    //public static int calculateFreeChocolate(int wrappersNo, int wrappersNeeded)
    public void calculateTotalChocolateTest() {
        int wrappersNo = 2;
        int wrappersNeeded = 2;
        int freeChocolate = 0;
        int remainingWrappers =0 ;
        int totalChocolates = wrappersNo;
        System.out.println("TotalChocolate = " + ChocolateShop.calculateTotalChocolate( wrappersNo, wrappersNeeded, freeChocolate,remainingWrappers, totalChocolates));
    }
}