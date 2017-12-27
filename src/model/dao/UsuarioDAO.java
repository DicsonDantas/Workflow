package model.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Usuario;

public class UsuarioDAO {

	public void salvar(Usuario usuario) {

		EntityManager entitymanager = JPAUtil.getEntityManager();

		entitymanager.getTransaction().begin();

		entitymanager.merge(usuario);

		entitymanager.getTransaction().commit();

		entitymanager.close();

	}

	@SuppressWarnings("unchecked")
	public List<Usuario> listarTodos(){

		EntityManager entitymanager = JPAUtil.getEntityManager();

		Query query = entitymanager.createQuery("from Usuario");

		return query.getResultList();
	}

}
