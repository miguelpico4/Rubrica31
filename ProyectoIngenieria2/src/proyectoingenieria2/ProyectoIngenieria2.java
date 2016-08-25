/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoingenieria2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ProyectoIngenieria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int opciones=0;
       
        System.out.println("escoja operacion a realizar");
        System.out.println("digite 1 si desea una suma");
        System.out.println("digite 2 si desea una resta");
        System.out.println("digite 3 si desea una multiplicacion");
        System.out.println("digite 4 si desea una division");
        System.out.println("Ingrese opcion");
        opciones=sc.nextInt();
        if (opciones==1){
            Operaciones objeto= new Operaciones();
            objeto.Operacionsuma();
            System.out.println("el resultado es"+objeto.Operacionsuma());
        }
        if (opciones==2){
            Operaciones objeto= new Operaciones();
            objeto.Operacionresta();
            System.out.println("el resultado es"+objeto.Operacionresta());
        }
        if (opciones==3){
            Operaciones objeto= new Operaciones();
            objeto.Operacionmultiplicacion();
            System.out.println("el resultado es"+objeto.Operacionmultiplicacion());
        }
        if (opciones==4){
            Operaciones objeto= new Operaciones();
            objeto.Operaciondivision();
            System.out.println("el resultado es"+objeto.Operaciondivision());
        }
    }
    
}
