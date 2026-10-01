package com.ejemplo.mvc.model;

import java.util.*;

public class UsuarioDAO {
    // Asegúrate de incluir <String, Usuario> aquí:
    private static final Map<String, Usuario> usuarios = new HashMap<>();

    static {
        usuarios.put("admin", new Usuario(
                "admin", "Admin123!", "Administrador General", "ADMIN"));
        usuarios.put("maria", new Usuario(
                "maria", "Maria2026!", "María Fernanda Rojas", "USER"));
    }

    public Usuario buscarPorUsername(String username) {
        return usuarios.get(username);
    }
}