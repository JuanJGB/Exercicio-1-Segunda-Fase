/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objetos.Aluno;
import br.com.satc.objetos.Disciplina;
import br.com.satc.objetos.Professor;
import static br.com.satc.objetos.Professor.calcularSalario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author juan.159417
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        List<Disciplina> materias = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
    
        do {
            String nome, departamento;
            char status;

            nome = JOptionPane.showInputDialog("Informe o nome da disciplina: ");
            departamento = JOptionPane.showInputDialog("Informe o departamento: ");
            status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo: ").charAt(0);
            materias.add(new Disciplina(nome, departamento, status));
        } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar? ") == 0));
        
        String disciplinasDisponiveis = "";
        for (Disciplina materia : materias) {
            disciplinasDisponiveis += "\n" + materias.lastIndexOf(materia) + " " + materia.getNome();
        }
        JOptionPane.showMessageDialog(null, disciplinasDisponiveis);
        
        
        List<Professor> professor = new ArrayList<>();
        do {

            int cargaHoraria;
            float valorHora;
             float salario;
            
           
            String nome, cpf, rg;
            Date dataNascimento = new Date();
             
            nome = JOptionPane.showInputDialog("Informe o nome do professor");
            rg = JOptionPane.showInputDialog("Informe o RG: ");
            cpf = JOptionPane.showInputDialog("Informe o CPF: ");
            cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horaria: "));
            valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da hora: "));
            calcularSalario(cargaHoraria, valorHora);
            salario = calcularSalario(cargaHoraria, valorHora);
            dataNascimento = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento: "));
            
            
            String disciplinasDisponiveis = "";
            for (Disciplina materia : materias) {
            disciplinasDisponiveis += "\n" + materias.lastIndexOf(materia) + " " + materia.getNome();
            
            professor.add(new Professor(cargaHoraria,valorHora,salario,nome, cpf, rg, dataNascimento));} 
            
        }while ((JOptionPane.showConfirmDialog(null, "Deseja continuar? ") == 0));
       
            JOptionPane.showMessageDialog(null, professor);
        
        do {

            String nome, rg, cpf;
            int matricula;
            ArrayList<Disciplina> disciplina;
            Date dataMatricula = new Date();
            Date dataNascimento = new Date();

            nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
            rg = JOptionPane.showInputDialog("Informe o nome do aluno: ");
            cpf = JOptionPane.showInputDialog("Informe o nome do aluno: ");
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula do aluno"));
            dataNascimento = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento do aluno: "));
            dataMatricula = sdf.parse(JOptionPane.showInputDialog("Informe a data da matricula do aluno: "));
            
        } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar? ") == 0));

}
    
    
}
