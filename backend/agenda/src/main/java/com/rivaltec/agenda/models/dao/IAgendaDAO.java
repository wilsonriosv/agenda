package com.rivaltec.agenda.models.dao;

import java.util.List;

import com.rivaltec.agenda.models.entity.Agenda;

public interface IAgendaDAO {
	
	Agenda findById(int id);
    void save(Agenda agenda);
    void update(Agenda agenda);
    void delete(Agenda agenda);
	List<Agenda> getAgenda();
}
