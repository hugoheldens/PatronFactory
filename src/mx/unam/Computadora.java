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
public class Computadora implements Store{
    String MarcaComputadora;
    boolean HewlettPackard;
    boolean Dell;
    boolean Asus;

    public Computadora() {
    }

    public Computadora(String MarcaComputadora, boolean HewlettPackard, boolean Dell, boolean Asus) {
        this.MarcaComputadora = MarcaComputadora;
        this.HewlettPackard = HewlettPackard;
        this.Dell = Dell;
        this.Asus = Asus;
    }

    public String getMarcaComputadora() {
        return MarcaComputadora;
    }

    public void setMarcaComputadora(String MarcaComputadora) {
        this.MarcaComputadora = MarcaComputadora;
    }

    public boolean isHewlettPackard() {
        return HewlettPackard;
    }

    public void setHewlettPackard(boolean HewlettPackard) {
        this.HewlettPackard = HewlettPackard;
    }

    public boolean isDell() {
        return Dell;
    }

    public void setDell(boolean Dell) {
        this.Dell = Dell;
    }

    public boolean isAsus() {
        return Asus;
    }

    public void setAsus(boolean Asus) {
        this.Asus = Asus;
    }

    @Override
    public String toString() {
        return "Computadora{" + "MarcaComputadora=" + MarcaComputadora + ", HewlettPackard=" + HewlettPackard + ", Dell=" + Dell + ", Asus=" + Asus + '}';
    }
    
    
}
