package Tugas_1;

import java.util.LinkedList;

public class Chairul_Alfani {

	public static void main(String[] args) {
		
	//soal nomor 1
	float StrukturBaris;
	StrukturBaris=3.5f;
	System.out.println("=====Soal Nomor 1=====");
	System.out.println("Struktur Baris = "+StrukturBaris);
	System.out.println("\n");
	//soal nomor 2
	String SusunanKataBaru;
	SusunanKataBaru="Pemrograman Struktur Data Java";
	System.out.println("=====Soal Nomor 2=====");
	System.out.println("Susunan Kata Baru"+SusunanKataBaru);
	System.out.println("\n");
	//soal nomor 3
	int[] DelapanAngka = new int[8];
	DelapanAngka[0]=10;
	DelapanAngka[1]=12;
	DelapanAngka[2]=18;
	DelapanAngka[3]=23;
	DelapanAngka[4]=33;
	DelapanAngka[5]=58;
	DelapanAngka[6]=67;
	DelapanAngka[7]=82;
	System.out.println("=====Soal Nomor 3=====");
	System.out.println("Delapan Angka = ");
		for(int i=0; i<DelapanAngka.length; i++) {
		System.out.print(DelapanAngka[i]+"\t");
		}
	System.out.println();
	System.out.println("\n");
	//soal nomor 4
	String[][] DuaAngka= {
			{"2", "4", "6"},
			{"8", "10", "12"},
			{"14", "16", "18"},
	};
	System.out.println("=====Soal Nomor 4=====");
	System.out.println("Dua Angka = ");
		for(int x=0; x<DuaAngka.length; x++) {
			for(int y=0; y<DuaAngka.length; y++) {
				System.out.print(DuaAngka[x][y]+"\t");
			}
		System.out.println();
		}
	System.out.println("\n");
	//soal nomor 5
	LinkedList<String> UrutanListAngka = new LinkedList<>();
	UrutanListAngka.add("15");
	UrutanListAngka.add("26");
	UrutanListAngka.add("33");
	UrutanListAngka.add("47");
	UrutanListAngka.add("59");
	System.out.println("=====Soal Nomor 5=====");
	System.out.println("Linked List = "+UrutanListAngka);
	
	
	}
}
