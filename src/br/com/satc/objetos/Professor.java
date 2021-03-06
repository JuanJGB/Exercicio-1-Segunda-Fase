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
public class Professor extends Pessoa {
    
     private ArrayList<Disciplina> disciplinas = new ArrayList<>();
     private int cargaHoraria;
     private float valorHora,salario;
     
      public Professor(int cargaHoraria,float valorHora,float salario,String nome,String cpf,String rg, Date dataNascimento ) {
        super(nome, rg, cpf, dataNascimento, cargaHoraria);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = calcularSalario(cargaHoraria, valorHora);
    }
     public static  Float calcularSalario(int cargaHoraria, float valorHora) {
            
	return cargaHoraria * valorHora;      
}  

    @Override
    public String toString() {
        return "Professor{" + "disciplina=" + disciplinas + ", cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", salario=" + salario + '}';
    }

   
    public ArrayList<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
