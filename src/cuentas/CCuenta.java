package cuentas;

/**
 * 
 * Clase para almacenar datos de cuentas de bancos.
 * 
 * @author yolandarivera
 *
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * Constructor vac&iacute;o
	 */
	public CCuenta() {

	}

	/**
	 * 
	 * Constructor a partir de los par&aacute;metros b&aacute;sicos
	 * 
	 * @param nom Nombre del titular
	 * @param cue N&uacute;mero de la cuenta
	 * @param sal Saldo de la cuenta
	 * @param tipo Tipo de cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {

		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * M&eacute;todo que devuelve el saldo de la cuenta
	 * 
	 * @return Saldo de la cuenta
	 */
	public double estado() {
		return getSaldo();
	}
	
	/**
	 * Añade al saldo la cantidad pasada por par&aacute;metro
	 * 
	 * @param cantidad Cantidad a añadir al saldo total 
	 * @throws Exception
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}
	
	/**
	 * Disminuye el saldo con la cantidad pasada por par&aacute;metro
	 * 
	 * @param cantidad Cantidad a restar al saldo total 
	 * @throws Exception
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Devuelve el valor del nombre
	 * 
	 * @return valor del nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Establece el valor del nombre
	 * 
	 * @param nombre valor del nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el valor del nombre
	 * 
	 * @return valor del nombre
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Establece el valor de la cuenta
	 * 
	 * @param cuenta valor de la cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Devuelve el valor del saldo
	 * 
	 * @return valor del saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Establece el valor del saldo
	 * 
	 * @param saldo valor del saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el valor del tipo de interés
	 * 
	 * @return valor del tipo de interés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Establece el valor del tipo de interés
	 * 
	 * @param tipoInterés valor del tipo de interés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
