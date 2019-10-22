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
public class Cursada {
    private int idCursada;
    private Alumno alumno;
    private Materia materia;
    private double nota;
    
public Cursada(Alumno alumno, Materia materia, double nota) {
    this.alumno=alumno;
    this.materia=materia;
    this.nota=nota;
}
    public Cursada() {
    }

    public int getIdCursada() {
        return idCursada;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setIdCursada(int idCursada) {
        this.idCursada = idCursada;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    
}
