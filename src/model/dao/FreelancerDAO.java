package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Freelancer;

public class FreelancerDAO {

	EntityManager em = JPAUtil.getEntityManager();

	
	public void salvar(Freelancer freelancer) {

		em.getTransaction().begin();

		em.merge(freelancer);

		em.getTransaction().commit();

		em.close();

	}
	

	//METODO NAO ESTA SENDO UTILIZADO POR ENQUANTO, FUTURAMENTE DEVERA SER IMPLEMENTADO NA TELA DE UM ADMIN POR EXEMPLO
	@SuppressWarnings("unchecked")
	public List<Freelancer> listarTodos() {

		EntityManager entitymanager = JPAUtil.getEntityManager();

		Query query = entitymanager.createQuery("from Freelancer");

		return query.getResultList();
	}
	


		//CARREGAR UM FREELANCER DO BANCO
		public Freelancer loadById(Integer id)
		{									
			return  em.find(Freelancer.class, id);
		
			

		}
}
