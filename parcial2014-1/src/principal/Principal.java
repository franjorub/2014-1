/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.lang.reflect.Array;
import java.util.Stack;

/**
 *
 * @author francisco
 * parcial 2014-1 programacion 2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal p = new Principal();
        p.Ejercicio1();
		System.out.println("hola");
    }

    public void Ejercicio1() {
        int D = 7;
        int numero_del_usuario = 507;
        String resultado = "";
        Stack<Integer> numero_base = new Stack<>();
        int mayor = -99999;
        String numero_de_la_suerte = "";
        for (int base = 2; base <= 9; base++) {
            int copia_de_numero = numero_del_usuario;
            int cuenta__los_numeros_d = 0;
            while (copia_de_numero >= base) {
                numero_base.push(copia_de_numero % base);
                copia_de_numero /= base;
            }
            numero_base.push(copia_de_numero % base);
            //numero_base.push((int) copia_de_numero / base);
            while (!numero_base.empty()) {
                resultado += numero_base.pop();
            }
            for (int i = 0; i < resultado.length(); i++) {
                if ((int) resultado.charAt(i) - 48 == D) {
                    cuenta__los_numeros_d++;
                }
            }
            if (cuenta__los_numeros_d > mayor) {
                mayor = cuenta__los_numeros_d;
                numero_de_la_suerte = resultado;
            }
            System.out.println("con base " + base + " resultado: " + resultado);
            resultado = "";
        }
        System.out.println("---------------------------");
        System.out.println("el numero de la suerte es: " + numero_de_la_suerte);

    }
}
