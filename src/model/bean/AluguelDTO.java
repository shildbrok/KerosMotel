/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author estev
 */
public class AluguelDTO {
    private int data, id;
    private String  nome, valor, clientes, funcionario1, funcionario2, tpPagamento, numero;

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the clientes
     */
    public String getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(String clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the funcionario1
     */
    public String getFuncionario1() {
        return funcionario1;
    }

    /**
     * @param funcionario1 the funcionario1 to set
     */
    public void setFuncionario1(String funcionario1) {
        this.funcionario1 = funcionario1;
    }

    /**
     * @return the funcionario2
     */
    public String getFuncionario2() {
        return funcionario2;
    }

    /**
     * @param funcionario2 the funcionario2 to set
     */
    public void setFuncionario2(String funcionario2) {
        this.funcionario2 = funcionario2;
    }

    /**
     * @return the tpPagamento
     */
    public String getTpPagamento() {
        return tpPagamento;
    }

    /**
     * @param tpPagamento the tpPagamento to set
     */
    public void setTpPagamento(String tpPagamento) {
        this.tpPagamento = tpPagamento;
    }
}
