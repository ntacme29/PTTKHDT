//Đã sửa
package DTO;

public class LoaiDayDTO {
    private String IDDay,TenLoaiDay;

    public LoaiDayDTO() {
    }

    public LoaiDayDTO(String IDDay, String TenLoaiDay) {
        this.IDDay = IDDay;
        this.TenLoaiDay = TenLoaiDay;
    }

    public String getIDDay() {
        return IDDay;
    }

    public void setIDDay(String IDDay) {
        this.IDDay = IDDay;
    }

    public String getTenLoaiDay() {
        return TenLoaiDay;
    }

    public void setTenLoaiDay(String TenLoaiDay) {
        this.TenLoaiDay = TenLoaiDay;
    }
    
}
