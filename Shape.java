package Tugas2;

import Tugas2.Circle;

/**
 * Created by USER on 3/7/2017.
 */
public class Shape {
    public static void main(String[]args){
        Circle a = new Circle();
        Circle b = new Circle();
        a.setName("Lingkaran");
        a.setJari(10);
        a.AreaC();
        System.out.println("Luas Lingkaran dari Jari-jari : "+a.getJari());
        System.out.println("adalah "+a.getLuas());
        System.out.println("");
        b.setName("Square");
        b.setLebar(18);
        b.setPanjang(20);
        b.AreaS();
        System.out.println("Luas Persegi panjang dari lebar : "+b.getLebar()+" dan Panjang : "+b.getPanjang());
        System.out.println("adalah "+b.getLuas());
    }
}
