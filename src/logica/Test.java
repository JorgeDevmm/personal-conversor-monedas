package logica;

import javax.swing.*;

/**
 * @author Jorge Monzón
 * @project personal-conversor-monedas
 */
public class Test {
    public static void main(String[] args) {
        Double monto;
        Boolean continuar = true;


        String[] opcionConvertir = {"Soles a Dólar", "Soles a Euro", "Soles a Libras Esterlinas", "Soles a Yen Japonés", "Soles a Won sur-coreano", "Dolar a Soles", "Euro a Soles", "Libras Esterlinas a Soles", "Yen Japonés a Soles", "Won sur-coreano a Soles"};
//      comboBox de opción
        JComboBox<String> comboBox = new JComboBox<>(opcionConvertir);

        do {
            String montoString = JOptionPane.showInputDialog("Ingresar el monto a convertir");


            if (montoString != null) {

                try {

                    monto = Double.parseDouble(montoString);

                    int opcion = JOptionPane.showConfirmDialog(null, comboBox, "Eliga la moneda a convertir", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);


//      validar la opción escogida
                    if (opcion == JOptionPane.OK_OPTION) {
//            capturar el índice del comboBox
                        int indiceSeleccinado = comboBox.getSelectedIndex();

                        calcularOperacion(indiceSeleccinado, monto);

                    } else if (opcion == JOptionPane.CANCEL_OPTION) {
                        System.out.println("No selecciono acción o cancelo");

                    } else if (opcion == JOptionPane.CLOSED_OPTION) {
                        System.out.println("Se Cerro la operación");
                    }


                } catch (Exception e) {
//                capturaos la excepción y asu vez validamos un dato valido
                    e.getMessage();
                    System.out.println("el valor ingresado no es valido");
                }


            } else {
                System.out.println("El usuario cerro o cancelo el ingreso de datos");
            }


            int mensaje = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Mensaje", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE);

//            validación si desea repetir el proceso
            if (mensaje == 0) {
                continuar = true;
            } else if (mensaje == 1 || mensaje == -1) {
                continuar = false;

                JOptionPane.showMessageDialog(null, "Programa Terminado");
            }
        } while (continuar);


    }

    public static void calcularOperacion(int indiceSeleccinado, Double monto) {
        switch (indiceSeleccinado) {
            case 0:
                Moneda dolar = new Moneda("Dolar", 0.26);
                JOptionPane.showMessageDialog(null, "Tienes " + dolar.calcularMonto(monto) + " de " + dolar.getTipo());
                break;
            case 1:
                Moneda euro = new Moneda("Euro", 0.25);
                JOptionPane.showMessageDialog(null, "Tienes " + euro.calcularMonto(monto) + " de " + euro.getTipo());
                break;
            case 2:
                Moneda librasEsterlinas = new Moneda("Libras Esterlinas", 0.21);
                JOptionPane.showMessageDialog(null, "Tienes " + librasEsterlinas.calcularMonto(monto) + " de " + librasEsterlinas.getTipo());
                break;
            case 3:
                Moneda yesJapones = new Moneda("Yen Japonés", 38.91);
                JOptionPane.showMessageDialog(null, "Tienes " + yesJapones.calcularMonto(monto) + " de " + yesJapones.getTipo());
                break;
            case 4:
                Moneda wonSurcoreano = new Moneda("Won surcoreano", 350.65);
                JOptionPane.showMessageDialog(null, "Tienes " + wonSurcoreano.calcularMonto(monto) + " de " + wonSurcoreano.getTipo());
                break;
            case 5:
                Moneda dolarSoles = new Moneda("Soles", 3.85);
                JOptionPane.showMessageDialog(null, "Tienes " + dolarSoles.calcularMonto(monto) + " de " + dolarSoles.getTipo());
                break;
            case 6:
                Moneda euroSoles = new Moneda("Soles", 4.06);
                JOptionPane.showMessageDialog(null, "Tienes " + euroSoles.calcularMonto(monto) + " de " + euroSoles.getTipo());
                break;
            case 7:
                Moneda librasSoles = new Moneda("Soles", 4.70);
                JOptionPane.showMessageDialog(null, "Tienes " + librasSoles.calcularMonto(monto) + " de " + librasSoles.getTipo());
                break;
            case 8:
                Moneda yenSoles = new Moneda("Soles", 0.026);
                JOptionPane.showMessageDialog(null, "Tienes " + yenSoles.calcularMonto(monto) + " de " + yenSoles.getTipo());
                break;
            case 9:
                Moneda wonSoles = new Moneda("Soles", 0.0029);
                JOptionPane.showMessageDialog(null, "Tienes " + wonSoles.calcularMonto(monto) + " de " + wonSoles.getTipo());
                break;
            default:
                System.out.println("opción no valida");
        }
    }

}
