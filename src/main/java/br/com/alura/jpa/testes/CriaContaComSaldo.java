package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaContaComSaldo {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Thais");
		conta.setNumero(12542);
		conta.setAgencia(6969);
		conta.setSaldo(5100.0);
		 //para esse insert fguncionar o mesmo devera esta dentro de uma transação
		
		//inicio da transação
		em.getTransaction().begin();
		em.persist(conta);//entidade chamando a persistencia
		em.getTransaction().commit();
		//finalizando a tranzação
		em.close();
		
		
		//apos o close a meneira de buscar o id especifico e alyterar o saldo é recriando a entiodade e recuperando a conta pelo merge()
		EntityManager em2 = emf.createEntityManager();
		conta.setSaldo(2300.0);
		
		em2.getTransaction().begin();
		
		em2.merge(conta);
		
		em2.getTransaction().commit();		
}

}
