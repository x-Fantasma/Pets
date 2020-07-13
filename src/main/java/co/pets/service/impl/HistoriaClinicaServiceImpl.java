package co.pets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import antlr.collections.List;
import co.pets.model.HistoriaClinica;
import co.pets.repository.HistoriaClinicaRepository;
import co.pets.service.HistoriaClinicaService;

public class HistoriaClinicaServiceImpl implements HistoriaClinicaService{
	
	@Autowired
	private HistoriaClinicaRepository historiaClinicaRepository;

	@Override
	public void save(HistoriaClinica historiaClinica) throws Exception{

		historiaClinicaRepository.save(historiaClinica);
		
	}

	@Override
	public void update(HistoriaClinica v) throws Exception {
		
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HistoriaClinica getById(String id) {			
		return this.historiaClinicaRepository.findById(id).orElse(null);
	}

	@Override
	public List getAll() {
		// TODO Auto-generated meth
		return null;
	}

	
}
