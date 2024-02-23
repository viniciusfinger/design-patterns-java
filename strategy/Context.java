import java.io.*;

public class Context {
    public static void main(String args[]) throws Exception {
        String input = readInput();
        CoffeeMakerActions action = CoffeeMakerActions.findByName(input);
        
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        
        coffeeMaker.handleAction(action);
    }
    
    private static String readInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}