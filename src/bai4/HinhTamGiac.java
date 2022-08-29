package bai4;

public class HinhTamGiac {
private double ma;
private double mb;
private double mc;
public HinhTamGiac() {
	super();
	// TODO Auto-generated constructor stub
}
public HinhTamGiac(double ma, double mb, double mc) {
	this.ma = ((ma>mb+mc || ma <0)?0:ma);
	this.mb = ((mb>ma+mc || mb <0)?0:mb);
	this.mc = ((mc>ma+mb || mc <0)?0:mc);
}
public double getMa() {
	return ma;
}
public void setMa(double ma) {
	if(ma>0 || (ma<mb+mc)) {
	this.ma = ma;}
}
public double getMb() {
	return mb;
}
public void setMb(double mb) {
	if(mb>0 || (mb<ma+mc)) {
	this.mb = mb;}
}
public double getMc() {
	return mc;
}
public void setMc(double mc) {
	if(mc>0 || (mc<ma+mb)) {
	this.mc = mc;}	
}
public double ChuVi () {
	return ma+mb+mc;
}
public double Tinhp() {
	return (ma+mb+mc)/2;
}
public double DienTich() {
	return Math.sqrt(Tinhp()*(Tinhp()-ma)*(Tinhp()-mb)*(Tinhp()-mc));
}
public void kieuTamGiac() {
	if((this.ma<this.mb+this.mc) && (this.mb<this.ma+this.mc) && (this.mc<this.ma+this.mb)) {
		if(this.ma == this.mb && this.mb == this.mc) {
			System.out.println("Tam giác điều nha !");
		}
		else if (this.ma==this.mb||this.mb==this.mc||this.ma==this.mc) {
	    	System.out.println("Tam giác cân nha !");
	    }
		else {
			System.out.println("Tam giác thường nha !");
		}
	
}
	else {
		System.out.println("Không phải tam giác nha !");
	}
}
public String toString() {
	String s;
	s = "";
	s+=s.format("|%5f|%5f|%5f|%10x|%5f|%5f|", getMa(), getMb(), getMc(), kieuTamGiac(), ChuVi(), DienTich());
	return s;
}
}
