import java.util.Scanner;

public abstract class CongNhan {
	String hoTen,diaChi,loaiCongNhan;
    public void nhapThongTin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=sc.nextLine();
        System.out.println("Nhap loai cong nhan: ");
        loaiCongNhan=sc.nextLine();
    }
    public abstract void tinhLuong();
    public void inThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Loai cong nhan: "+loaiCongNhan);
    }
}

