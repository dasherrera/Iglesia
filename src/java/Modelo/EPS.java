
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author ASUS
 */
@Entity 
public class EPS {
    @Id
    public int idEPS;
    public String EPS;
    
    @OneToMany(mappedBy = "EPS", cascade = CascadeType.ALL)
    private List<Pastor> EPS_Pastor = new ArrayList<>();

    public int getIdEPS() {
        return idEPS;
    }

    public void setIdEPS(int idEPS) {
        this.idEPS = idEPS;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public List<Pastor> getEPS_Pastor() {
        return EPS_Pastor;
    }

    public void setEPS_Pastor(List<Pastor> EPS_Pastor) {
        this.EPS_Pastor = EPS_Pastor;
    }
    
}
