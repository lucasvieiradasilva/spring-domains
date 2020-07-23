package br.com.unnamed.springdomains.models.usuario;

import java.util.ArrayList;
import java.util.List;

//@Entity
public class Usuario {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String senha;
	private String nome;
	private String email;
	
//	@ManyToMany(fetch = FetchType.EAGER)
	private List<Role> roles = new ArrayList<>();
	
	
	
	
}
