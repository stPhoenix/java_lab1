import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[args.length];
        int counter = 0;
        for (String s:args)
        {
            int n = Integer.parseInt(s);
            if(isSimple(n)){
                numbers[counter] = n;
                counter++;
            }
        }
        int[] temp = new int[counter];
        counter = 0;
        for (int i: numbers)
        {
            if (i != 0)
            {
                temp[counter] = i;
                counter++;
            }
        }
        numbers = temp;

        System.out.println("Simple numbers: "+Arrays.toString(numbers));

    }

    public static boolean isSimple(int n){
        for (int i=2; i<256; i++)
        {
            if (i == n){
                return true;
            }
            if (n%i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
