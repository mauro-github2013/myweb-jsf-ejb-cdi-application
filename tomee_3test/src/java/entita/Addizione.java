/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entita;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author mauro
 */
@Entity
public class Addizione implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    private double x, y, total;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getTotal() {
        return this.total;
    }

    public void setX(double ax) {
        this.x = ax;
    }

    public void setY(double ay) {

        this.y = ay;
    }

    public void setTotal(double atotal) {
        this.total = atotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addizione)) {
            return false;
        }
        Addizione other = (Addizione) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entita.Addizione[ id=" + id + " x=" +x + "y=" +y+"total=" +total + " ]";
    }
}
