package bai2;

public class Test {
public static void main(String[] args) {
	ToaDo p1 = new ToaDo("H", 2, 3, 4);
	System.out.println(p1);
	System.out.println(p1+" co diem doi xung qua O la : "+ p1.negative());
	System.out.println("Khoang cach den O la : "+ p1.distane());
}

}
