package com.sr.users.dtos;

import com.sr.users.entities.User;

/**
 * Objeto de Transferência de Dados (DTO) para a entidade User.
 * Este DTO é utilizado para transferir dados do usuário entre as diferentes camadas da aplicação.
 *
 * @author Charles Borges de Melo (solucao.erp@gmail.com)
 * @version 1.0
 */
public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String password;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * Construtor para inicializar o UserDTO com base em uma entidade User.
     *
     * @param user A entidade User a ser transformada em DTO.
     */
    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
        password = user.getPassword();
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
     * Fornece uma representação em string do objeto UserDTO.
     *
     * @return Representação em string do UserDTO.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserDTO{")
                .append("id='").append(getId()).append('\'')
                .append(", name='").append(getName()).append('\'')
                .append(", email='").append(getEmail()).append('\'')
                .append('}');
        return sb.toString();
    }
}