package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



//Para inicializar a JPA, � preciso definir um arquivo de configura��o, chamado persistence.xml
//Nele, colocamos as configura��es mais importantes, como o driver e os dados da conex�o
//A classe Persistence l� a configura��o e cria uma EntityManagerFactory
//Podemos usar a JPA para gerar e atualizar as tabelas no banco de dados
//Uma entidade deve usar as anota��es @Entity e @Id
//@GeneratedValue n�o � obrigat�rio, mas pode ser �til para definir uma chave auto-increment
public class TesteCriaTabelas {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager createEntityManager = emf.createEntityManager();
		emf.close();

	}

}
