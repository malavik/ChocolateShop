import static org.junit.Assert.*;

public class ChocolateShopTest {
    @org.junit.Test
    public void test_read_input_file() {
        ChocolateShop.ReadInput();
    }


    String input[]=new String[]{"6","2","2", "sugar free"};
    @org.junit.Test
    public void generate_output() {
        System.out.println("Cash=" + input[0] + " , price=" + input[1] +  " , wrappers needed=" + input[2] + " , type=" + input[3] );
        ChocolateShop.GenerateOutput(input);
    }

}