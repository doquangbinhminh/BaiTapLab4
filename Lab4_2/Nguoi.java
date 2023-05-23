public class Nguoi{
    String ten,gioiTinh;
    int tuoi;
    public Nguoi(){
    }
    public Nguoi(String ten,int tuoi,String gioiTinh){
        this.ten=ten;
        this.tuoi=tuoi;
        this.gioiTinh=gioiTinh;
    }
    public String getten(){
        return ten;
    }
    public void setten(String ten){
        this.ten=ten;
    }
    public int gettuoi(){
        return tuoi;
    }
    public void settuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public String getgioiTinh(){
        return gioiTinh;
    }
    public void setgioiTinh(String gioiTinh){
        this.gioiTinh=gioiTinh;
    }
    public String toString(){
        return "Ten : "+ten+"\nTuoi : "+tuoi+"\nGioi tinh : "+gioiTinh;
    }
}