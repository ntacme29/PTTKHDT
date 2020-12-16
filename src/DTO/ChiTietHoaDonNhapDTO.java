//Đã sửa
package DTO;
public class ChiTietHoaDonNhapDTO {
    private String IDHoaDonNhap,IDSanPham;
    private int SoLuong,IDChiTietHoaDonNhap;

    public ChiTietHoaDonNhapDTO() {
    }

    public ChiTietHoaDonNhapDTO(String IDHoaDonNhap, String IDSanPham, int SoLuong, int IDChiTietHoaDonNhap) {
        this.IDHoaDonNhap = IDHoaDonNhap;
        this.IDSanPham = IDSanPham;
        this.SoLuong = SoLuong;
        this.IDChiTietHoaDonNhap = IDChiTietHoaDonNhap;
    }

    public String getIDHoaDonNhap() {
        return IDHoaDonNhap;
    }

    public void setIDHoaDonNhap(String IDHoaDonNhap) {
        this.IDHoaDonNhap = IDHoaDonNhap;
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

    public int getIDChiTietHoaDonNhap() {
        return IDChiTietHoaDonNhap;
    }

    public void setIDChiTietHoaDonNhap(int IDChiTietHoaDonNhap) {
        this.IDChiTietHoaDonNhap = IDChiTietHoaDonNhap;
    }
    
}
