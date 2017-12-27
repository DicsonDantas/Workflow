package model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tab_usuario")
public class Usuario{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idUsuario;	
	private String login; 	
	private String nome;
	private String sobreNome; 
	private String senha; 
	private String email; 
	@Temporal(TemporalType.DATE)
	private Date dataNascimento; 
	private String numTel; 
	private String numCel; 
	private String cpf;
	
	// private List<TipoHabilidade> tiposHabilidades = Arrays.asList(TipoHabilidade.values()); 

	
	//CONSTRUTORES
	public Usuario(Long idUsuario, String login, String nome, String sobreNome, String senha, String email,
			Date dataNascimento, String numTel, String numCel, String cpf) {
		super();
		this.idUsuario = idUsuario;
		this.login = login;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.senha = senha;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.numTel = numTel;
		this.numCel = numCel;
		this.cpf = cpf;
	
	}
	public Usuario() {
		super();
	}


	//GETTERS AND SETTERS
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	
	
	//HASHCODE E EQUALS DO ATRIBUTO idUsuario
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		return true;
	}

	//TOSTRING DE TODOS ATRIBUTOS
	
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", login=" + login + ", nome=" + nome + ", sobreNome=" + sobreNome
				+ ", senha=" + senha + ", email=" + email + ", dataNascimento=" + dataNascimento + ", numTel=" + numTel
				+ ", numCel=" + numCel + ", cpf=" + cpf + "]";
	}

	}

	





