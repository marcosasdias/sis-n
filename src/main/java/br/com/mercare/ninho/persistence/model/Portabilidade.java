package br.com.mercare.ninho.persistence.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "N_PORTABILIDADE")
public class Portabilidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	@OneToOne
	@JoinColumn(name = "ID_BANCO")
	private Banco banco;

	@Column(name = "VLR_PARCELA")
	private Double valorParcela;

	@Column(name = "DAT_QUITACAO")
	private Calendar dataQuitacao;

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
	 * @return the banco
	 */
	public Banco getBanco() {
		return banco;
	}

	/**
	 * @param banco
	 *            the banco to set
	 */
	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	/**
	 * @return the valorParcela
	 */
	public Double getValorParcela() {
		return valorParcela;
	}

	/**
	 * @param valorParcela
	 *            the valorParcela to set
	 */
	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	/**
	 * @return the dataQuitacao
	 */
	public Calendar getDataQuitacao() {
		return dataQuitacao;
	}

	/**
	 * @param dataQuitacao
	 *            the dataQuitacao to set
	 */
	public void setDataQuitacao(Calendar dataQuitacao) {
		this.dataQuitacao = dataQuitacao;
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
