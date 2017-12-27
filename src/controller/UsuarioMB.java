package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


import model.Usuario;
import model.dao.UsuarioDAO;

@ManagedBean(name = "usuarioMB")
@SessionScoped
public class UsuarioMB{

	Usuario usuario = new Usuario();
	UsuarioDAO usuariodao = new UsuarioDAO();
	public List<Usuario> usuarios = new ArrayList<Usuario>();
	
	//PRECISO REALIZAR MANUTENÇÃO SOBRE ESTE BEAN E REVER FUNCIONALIDADES
	
	public UsuarioMB(){
	
			
	}
	
	public UsuarioDAO getUsuariodao() {
		return usuariodao;
	}

	public void setUsuariodao(UsuarioDAO usuariodao) {
		this.usuariodao = usuariodao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String salvar() {
		usuariodao.salvar(usuario);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Salvo Com Sucesso!"));
		return "";
	}

	public String goHome() {
		return "index?faces-redirect=true";
	}

	public String goCadastroFreelancer() {
		return "cadastrofreelancer?faces-redirect=true";
	}

	public String goCadastroUsuario() {
		return "cadastrousuario?faces-redirect=true";
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void adicionarHabilidades(){
		
	}

}