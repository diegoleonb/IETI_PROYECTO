package edu.eci.ieti.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.ieti.proyecto.model.Usuario;
import edu.eci.ieti.proyecto.persistence.UsuarioPersistence;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioPersistence usuarioPersistence;

    public boolean existsById(int id) {
        return usuarioPersistence.existsById(id);
    }

    public List<Usuario> findAll() {
        return usuarioPersistence.findAll();
    }

    public void save(Usuario usuario) {
        usuarioPersistence.save(usuario);
    }

    public Usuario findById(int id) {
        return usuarioPersistence.findById(id);
    }

    public void update(int id, Usuario usuario) {
        usuarioPersistence.update(id, usuario);
    }

    public void delete(int id) {
        usuarioPersistence.delete(id);
    }

}
