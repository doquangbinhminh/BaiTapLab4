import java.util.Scanner;

public class GVThinhGiang extends GiaoVien{
	int soTietDay,donGia;
    double luongThang,thuNhap;
	@Override
	public void nhapThongTin(){
        System.out.println("\tGiang vien thinh giang");
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tiet day: ");
        soTietDay=sc.nextInt();
        System.out.println("Nhap don gia: ");
        donGia=sc.nextInt();
    }
	public void tinhLuong() {
	thuNhap=0.15*soTietDay*donGia;
    luongThang=soTietDay*donGia-thuNhap;
    System.out.println("Luong cua giao vien: "+luongThang);
		
	}

}
