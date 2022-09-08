
package atv4;

import java.util.Scanner;

import atv4.Imposto.Imposto;
import atv4.Imposto.Comercial.ICMS;
import atv4.Imposto.Comercial.IPI;
import atv4.Imposto.Social.Cofins;
import atv4.Imposto.Social.PIS;

/**
 *
 * @author kelvi
 */
public class Atv4 {
    // It's a constant that defines the maximum number of inputs that the user can
    // do.
    static Scanner input = new Scanner(System.in);

    // It's a constant that defines the maximum number of inputs that the user can
    // do.
    static final int MAX_INPUTS = 10;

    /**
     * It's a function that asks the user to choose a type of employee to register,
     * and returns the option
     * chosen
     * 
     * @return The option that the user has chosen.
     */
    public static int optionsMenu() {
        int option;
        while (true) {

            System.out.println("Escolha um tipo de imposto para registrar:");
            System.out.print("\n1 - PIS");
            System.out.print("\n2 - Cofins");
            System.out.print("\n3 - ICMS");
            System.out.print("\n4 - IPI");
            System.out.print("\n5 - Parar/Sair\n==> ");
            option = Integer.parseInt(input.nextLine());

            if (option >= 1 && option <= 5)
                break;
        }
        return option;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i < MAX_INPUTS; i++) {
            int option = optionsMenu();

            switch (option) {
                case 1:
                    Imposto.addImposto(new PIS());
                    break;
                case 2:
                    Imposto.addImposto(new Cofins());
                    break;
                case 3:
                    Imposto.addImposto(new ICMS());
                    break;
                case 4:
                    Imposto.addImposto(new IPI());
                    break;
                case 5:
                    break;
            }
            if (option == 5)
                break;
        }

        Imposto.printImpostos();
       

    }

}
