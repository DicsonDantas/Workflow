package model;

import java.util.List;

public class OrdemDeServico {

	private Long IdOs;
	private Freelancer freelancer; 
	private List<Freelancer> freelancersCandidatos; 
	private String descricaoServico; 
	private Double valorEstimadoMinimo; 
	private Double valorEstimadoMaximo; 
	private Habilidade tipohabilidade;
	
	
	
	//CONSTRUTORES

	public OrdemDeServico(Long idOs, Freelancer freelancer, List<Freelancer> freelancersCandidatos,
			String descricaoServico, Double valorEstimadoMinimo, Double valorEstimadoMaximo,
			Habilidade tipohabilidade) {
		super();
		IdOs = idOs;
		this.freelancer = freelancer;
		this.freelancersCandidatos = freelancersCandidatos;
		this.descricaoServico = descricaoServico;
		this.valorEstimadoMinimo = valorEstimadoMinimo;
		this.valorEstimadoMaximo = valorEstimadoMaximo;
		this.tipohabilidade = tipohabilidade;
	}

	public OrdemDeServico() {
		super();
	} 
	
	
	//GETTERS AND SETTERS 
	
	public Long getIdOs() {
		return IdOs;
	}	
	public void setIdOs(Long idOs) {
		IdOs = idOs;
	}
	public Freelancer getFreelancer() {
		return freelancer;
	}
	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}
	public List<Freelancer> getFreelancersCandidatos() {
		return freelancersCandidatos;
	}
	public void setFreelancersCandidatos(List<Freelancer> freelancersCandidatos) {
		this.freelancersCandidatos = freelancersCandidatos;
	}
	public String getDescricaoServico() {
		return descricaoServico;
	}
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
	public Double getValorEstimadoMinimo() {
		return valorEstimadoMinimo;
	}
	public void setValorEstimadoMinimo(Double valorEstimadoMinimo) {
		this.valorEstimadoMinimo = valorEstimadoMinimo;
	}
	public Double getValorEstimadoMaximo() {
		return valorEstimadoMaximo;
	}
	public void setValorEstimadoMaximo(Double valorEstimadoMaximo) {
		this.valorEstimadoMaximo = valorEstimadoMaximo;
	}
	public Habilidade getTipohabilidade() {
		return tipohabilidade;
	}
	public void setTipohabilidade(Habilidade tipohabilidade) {
		this.tipohabilidade = tipohabilidade;
	}


	
	
	
	
}
