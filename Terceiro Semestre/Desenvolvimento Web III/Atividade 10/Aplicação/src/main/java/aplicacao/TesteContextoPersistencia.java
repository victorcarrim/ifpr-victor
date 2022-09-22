package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;
import dominio.Veiculo;

public class TesteContextoPersistencia {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("aula_jpa");
		
		EntityManager entityManeger = factory.createEntityManager();
		
		entityManeger.getTransaction().begin();
		
		Pessoa p1 = entityManeger.find(Pessoa.class, 1);
		System.out.println("buscou uma vez...");
		
		if(entityManeger.contains(p1)) {
			System.out.println("Monitorado na memoria");
		}
		
		Pessoa p2 = entityManeger.find(Pessoa.class, 1);
		System.out.println("buscou outra vez...");
		
		if(p1 == p2) {
			System.out.println("Iguais");
		}
		
		Veiculo v1 = entityManeger.find(Veiculo.class, 1L);
		System.out.println(v1);
		
		
		
		entityManeger.getTransaction().commit();
	}
}
