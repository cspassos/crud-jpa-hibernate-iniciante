package br.com.jh.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jh.model.Cliente;

public class SalvandoPrimeiroObjeto {
	
	public static void main(String[] args) {
		
		//EntityManagerFactory -< fabrica de EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		//Para funcionar devo criar primeiro o EntityManagerFactory
		EntityManager em = emf.createEntityManager();
		
		
		//toda vez ao inicializar um banco de dados, deve iniciar uma transação
		// o begin faz isso e atualiza o banco de dados de pois deve usar o commit para commitar a transação.
		Cliente cliente = new Cliente();

		cliente.setNome("Caic Souza Passos");
		cliente.setIdade(21);
		cliente.setSexo("M");
		cliente.setProfissao("Desenvolvedor");
		
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
		System.out.println("Cliente salvo com sucesso!!!");
	}
}
