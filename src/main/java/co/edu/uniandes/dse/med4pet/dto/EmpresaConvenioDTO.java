package co.edu.uniandes.dse.med4pet.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class EmpresaConvenioDTO  {
	
	//===========================================================================
	// Atributos
	//===========================================================================

	/**
	 * Identificador
	 */
	private Long id;
	
	/**
	 * Representa el nombre de la empresa asociada.
	 */
	private String nombre;
	/**
	 * Representa el nit propio de la empresa asociada.
	 */
	private String nit;
	
	/**
	 * Representa el servicio que presta de la empresa asociada.
	 */
	private String servicio;
}