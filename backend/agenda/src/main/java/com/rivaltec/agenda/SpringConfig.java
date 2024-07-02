package com.rivaltec.agenda;

import com.rivaltec.agenda.models.dao.IAgendaDAO;
import com.rivaltec.agenda.models.dao.AgendaDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public IAgendaDAO agendaDAO() {
        return new AgendaDAOImpl(); // Aquí debes instanciar la implementación de IAgendaDAO
    }
}