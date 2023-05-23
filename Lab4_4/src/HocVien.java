import java.util.Scanner;

public abstract class HocVien {
	String hoTen,diaChi,loaiChuongTrinh;
    int loaiUuTien;
    public void nhapThongTin() {
    Scanner sc =new Scanner(System.in);
    System.out.println("nhap ho ten: ");
    hoTen=sc.nextLine();
    System.out.println("Nhap dia chi: ");
    diaChi=sc.nextLine();
    System.out.println("Nhap loai uu tien: ");
    loaiUuTien=sc.nextInt();
    System.out.println("Nhap loai chuong trinh: ");
    sc.nextLine();
    loaiChuongTrinh=sc.nextLine();
    }
    public abstract void hocPhi();
    public void inThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("Loai uu tien: "+loaiUuTien);
        System.out.println("Loai chuong trinh: "+loaiChuongTrinh);
    }

}