package model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Habilidade;


public class TipoHabilidadeDAO {
	
	



	public void salvar(Habilidade  tipohabilidade) {

		EntityManager entitymanager = JPAUtil.getEntityManager();

		entitymanager.getTransaction().begin();

		entitymanager.merge(tipohabilidade);

		entitymanager.getTransaction().commit();

		entitymanager.close();

	}

	@SuppressWarnings("unchecked")
	public List<Habilidade> listarTodos(){

		EntityManager entitymanager = JPAUtil.getEntityManager();

		Query query = entitymanager.createQuery("from Habilidade");

		return query.getResultList();
	}
	
	

		//CARREGAR HABILIDADES DO BANCO
		public Habilidade lerPorId(Integer id)
		{
						
			EntityManager em = JPAUtil.getEntityManager();
			return  em.find(Habilidade.class, id);
		
		}



}