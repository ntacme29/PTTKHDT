//Đã sửa
package DAO;

import DTO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ChiTietHoaDonDAO {

    ConnectDB connection = new ConnectDB();

    public ChiTietHoaDonDAO() {

    }

    public ArrayList docCTHD() throws SQLException, Exception { //cần ghi lại khi qua class khác
        connection = new ConnectDB();
        ArrayList<ChiTietHoaDonDTO> chitiethd = new ArrayList<>();
        try {
            String qry = "SELECT * FROM chitiethoadonban ";
            ResultSet result = connection.excuteQuery(qry);
            if (result != null) {
                while (result.next()) {
                    ChiTietHoaDonDTO cthd = new ChiTietHoaDonDTO();
                    cthd.setIDHoaDon(result.getString("IDHoaDonBan"));
                    cthd.setIDSanPham(result.getString("IDSanPham"));
                    cthd.setSoLuong(result.getInt("SoLuong"));
                    chitiethd.add(cthd);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không đọc được dữ liệu bảng chi tiết hoá đơn");
        }
        return chitiethd;
    }

    public void them(ChiTietHoaDonDTO chitiethd) { //cần ghi lại khi qua class khác
        try {
            String qry = "INSERT INTO chitiethoadon values (";
            qry = qry + "'" + chitiethd.getIDHoaDon()+ "'";
            qry = qry + "," + "'" + chitiethd.getIDSanPham()+ "'";
            qry = qry + "," + "'" + chitiethd.getSoLuong() + "'";
            qry = qry + ")";
            connection.getStatement();
            connection.ExecuteUpdate(qry);
            System.out.println(qry);
            connection.closeConnect();
        } catch (Exception ex) {
        }
    }


}





