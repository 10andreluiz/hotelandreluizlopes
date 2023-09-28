/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 0069837
 */
public class Produto {

	private int id;
	private String tipo_produto;
	private String nome;
	private int dia_da_compra;
	private int mes_de_referencia;
	private double valor;
	private int id_fornecedor;

	public Produto(int id, String tipo_produto, String nome, int dia_da_compra, int mes_de_referencia, double valor,
			int id_fornecedor) {
		this.id = id;
		this.tipo_produto = tipo_produto;
		this.nome = nome;
		this.dia_da_compra = dia_da_compra;
		this.mes_de_referencia = mes_de_referencia;
		this.valor = valor;
		this.id_fornecedor = id_fornecedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo_produto() {
		return tipo_produto;
	}

	public void setTipo_produto(String tipo_produto) {
		this.tipo_produto = tipo_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDia_da_compra() {
		return dia_da_compra;
	}

	public void setDia_da_compra(int dia_da_compra) {
		this.dia_da_compra = dia_da_compra;
	}

	public int getMes_de_referencia() {
		return mes_de_referencia;
	}

	public void setMes_de_referencia(int mes_de_referencia) {
		this.mes_de_referencia = mes_de_referencia;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getId_fornecedor() {
		return id_fornecedor;
	}

	public void setId_fornecedor(int id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}

}
