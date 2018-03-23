/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gabriel.155317
 */
public class Aluno extends Pessoa{
    
    private String matricula;
    private Date dataMatricula;
    private ArrayList<Disciplina> disciplinas;
    private int idade;

    public Aluno(String matricula, Date dataMatricula, String nome, String rg, String cpf, Date dataNascimento, int idade) {
        super(nome, rg, cpf, dataNascimento, idade);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
        this.idade = calcularIdade(dataNascimento);
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", disciplinas=" + disciplinas + '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
        
}