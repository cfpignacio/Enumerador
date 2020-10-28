/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerador;

/**
 *
 * @author Notebook
 */
public class Viandas {
    private String nombre;
    private int precio;
    private Categoria cat;

    public Viandas(String nombre, int precio, Categoria cat) {
        this.nombre = nombre;
        this.precio = precio;
        this.cat = cat;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }
    
}
