import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	        HocVienHD hvdh=new HocVienHD();
	        HocVienLT hvlt=new HocVienLT();
	        int luachon;
	        String chon;
	        do{
	        Scanner sc=new Scanner(System.in);
	        System.out.println("\tMENU");
	        System.out.println("1.Nhap thong tin sinh vien do hoa.");
	        System.out.println("2.Xuat thong tin sinh vien do hoa.");
	        System.out.println("3.Nhap thong tin sinh vien lap trinh.");
	        System.out.println("4.Xuat thong tin sinh vien lap trinh.");
	        System.out.println("Nhap lua chon: ");
	        luachon=sc.nextInt();
	        switch(luachon){
	        case 1:
	        hvdh.nhapThongTin();
	        break;
	        case 2:
	        hvdh.inThongTin();
	        hvdh.hocPhi();
	        break;
	        case 3:
	        hvlt.nhapThongTin();
	        break;
	        case 4:
	        hvlt.inThongTin();
	        hvlt.hocPhi();
	        break;
	        default:
	         System.out.println("Nhap sai du lieu");
	        };
	        System.out.println("Nhan co de tiep tuc ");
	        sc.nextLine();
	        chon=sc.nextLine();
	    }while(chon!="co");
	  
}
}
