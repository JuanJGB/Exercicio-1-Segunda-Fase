/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objetos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juan.159417
 */
public class Aluno extends Professor {
    private int matricula;
    private Date dataMatricula;
    private ArrayList<Disciplina> disciplina;

    public Aluno(int matricula, Date dataMatricula, int cargaHoraria, float valorHora, String nome, String cpf, String rg, Date dataNascimento) {
        super(cargaHoraria, valorHora, nome, cpf, rg, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", disciplina=" + disciplina + '}';
    }

   

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
    
    
    
    
    
    
}
