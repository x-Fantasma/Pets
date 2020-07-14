package co.pets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.pets.model.Mascota;
import co.pets.service.MascotaService;

@RestController
@RequestMapping("/pets")
@CrossOrigin("localhost:4200")
public class MascotaController {
	
	@Autowired
	private MascotaService mascotaService;
	
	@GetMapping("{nroChip}/getmascota")
	public Mascota getMascota(@PathVariable(required = true) String nroChip) throws Exception {
		return mascotaService.getById(nroChip);
	}
	
	@PostMapping("/savemascota")
	public void saveMascota(@RequestBody Mascota mascota) throws Exception {
		mascotaService.save(mascota);
	}
}
