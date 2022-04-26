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
public class Tablet implements Store{
    String MarcaTablet;
    boolean Huawei;
    boolean Samsung;
    boolean Apple;

    public Tablet() {
    }

    public Tablet(String MarcaTablet, boolean Huawei, boolean Samsung, boolean Apple) {
        this.MarcaTablet = MarcaTablet;
        this.Huawei = Huawei;
        this.Samsung = Samsung;
        this.Apple = Apple;
    }

    public String getMarcaTablet() {
        return MarcaTablet;
    }

    public void setMarcaTablet(String MarcaTablet) {
        this.MarcaTablet = MarcaTablet;
    }

    public boolean isHuawei() {
        return Huawei;
    }

    public void setHuawei(boolean Huawei) {
        this.Huawei = Huawei;
    }

    public boolean isSamsung() {
        return Samsung;
    }

    public void setSamsung(boolean Samsung) {
        this.Samsung = Samsung;
    }

    public boolean isApple() {
        return Apple;
    }

    public void setApple(boolean Apple) {
        this.Apple = Apple;
    }

    @Override
    public String toString() {
        return "Tablet{" + "MarcaTablet=" + MarcaTablet + ", Huawei=" + Huawei + ", Samsung=" + Samsung + ", Apple=" + Apple + '}';
    }
    
    
    
}
