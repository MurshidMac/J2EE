package net.java.cargotracker.interfaces.tracking.web;

import net.java.cargotracker.domain.model.cargo.Cargo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 * Created by murshid on 7/15/18.
 */
@ManagedBean
@ViewScoped
public class DataListView implements Serializable {
    private List<Cargo> cargo;
    private List<Cargo> cargo2;
    private List<Cargo> cargo3;

    @ManagedProperty("#{carService}")
    private
}
