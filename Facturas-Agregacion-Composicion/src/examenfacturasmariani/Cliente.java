/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfacturasmariani;

/**
 *
 * @author sanfra
 */
public class Cliente extends Persona implements Estado_Cuenta {
    
       private Tarjeta_de_Credito tarjetaCredito;
       private boolean veraz;
    
    public Cliente() {
    }

    public Cliente(Tarjeta_de_Credito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Cliente(Tarjeta_de_Credito tarjetaCredito, int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
        this.tarjetaCredito = tarjetaCredito;
    }

    public Tarjeta_de_Credito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(Tarjeta_de_Credito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

       @Override
    public int getDni() {
        return dni;
    }

       @Override
    public void setDni(int dni) {
        this.dni = dni;
    }

       @Override
    public String getNombre() {
        return nombre;
    }

       @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

       @Override
    public String getApellido() {
        return apellido;
    }

       @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

       @Override
    public long getCuit() {
        return cuit;
    }

       @Override
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    @Override
    public boolean problemaVerazCodeme() {
       return veraz = false;
    }
       
}
