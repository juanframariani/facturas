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
public class ExamenFacturasMariani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente c1 =  new Cliente();
        Empleado e1 = new Empleado();
        Factura f1 = new Factura();
        Proveedor p1 = new Proveedor();
        
                
        c1.setNombre("Juan Francisco");
        c1.setApellido("Mariani");
        c1.setCuit(2031286526);
        c1.problemaVerazCodeme();
        
        
        e1.setApellido("Gonzalez");
        e1.setNombre("Emanuel");
        e1.setNroLegajo(44819);
        
        p1.setNombreComercial("Fantasia Pura");
        
        f1.setNro_Factura(1836);
        f1.setMonto(1500);
             
        
        System.out.println("Razon Social: " + p1.getNombreComercial());
        
        System.out.println("Numero de Factura: " + f1.getNro_Factura() + " - Fecha: " + f1.getFecha());
        
        System.out.println("Vendedor: " + e1.getApellido() + ", " + e1.getNombre() + " - Legajo: " + e1.getNroLegajo());
        
        System.out.println("Cliente: " + c1.getApellido() + ", " + c1.getNombre() + " - CUIT: " + c1.getCuit());
        
        System.out.println("Monto Factura: $ " + f1.getMonto());
        
        if (c1.problemaVerazCodeme() != false) {
            System.out.println("EL CLIENTE TIENE PROBLEMA DE VERAZ");
        } else  
            System.out.println("EL CLIENTE NO TIENE PROBLEMA DE VERAZ");
        
       
    }
    
}
