package ejercicio10;

public class Consumo {
	
	/**
	 * @param kms
	 * @param litros
	 * @param vmed
	 * @param pgas
	 */
	Consumo(double kms, double litros, double vmed, double pgas) {
		super();
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Consumo [kms=");
		builder.append(kms);
		builder.append(", litros=");
		builder.append(litros);
		builder.append(", vmed=");
		builder.append(vmed);
		builder.append(", pgas=");
		builder.append(pgas);
		builder.append("]");
		return builder.toString();
	}

	double getTiempo() {
		return kms/vmed*60;
	}
	
	double consumoEuros() {
		return (pgas*litros);
	}
	
	double consumoMedio() {
		return(kms/litros);
	}
	
	double kms,litros,vmed,pgas;

	/**
	 * @return the kms
	 */
	public double getKms() {
		return kms;
	}

	/**
	 * @param kms the kms to set
	 */
	public void setKms(double kms) {
		this.kms = kms;
	}

	/**
	 * @return the litros
	 */
	public double getLitros(double litros) {
		return litros;
	}

	/**
	 * @param litros the litros to set
	 */
	public void setLitros(double litros) {
		this.litros = litros;
	}

	/**
	 * @return the vmed
	 */
	public double getVmed() {
		return vmed;
	}

	/**
	 * @param vmed the vmed to set
	 */
	public void setVmed(double vmed) {
		this.vmed = vmed;
	}

	/**
	 * @return the pgas
	 */
	public double getPgas() {
		return pgas;
	}

	/**
	 * @param pgas the pgas to set
	 */
	public void setPgas(double pgas) {
		this.pgas = pgas;
	}
	
}
