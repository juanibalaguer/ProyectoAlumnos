/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author garba
 */
public class Alumno {
    private int idAlumno=-1;
    private String nombre;
    private int dni;
    private String domicilio;
    private LocalDate fechaNacimiento;
    
    
    public Alumno(){}
    public Alumno(String nombre, int dni, String domicilio, LocalDate fechaNacimiento)
    {
        
        this.nombre=nombre;
        this.dni=dni;
        this.domicilio=domicilio;
        this.fechaNacimiento=fechaNacimiento;

    }

    
    
   public int getIdAlumno()
   {
       return this.idAlumno;
   }
   public String getNombre()
   {
       return this.nombre;
   }
   public int getDni()
   {
       return this.dni;
   }
   public String getDomicilio()
   {
       return this.domicilio;
   }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
   
   public void setNombre(String nombre)
   {
       this.nombre=nombre;
   }
   public void setDni(int dni)
   {
       this.dni=dni;
   }
   public void setDomicilio(String domicilio)
   {
       this.domicilio=domicilio;
   }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
   
}
