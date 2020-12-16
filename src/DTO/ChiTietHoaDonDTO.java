//Đã sửa
package DTO;
public class ChiTietHoaDonDTO {

    private String IDHoaDon,IDSanPham;
    private int SoLuong,IDChiTietHoaDon;

    public ChiTietHoaDonDTO() {
    }

    public ChiTietHoaDonDTO(String IDHoaDon, String IDSanPham, int SoLuong, int IDChiTietHoaDon) {
        this.IDHoaDon = IDHoaDon;
        this.IDSanPham = IDSanPham;
        this.SoLuong = SoLuong;
        this.IDChiTietHoaDon = IDChiTietHoaDon;
    }

    public String getIDHoaDon() {
        return IDHoaDon;
    }

    public void setIDHoaDon(String IDHoaDon) {
        this.IDHoaDon = IDHoaDon;
    }

    public String getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(String IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getIDChiTietHoaDon() {
        return IDChiTietHoaDon;
    }

    public void setIDChiTietHoaDon(int IDChiTietHoaDon) {
        this.IDChiTietHoaDon = IDChiTietHoaDon;
    }
    
}