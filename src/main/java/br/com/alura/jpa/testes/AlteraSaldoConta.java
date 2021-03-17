package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class AlteraSaldoConta {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		Conta contaDoJuliano = em.find(Conta.class, 1L); //alterando o valor da conta (find (Achar))
		
		
		em.getTransaction().begin();
		contaDoJuliano.setSaldo(20.00);
		
		em.getTransaction().commit();
	}

}
