package br.com.mercare.ninho.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mercare.ninho.persistence.model.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
   
	Usuario buscaPorEmail(String email);

	Usuario buscaPorLogin(String nome);
	
    @Override
    void delete(Usuario usuario);

    
}
