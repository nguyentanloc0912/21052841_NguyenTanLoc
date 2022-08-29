package bai3;

public class SinhVien {
private int maSV;
private String tenSV;
private double diemLT;
private double diemTH;
public SinhVien() {
	maSV = 0;
	tenSV = "";
	diemLT = 0;
	diemTH = 0;
}
public SinhVien(int maSV, String tenSV, double diemLT, double diemTH) {
	this.maSV = maSV<0?0:maSV;
	this.tenSV = tenSV.equals("")?"@":tenSV;
	this.diemLT = (diemLT<0 || diemLT>10)?0:diemLT;
	this.diemTH = (diemTH<0 || diemTH>10)?0:diemTH;
}
public int getMaSV() {
	return maSV;
}
public void setMaSV(int maSV) {
	this.maSV = maSV<0?0:maSV;
}
public String getTenSV() {
	return tenSV;
}
public void setTenSV(String tenSV) {
	this.tenSV = tenSV.equals("")?"@":tenSV;
}
public double getDiemLT() {
	return diemLT;
}
public void setDiemLT(double diemLT) {
	this.diemLT = (diemLT<0 || diemLT>10)?0:diemLT;
}
public double getDiemTH() {
	return diemTH;
}
public void setDiemTH(double diemTH) {
	this.diemTH = (diemTH<0 || diemTH>10)?0:diemTH;
}
public double diemTrungBinh() {
	return (diemLT+diemTH)/2;
}
public String toString() {
	String s;
	s = "";
	s+=s.format("|%-10d|%-10s|%5.2f|%5.2f|%5.2f|", getMaSV(), getTenSV(), getDiemLT(), getDiemTH(), diemTrungBinh());
	return s;
}
}
