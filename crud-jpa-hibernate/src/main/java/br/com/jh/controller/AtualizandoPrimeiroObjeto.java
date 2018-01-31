package br.com.jh.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jh.model.Cliente;

public class AtualizandoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		//busco o cliente que vou fazer o update
		Cliente cliente = em.find(Cliente.class, 1L);
		
		em.getTransaction().begin();
		//UPDATE
			cliente.setNome("Caic Passos");
			cliente.setProfissao("Programador");
		em.getTransaction().commit();
		
		System.out.println("Cliente alterado com sucesso: " + cliente.getNome());
	}

}
