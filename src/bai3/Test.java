package bai3;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int maSV;
	String tenSV;
	double diemLT;
	double diemTH;
	System.out.println("nhập mã sinh viên: ");
	maSV = sc.nextInt();
	System.out.println("nhập tên sinh viên : ");
	tenSV = sc.next();
	System.out.println("nhập diểm lý thuyết : ");
	diemLT = sc.nextDouble();
	System.out.println("nhập điểm thực hành : ");
	diemTH = sc.nextDouble();
    SinhVien sv3 = new SinhVien(maSV, tenSV, diemLT, diemTH);
    System.out.printf("|%-10s|%-10s|%5s|%5s|%5s|", "MaSV", "TenSV", "DiemLT", "DiemTH", "DiemTB");
    System.out.println();
    for(int i=0;i<43;i++) {
    	System.out.print("-");
    }
    System.out.println();
	SinhVien sv1 = new SinhVien(21052841, "Lộc", 2, 3);
    SinhVien sv2 = new SinhVien(21052941, "Tâm", 3, 4);
    System.out.println(sv1);
    System.out.println(sv2);
    System.out.println(sv3);
    
	
}

}
