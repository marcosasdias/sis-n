package br.com.mercare.ninho.persistence.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "N_CLIENTE")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "RG")
	private String rg;

	@Column(name = "CNH")
	private Long cnh;

	@Column(name = "CPF")
	private Long cpf;

	@Column(name = "DAT_NASCIMENTO")
	private Calendar dataNascimento;

	@Column(name = "TELEFONE_1")
	private Long telefone1;

	@Column(name = "TELEFONE_2")
	private Long telefone2;

	@Column(name = "TELEFONE_3")
	private Long telefone3;

	@OneToOne
	@JoinColumn(name = "ID_OCUPACAO")
	private Ocupacao ocupacao;

	@OneToOne
	@JoinColumn(name = "ID_PRODUTO")
	private Produto produto;

	@OneToMany
	@JoinColumn(name = "ID_CLIENTE")
	private List<Proposta> propostas;

	@Column(name = "DAT_INCLUSAO")
	private Calendar dataInclusao;

	@Column(name = "DAT_ATUALIZACAO")
	private Calendar dataAtualizacao;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg
	 *            the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the cnh
	 */
	public Long getCnh() {
		return cnh;
	}

	/**
	 * @param cnh
	 *            the cnh to set
	 */
	public void setCnh(Long cnh) {
		this.cnh = cnh;
	}

	/**
	 * @return the cpf
	 */
	public Long getCpf() {
		return cpf;
	}

	/**
	 * @param cpf
	 *            the cpf to set
	 */
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the dataNascimento
	 */
	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento
	 *            the dataNascimento to set
	 */
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the telefone1
	 */
	public Long getTelefone1() {
		return telefone1;
	}

	/**
	 * @param telefone1
	 *            the telefone1 to set
	 */
	public void setTelefone1(Long telefone1) {
		this.telefone1 = telefone1;
	}

	/**
	 * @return the telefone2
	 */
	public Long getTelefone2() {
		return telefone2;
	}

	/**
	 * @param telefone2
	 *            the telefone2 to set
	 */
	public void setTelefone2(Long telefone2) {
		this.telefone2 = telefone2;
	}

	/**
	 * @return the telefone3
	 */
	public Long getTelefone3() {
		return telefone3;
	}

	/**
	 * @param telefone3
	 *            the telefone3 to set
	 */
	public void setTelefone3(Long telefone3) {
		this.telefone3 = telefone3;
	}

	/**
	 * @return the ocupacao
	 */
	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	/**
	 * @param ocupacao
	 *            the ocupacao to set
	 */
	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}

	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * @param produto
	 *            the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	/**
	 * @return the propostas
	 */
	public List<Proposta> getPropostas() {
		return propostas;
	}

	/**
	 * @param propostas
	 *            the propostas to set
	 */
	public void setPropostas(List<Proposta> propostas) {
		this.propostas = propostas;
	}

	/**
	 * @return the dataInclusao
	 */
	public Calendar getDataInclusao() {
		return dataInclusao;
	}

	/**
	 * @param dataInclusao
	 *            the dataInclusao to set
	 */
	public void setDataInclusao(Calendar dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	/**
	 * @return the dataAtualizacao
	 */
	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}

	/**
	 * @param dataAtualizacao
	 *            the dataAtualizacao to set
	 */
	public void setDataAtualizacao(Calendar dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}
