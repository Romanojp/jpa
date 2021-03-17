package br.com.alura.jpa.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



//Relacionamentos entre entidades precisam ser configurados pelas anotações no atributo que define o relacionamento na classe
//Um relacionamento do tipo Muitos-para-Um deve usar anotação a @ManyToOne
//A anotação @ManyToOne causa a criação de uma chave estrangeira
//A JPA carrega automaticamente o relacionamento ao carregar a entidade

@Entity

public class Movimentacao {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipoMovimentacao;
    private LocalDateTime data;
    private String descricao;
    private BigDecimal valor;
    
    @ManyToMany
    private List<Categoria> categiorias;
    
    @ManyToOne
    private Conta conta;
    
    
    
	public Long getId() {
		return id;
	}
	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public void setId(Long id) {
		this.id = id;
	}



	

	}

	
	
