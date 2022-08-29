package bai4;

public class Test {
public static void main(String[] args) {
	HinhTamGiac tamgiac = new HinhTamGiac(8, 8, 8);
	System.out.println("Chu vi hình tam giác là : "+ tamgiac.ChuVi());
	System.out.println("Diem tich hình tam giác là : "+ tamgiac.DienTich());
	tamgiac.kieuTamGiac();
}

}
