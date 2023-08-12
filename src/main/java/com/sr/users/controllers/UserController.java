/**
 * Classe UserController.
 *
 * Controlador responsável por lidar com operações relacionadas à entidade User.
 * Oferece endpoints para exibição do formulário e registro do usuário.
 *
 * @author Charles Borges de Melo (solucao.erp@gmail.com)
 * @version 1.0
 */
package com.sr.users.controllers;

import com.sr.users.dtos.UserDTO;
import com.sr.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Controlador para lidar com as ações relacionadas a entidade User.
 * Define os métodos para exibir e processar o formulário de usuário.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Exibe a página inicial com o formulário para cadastro de usuário.
     *
     * @param model Modelo da view para passar informações para a camada de visualização.
     * @return Nome da view a ser exibida.
     */
    @GetMapping("/")
    public String showForm(Model model) {
        return "index";
    }

    /**
     * Processa o formulário após submissão e registra o usuário.
     * Após o registro, redireciona para a página inicial.
     *
     * @param userDTO Objeto de Transferência de Dados (DTO) do usuário com informações a serem salvas.
     * @param redirectAttributes Atributos usados para passar informações entre requisições.
     * @return Uma URL de redirecionamento para a página inicial.
     */
    @PostMapping("/register")
    public String processForm(@Validated @ModelAttribute UserDTO userDTO, RedirectAttributes redirectAttributes) {

        // salva o usuário no banco de dados
        userDTO = userService.saveUser(userDTO);

        // imprime os dados no console após salvar, neste ponto o ID deveria estar preenchido
        System.out.println(userDTO.toString());

        redirectAttributes.addAttribute("userId", userDTO.getId());

        return "redirect:/";
    }
}