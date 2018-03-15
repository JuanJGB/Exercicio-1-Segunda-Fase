/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objetos;

import java.util.Date;

/**
 *
 * @author juan.159417
 */
public class Disciplina extends Aluno{
    private String name,departamento;
    private char status;
    
    
     public Disciplina(String name, String departamento, char status, int matricula, Date dataMatricula, int cargaHoraria, float valorHora, String nome, String cpf, String rg, Date dataNascimento) {
        super(matricula, dataMatricula, cargaHoraria, valorHora, nome, cpf, rg, dataNascimento);
        this.name = name;
        this.departamento = departamento;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "name=" + name + ", departamento=" + departamento + ", status=" + status + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

   
  
   
    


}
