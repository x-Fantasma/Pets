package co.pets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import co.pets.exceptions.ExceptionsMessages;
import co.pets.exceptions.impl.MascotaExceptions;
import co.pets.model.Mascota;
import co.pets.repository.MascotaRepository;
import co.pets.service.MascotaService;

@Service
public class MascotaServiceImpl implements MascotaService{
	
	@Autowired
	private MascotaRepository mascotaRepository;

	@Override
	public void save(Mascota mascota) throws MascotaExceptions {
		if(getById(mascota.getNroChip()) == null) {
			try {
				mascota.setfechaNacimiento(mascota.getEdad());
				mascotaRepository.save(mascota);
			} catch (MascotaExceptions e) {
				throw new MascotaExceptions(ExceptionsMessages.MENSAJE_EDAD_MASCOTA);
			}
						
		}else {
			throw new MascotaExceptions(ExceptionsMessages.MENSAJE_MASCOTA_EXISTENTE);
		}		
	}

	@Override
	public void update(Mascota mascota) throws MascotaExceptions {
		if(getById(mascota.getNroChip()) != null) {
			try {
				mascota.setfechaNacimiento(mascota.getEdad());
				mascotaRepository.save(mascota);
			} catch (MascotaExceptions e) {
				throw new MascotaExceptions(ExceptionsMessages.MENSAJE_EDAD_MASCOTA);
			}
						
		}else {
			throw new MascotaExceptions(ExceptionsMessages.MENSAJE_MASCOTA_INEXISTENTE);
		}	
		
	}

	@Override
	public void deleteById(String nroMicrochip) {
		mascotaRepository.deleteById(nroMicrochip);
		
	}

	@Override
	public Mascota getById(String nroMicrochip){
		return mascotaRepository.findById(nroMicrochip).orElse(null);
	}

	@Override
	public List getAll() {
		return (List) mascotaRepository.findAll();
	}

	

}
