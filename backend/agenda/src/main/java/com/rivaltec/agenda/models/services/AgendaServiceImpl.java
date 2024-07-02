package com.rivaltec.agenda.models.services;

import com.rivaltec.agenda.models.dao.IAgendaDAO;
import com.rivaltec.agenda.models.entity.Agenda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaServiceImpl implements IAgendaService {

    @Autowired
    private IAgendaDAO agendaDAO;

    @Override
	//@Transactional(readOnly=true)
	public List<Agenda> getAgenda() {
		return agendaDAO.getAgenda();
	}

    @Override
    public Agenda findAgendaById(int id) {
        return agendaDAO.findById(id);
    }

    @Override
    public void saveAgenda(Agenda agenda) {
        agendaDAO.save(agenda);
    }

    @Override
    public void updateAgenda(Agenda agenda) {
        agendaDAO.update(agenda);
    }

    @Override
    public void deleteAgenda(int id) {
        Agenda agenda = agendaDAO.findById(id);
        if (agenda != null) {
            agendaDAO.delete(agenda);
        }
    }

}