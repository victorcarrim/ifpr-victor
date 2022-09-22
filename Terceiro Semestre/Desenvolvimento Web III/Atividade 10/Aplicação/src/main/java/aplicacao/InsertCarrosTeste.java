package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dominio.Proprietario;
import dominio.TipoCombustivel;
import dominio.Veiculo;

public class InsertCarrosTeste {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("aula_jpa");
		
		EntityManager entityManeger = factory.createEntityManager();
		
		EntityTransaction transaction = entityManeger.getTransaction();
		
		transaction.begin();
		
		Proprietario p1 = new Proprietario();
		p1.setNome("Paulinho da Massa");
		p1.setEmail("massinha@email.com");
		entityManeger.persist(p1);
		
		Veiculo v1 = new Veiculo();
		v1.setFabricante("Ford");
		v1.setModelo("Camaro");
		v1.setAnoFabricacao(2022);
		v1.setValor(222000.00);
		v1.setTipoCombustivel(TipoCombustivel.ALCOOL);
		v1.setProprietario(p1);
		entityManeger.persist(v1);
		
//		Veiculo v2 = new Veiculo();
//		v2.setFabricante("Fiat");
//		v2.setModelo("Pulse");
//		v2.setAnoFabricacao(2022);
//		v2.setValor(192000.00);
//		v2.setTipoCombustivel(TipoCombustivel.DIESEL);
//		entityManeger.persist(v2);
//		
//		Veiculo v3 = new Veiculo();
//		v3.setFabricante("Ford");
//		v3.setModelo("KA");
//		v3.setAnoFabricacao(2014);
//		v3.setValor(37000.00);
//		v3.setTipoCombustivel(TipoCombustivel.GASOLINA);
//		entityManeger.persist(v3);
		
		transaction.commit();
		
		
	}
}
