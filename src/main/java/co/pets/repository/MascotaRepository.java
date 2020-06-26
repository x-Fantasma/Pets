package co.pets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.pets.model.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, String>{

}
