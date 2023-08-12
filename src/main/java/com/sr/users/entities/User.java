/**
 * Classe User.
 *
 * Representa a entidade de um usuário no sistema. Contém informações como ID, nome, e-mail e senha.
 *
 * @author Charles Borges de Melo (solucao.erp@gmail.com)
 * @version 1.0
 */
package com.sr.users.entities;

import jakarta.persistence.*;

/**
 * Entidade que representa um usuário no banco de dados.
 * Esta classe é usada pelo JPA para realizar operações CRUD relacionadas à tabela "users".
 */
@Entity
@Table(name = "users")
public class User {
    /**
     * Identificador único do usuário. É gerado automaticamente.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    /**
     * Construtor padrão.
     */
    public User() {
    }

    /**
     * Construtor com parâmetros.
     *
     * @param id Identificador único do usuário.
     * @param name Nome do usuário.
     * @param email Endereço de e-mail do usuário.
     * @param password Senha do usuário.
     */
    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Retorna uma representação string da entidade User.
     * Inclui os principais atributos do usuário.
     *
     * @return String representando o usuário.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{")
                .append("id='").append(getId()).append('\'')
                .append(", name='").append(getName()).append('\'')
                .append(", email='").append(getEmail()).append('\'')
                .append('}');
        return sb.toString();
    }
}