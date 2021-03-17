package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class TestandoEstados {
//transient 
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Pedro");
		conta.setAgencia(321);
		conta.setNumero(122354);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		//Transient -> managed
		em.persist(conta);
		
		//Maneged -> removida
		em.remove(conta);
		
		em.getTransaction().commit();
		

	}

}
