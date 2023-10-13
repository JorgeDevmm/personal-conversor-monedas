package logica;

import javax.swing.*;

/**
 * @author Jorge Monzón
 * @project personal-conversor-monedas
 */
public class Test {
    public static void main(String[] args) {

        Double resultado;
        String resultaodFormateado, moneda;
        Boolean continuar = true;


        String[] opcionConvertir = {"Soles a Dólar", "Soles a Euro", "Soles a Libras Esterlinas", "Soles a Yen Japonés", "Soles a Won sur-coreano", "Dolar a Soles", "Euro a Soles", "Libras Esterlinas a Soles", "Yen Japonés a Soles", "Won sur-coreano a Soles"};
//      comboBox de opción
        JComboBox<String> comboBox = new JComboBox<>(opcionConvertir);


        do {
            String montoString = JOptionPane.showInputDialog("Ingresar el monto a convertir");

            if (montoString != null) {

                try {

                    Double monto = Double.parseDouble(montoString);

                    int opcion = JOptionPane.showConfirmDialog(null, comboBox, "Eliga la moneda a convertir", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

//      validar la opción escogida
                    if (opcion == JOptionPane.OK_OPTION) {
//            capturar el índice del comboBox
                        int indiceSeleccinado = comboBox.getSelectedIndex();

                        switch (indiceSeleccinado) {
                            case 0:

                                resultado = monto * 0.26;
//                  convertir a dos decimales
                                resultaodFormateado = String.format("%.2f", resultado);
                                moneda = "Dolar";
                                JOptionPane.showMessageDialog(null, "Tienes " + resultaodFormateado + " de " + moneda);
                                break;
                            case 1:
                                resultado = monto * 0.25;
//                  convertir a dos decimales
                                resultaodFormateado = String.format("%.2f", resultado);
                                moneda = "Euro";
                                JOptionPane.showMessageDialog(null, "Tienes " + resultaodFormateado + " de " + moneda);
                                break;
                            case 2:
                                resultado = monto * 0.21;
//                  convertir a dos decimales
                                resultaodFormateado = String.format("%.2f", resultado);
                                moneda = "Libras Esterlinas";
                                JOptionPane.showMessageDialog(null, "Tienes " + resultaodFormateado + " de " + moneda);
                                break;
                            case 3:
                                resultado = monto * 38.91;
//                  convertir a dos decimales
                                resultaodFormateado = String.format("%.2f", resultado);
                                moneda = "Yen japonés";
                                JOptionPane.showMessageDialog(null, "Tienes " + resultaodFormateado + " de " + moneda);
                                break;
                            case 4:
                                resultado = monto * 350.65;
//                  convertir a dos decimales
                                resultaodFormateado = String.format("%.2f", resultado);
                                moneda = "Won surcoreano";
                                JOptionPane.showMessageDialog(null, "Tienes " + resultaodFormateado + " de " + moneda);
                                break;
                            case 5:
                                resultado = monto * 3.85;
//                  convertir a dos decimales
                                resultaodFormateado = String.format("%.2f", resultado);
                                moneda = "Soles";
                                JOptionPane.showMessageDialog(null, "Tienes " + resultaodFormateado + " de " + moneda);
                                break;
                            case 6:
                                resultado = monto * 4.06;
//                  convertir a dos decimales
                                resultaodFormateado = String.format("%.2f", resultado);
                                moneda = "Soles";
                                JOptionPane.showMessageDialog(null, "Tienes " + resultaodFormateado + " de " + moneda);
                                break;
                            case 7:
                                resultado = monto * 4.70;
//                  convertir a dos decimales
                                resultaodFormateado = String.format("%.2f", resultado);
                                moneda = "Soles";
                                JOptionPane.showMessageDialog(null, "Tienes " + resultaodFormateado + " de " + moneda);
                                break;
                            case 8:
                                resultado = monto * 0.026;
//                  convertir a dos decimales
                                resultaodFormateado = String.format("%.2f", resultado);
                                moneda = "Soles";
                                JOptionPane.showMessageDialog(null, "Tienes " + resultaodFormateado + " de " + moneda);
                                break;
                            case 9:
                                resultado = monto * 0.0029;
//                  convertir a dos decimales
                                resultaodFormateado = String.format("%.2f", resultado);
                                moneda = "Soles";
                                JOptionPane.showMessageDialog(null, "Tienes " + resultaodFormateado + " de " + moneda);
                                break;
                            default:
                                System.out.println("opción no valida");
                        }


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

            System.out.println(mensaje);

//            validación si desea repetir el proceso
            if (mensaje == 0) {
                continuar = true;
            } else if (mensaje == 1 || mensaje == -1) {
                continuar = false;

                JOptionPane.showMessageDialog(null, "Programa Terminado");
            }
        } while (continuar);


    }

}
