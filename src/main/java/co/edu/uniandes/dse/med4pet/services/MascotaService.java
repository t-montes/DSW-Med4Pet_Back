package co.edu.uniandes.dse.med4pet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.med4pet.entities.MascotaEntity;
import co.edu.uniandes.dse.med4pet.repositories.MascotaRepository;

@Service
public class MascotaService {

	@Autowired
	private MascotaRepository mascotaRepository;
	
	//OBtener todos los clientes
	@Transactional
	public List<MascotaEntity> getMascotas(){
		return mascotaRepository.findAll();
	}
}