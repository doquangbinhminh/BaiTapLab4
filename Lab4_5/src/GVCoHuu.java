import java.util.Scanner;

public class GVCoHuu extends GiaoVien{
	 int heSoLuong;
	 double luongThang,phuCap,luongCoBan,thamNien;
public void nhapThongTin() {
	System.out.println("\tGiang vien co huu");
    super.nhapThongTin();
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhap vao luong co ban: ");
    luongCoBan=sc.nextDouble();
    System.out.println("Nhap vao he so luong:: ");
    heSoLuong=sc.nextInt();
    System.out.println("Nhap vao tham nien: ");
    thamNien=sc.nextDouble();
}
	@Override
	public void tinhLuong() {
		 if(thamNien<5){
	            phuCap=0;        
	        }else if(thamNien==5){
	            phuCap=0.05*luongCoBan;
	        }else{
	            phuCap=(thamNien*luongCoBan)/100;
	        };
	        luongThang=luongCoBan*heSoLuong+phuCap;
	        System.out.println("Luong cua giao vien: "+luongThang);
	        }
		
	}


