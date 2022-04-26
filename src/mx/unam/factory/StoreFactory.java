/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.unam.factory;

import mx.unam.Computadora;
import mx.unam.Smarphone;
import mx.unam.Tablet;

/**
 *
 * @author Hugo Fernandez Avila
 */
public class StoreFactory {
    public static Store createStore(int tipo){
        switch (tipo) {
            case Store.COM_HPA:
                    return new Computadora("Computadora HewlettPackard", false, true, false);
                
            case Store.COM_DEL:
                    return new Computadora("Computadora Dell", false, true, false);
                
            case Store.COM_ASU:
                    return new Computadora("Computadora Asus", false, true, false);
                
            case Store.SMA_APP:
                    return new Smarphone("Smarphone Apple", false, true, false);
                
            case Store.SMA_SAM:
                    return new Smarphone("Smarphone Samsung", false, true, false);
                
            case Store.SMA_XIA:
                    return new Smarphone("Smarphone Xiaomi", false, true, false);
                
            case Store.TAB_APP:
                    return new Tablet("Tableta Apple", false, true, false);
                
            case Store.TAB_HUA:
                    return new Tablet("Tableta Huawei", true, false, false);
                
            case Store.TAB_SAM:
                    return new Tablet("Tableta Samsung", false, true, false);
                
                
           
            default:
                throw new AssertionError();
        }
    }
    
}
