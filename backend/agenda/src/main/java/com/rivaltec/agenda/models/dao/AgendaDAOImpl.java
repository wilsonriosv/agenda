package com.rivaltec.agenda.models.dao;

import com.rivaltec.agenda.models.entity.Agenda;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AgendaDAOImpl implements IAgendaDAO {

    private static final Map<Integer, Agenda> agendas = new HashMap<>();

    @Override
	//@Transactional(readOnly=true)
	public List<Agenda> getAgenda() {
		return getAgenda();
	}
    
    @Override
    public Agenda findById(int id) {
        return agendas.get(id);
    }

    @Override
    public void save(Agenda agenda) {
        agendas.put(agenda.getId(), agenda);
    }

    @Override
    public void update(Agenda agenda) {
        agendas.put(agenda.getId(), agenda);
    }

    @Override
    public void delete(Agenda agenda) {
        agendas.remove(agenda.getId());
    }

}