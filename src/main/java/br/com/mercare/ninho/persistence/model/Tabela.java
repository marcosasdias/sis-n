package br.com.mercare.ninho.persistence.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "N_TABELA")
public class Tabela implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	@Column(name = "INSTITUICAO")
	private String instituicao;

	@Column(name = "VIGENCIA")
	private Calendar vigencia;

	@Column(name = "PARCERIA")
	private String parceria;

	@Column(name = "OBSERVACAO")
	private String observacao;

	@Column(name = "TABELA")
	private String tabela;

	@Column(name = "CODIGO_TABELA")
	private String codigoTabela;

	@ManyToOne
	@JoinColumn(name = "ID_OPERACAO")
	private Operacao operacao;

	@Column(name = "PRAZO")
	private Long prazo;

	@Column(name = "COMISSAO_AVISTA")
	private Double comissaoVista;

	@Column(name = "TX_MANU_DIFERIDO")
	private Double txManutDiferido;

	@Column(name = "TX_MANU_ANTECIPADO")
	private Double txManuAntecipado;

	@Column(name = "BONUS")
	private Double bonus;

	@Column(name = "TOTAL_COMISSAO_SA")
	private Double totalComissaoSA;// SA Sem antecipacao

	@Column(name = "TOTAL_COMISSAO_CA")
	private Double totalComissaoCA;// CA Com antecipacao

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
	 * @return the instituicao
	 */
	public String getInstituicao() {
		return instituicao;
	}

	/**
	 * @return the vigencia
	 */
	public Calendar getVigencia() {
		return vigencia;
	}

	/**
	 * @return the parceria
	 */
	public String getParceria() {
		return parceria;
	}

	/**
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @return the tabela
	 */
	public String getTabela() {
		return tabela;
	}

	/**
	 * @return the codigoTabela
	 */
	public String getCodigoTabela() {
		return codigoTabela;
	}

	/**
	 * @return the operacao
	 */
	public Operacao getOperacao() {
		return operacao;
	}

	/**
	 * @return the prazo
	 */
	public Long getPrazo() {
		return prazo;
	}

	/**
	 * @return the comissaoVista
	 */
	public Double getComissaoVista() {
		return comissaoVista;
	}

	/**
	 * @return the txManutDiferido
	 */
	public Double getTxManutDiferido() {
		return txManutDiferido;
	}

	/**
	 * @return the txManuAntecipado
	 */
	public Double getTxManuAntecipado() {
		return txManuAntecipado;
	}

	/**
	 * @return the bonus
	 */
	public Double getBonus() {
		return bonus;
	}

	/**
	 * @return the totalComissaoSA
	 */
	public Double getTotalComissaoSA() {
		return totalComissaoSA;
	}

	/**
	 * @return the totalComissaoCA
	 */
	public Double getTotalComissaoCA() {
		return totalComissaoCA;
	}

	/**
	 * @return the dataInclusao
	 */
	public Calendar getDataInclusao() {
		return dataInclusao;
	}

	/**
	 * @return the dataAtualizacao
	 */
	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param instituicao
	 *            the instituicao to set
	 */
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	/**
	 * @param vigencia
	 *            the vigencia to set
	 */
	public void setVigencia(Calendar vigencia) {
		this.vigencia = vigencia;
	}

	/**
	 * @param parceria
	 *            the parceria to set
	 */
	public void setParceria(String parceria) {
		this.parceria = parceria;
	}

	/**
	 * @param observacao
	 *            the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	/**
	 * @param tabela
	 *            the tabela to set
	 */
	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	/**
	 * @param codigoTabela
	 *            the codigoTabela to set
	 */
	public void setCodigoTabela(String codigoTabela) {
		this.codigoTabela = codigoTabela;
	}

	/**
	 * @param operacao
	 *            the operacao to set
	 */
	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

	/**
	 * @param prazo
	 *            the prazo to set
	 */
	public void setPrazo(Long prazo) {
		this.prazo = prazo;
	}

	/**
	 * @param comissaoVista
	 *            the comissaoVista to set
	 */
	public void setComissaoVista(Double comissaoVista) {
		this.comissaoVista = comissaoVista;
	}

	/**
	 * @param txManutDiferido
	 *            the txManutDiferido to set
	 */
	public void setTxManutDiferido(Double txManutDiferido) {
		this.txManutDiferido = txManutDiferido;
	}

	/**
	 * @param txManuAntecipado
	 *            the txManuAntecipado to set
	 */
	public void setTxManuAntecipado(Double txManuAntecipado) {
		this.txManuAntecipado = txManuAntecipado;
	}

	/**
	 * @param bonus
	 *            the bonus to set
	 */
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	/**
	 * @param totalComissaoSA
	 *            the totalComissaoSA to set
	 */
	public void setTotalComissaoSA(Double totalComissaoSA) {
		this.totalComissaoSA = totalComissaoSA;
	}

	/**
	 * @param totalComissaoCA
	 *            the totalComissaoCA to set
	 */
	public void setTotalComissaoCA(Double totalComissaoCA) {
		this.totalComissaoCA = totalComissaoCA;
	}

	/**
	 * @param dataInclusao
	 *            the dataInclusao to set
	 */
	public void setDataInclusao(Calendar dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	/**
	 * @param dataAtualizacao
	 *            the dataAtualizacao to set
	 */
	public void setDataAtualizacao(Calendar dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}
