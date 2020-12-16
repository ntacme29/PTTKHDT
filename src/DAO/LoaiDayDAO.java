//Đã sửa
package DAO;

import DTO.LoaiDayDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class LoaiDayDAO {
    ConnectDB connection = new ConnectDB();

    public LoaiDayDAO() {

    }

    public ArrayList docLD() throws SQLException, Exception { //cần ghi lại khi qua class khác
        connection = new ConnectDB();
        ArrayList<LoaiDayDTO> LD = new ArrayList<>();
        try {
            String qry = "SELECT * FROM loaiday";
            ResultSet result = connection.excuteQuery(qry);
            if (result != null) {
                while (result.next()) {
                    LoaiDayDTO ld = new LoaiDayDTO();
                    ld.setIDDay(result.getString("IDDay"));
                    ld.setTenLoaiDay(result.getString("TenLoaiDay"));
                    LD.add(ld);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không đọc được dữ liệu bảng hóa đơn");
        }
        return LD;
    }

    public void them(LoaiDayDTO LD) { //cần ghi lại khi qua class khác
        try {
            String qry = "INSERT INTO loaiday values (";
            qry = qry + "'" + LD.getIDDay()+ "'";
            qry = qry + "," + "'" + LD.getTenLoaiDay()+ "'";
            qry = qry + ")";
            connection.getStatement();
            connection.ExecuteUpdate(qry);
            System.out.println(qry);
            connection.closeConnect();
        } catch (Exception ex) {
        }
    }

    public void xoa(LoaiDayDTO LD) {
        try {
            String qry = "DELETE FROM loaiday";
            qry = qry + " " + "WHERE IDDay = '" + LD.getIDDay()+ "'";
            connection.getStatement();
            connection.ExecuteUpdate(qry);
            System.out.println(qry);
            connection.closeConnect();
        } catch (Exception e) {
        }
    }

    public void sua(LoaiDayDTO LD) { //cần ghi lại khi qua class khác
        try {
            String qry = "Update loaiday Set ";
            qry = qry + "TenLoaiDay=" + "'" + LD.getTenLoaiDay()+ "'";
            qry = qry+" "+" WHERE IDDay=' "+LD.getIDDay()+"'";
            connection.getStatement();
            connection.ExecuteUpdate(qry);
            System.out.println(qry);
            connection.closeConnect();

        } catch (Exception ex) {
        }
    }
}
