import java.util.Scanner;

public class HocVienHD extends HocVien{
	int soBuoi,donGiaDH,hocPhi;
	
	public void nhapThongTin(){
        System.out.println("\tDo Hoa");
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so buoi: ");
        soBuoi=sc.nextInt();
        System.out.println("Nhap vao don gia: ");
        donGiaDH=sc.nextInt();
    }
	@Override
	public void hocPhi() {
		 if(loaiUuTien==1){
             hocPhi=(soBuoi*donGiaDH)-1000000;
        }else if(loaiUuTien==2){
             hocPhi=(soBuoi*donGiaDH)-500000;
        }else{
             hocPhi=soBuoi*donGiaDH;
        };
        System.out.println("Hoc phi: "+hocPhi);
    }
		
	}


