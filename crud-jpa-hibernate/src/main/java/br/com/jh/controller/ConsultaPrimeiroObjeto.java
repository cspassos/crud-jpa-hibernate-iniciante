package br.com.jh.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jh.model.Cliente;

public class ConsultaPrimeiroObjeto {

	public static void main(String[] args) {
		
		//EntityManagerFactory -< fabrica de EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		//serviço central para todas as ações de persistência. Para funcionar devo criar primeiro o EntityManagerFactory
		EntityManager em = emf.createEntityManager();
		
		//Buscar pela classe e pelo codigo.
		Cliente cliente = em.find(Cliente.class, 1L);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getProfissao());
		System.out.println(cliente.getIdade());
		System.out.println(cliente.getSexo());
	}
		
}
