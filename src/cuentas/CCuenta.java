package cuentas;

/**
 *
 * @author IsmaelJuarez
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *Constructor vacio de la cuenta
     */
    public CCuenta()
    {
    }
    
    /**
     *constructor de la cuenta
     * @param nom nombre del cliente
     * @param cue cuenta creada
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *devuelve el saldo de la cuenta
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     *Dada una cnatidad hace un ingreso en la cuenta del importe
     *detecta si la cantidad es negatíva ya que seria un error
     * @param cantidad
     * @throws Exception la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**Dada una cantidad la retira del saldo de la cuena
     detecta si la cantidad que se quiere retirar es negativa y
     si la cantidad supera el saldo de la cuenta
     * @param cantidad
     * @throws java.lang.Exception si la cantidad es negativa o mayor que el saldo de la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * metodo getter del nombre del propietario de la cuenta
     * @return el nombre del propietario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo setter del nombre del propietario de la cuenta
     * @param nombre modifica el nombre del propietario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo getter del nombre de la cuneta
     * @return devuelve el nombre de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * metodo setter del nombre cuenta
     * @param cuenta inroduce el nombre cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * metodo getter del saldo de la cuenta
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * metodo setter del saldo de la cuenta
     * @param saldo modifica el saldo de la cuenta 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * metodo getter del tipo de interes
     * @return el tipoInterés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Metodo setter del tipo de interes
     * @param tipoInterés selecciona el tipoInterés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
}
