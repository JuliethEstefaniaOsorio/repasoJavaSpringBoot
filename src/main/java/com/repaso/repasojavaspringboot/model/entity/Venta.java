package com.repaso.repasojavaspringboot.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private Integer valor;
    private Date fecha;
    private String nombreVendedor;
    private String zona;

    public Venta() {
    }

    public Venta(long id, Integer valor, Date fecha, String nombreVendedor, String zona) {
        this.id = id;
        this.valor = valor;
        this.fecha = fecha;
        this.nombreVendedor = nombreVendedor;
        this.zona = zona;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", valor=" + valor +
                ", fecha=" + fecha +
                ", nombreVendedor='" + nombreVendedor + '\'' +
                ", zona='" + zona + '\'' +
                '}';
    }
}
