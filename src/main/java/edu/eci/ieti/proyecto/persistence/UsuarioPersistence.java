package edu.eci.ieti.proyecto.persistence;

import java.util.List;

import edu.eci.ieti.proyecto.model.Usuario;

public interface UsuarioPersistence {

    public List<Usuario> findAll();

    public boolean existsById(int id);

    public void save(Usuario usuario);

    public Usuario findById(int id);

    public void update(int id, Usuario usuario);

    public void delete(int id);
    
}