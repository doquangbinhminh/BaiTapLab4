import java.util.Scanner;

public abstract class GiaoVien {
String hoTen,diaChi,loaiGiangVien;
public void nhapThongTin() {
	Scanner sc=new Scanner(System.in);
	System.out.println("nhap ho ten: ");
	hoTen=sc.nextLine();
	System.out.println("nhap dia chi: ");
	diaChi=sc.nextLine();
	System.out.println("Nhap loai giang vien: ");
    loaiGiangVien=sc.nextLine();  
}
public abstract void tinhLuong();
public void inThongTin(){
    System.out.println("ho ten: "+hoTen);
    System.out.println("dia chi: "+diaChi);
    System.out.println("loai giang vien: "+loaiGiangVien);
}
}

