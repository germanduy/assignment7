package Assignment7;

public class SanPham {
    public String ten,donvi;
    public Integer gia,soluong;
    public SanPham(){

    }
    public SanPham(String ten, Integer gia, String donvi,Integer soluong) {
        this.ten = ten;
        this.gia = gia;
        this.donvi = donvi;
        this.soluong = soluong;
    }

    public String getTen() {
        return ten;
    }

    public String getDonvi() {
        return donvi;
    }

    public Integer getGia() {
        return gia;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }
    public String hiends(){
        String s = "\n\n";
        s+= "\n" + getTen();
        s+= "\n" + getGia();
        s+= "\n" + getDonvi();
        s+= "\n" + getSoluong();
        return s;

    }
}
