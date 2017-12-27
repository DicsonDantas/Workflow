package controller;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import model.Freelancer;
import model.Habilidade;
import model.dao.FreelancerDAO;
import model.dao.TipoHabilidadeDAO;


@ManagedBean(name="freelancerMB")
@RequestScoped
public class FreelancerMB{

	
	private Freelancer freelancer = new Freelancer();	
	private FreelancerDAO freeladao = new FreelancerDAO();
	
	private List<Habilidade> tiposHabilidade = null;
	private List<Habilidade> tiposHabilidadeSelect = null;
	protected TipoHabilidadeDAO habilidadedao = new TipoHabilidadeDAO(); 
	
	//CONSTRUTOR
	public FreelancerMB(){
		tiposHabilidade = habilidadedao.listarTodos(); 
	}
	
	//LISTA TODOS OS FREELANCERS CADASTRADOS
	public void listarTodos(){
	}	
	
	//SALVA UMA INSTANCIA DE UM FREELANCER
	public String salvar(){
		freelancer.setHabilidades(tiposHabilidadeSelect);
		freeladao.salvar(freelancer);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Salvo Com Sucesso!"));
		return "";
	}
	

	// CARREGAR DO BANCO ATRAVÉS DO ID
	public void acaoEditar() {          
		// this.freelancer = this.freeladao.loadById(id);
	    this.freelancer = this.freeladao.loadById(freelancer.getIdFreelancer()); 
	    
	}


	
	public String goHome(){
		return "index?faces-redirect=true";
	}


	public String goCadastroFreelancer(){
		return "cadastrofreelancer?faces-redirect=true";
	}
	

	///GETTERS AND SETTERS

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public FreelancerDAO getFreeladao() {
		return freeladao;
	}

	public void setFreeladao(FreelancerDAO freeladao) {
		this.freeladao = freeladao;
	}

	

	public List<Habilidade> getTiposHabilidade() {
		return tiposHabilidade;
	}

	public void setTiposHabilidade(List<Habilidade> tiposHabilidade) {
		this.tiposHabilidade = tiposHabilidade;
	}


	public TipoHabilidadeDAO getHabilidadedao() {
		return habilidadedao;
	}


	public void setHabilidadedao(TipoHabilidadeDAO habilidadedao) {
		this.habilidadedao = habilidadedao;
	}


	public List<Habilidade> getTiposHabilidadeSelect() {
		return tiposHabilidadeSelect;
	}




	public void setTiposHabilidadeSelect(List<Habilidade> tiposHabilidadeSelect) {
		this.tiposHabilidadeSelect = tiposHabilidadeSelect;
	}
	

//     LIST QUE RECEBE UM getLabel DAS ENUM's CRIADAS FALTA GET E SET
//	 private List<TipoHabilidade> tipos = Arrays.asList(TipoHabilidade.values()); 
//	
	
}