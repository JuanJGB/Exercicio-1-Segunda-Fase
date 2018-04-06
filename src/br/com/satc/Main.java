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
import static br.com.satc.objetos.Aluno.calculaIdade;
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
        List<Professor> professor = new ArrayList<>();
        List<Aluno> aluno = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int esc = 0;

        do {
            esc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
                    + "\n 1. Cadastro de Disciplina"
                    + "\n 2. Cadastro de Professor"
                    + "\n 3. Cadastro de Aluno"
                    + "\n 4. Consulta de Disciplina"
                    + "\n 5. Consulta de Professor"
                    + "\n 6. Consulta de Aluno"
                    + "\n 7. Sair"));

            switch (esc) {
                case 1:

                    do {
                        String nome, departamento;
                        char status;

                        nome = JOptionPane.showInputDialog("Informe o nome da disciplina: ");
                        departamento = JOptionPane.showInputDialog("Informe o departamento: ");
                        status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo: ").toUpperCase().charAt(0);

                        if ((status != 'A') && (status != 'I')) {
                            JOptionPane.showMessageDialog(null, "INVÁLIDO!");
                        } else {
                            materias.add(new Disciplina(nome, departamento, status));
                        }
                    } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar? ") == 0));

                    break;
                case 2:
                    do {
                        int cargaHoraria;
                        float valorHora, salario;

                        String nome, cpf, rg;
                        Date dataNascimento;

                        nome = JOptionPane.showInputDialog("Informe o nome do professor");
                        rg = JOptionPane.showInputDialog("Informe o RG: ");
                        cpf = JOptionPane.showInputDialog("Informe o CPF: ");
                        cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horaria: "));
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da hora: "));
                        dataNascimento = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento: "));
                        calcularSalario(cargaHoraria, valorHora);
                        salario = calcularSalario(cargaHoraria, valorHora);
                        professor.add(new Professor(cargaHoraria, valorHora, salario, nome, cpf, rg, dataNascimento));

                        if (JOptionPane.showConfirmDialog(null, "O professor ja trabalha em alguma disciplina? ") == 0) {
                            do {
                                String disciplinasDisponiveis = "";

                                for (Disciplina materia : materias) {
                                    disciplinasDisponiveis += "\n" + materias.indexOf(materia) + " " + materia.getNome();
                                    int escolhaDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Informe a disciplina: \n " + disciplinasDisponiveis));
                                    if (escolhaDisciplina != materias.indexOf(materia)) {
                                        JOptionPane.showMessageDialog(null, "INVÁLIDO");
                                    }else 
                                professor.get(professor.size() - 1).getDisciplina().add(materias.get(escolhaDisciplina));
                                } 
                            } while ((JOptionPane.showConfirmDialog(null, "O Professor possui outra disciplina? ")) == 0);
                        }
                    } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar? ") == 0));

                    break;
                case 3:
                    do {

                        String nome, rg, cpf;
                        String matricula;
                        int idade;
                        Date dataMatricula;
                        Date dataNascimento;

                        nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
                        rg = JOptionPane.showInputDialog("Informe o rg do aluno: ");
                        cpf = JOptionPane.showInputDialog("Informe o cpf do aluno: ");

                        matricula = JOptionPane.showInputDialog("Informe a matrícula do aluno");
                        dataNascimento = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento do aluno: "));
                        dataMatricula = sdf.parse(JOptionPane.showInputDialog("Informe a data da matricula do aluno: "));
                        calculaIdade(dataNascimento);
                        idade = calculaIdade(dataNascimento);
                        aluno.add(new Aluno(matricula, dataMatricula, nome, rg, cpf, dataNascimento, idade));
                        
                        if (JOptionPane.showConfirmDialog(null, "O aluno já cursa em alguma disciplina? ") == 0) {
                            do {
                                String disciplinasDisponiveis = "";

                                for (Disciplina materia : materias) {
                                    disciplinasDisponiveis += "\n" + materias.indexOf(materia) + " " + materia.getNome();
                                    int escolhaDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Informe a disciplina: \n " + disciplinasDisponiveis));
                                    if (escolhaDisciplina != materias.indexOf(materia)) {
                                        JOptionPane.showMessageDialog(null, "INVÁLIDO");
                                    }else 
                                aluno.get(aluno.size() - 1).getDisciplina().add(materias.get(escolhaDisciplina));
                                } 
                            } while ((JOptionPane.showConfirmDialog(null, "O aluno possui outra disciplina? ")) == 0);
                        }                        
                    } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar? ") == 0));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, materias.toString());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, professor.toString());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, aluno.toString());
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Tchau! ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Inválido!! ");
            }
        } while (esc != 7);
    }

}
