/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author garba
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private String responsable;
    private String periodo;

    public Materia() {
    }

    public Materia(String nombre, String responsable, String periodo) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.periodo = periodo;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
}
