package Tugas2;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by USER on 3/7/2017.
 */
public class Circle {
    private String Name;
    private double Jari;
    private double Lebar;
    private double Panjang;
    private double Luas;

    public Circle(){

    }
    public Circle(String Name,double Jari,double Panjang, double Lebar){
        this.Name = Name;
        this.Jari = Jari;
       this.Luas = Luas;
       this.Lebar = Lebar;
       this.Panjang = Panjang;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }
    public void setJari(double Jari)
    {
        this.Jari = Jari;
    }
    public void setLuas(double Luas)
    {
    this.Luas = Luas;
    }
    public void setLebar(double Lebar){
        this.Lebar = Lebar;
    }
    public void setPanjang(double Panjang){
        this.Panjang = Panjang;
    }
    public String getName(){
        return Name;
    }
    public double getJari(){
        return Jari;
    }
    public double getLuas(){
        return Luas;
    }
    public double getPanjang(){
        return Panjang;
    }
    public double getLebar(){
        return Lebar;
    }
    public void AreaC(){
        this.setLuas((this.getJari() * this.getJari())*3.14);
    }
    public void AreaS(){
        this.setLuas(this.getLebar() * this.getPanjang());
    }


}
