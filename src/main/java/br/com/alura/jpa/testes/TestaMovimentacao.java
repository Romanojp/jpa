package br.com.alura.jpa.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.TipoMovimentacao;


public class TestaMovimentacao {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setAgencia(123);
		conta.setNumero(152546);
		conta.setSaldo(500.0);
		conta.setTitular("Beatriz");
		
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setDescricao("Churrascaria");
		movimentacao.setValor(new BigDecimal(500.00));
		movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao.setConta(conta);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		
		   em.getTransaction().begin();
	        em.persist(movimentacao);
	        em.persist(conta);
	        em.getTransaction().commit();

	        em.close();
	}

}
