package complejo.ejer;

public class Complejo implements Comparable<Complejo> {
	
	Double real;
	Double imaginario;
	
	public Complejo() {
		this.real = 0.0;
		this.imaginario=0.0;
	}
	
	public Complejo(double real, double imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	
	public Complejo sumar(Complejo num) {
		Complejo suma = new Complejo(num.real+this.real,this.imaginario+num.imaginario);
		return suma;
	}
	public Complejo sumar(double num) {
		Complejo suma = new Complejo(this.real + num, this.imaginario);
		return suma;
	}
	public Complejo restar(Complejo num) {
		
		Complejo resta = new Complejo(this.real - num.real, this.imaginario - num.imaginario);
		return resta;
	}
	public Complejo restar(double num) {
		Complejo resta = new Complejo(this.real-num,this.imaginario);
		return resta;
	}
	public Complejo multiplicar(double escalar) {
		
		Complejo multiplico = new Complejo(this.real * escalar, this.imaginario * escalar);
		return multiplico;
	}
	
	public Complejo mulplicar(Complejo num) {
		
		double real = this.real* num.real - this.imaginario * num.imaginario;
		double imaginario = this.real* num.imaginario + this.imaginario * num.real;
		
		return new Complejo(real,imaginario);
	}
	
	@Override
	public int compareTo(Complejo otro) { // SIRVE PARA ORDENAR SOLO UNO POR CLASE // EN ESTE CASO POR MODULOS
		return this.moduloDeUnComplejo().compareTo(otro.moduloDeUnComplejo());
	}
	public Double moduloDeUnComplejo() {
		
		return Math.sqrt(Math.pow(this.real, 2)+Math.pow(this.imaginario, 2));
	}
	public void clone(Complejo c1) {
		
		this.real = c1.real;
		this.imaginario = c1.imaginario;
	}

	@Override
	public String toString() {
		return real +" + "+ imaginario + "i";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(imaginario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(real);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(imaginario) != Double.doubleToLongBits(other.imaginario))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}

	
	
}
