/**
 * Interface UserRepository.
 *
 * Interface para operações CRUD relacionadas à entidade {@link User}. Esta interface
 * estende {@link JpaRepository}, e portanto herda uma série de métodos para operações
 * com a entidade User, como save, delete e find.
 *
 * @author Charles Borges de Melo (solucao.erp@gmail.com)
 * @version 1.0
 * @see User
 */
package com.sr.users.repositories;

import com.sr.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
