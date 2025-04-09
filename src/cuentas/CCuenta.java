package cuentas;
/** A clase CCuenta, replica o funcionamento das contas bancarias
 * 
 * @author Juan José Hidalgo Neira
 * 
 * O repositorio de Github está en
 * @see https://github.com/JuanJoseHidalgo/Deposito
 * 
 */

public class CCuenta {
   

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    public CCuenta()
    {
    }

    /** Constructor da clase CCuenta
     * ten os seguintes parámetros:
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     * 
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /** Método para obter o saldo
     * 
     * @return getSaldo()
     * 
     */
    
    public double estado()
    {
        return getSaldo();
    }

    
    /** Método para ingresar
     * 
     * @param cantidad
     * @throws Exception 
     * 
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    
    /** Método para retirar
     * 
     * @param cantidad
     * @throws Exception
     * 
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
     * Getter do nombre
     * 
     * @return nombre
     */
    
    public String getNombre() {
        return nombre;
    }


    /**
     * Setter do nombre
     * 
     * @param nombre
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Getter de cuenta
     * 
     * @return cuenta
     */
    
    public String getCuenta() {
        return cuenta;
    }

    
    /**
     * Setter de cuenta
     * 
     * @param cuenta 
     */
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    
    /**
     * Getter de saldo
     * 
     * @return saldo
     */
    
    public double getSaldo() {
        return saldo;
    }

    
    /**
     * Setter de saldo
     * 
     * @param saldo 
     */
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    /**
     * Getter de tipoInterés
     * 
     * @return tipoInterés
     */
    
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter de tipoInterés
     * 
     * @param tipoInterés 
     */
    
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
