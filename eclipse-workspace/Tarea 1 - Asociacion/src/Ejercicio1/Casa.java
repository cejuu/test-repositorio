package Ejercicio1;
//@Autor Javier Cejuela realizado con Adrián Sánchez
public class Casa {
	private double superficie;
	private String direccion;
	Salon salonCasa;
	Cocina cocina;

	public Casa(double superficie, String direccion, Salon salonCasa, Cocina cocina) {
		this.superficie = superficie;
		this.direccion = direccion;
		this.salonCasa = salonCasa;
		this.cocina = cocina;
	}

	public double getSuperficie() {
		return superficie;
	}

	public String getDireccion() {
		return direccion;
	}

	public Salon getSalonCasa() {
		return salonCasa;
	}

	public Cocina getCocina() {
		return cocina;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setSalonCasa(Salon salonCasa) {
		this.salonCasa = salonCasa;
	}

	public void setCocina(Cocina cocina) {
		this.cocina = cocina;
	}
}
