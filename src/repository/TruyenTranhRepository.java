
package repository;

import java.util.ArrayList;
import model.TruyenTranh;
import util.ConnectionDB;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author van15
 */
public class TruyenTranhRepository {
    public ArrayList<TruyenTranh> all(){
        ArrayList<TruyenTranh> listTT = new ArrayList<>();
        try {
            Connection conn = ConnectionDB.getConnection();
            System.out.println(conn.getCatalog());
            
            String query = "SELECT * FROM manga";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                Integer id = rs.getInt("id");
                String ten = rs.getString("ten");
                String theLoai = rs.getString("the_loai");
                Integer soLg = rs.getInt("so_luong");
                float donGia = rs.getFloat("don_gia");
                Integer tacGiaId = rs.getInt("tac_gia_id");
                
                TruyenTranh tt = new TruyenTranh(id, ten, theLoai, soLg, donGia, tacGiaId);
                listTT.add(tt);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listTT;
    }
    
    public void insert(TruyenTranh tt){
        try {
            Connection conn = ConnectionDB.getConnection();
            System.out.println(conn.getCatalog());
            
            String query = "INSERT INTO manga"
                    + " (ten, the_loai, so_luong, don_gia, tac_gia_id)"
                    + " VALUES (?, ?, ?, ?, ?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tt.getTen());
            ps.setString(2, tt.getTheLoai());
            ps.setInt(3, tt.getSoLg());
            ps.setFloat(4, tt.getDonGia());
            ps.setInt(5, tt.getTacGiaId());
            ps.execute();
            System.out.println("Success");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void update(TruyenTranh tt, Integer id){
        try {
            Connection conn = ConnectionDB.getConnection();
            System.out.println(conn.getCatalog());
            
            String query = "UPDATE manga"
                    + " SET ten = (?),"
                    + " the_loai = (?),"
                    + " so_luong = (?),"
                    + " don_gia = (?),"
                    + " tac_gia_id = (?)"
                    + " WHERE id = (?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, tt.getTen());
            ps.setString(2, tt.getTheLoai());
            ps.setInt(3, tt.getSoLg());
            ps.setFloat(4, tt.getDonGia());
            ps.setInt(5, tt.getTacGiaId());
            ps.setInt(6, id);
            ps.execute();
            System.out.println("Success");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void delete(Integer id){
        try {
            Connection conn = ConnectionDB.getConnection();
            System.out.println(conn.getCatalog());
            
            String query = "DELETE FROM manga"
                    + " WHERE id = (?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Success");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
