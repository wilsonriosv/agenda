package com.rivaltec.agenda.controllers;

import com.rivaltec.agenda.models.entity.Agenda;
import com.rivaltec.agenda.models.services.IAgendaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AgendaRestController {

    @Autowired
    private IAgendaService agendaService;

    @GetMapping("/agendas")
	public List<Agenda> getAgenda(){
		return agendaService.getAgenda();
	}
    
    @GetMapping("/{id}")
    public Agenda getAgendaById(@PathVariable int id) {
        return agendaService.findAgendaById(id);
    }

    @PostMapping
    public void createAgenda(@RequestBody Agenda agenda) {
        agendaService.saveAgenda(agenda);
    }

    @PutMapping
    public void updateAgenda(@RequestBody Agenda agenda) {
        agendaService.updateAgenda(agenda);
    }

    @DeleteMapping("/{id}")
    public void deleteAgenda(@PathVariable int id) {
        agendaService.deleteAgenda(id);
    }
}