package br.com.jh.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jh.model.Cliente;

public class RemovendoPrimeiroObjeto {

	public static void main(String[] args) {
		
		//Iniciando fabrica de entity manager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		//serviço central para todas as ações de persistência
		EntityManager em = emf.createEntityManager();
		
		//Faz a consulta para pegar o cliente
		Cliente cliente = em.find(Cliente.class, 2L);
		
		em.getTransaction().begin();
		//Remove o cliente
		em.remove(cliente);
		em.getTransaction().commit();
		
		System.out.println("objetovo removido com sucesso!");
	}

}
