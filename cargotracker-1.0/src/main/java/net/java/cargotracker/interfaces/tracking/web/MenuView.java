package net.java.cargotracker.interfaces.tracking.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 * Created by murshid on 7/15/18.
 */
@Named
@ViewScoped
@ManagedBean
public class MenuView {
    public void save(){
        addMessage("Save", "Data Saved");
    }
    public void update(){
        addMessage("Success", "Data updated");
    }
    public void delete(){
        addMessage("Delete Success", "Data deleted");
    }
    public void addMessage(String summary, String details){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, details);
        FacesContext.getCurrentInstance().addMessage(null,message);
    }

}
