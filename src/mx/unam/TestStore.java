/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.unam;

import java.util.Scanner;

/**
 *
 * @author Hugo Fernandez Avila
 */
public class TestStore {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("Que prefieres");
        
        System.out.println("1) Computadora HewlettPackard");
        System.out.println("2) Computadora Dell");
        System.out.println("3) Computadora Asus");
        System.out.println("4) Smarphone Samsung");
        System.out.println("5) Smarphone Xiaomi");
        System.out.println("6) Smarphone Apple");
        System.out.println("7) Tablet Huawei");
        System.out.println("8) Tablet Samsung");
        System.out.println("9) Tablet Apple");
        
        try{
            System.out.println("Elige la el numero de la opcion de tu preferencia");
            eleccion =  teclado.nextInt(); 
        }catch (Exception e ){
            System.out.println("No elegiste ninguna de las opciones");
        }
        switch (eleccion) {
            case 1:
                Computadora c = new Computadora("HewlettPackard", true, true, true);
                System.out.println(c);
                break;
            case 2:
                Computadora co = new Computadora("Dell", true, true, true);
                System.out.println(co);
                break;
            case 3:
                Computadora com = new Computadora("Asus", true, true, true);
                System.out.println(com);
                break;
            case 4:
                Smarphone s = new Smarphone("Samsung", true, true, true);
                System.out.println(s);
                break;
            case 5:
                Smarphone sm = new Smarphone("Xiaomi", true, true, true);
                System.out.println(sm);
                break;
            case 6:
                Smarphone sma = new Smarphone("Apple", true, true, true);
                System.out.println(sma);
                break;
            case 7:
                Tablet t = new Tablet("Huawei", true, true, true);
                System.out.println(t);
                break;
            case 8:
                Tablet ta = new Tablet("Samsung", true, true, true);
                System.out.println(ta);
                break;
            case 9:
                Tablet tab = new Tablet("Apple", true, true, true);
                System.out.println(tab);
                break;
                
                
                
            default:
                throw new AssertionError();
        }

    
    }
    
}
