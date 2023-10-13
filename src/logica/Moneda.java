package logica;

import javax.swing.*;

/**
 * @author Jorge Monzón
 * @project personal-conversor-monedas
 */
public class Moneda {

    private String tipo;
    private Double valor;


    public Moneda(String tipo, Double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String calcularMonto(double montoIngresado) {
        Double resultado = montoIngresado * this.getValor();
//      aplicar formato tipo string a dos decimales
        String resultadoFormateado = String.format("%.2f", resultado);
        String moneda = this.getTipo();
        return resultadoFormateado;
    }

}
