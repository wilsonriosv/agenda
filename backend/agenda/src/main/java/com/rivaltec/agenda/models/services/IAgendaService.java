package com.rivaltec.agenda.models.services;

import java.util.List;

import com.rivaltec.agenda.models.entity.Agenda;

public interface IAgendaService {
    Agenda findAgendaById(int id);
    void saveAgenda(Agenda agenda);
    void updateAgenda(Agenda agenda);
    void deleteAgenda(int id);
	List<Agenda> getAgenda();
}