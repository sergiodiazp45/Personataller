
package primerejemplo;

import java.util.Scanner;

public class PrimerEjemplo {

    public static void main(String[] args) {
      Persona pe = new Persona();

        Scanner sc = new Scanner(System.in);
        int respuesta;
        System.out.println(" DESEA CREAR UNA PERSONA?\n 1.SI\n 2.NO");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            System.out.println(pe.adnombre);
            String nombre = sc.nextLine();
            pe.adnombre = nombre;


        } else {
            System.out.println(" NECESITA CREAR UNA PERSONA PARA CONTINUAR ");
            main(args);
        }
        System.out.println(" DESEA QUE DIGA MI NOMBRE?\n 1.SI\n 2.NO");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            System.out.println(pe.denombre);
        }
        System.out.println("QUIERE ESCUCHARME HABLAR?\n 1.SI\n 2.NO");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            System.out.println(pe.hablar);
        }
        System.out.println("DESEA QUE VAYA A DORMIR?\n 1.SI\n 2.NO");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            System.out.println(pe.dormir);
        }
        System.out.println("QUIERE OIRME CONTAR?\n 1.SI\n 2.NO");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            System.out.println(pe.contar);
        }
    }
}
