package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Teste {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("aula_jpa");
		
		EntityManager entityManeger = factory.createEntityManager();
		
		entityManeger.getTransaction().begin();

		Pessoa p1 = new Pessoa(null, "Victor", "victor@email.com");
		Pessoa p2 = new Pessoa(null, "Leonardo", "leonardo@email.com");
		Pessoa p3 = new Pessoa(null, "Jose", "jose@email.com");
		
		entityManeger.persist(p1);
		entityManeger.persist(p2);
		entityManeger.persist(p3);
		
		Pessoa p4 = entityManeger.find(Pessoa.class, 2);
		
		System.out.println(p4);
		
		entityManeger.getTransaction().commit();
		entityManeger.close();
		factory.close();
	}
}
