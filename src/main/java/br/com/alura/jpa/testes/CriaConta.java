package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaConta {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Maria");
		conta.setNumero(12523);
		conta.setAgencia(456);
		 //para esse insert fguncionar o mesmo devera esta dentro de uma transação
		
		//inicio da transação
		em.getTransaction().begin();
		em.persist(conta);//entidade chamando a persistencia
		em.getTransaction().commit();
		//finalizando a tranzação
		
		
		
		
}

}
