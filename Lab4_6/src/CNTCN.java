import java.util.Scanner;

public class CNTCN extends CongNhan{
	int soNgayCong;
    double luongThang,luongCoBan,thuong;
    
    public void nhapThongTin(){
        System.out.println("\tCONG NHAN TINH CONG NHAT");
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong co ban: ");
        luongCoBan=sc.nextDouble();
        System.out.println("Nhap so ngay cong: ");
        soNgayCong=sc.nextInt();
    }
	@Override
	public void tinhLuong() {
		 if(soNgayCong<20){
	            thuong=0;
	        }else{
	            thuong=1.2*luongCoBan;
	        };
	        luongThang=luongCoBan*soNgayCong+thuong;
	        System.out.println("Luong cua cong nhan: "+luongThang);
	    }
		
	}


