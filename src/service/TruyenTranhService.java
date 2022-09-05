
package service;

import java.util.ArrayList;
import model.TruyenTranh;
import repository.TruyenTranhRepository;

/**
 *
 * @author van15
 */
public class TruyenTranhService {
    private TruyenTranhRepository ttrepo;

    public TruyenTranhService() {
        this.ttrepo = new TruyenTranhRepository();
    }
    
    public ArrayList<TruyenTranh> getListTT(){
        return this.ttrepo.all();
    }
    
    public void insert(TruyenTranh tt){
        this.ttrepo.insert(tt);
    }
    
    public void update(TruyenTranh tt, Integer id){
        this.ttrepo.update(tt, id);
    }
    
    public void delete(Integer id){
        this.ttrepo.delete(id);
    }
}
