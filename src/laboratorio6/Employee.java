/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio6;

/**
 *
 * @author olste
 */
public class Employee {
    public String nombre;
    public String apellido;
    public int cantidad_articulos;
    public double sueldo;
    public double sueldo_total;
    
    public Employee(String n, String a, int c){
        this.nombre = n;
        this.apellido = a;
        this.cantidad_articulos = c;
        this.sueldo = this.getSalary();
        this.sueldo_total = this.sueldo - (this.sueldo*0.1067);
    }
    
    
    public double getSalary(){
        if(this.cantidad_articulos >= 100 && this.cantidad_articulos <= 300)
        {
            return this.cantidad_articulos*125;
        }
        else if(this.cantidad_articulos >=301 && this.cantidad_articulos <= 500)
        {
            return this.cantidad_articulos * 145;
        }
        else if(this.cantidad_articulos >= 501 && this.cantidad_articulos <= 800)
        {
            return this.cantidad_articulos * 165;
        }
        else
        {
            return this.cantidad_articulos * 175;
        }
    }
    
    
    
    
}
