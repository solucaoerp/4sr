/**
 * Classe WebConfig.
 *
 * Oferece configurações para a camada web da aplicação, especialmente
 * para resolução de visualizações (views).
 *
 * @author Charles Borges de Melo (solucao.erp@gmail.com)
 * @version 1.0
 */
package com.sr.users.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig {

    /**
     * Cria um bean ViewResolver para resolver nomes de views para as views reais.
     * Este resolver está configurado para encontrar arquivos JSP no diretório /WEB-INF/jsp/.
     *
     * @return ViewResolver para views em JSP
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}