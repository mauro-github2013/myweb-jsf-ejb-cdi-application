/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import ejb.ManagerSaveOperationEffectued;
import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author mauro
 */
@Named
@RequestScoped
public class CalcolatoreBean {
   @Inject
   ManagerSaveOperationEffectued manager;
  
    private double x;
    private double y;
    private double result;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String add() {
       result= this.x+this.y;
       this.manager.saveAdditionIntoDatabase(x, y, result);
        
        return "result.jsf";
    }  
}
