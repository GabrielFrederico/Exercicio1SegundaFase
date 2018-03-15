/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.Date;

/**
 *
 * @author gabriel.155317
 */
public class Disciplina extends Aluno{
    
    private String name,departamento;
    private char status;

    public Disciplina(String name, String departamento, char status, int matricula, Date dataMatricula, int cargaHoraria, float valorHora, String nome, String rg, String cpf, Date dataNascimento) {
        super(matricula, dataMatricula, cargaHoraria, valorHora, nome, rg, cpf, dataNascimento);
        this.name = name;
        this.departamento = departamento;
        this.status = status;
    }


    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + name + ", departamento=" + departamento + ", status=" + status + '}';
    }

        public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
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