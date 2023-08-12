package com.sr.users.services;

import com.sr.users.dtos.UserDTO;

/**
 * Interface UserService.
 *
 * Define os serviços relacionados à manipulação e operações de usuários no sistema.
 * Esta interface pode ser implementada para interagir com diferentes tipos de armazenamento de dados,
 * como bancos de dados, sistemas de arquivos ou serviços de nuvem.
 *
 * @author Charles Borges de Melo (solucao.erp@gmail.com)
 * @version 1.0
 */
public interface UserService {

    /**
     * Salva ou atualiza um usuário no sistema.
     *
     * Se o usuário já existir, suas informações serão atualizadas.
     * Caso contrário, um novo usuário será criado.
     *
     * @param userDTO Objeto contendo as informações do usuário a ser salvo ou atualizado.
     * @return UserDTO com informações atualizadas após a operação de salvamento.
     */
    UserDTO saveUser(UserDTO userDTO);
}
