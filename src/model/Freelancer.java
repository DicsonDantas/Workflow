package model;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table(name="tab_freelancer")
public class Freelancer{

		
	   @Id
	   @GeneratedValue(strategy=GenerationType.SEQUENCE)
	    private Integer idFreelancer;
	   
		private String login; 	
		private String senha; 	
		private String nome; 	
		private String sobreNome;
		@Temporal(TemporalType.DATE)
		private Date dataNasc;
		private String cpf;
		private String email;
		private String numTel;
		private String numCel; 
		
		
		 @ManyToMany
		 @Basic(fetch=FetchType.LAZY)
		 @JoinColumn(name = "id_habilidade_fk")		
		 private List<Habilidade> habilidades;  //VERIFICAR SE É NECESSÁRIO CRIAR DUAS INSTÂNCIAS (CRIADO EM TIPOHABILIDADEFREELANCER (CLASSEASSOCIATIVA)  ) 


		
		//CONSTRUTORES
		public Freelancer(Integer idFreelancer, String login, String senha, String nome, String sobreNome, Date dataNasc,
				String cpf, String email, String numTel, String numCel, List<Habilidade> habilidades) {
			super();
			this.idFreelancer = idFreelancer;
			this.login = login;
			this.senha = senha;
			this.nome = nome;
			this.sobreNome = sobreNome;
			this.dataNasc = dataNasc;
			this.cpf = cpf;
			this.email = email;
			this.numTel = numTel;
			this.numCel = numCel;
			this.habilidades = habilidades;
		}

		public Freelancer() {
			super();
		}


		//GETTER AND SETTERS 
		public Integer getIdFreelancer() {
			return idFreelancer;
		}
		public void setIdFreelancer(Integer idFreelancer) {
			this.idFreelancer = idFreelancer;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSobreNome() {
			return sobreNome;
		}
		public void setSobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
		}
		public Date getDataNasc() {
			return dataNasc;
		}
		public void setDataNasc(Date dataNasc) {
			this.dataNasc = dataNasc;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNumTel() {
			return numTel;
		}
		public void setNumTel(String numTel) {
			this.numTel = numTel;
		}

		public String getNumCel() {
			return numCel;
		}
		public void setNumCel(String numCel) {
			this.numCel = numCel;
		}
		
		
		public List<Habilidade> getHabilidades() {
			return habilidades;
		}

		public void setHabilidades(List<Habilidade> habilidades) {
			this.habilidades = habilidades;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idFreelancer == null) ? 0 : idFreelancer.hashCode());
			return result;
		}
		
		//HASCHCODE do atributo idFreelancer, Equals do attr idFreelancer
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Freelancer other = (Freelancer) obj;
			if (idFreelancer == null) {
				if (other.idFreelancer != null)
					return false;
			} else if (!idFreelancer.equals(other.idFreelancer))
				return false;
			return true;
		}
		//toString de todos atributos

		@Override
		public String toString() {
			return "Freelancer [idFreelancer=" + idFreelancer + ", login=" + login + ", senha=" + senha + ", nome="
					+ nome + ", sobreNome=" + sobreNome + ", dataNasc=" + dataNasc + ", cpf=" + cpf + ", email=" + email
					+ ", numTel=" + numTel + ", numCel=" + numCel + ", habilidades=" + habilidades + "]";
		}

	
		
		

		
		
}