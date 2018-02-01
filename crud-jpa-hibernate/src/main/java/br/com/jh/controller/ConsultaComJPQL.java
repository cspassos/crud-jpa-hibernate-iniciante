package br.com.jh.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jh.model.Cliente;

public class ConsultaComJPQL {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		List<Cliente> cientes = em.createQuery("from Cliente", Cliente.class)
					.getResultList();
		
		for (Cliente cliente : cientes) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Profissao: " + cliente.getProfissao());
			System.out.println("Sexo: " + cliente.getSexo());
			System.out.println("Idade: " + cliente.getIdade());
			System.out.println("___________________________________");
		}
	}
}
