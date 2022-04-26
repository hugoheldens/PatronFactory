/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.unam;

import mx.unam.factory.Store;

/**
 *
 * @author Hugo Fernandez Avila
 */
public class Smarphone implements Store {
    String MarcaSmarphone;
    boolean Samsumg;
    boolean Xiaomi;
    boolean Apple;

    public Smarphone() {
    }

    public Smarphone(String MarcaSmarphone, boolean Samsumg, boolean Xiaomi, boolean Apple) {
        this.MarcaSmarphone = MarcaSmarphone;
        this.Samsumg = Samsumg;
        this.Xiaomi = Xiaomi;
        this.Apple = Apple;
    }

    public String getMarcaSmarphone() {
        return MarcaSmarphone;
    }

    public void setMarcaSmarphone(String MarcaSmarphone) {
        this.MarcaSmarphone = MarcaSmarphone;
    }

    public boolean isSamsumg() {
        return Samsumg;
    }

    public void setSamsumg(boolean Samsumg) {
        this.Samsumg = Samsumg;
    }

    public boolean isXiaomi() {
        return Xiaomi;
    }

    public void setXiaomi(boolean Xiaomi) {
        this.Xiaomi = Xiaomi;
    }

    public boolean isApple() {
        return Apple;
    }

    public void setApple(boolean Apple) {
        this.Apple = Apple;
    }

    @Override
    public String toString() {
        return "Smarphone{" + "MarcaSmarphone=" + MarcaSmarphone + ", Samsumg=" + Samsumg + ", Xiaomi=" + Xiaomi + ", Apple=" + Apple + '}';
    }
    
    
    
}
