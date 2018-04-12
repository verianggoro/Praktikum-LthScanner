/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.lth.scanner;
import java.util.Scanner;


/**
 *
 * @author veri
 */
public class LthScanner1 {
    public static void main(String args[]){
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Masukan Panjang Persegi : ");
        String panjangA = bacaInput.nextLine();
        int panjang = Integer.parseInt(panjangA);
        System.out.print("Masukan Lebar persegi : ");
        String lebarA = bacaInput.nextLine();
        int lebar = Integer.parseInt(lebarA);
        int hasilLuas = panjang * lebar;
        int hasilKeliling = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang " +hasilLuas);
        System.out.println("Keliling Persegi Panjang " +hasilKeliling);
        
        
    }
}
