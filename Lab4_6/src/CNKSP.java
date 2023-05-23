import java.util.Scanner;

public class CNKSP extends CongNhan {
	 int soSP;
	    double luongThang,donGia,thuong;
	    public void nhapThongTin(){
	        System.out.println("\tCONG NHAN KHOAN SAN PHAM");
	        super.nhapThongTin();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Nhap vao so san pham: ");
	        soSP=sc.nextInt();
	        System.out.println("Nhap vao don gia: ");
	        donGia=sc.nextDouble();
	    }
	@Override
	public void tinhLuong() {
		if(soSP>=1150){
            thuong=1500;        
        }else if(soSP>=1100){
            thuong=1000;
        }else{
            thuong=0;
        };
        luongThang=soSP*donGia+thuong;
        System.out.println("Luong cua cong nhan: "+luongThang);
        }
		
	}


