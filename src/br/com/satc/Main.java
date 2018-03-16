/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Disciplina;
import br.com.satc.objeto.Professor;
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
        List<Disciplina> materias = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        do {
            String nome, departamento;
            char status;

            nome = JOptionPane.showInputDialog("Informe o nome da disciplina: ");
            departamento = JOptionPane.showInputDialog("Qual o departamento? ");
            status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo? ").charAt(0);
            materias.add(new Disciplina(nome, departamento, status));
        } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar?")) == 0);
        String disciplinasDisponiveis = "";
        for (Disciplina materia : materias) {
            disciplinasDisponiveis += "\n" + materias.lastIndexOf(materia) + " " + materia.getNome();
        }
        JOptionPane.showMessageDialog(null, disciplinasDisponiveis);

        List<Professor> professores = new ArrayList<>();

        do {
            int cargaHoraria;
            float valorHora;
            String nome, rg, cpf;
            Date dataNascimento = new Date();

            cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua carga horária: "));
            valorHora = Float.parseFloat("Informe o valor por hora: ");
            nome = JOptionPane.showInputDialog("Informe o seu nome: ");
            rg = JOptionPane.showInputDialog("Digite o seu RG: ");
            cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
            dataNascimento = sdf.parse(JOptionPane.showInputDialog("Digite a sua data de nascimento: "));
            professores.add(new Professor(cargaHoraria, valorHora, nome, rg, cpf, dataNascimento));
        } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar?")) == 0);
        String professoresDisponiveis = "";
        for (Professor trabalhador : professores) {
            professoresDisponiveis += "\n" + professores.lastIndexOf(trabalhador) + " " + trabalhador.getName();
        }
        JOptionPane.showMessageDialog(null, disciplinasDisponiveis);

        do {
            String nome, rg, cpf;
            int idade;
            Date dataMatricula = new Date();
            Date dataNascimento = new Date();

            nome = JOptionPane.showInputDialog("Digite o seu nome: ");
            rg = JOptionPane.showInputDialog("Digite o seu RG: ");
            cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
            dataNascimento = sdf.parse(JOptionPane.showInputDialog("Digite a sua data de nascimento: "));
            dataMatricula = sdf.parse(JOptionPane.showInputDialog("Digite a sua data de matricula: "));

        } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar?")) == 0);
    }
}
