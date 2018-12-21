package br.com.mercare.ninho.persistence.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "N_UNIDADE")
public class Unidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "TELEFONE")
	private Long telefone;

	@Column(name = "ENDERECO")
	private String endereco;

	@Column(name = "META_DIGITADOS")
	private Long metaDigitados;

	@Column(name = "META_PAGOS")
	private Long metaPagos;

	@Column(name = "DAT_INAUGURACAO")
	private Calendar dataInauguracao;

	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USUARIO_SUPORTE")
	private Usuario suporte;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "UNIDADE_FRANQUEADO", 
			joinColumns = { @JoinColumn(name = "ID_USUARIO") }, 
			inverseJoinColumns = {
			@JoinColumn(name = "ID_UNIDADE") })
	private List<Usuario> franqueado;

	@JoinTable(name = "UNIDADE_COLABORADOR", 
			joinColumns = { @JoinColumn(name = "ID_USUARIO") }, 
			inverseJoinColumns = {
			@JoinColumn(name = "ID_UNIDADE") })	
	private List<Usuario> colaboradores;

	@OneToMany
	@JoinColumn(name = "ID_UNIDADE")
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
	 * @param id the id to set
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
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the telefone
	 */
	public Long getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the metaDigitados
	 */
	public Long getMetaDigitados() {
		return metaDigitados;
	}

	/**
	 * @param metaDigitados the metaDigitados to set
	 */
	public void setMetaDigitados(Long metaDigitados) {
		this.metaDigitados = metaDigitados;
	}

	/**
	 * @return the metaPagos
	 */
	public Long getMetaPagos() {
		return metaPagos;
	}

	/**
	 * @param metaPagos the metaPagos to set
	 */
	public void setMetaPagos(Long metaPagos) {
		this.metaPagos = metaPagos;
	}

	/**
	 * @return the dataInauguracao
	 */
	public Calendar getDataInauguracao() {
		return dataInauguracao;
	}

	/**
	 * @param dataInauguracao the dataInauguracao to set
	 */
	public void setDataInauguracao(Calendar dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}

	/**
	 * @return the suporte
	 */
	public Usuario getSuporte() {
		return suporte;
	}

	/**
	 * @param suporte the suporte to set
	 */
	public void setSuporte(Usuario suporte) {
		this.suporte = suporte;
	}

	/**
	 * @return the franqueado
	 */
	public List<Usuario> getFranqueado() {
		return franqueado;
	}

	/**
	 * @param franqueado the franqueado to set
	 */
	public void setFranqueado(List<Usuario> franqueado) {
		this.franqueado = franqueado;
	}

	/**
	 * @return the colaboradores
	 */
	public List<Usuario> getColaboradores() {
		return colaboradores;
	}

	/**
	 * @param colaboradores the colaboradores to set
	 */
	public void setColaboradores(List<Usuario> colaboradores) {
		this.colaboradores = colaboradores;
	}

	/**
	 * @return the dataInclusao
	 */
	public Calendar getDataInclusao() {
		return dataInclusao;
	}

	/**
	 * @param dataInclusao the dataInclusao to set
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
	 * @param dataAtualizacao the dataAtualizacao to set
	 */
	public void setDataAtualizacao(Calendar dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	
	

}
