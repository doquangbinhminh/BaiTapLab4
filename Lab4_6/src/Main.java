import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	 CNKSP cn1=new CNKSP();
     CNTCN cn2=new CNTCN();
     int luachon;
     String chon;
     do{
     Scanner sc=new Scanner(System.in);
     System.out.println("\tMENU");
     System.out.println("1.Nhap thong tin cong nhan khoan san pham.");
     System.out.println("2.Xuat thong tin cong nhan khoan san pham.");
     System.out.println("3.Nhap thong tin cong nhan tinh cong nhat.");
     System.out.println("4.Xuat thong tin cong nhan tinh cong nhat.");
     System.out.println("Nhap lua chon:  ");
     luachon=sc.nextInt();
     switch(luachon){
     case 1:
     cn1.nhapThongTin();
     break;
     case 2:
     cn1.inThongTin();
     cn1.tinhLuong();
     break;
     case 3:
     cn2.nhapThongTin();
     break;
     case 4:
     cn2.inThongTin();
     cn2.tinhLuong();
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

