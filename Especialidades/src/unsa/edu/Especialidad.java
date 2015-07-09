package unsa.edu;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Especialidad {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String mension;
	
	@Persistent
	private String especialidades;
	@Persistent
	private String nombre;
	@Persistent
	private String apellidos;

	@Override
	public String toString() {
		return "Especialidad [mension=" + mension + ", especialidades="
				+ especialidades + "]";
	}


	public Especialidad(String mension, String especialidades,String nombre,String apellidos) {
		super();
		this.mension = mension;
		this.especialidades = especialidades;
		this.nombre=nombre;
		this.apellidos=apellidos;
	}

	public String getMension() {
		return mension;
	}

	public void setMension(String mension) {
		this.mension = mension;
	}

	public String getEspecialidades() {
		return especialidades;
	}


	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	

	
}