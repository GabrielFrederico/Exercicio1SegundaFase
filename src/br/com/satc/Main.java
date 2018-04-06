/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Aluno;
import static br.com.satc.objeto.Aluno.calculaIdade;
import br.com.satc.objeto.Disciplina;
import br.com.satc.objeto.Professor;
import static br.com.satc.objeto.Professor.calcularSalario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.155317
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        List<Aluno> aluno = new ArrayList();
        List<Disciplina> materias = new ArrayList<>();
        List<Professor> prof = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int esc = 0;
        do {
            esc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção"
                    + "\n 1. Cadastro de Disciplina"
                    + "\n 2. Cadastro de Professor"
                    + "\n 3. Cadastro de Aluno"
                    + "\n 4. Consulta de Disciplina"
                    + "\n 5. Consulta de Professor"
                    + "\n 6. Consulta de Aluno"
                    + "\n 7. Sair"));
            switch (esc) {
                case 1: {

                    do {
                        String nome, departamento;
                        char status;

                        nome = JOptionPane.showInputDialog("Digite o nome da disciplina: ");
                        departamento = JOptionPane.showInputDialog("Qual o departamento? ");
                        status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo? ").toUpperCase().charAt(0);
                        materias.add(new Disciplina(nome, departamento, status));

                    } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar?")) == 0);
                    break;
                }
                case 2: {

                    do {
                        int cargaHoraria, idade = 0;
                        float valorHora, salario;
                        String nome, rg, cpf;
                        Date dataNascimento;
                        
                        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
                        rg = JOptionPane.showInputDialog("Digite o seu RG: ");
                        cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
                        cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua carga horária: "));
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor por hora: "));
                        dataNascimento = sdf.parse(JOptionPane.showInputDialog("Digite a sua data de nascimento: "));
                        calcularSalario(cargaHoraria, valorHora);
                        salario = calcularSalario(cargaHoraria, valorHora);
                        prof.add(new Professor(cargaHoraria, valorHora, salario, nome, rg, cpf, dataNascimento, idade));

                        if (JOptionPane.showConfirmDialog(null, "Professor já trabalha em alguma disciplina?") == 0);
                        {
                            do {
                                String disciplinasExistentes = "";
                                for (Disciplina materia : materias) {
                                    disciplinasExistentes += "\n" + materias.indexOf(materia) + " " + materia.getNome();
                                
                                int escolhaDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Digite qual disciplina : \n" + disciplinasExistentes));
                                if (escolhaDisciplina != materias.indexOf(materia)) {
                                    JOptionPane.showMessageDialog(null, "Número não corresponde a uma disciplina!");
                                }else
                                prof.get(prof.size() - 1).getDisciplinas().add(materias.get(escolhaDisciplina));
                                }
                                
                            } while ((JOptionPane.showConfirmDialog(null, "Professor possui outra disciplina")) == 0);
                        }
                    } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar?")) == 0);
                    break;
                }
                case 3: {

                    do {
                        String nome, rg, cpf, matricula;
                        int idade;
                        Date dataMatricula = new Date();
                        Date dataNascimento = new Date();

                        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
                        rg = JOptionPane.showInputDialog("Digite o seu RG: ");
                        cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
                        matricula = JOptionPane.showInputDialog("Digite a sua matrícula: ");                        
                        dataNascimento = sdf.parse(JOptionPane.showInputDialog("Digite a sua data de nascimento: "));
                        dataMatricula = sdf.parse(JOptionPane.showInputDialog("Digite a sua data de matrícula: "));
                        calculaIdade(dataNascimento);
                        idade = calculaIdade(dataNascimento);
                        aluno.add(new Aluno(matricula, dataMatricula, nome, rg, cpf, dataNascimento, idade));
                        
                        if (JOptionPane.showConfirmDialog(null, "Aluno já cursa alguma disciplina?") == 0);
                        {
                            do {
                                String disciplinasExistentes = "";
                                for (Disciplina materia : materias) {
                                    disciplinasExistentes += "\n" + materias.indexOf(materia) + " " + materia.getNome();
                                
                                int escolhaDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Informe qual disciplina : \n" + disciplinasExistentes));
                                if (escolhaDisciplina != materias.indexOf(materia)) {
                                    JOptionPane.showMessageDialog(null, "Número não corresponde a uma disciplina!");
                                }else
                                aluno.get(aluno.size() - 1).getDisciplinas().add(materias.get(escolhaDisciplina));
                                }
                                
                            } while ((JOptionPane.showConfirmDialog(null, "Aluno possui outra disciplina")) == 0);
                        }

                    } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar?")) == 0);
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, materias.toString());
                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, prof.toString());
                    break;
                }
                case 6: {
                    JOptionPane.showMessageDialog(null, aluno.toString());
                    break;
                }
                case 7: {
                    JOptionPane.showMessageDialog(null, "Até a próxima !");
                }

            }
        } while (esc != 7);
    }
}
