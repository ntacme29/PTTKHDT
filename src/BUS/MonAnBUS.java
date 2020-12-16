package BUS;
import DTO.*;
import DAO.*;
import java.util.ArrayList;
// copy paste qua hết
public class MonAnBUS {

    public static ArrayList<SanPhamDTO> dsMonAn;

    public MonAnBUS() {

    }

    public void docDSMonAn() throws Exception //cần ghi lại khi qua class khác
    {
        MonAnDAO data = new MonAnDAO();
        if (dsMonAn == null) {
            dsMonAn = new ArrayList<>();
        }
        dsMonAn = data.docDB(); // đọc dữ liệu từ database

    }

    public void them(SanPhamDTO monAn) //cần ghi lại khi qua class khác
    {
        MonAnDAO data = new MonAnDAO();
        data.them(monAn);//ghi vào database
        if(dsMonAn!=null)
            dsMonAn.add(monAn);//cập nhật arraylist
    }

    public void sua(SanPhamDTO monAn, int i) //cần ghi lại khi qua class khác
    {
        MonAnDAO data = new MonAnDAO();
        data.sua(monAn);
        if(dsMonAn!=null)
            dsMonAn.set(i, monAn);
    }

    public void xoa(String ID, int index) //cần ghi lại khi qua class khác
    {
        MonAnDAO data = new MonAnDAO();
        data.xoa(ID); // update trạng thái lên database
        SanPhamDTO DTO=dsMonAn.get(index); // sửa lại thông tin trong list
        DTO.setTrangThai("Ẩn");
        if(dsMonAn!=null)
            dsMonAn.set(index, DTO);
    }
    //tìm vị trí của thằng có chứa mã mà mình cần
    public static int timViTri( String ID) 
    {
        for (int i = 0; i < dsMonAn.size(); i++) {
            if (dsMonAn.get(i).getIDMonAn().equals(ID)) {
                return i;
            }
        }
        return 0;
    }
    public ArrayList<SanPhamDTO> getMonAnDTO() {
        return dsMonAn;
    }
    public SanPhamDTO getMonAnDTO(String idmonan) {
        for (SanPhamDTO maDTO : dsMonAn) {
            if (maDTO.getIDMonAn().equals(idmonan)) {
                return maDTO;
            }
        }
        return null;
    }
 
    public static String getMaMonAnCuoi()
    {
        if(dsMonAn == null)
        {
            dsMonAn = new ArrayList<>();
        }
        if(dsMonAn.size() > 0)
        {
            String ma;
         ma = dsMonAn.get(dsMonAn.size()-1).getIDMonAn();
         return ma;
        }
         return null;
    }
    
    public static boolean timMaMonAn(String maMonAn)
    {
        if(dsMonAn == null)
        {
            dsMonAn = new ArrayList<>();
        }
        for(SanPhamDTO monAnDTO : dsMonAn)
        {
            if(monAnDTO.getIDMonAn().equals(maMonAn))
            {
                return true;
            }
        }
         return false;
    }
}












