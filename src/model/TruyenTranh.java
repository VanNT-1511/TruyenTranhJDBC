
package model;

/**
 *
 * @author van15
 */
public class TruyenTranh {
    private Integer id;
    private String ten;
    private String theLoai;
    private Integer soLg;
    private float donGia;
    private Integer tacGiaId;

    public TruyenTranh() {
    }

    public TruyenTranh(Integer id, String ten, String theLoai, Integer soLg, float donGia, Integer tacGiaId) {
        this.id = id;
        this.ten = ten;
        this.theLoai = theLoai;
        this.soLg = soLg;
        this.donGia = donGia;
        this.tacGiaId = tacGiaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public Integer getSoLg() {
        return soLg;
    }

    public void setSoLg(Integer soLg) {
        this.soLg = soLg;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public Integer getTacGiaId() {
        return tacGiaId;
    }

    public void setTacGiaId(Integer tacGiaId) {
        this.tacGiaId = tacGiaId;
    }
    
    
}
