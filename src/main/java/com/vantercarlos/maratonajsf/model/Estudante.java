package com.vantercarlos.maratonajsf.model;

import com.vantercarlos.maratonajsf.model.enums.Turno;

import java.io.Serializable;

public class Estudante implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome = "Vantercarlos";
    private String sobrenome = "Caitano";
    private double nota1;
    private double nota2;
    private double nota3 = 10;
    private double nota4 = 10;
    private Turno turno = Turno.MATUTINO;

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
