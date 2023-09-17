package com.mycompany.membuat_program_kasir_warung_beras;

import java.util.Scanner;

public class Membuat_Program_Kasir_Warung_Beras {

     public static void main(String[] args) {
       
       // 1. Membuat ojek scanner untuk menerima input dari keyboard
         Scanner input = new Scanner(System.in);
         System.out.println("         KASIR WARUNG BERKAH 27     ");
         System.out.println("            WARUNG BERKAH 27        ");
         System.out.println("Jl.Rungkut Madya No.195, Surabaya, Jawa Timur");
         System.out.println("         No.Telp:088804960683       ");
         
       // 2. Mendeklarasikan variabel untuk menyimpan data
       double jumlahBeras, hargaSatuan, totalBiaya, biayaAkhir, diskon,
               uangBayar, uangKembali;
       
       // 3. Pemberian garis ke dalam Variabel 
         System.out.println("----------------------------------------------------------------------");
       
       // 4. Memasukan data jumlah beras yang dibeli (dalam kg), harga satuan per kg, dan Diskon 5%
          System.out.println("Masukan jumlah beras yang dibeli dalam (kg) = ");
          jumlahBeras = input.nextDouble();
          System.out.println("Harga satuan per(kg): ");
          hargaSatuan = input.nextDouble();
        
       // 5. Menghitung total biaya yang harus dibayar oleh pembeli
          totalBiaya = jumlahBeras * hargaSatuan;
          System.out.println("Total biaya yang harus dibayar = Rp" + totalBiaya);
          
       // 6. Menghitung biaya akhir setelah diberikan potongan diskon 5%
          diskon = 0.05 * totalBiaya;
          biayaAkhir = totalBiaya - diskon;
          System.out.println("Biaya akhir setelah diberikan potongan diskon 5% = Rp" + biayaAkhir);
          
       // 7. Memasukan jumlah uang yang diberikan oleh pembeli
          System.out.println("Masukan jumlah uang yang diterima oleh kasir = Rp");
          uangBayar = input.nextDouble();
          
       // 8. Menghitung uang kembalian dan menampilkannya di layar output
          uangKembali = uangBayar - biayaAkhir;
          
          System.out.println("-----------------------------------------------------------------------");
          System.out.println("TOTAl:Rp." +  totalBiaya );
          System.out.println("TUNAI:Rp." + uangBayar);
          System.out.println("DISKON:Rp." + diskon);
          System.out.println("KEMBALI:Rp."+ uangKembali);
          
          
          System.out.println("-----------------------------------------------------------------------");
          System.out.println("            WARUNG BERKAH 27             ");
          System.out.println("   TERIMAKASIH,SILAHKAN DATANG KEMBALI    ");
           
          
          input.close();
      
          
          
      
    }
}s