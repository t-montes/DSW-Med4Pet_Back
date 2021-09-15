package co.edu.uniandes.dse.med4pet.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniandes.dse.med4pet.dto.RegistroMedicoDTO;
import co.edu.uniandes.dse.med4pet.entities.RegistroMedicoEntity;
import co.edu.uniandes.dse.med4pet.services.RegistroMedicoService;

@RestController
@RequestMapping("/registrosMedicos")
public class RegistroMedicoController 
{
	@Autowired
	private RegistroMedicoService registroMedicoService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<RegistroMedicoDTO> findAll()
	{
		List<RegistroMedicoEntity> registrosMedicos = registroMedicoService.getRegistrosMedicos();
		return modelMapper.map(registrosMedicos, new TypeToken<List<RegistroMedicoDTO>>(){}.getType());
	}
}
