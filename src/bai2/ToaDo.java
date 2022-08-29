package bai2;

public class ToaDo {
private String ten;
private int x;
private int y;
private int z;
public ToaDo(String ten, int x, int y, int z) {
	super();
	this.ten = ten;
	this.x = x;
	this.y = y;
	this.z = z;
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public int getZ() {
	return z;
}
public void setZ(int z) {
	this.z = z;
}
public ToaDo negative() {
	ToaDo p = new ToaDo("~"+ten, -x, -y, -z);
	return p;
}
public double distane() {
	return Math.sqrt(x*x+y*y+z*z);
}
public String toString() {
	return ten+"("+x+","+y+","+z+")";
}
}
