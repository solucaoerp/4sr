package com.sr.users.services;

import com.sr.users.dtos.UserDTO;
import com.sr.users.entities.User;
import com.sr.users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserServiceImpl.
 *
 * Implementação concreta da interface UserService. Esta classe realiza operações de usuário
 * utilizando a JPA e interage diretamente com a camada de repositório.
 *
 * @author Charles Borges de Melo (solucao.erp@gmail.com)
 * @version 1.0
 * @see UserService
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * Instância do repositório de usuário. Utilizado para operações CRUD de usuário.
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * Salva um novo usuário no banco de dados ou atualiza um existente.
     * A operação é envolvida em uma transação para garantir a integridade dos dados.
     *
     * @param userDTO DTO contendo informações do usuário a ser salvo.
     * @return UserDTO com informações atualizadas após a operação de salvamento.
     */
    @Override
    @Transactional
    public UserDTO saveUser(UserDTO userDTO) {

        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());

        User savedUser = userRepository.save(user);

        return new UserDTO(savedUser);
    }
}
