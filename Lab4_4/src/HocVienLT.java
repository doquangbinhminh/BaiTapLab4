import java.util.Scanner;

public class HocVienLT extends HocVien {
	int soBuoi,donGiaLT, hocPhi;
	
	public void nhapThongTin(){
	        System.out.println("\tLAP TRINH");
	        super.nhapThongTin();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Nhap so buoi: ");
	        soBuoi=sc.nextInt();
	        System.out.println("Nhap don gia: ");
	        donGiaLT=sc.nextInt();
	    }
	@Override
	public void hocPhi() {
	        if(loaiUuTien==1){
	              hocPhi=(soBuoi*donGiaLT)-10000000;
	        }else if(loaiUuTien==2){
	              hocPhi=(soBuoi*donGiaLT)-800000;
	        }else{
	              hocPhi=soBuoi*donGiaLT;
	        };
	        System.out.println("Hoc phi: "+hocPhi);
	    }
		
	}
	

