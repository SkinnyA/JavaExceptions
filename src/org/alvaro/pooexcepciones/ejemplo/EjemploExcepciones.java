package org.alvaro.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args){

        Calculadora calc = new Calculadora();

        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");

        try{
            double division2 = calc.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);

        }catch (FormatoNumException fne){
            System.out.println("Se detecto una excepcion. Ingrese un numero valido: " + fne.getMessage());
            fne.printStackTrace(System.out); //Se imprime en la consola
        }
        catch (DivisionPorCeroException ex){
            System.out.println("Capturamos la excepcion " + ex.getMessage());
            main(args);
        }finally {
            System.out.println("Es opcional pero se ejecuta siempre");
        }

        System.out.println("Seguimos con el flujo de la app");


    }
}
