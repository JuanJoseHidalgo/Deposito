package cuentas;
/** A clase CCuenta, replica o funcionamento das contas bancarias
 * 
 * @author Juan José Hidalgo Neira
 * 
 * O repositorio de Github está en
 * https://github.com/JuanJoseHidalgo/Deposito
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
     * @param nom nome
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo
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
     * @param cantidad cantidade
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
     * @return nombre nome
     */
    
    public String getNombre() {
        return nombre;
    }


    /**
     * Setter do nombre
     * 
     * @param nombre nome
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Getter de cuenta
     * 
     * @return cuenta conta
     */
    
    public String getCuenta() {
        return cuenta;
    }

    
    /**
     * Setter de cuenta
     * 
     * @param cuenta conta
     */
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    
    /**
     * Getter de saldo
     * 
     * @return saldo saldo
     */
    
    public double getSaldo() {
        return saldo;
    }

    
    /**
     * Setter de saldo
     * 
     * @param saldo saldo
     */
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    /**
     * Getter de tipoInterés
     * 
     * @return tipoInterés tipo de Interese
     */
    
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter de tipoInterés
     * 
     * @param tipoInterés Tipo de Interese
     */
    
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
