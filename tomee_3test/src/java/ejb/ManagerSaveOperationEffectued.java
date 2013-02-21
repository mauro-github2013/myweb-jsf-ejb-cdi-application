/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entita.Addizione;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.openejb.config.AdditionalBeanDiscoverer;
import org.apache.openejb.config.AppModule;


 @Named

@Stateless
public class ManagerSaveOperationEffectued {
    @PersistenceContext(unitName="tomee_3testPU")
    private EntityManager em;

    public void saveAdditionIntoDatabase(double x, double y, double total) {
        Addizione addition= new Addizione();
        addition.setX(x);
        addition.setY(y);
        addition.setTotal(total);
        em.persist(addition);
    }

   

    public List<Addizione> getListAdditionsFromDatabase() {
        return em.createQuery("select a from Addizione a").getResultList();
        
       
    }

}
