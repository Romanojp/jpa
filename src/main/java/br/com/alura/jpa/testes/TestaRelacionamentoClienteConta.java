package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Cliente;
import br.com.alura.jpa.modelo.Conta;

public class TestaRelacionamentoClienteConta {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager(); 
		
		Conta conta2 = new Conta();
		conta2.setId(1L);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("João");
		cliente2.setEndereco("Rua Panambi, 262");
		cliente2.setProfissao("Desenvolvedor");
		cliente2.setConta(conta2);
		
		em.getTransaction().begin();
		
		em.persist(cliente2);
		
		em.getTransaction().commit();
		em.close();
		
		
		
		

	}

}