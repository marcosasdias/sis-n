package br.com.mercare.ninho.persistence.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "N_PROPOSTA")
public class Proposta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;

	@Column(name = "CODIGO")
	private Long codigo;

	@Column(name = "CONTRATO")
	private Long contrato;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "VALOR_CONTRATO")
	private Double valorContrato;

	@Column(name = "VALOR_SOLICITADO")
	private Double valorSolicitado;

	@Column(name = "BASE_CALCULO")
	private Double baseCalculo;

	@Column(name = "VALOR_TAC")
	private Double valorTAC;

	@Column(name = "PERC_PREVISTO_COMISS")
	private Double percPrevistoComiss;

	@Column(name = "VALOR_IOF")
	private Double valorIOF;

	@Column(name = "QTDE_PARCELAS")
	private Long qtdeParcelas;

	@Column(name = "VALOR_PARCELA")
	private Double valorParcela;

	@Column(name = "VALOR_FINAL_CONTRATO")
	private Double valorFinalContrato;

	@Column(name = "DAT_PGTO_CONTRATO")
	private Calendar dataPgtoContrato;

	@Column(name = "DAT_DIGIT_CONTRATO")
	private Calendar dataDigitContrato;
	
	@ManyToOne
	private Unidade unidade;

	@ManyToOne
	private Cliente cliente;

	@ManyToOne
	private Usuario responsavel;

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
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the contrato
	 */
	public Long getContrato() {
		return contrato;
	}

	/**
	 * @param contrato
	 *            the contrato to set
	 */
	public void setContrato(Long contrato) {
		this.contrato = contrato;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the valorContrato
	 */
	public Double getValorContrato() {
		return valorContrato;
	}

	/**
	 * @param valorContrato
	 *            the valorContrato to set
	 */
	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	/**
	 * @return the valorSolicitado
	 */
	public Double getValorSolicitado() {
		return valorSolicitado;
	}

	/**
	 * @param valorSolicitado
	 *            the valorSolicitado to set
	 */
	public void setValorSolicitado(Double valorSolicitado) {
		this.valorSolicitado = valorSolicitado;
	}

	/**
	 * @return the baseCalculo
	 */
	public Double getBaseCalculo() {
		return baseCalculo;
	}

	/**
	 * @param baseCalculo
	 *            the baseCalculo to set
	 */
	public void setBaseCalculo(Double baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	/**
	 * @return the valorTAC
	 */
	public Double getValorTAC() {
		return valorTAC;
	}

	/**
	 * @param valorTAC
	 *            the valorTAC to set
	 */
	public void setValorTAC(Double valorTAC) {
		this.valorTAC = valorTAC;
	}

	/**
	 * @return the percPrevistoComiss
	 */
	public Double getPercPrevistoComiss() {
		return percPrevistoComiss;
	}

	/**
	 * @param percPrevistoComiss
	 *            the percPrevistoComiss to set
	 */
	public void setPercPrevistoComiss(Double percPrevistoComiss) {
		this.percPrevistoComiss = percPrevistoComiss;
	}

	/**
	 * @return the valorIOF
	 */
	public Double getValorIOF() {
		return valorIOF;
	}

	/**
	 * @param valorIOF
	 *            the valorIOF to set
	 */
	public void setValorIOF(Double valorIOF) {
		this.valorIOF = valorIOF;
	}

	/**
	 * @return the qtdeParcelas
	 */
	public Long getQtdeParcelas() {
		return qtdeParcelas;
	}

	/**
	 * @param qtdeParcelas
	 *            the qtdeParcelas to set
	 */
	public void setQtdeParcelas(Long qtdeParcelas) {
		this.qtdeParcelas = qtdeParcelas;
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
	 * @return the valorFinalContrato
	 */
	public Double getValorFinalContrato() {
		return valorFinalContrato;
	}

	/**
	 * @param valorFinalContrato
	 *            the valorFinalContrato to set
	 */
	public void setValorFinalContrato(Double valorFinalContrato) {
		this.valorFinalContrato = valorFinalContrato;
	}

	/**
	 * @return the dataPgtoContrato
	 */
	public Calendar getDataPgtoContrato() {
		return dataPgtoContrato;
	}

	/**
	 * @param dataPgtoContrato
	 *            the dataPgtoContrato to set
	 */
	public void setDataPgtoContrato(Calendar dataPgtoContrato) {
		this.dataPgtoContrato = dataPgtoContrato;
	}

	/**
	 * @return the dataDigitContrato
	 */
	public Calendar getDataDigitContrato() {
		return dataDigitContrato;
	}

	/**
	 * @param dataDigitContrato
	 *            the dataDigitContrato to set
	 */
	public void setDataDigitContrato(Calendar dataDigitContrato) {
		this.dataDigitContrato = dataDigitContrato;
	}

	/**
	 * @return the unidade
	 */
	public Unidade getUnidade() {
		return unidade;
	}

	/**
	 * @param unidade
	 *            the unidade to set
	 */
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the responsavel
	 */
	public Usuario getResponsavel() {
		return responsavel;
	}

	/**
	 * @param responsavel
	 *            the responsavel to set
	 */
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
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
