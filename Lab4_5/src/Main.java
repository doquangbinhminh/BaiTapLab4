import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	GVCoHuu gvch=new GVCoHuu();
    GVThinhGiang gvtg=new GVThinhGiang();
    int luachon;
    String chon;
    do{
    Scanner sc=new Scanner(System.in);
    System.out.println("\tMENU");
    System.out.println("1.Nhap thong tin giang vien co huu.");
    System.out.println("2.Xuat thong tin giang vien co huu.");
    System.out.println("3.Nhap thong tin giang vien thinh giang.");
    System.out.println("4.Xuat thong tin giang vien thinh giang.");
    System.out.println("Nhap lua chon: ");
    luachon=sc.nextInt();
    switch(luachon){
    case 1:
    gvch.nhapThongTin();
    break;
    case 2:
    gvch.inThongTin();
    gvch.tinhLuong();
    break;
    case 3:
    gvtg.nhapThongTin();
    break;
    case 4:
    gvtg.inThongTin();
    gvtg.tinhLuong();
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

