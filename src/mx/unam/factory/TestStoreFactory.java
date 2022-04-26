/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.unam.factory;

import java.util.Scanner;

/**
 *
 * @author Hugo Fernandez Avila
 */
public class TestStoreFactory {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;

        System.out.println("Que prefieres");
        System.out.println(Store.COM_HPA+") Computadora HewlettPackard");
        System.out.println(Store.COM_DEL+") Computadora Dell");
        System.out.println(Store.COM_ASU+") Computadora Asus");
        System.out.println(Store.SMA_SAM+") Smarphone Samsung");
        System.out.println(Store.SMA_XIA+") Smarphone Xiaomi");
        System.out.println(Store.SMA_APP+") Smarphone Apple");
        System.out.println(Store.TAB_HUA+") Tablet Huawei");
        System.out.println(Store.TAB_SAM+") Tablet Samsung");
        System.out.println(Store.TAB_APP+") Tablet Apple");

        try {
            System.out.println("Elige la el numero de la opcion de tu preferencia");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No elegiste ninguna de las opciones");
        }
        Store s = StoreFactory.createStore(eleccion);
        System.out.println(s.toString());
        
        
    }
}
