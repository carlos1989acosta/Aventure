/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.foto.bean;

import br.com.foto.daos.usuariosDaos;
import br.com.foto.entity.usuarios;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.annotation.ManagedBean;
import javax.inject.Named;
import java.util.ArrayList;

/**
 *
 * @author ACOSTA
 */

@ManagedBean
@Named(value = "ManagedBean")
@SessionScoped
public class usuariosBean implements Serializable {

    /**
     * Creates a new instance of usuariosBean
     */
    private usuarios usuarios=new usuarios();
    private  usuariosDaos usuariosdaos =new usuariosDaos();
    private List<usuarios>lista_usuarios;
    public usuariosBean() {
    }
    
        public usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(usuarios usuarios) {
        this.usuarios = usuarios;
    }
    
    public String adicionarusuarios(){
        usuariosdaos.addusuarios(usuarios);
        usuarios.setName(null);
        usuarios.setUser(null);
        usuarios.setPassword(null);
        return "index";
    }
        public String cancelarusuario(){
        usuariosdaos.cancelarusuario(usuarios);
        return "Eliminacion realizado con suceso";
    }
        


    public List listar_usuarios(){
      lista_usuarios= usuariosdaos.getList();
         
           return this.lista_usuarios;
        }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.usuarios);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final usuariosBean other = (usuariosBean) obj;
        if (!Objects.equals(this.usuarios, other.usuarios)) {
            return false;
        }
        return true;
    }

    
    
    
}
