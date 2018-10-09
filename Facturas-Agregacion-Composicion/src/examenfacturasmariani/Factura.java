/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfacturasmariani;

import java.util.Date;

/**
 *
 * @author sanfra
 */
public class Factura {
    
    private Empleado empleado;
    private Cliente cliente;
    private int nro_Factura;
    private Date fecha = new Date();
    private double monto;

    public Factura() {
    }

    public Factura(int nro_Factura, Date fecha, double monto) {
        this.empleado = new Empleado();                                         //relacion de composicion con empleado y cliente.
        this.cliente = new Cliente();
        this.nro_Factura = nro_Factura;
        this.fecha = fecha;
        this.monto = monto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNro_Factura() {
        return nro_Factura;
    }

    public void setNro_Factura(int nro_Factura) {
        this.nro_Factura = nro_Factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    
}
