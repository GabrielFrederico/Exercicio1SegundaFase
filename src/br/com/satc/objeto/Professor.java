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
public class Professor extends Pessoa{
    
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private int cargaHoraria;
    private float valorHora,salario;

    public Professor(int cargaHoraria, float valorHora, float salario, String nome, String rg, String cpf, Date dataNascimento, int idade) {
        super(nome, rg, cpf, dataNascimento, idade);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = calcularSalario(cargaHoraria, valorHora);
    }
    
    @Override
    public String toString() {
        return "Professor{" + "disciplinas=" + disciplinas + ", cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", salario=" + salario + '}';
    }
    
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
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

    public static Float calcularSalario(int cargaHoraria, float valorHora) {
       return valorHora * cargaHoraria; 
    }

}