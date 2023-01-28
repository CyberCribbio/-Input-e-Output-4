

import java.util.Scanner;

    public class PrintYourAge{
        public PrintYourAge() {
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Inserisci la tua età: ");
            int age = input.nextInt();
            System.out.printf("La tua età è di: %d", age);
            input.close();

        }
    }
