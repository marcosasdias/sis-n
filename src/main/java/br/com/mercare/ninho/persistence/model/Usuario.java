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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "N_USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "CPF")
	private Long cpf;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "TELEFONE")
	private Long telefone;

	@Column(name = "STATUS")
	private Long status;

	@Column(name = "LOGIN")
	private String login;

	@Column(name = "SENHA")
	private String senha;

	@Column(name = "DAT_INCLUSAO")
	private Calendar dataInclusao;

	@Column(name = "DAT_ATUALIZACAO")
	private Calendar dataAtualizacao;
	
	@OneToMany
	@JoinColumn(name = "ID_UNIDADE")
	private List<Unidade> unidades;
	
	@OneToMany
	@JoinColumn(name = "ID_USUARIO")
	private List<Proposta> propostas;

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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telefone
	 */
	public Long getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone
	 *            the telefone to set
	 */
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the status
	 */
	public Long getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Long status) {
		this.status = status;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
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
