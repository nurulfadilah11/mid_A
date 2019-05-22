/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid_a2;

import java.util.Scanner;

/**
 *
 * @author nurul
 */
public class Mid_A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    String nama;
    int nilaipraktikum,nteori,ntugas1,ntugas2,ntugas3;
    double npraktikumakhir,nteoriakhir,ntugasakhir,nakhir;
    System.out.print("masukkan nama:");
    nama=input.next();
    System.out.print("nilai praktikum:");
    nilaipraktikum=input.nextInt();
    System.out.print("nilai teori: ");
    nteori=input.nextInt();
    System.out.print("nilai tugas1: ");
    ntugas1=input.nextInt();
    System.out.print("nilai tugas2: ");
    ntugas2=input.nextInt();
    System.out.print("nilai tugas3: ");
    ntugas3=input.nextInt();
    
    npraktikumakhir=(int)nilaipraktikum*0.4;
    nteoriakhir=(int)nteori*0.4;
    ntugasakhir=(int)((ntugas1+ntugas2+ntugas3)/3)*0.2;
    
    nakhir=(int)npraktikumakhir+nteoriakhir+ntugasakhir;
    
    System.out.println("nama:"+nama);
    System.out.println("nilai praktikum"+nilaipraktikum);
    System.out.println("nilai teori"+nteori);
    System.out.println("nilai tugas1"+ntugas1);
    System.out.println("nilai tugas2"+ntugas2);
    System.out.println("nilai tugas3"+ntugas3);
    System.out.println("nilai praktikum akhir"+npraktikumakhir);
    System.out.println("nilai teori akhir"+nteoriakhir);
    System.out.println("nilai tugas akhir"+ntugasakhir);
    System.out.println("nilai akhir"+nakhir);
    
    }
    
}
