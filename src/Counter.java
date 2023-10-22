import java.util.Scanner;


public class Counter {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        int firstParam = 0;
        int secondParam = 0;

        System.out.println("Enter the first param: ");
        firstParam = terminal.nextInt();
        System.out.println("Enter the second param: ");
        secondParam = terminal.nextInt();

        try{
            count(firstParam, secondParam);
        } catch(InvalidParamsException e){
            System.out.println(e);
        }

    }

    static void count(int firstParam, int secondParam) throws InvalidParamsException{
        if(firstParam > secondParam){
            throw new InvalidParamsException();
        } else {
            int count = secondParam - firstParam;
            for (int i = 1; i <= count; i++) {
                System.out.println("Printing the number: " + i);
            }
        }
    }
}
