import java.util.Scanner;

public class LocatePrime {
	public static void main(String arg[]) {

        System.out.println("Let's Locate Some Primes!");
        System.out.println("The application will find you any prime, in order, from first prime number on\n");
        char ch;
        
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Which prime no are you looking for?");
            int i = 1;
            
            int j = 2;
            int prime = 0;
            int primePos = input.nextInt();
            while (i <= primePos) {
                boolean isPrime = true;
                for (int k = 2; k < j; k++) {
                    if (j % k == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime) {
                    i++;
                    prime = j;
                }
                j++;
            }

            System.out.println("The number " + primePos + " prime is " + prime);
            System.out.print("\nDo you want to find another prime number?(y/n):");
            ch = input.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}



