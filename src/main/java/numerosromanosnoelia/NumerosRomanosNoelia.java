/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package numerosromanosnoelia;

import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class NumerosRomanosNoelia {

    public static void main(String[] args) {

        //Implementa un programa que muestre tres opciones. 
        //La primera será la opción que represente un número romano a partir 
        //de su número decimal (Entre 1 y 10). 
        //La segunda debe contar las vocales que tiene un nombre. 
        //La tercera será salir. El programa debe ejecutarse hasta que 
        //el usuario decida salir. Se puede usar Scanner y/o JOptionPane.
        
        
        //empezaré inicializando el string para elegir la opción
        //con cualquier cosa, en este caso "a", para que no de error
        String opcion = "a";
        
        //crearé un while en el que irá el panel de las opciones del
        //programa, va dentro del while para que siga apareciendo
        //una y otra vez hasta que elija salir
        while (!opcion.equals("3")) {
            opcion = JOptionPane.showInputDialog("""
                                                      ESCOJA UNA OPCIÓN
                                              ---------------------------------------
                                               1 - Decimal a nº romano
                                               2 - Nº de vocales en tu nombre
                                               3 - Salir
                                               """);
            //voy a crear un switch con 3 case para las opciones
            switch (opcion) {
                case "1":
                    //utilizo un joption para pedir un numero del 1-10
                    //que se parsea a int y se guarda en la variable decimal
                    int decimal = Integer.parseInt(JOptionPane.showInputDialog(
                            "Introduce un número decimal de 1-10: "));
                    //para los números romanos voy a crear otro switch
                    //dentro del primer case, cada case del nuevo switch
                    //contiene un numero del 1 al 10 con su traduccion en romano
                    switch (decimal) {
                        case 1:
                            JOptionPane.showMessageDialog(null, 
                                    decimal + " = I");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, 
                                    decimal + " = II");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, 
                                    decimal + " = III");
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, 
                                    decimal + " = IV");
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, 
                                    decimal + " = V");
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, 
                                    decimal + " = VI");
                            break;
                        case 7:
                            JOptionPane.showMessageDialog(null, 
                                    decimal + " = VII");
                            break;
                        case 8:
                            JOptionPane.showMessageDialog(null, 
                                    decimal + " = VIII");
                            break;
                        case 9:
                            JOptionPane.showMessageDialog(null, 
                                    decimal + " = IX");
                            break;
                        case 10:
                            JOptionPane.showMessageDialog(null, 
                                    decimal + " = X");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, 
                                    "Número no válido");
                    }
                    break;
                    //para la opción de contar las vocales
                    //pido con un joption el nombre
                    //creo la variable contador para guardar las veces que
                    //se encuentra una vocal
                case "2":
                    String nombre = JOptionPane.showInputDialog(
                            "Introduzca un nombre: ");
                    int contador = 0;
                    //con un bucle for voy a recorrer los caracteres del nombre
                    //que introduzca usando .lenght
                    for (int i = 0; i < nombre.length(); i++) {
                        //dentro del for voy a crear un if, con el que 
                        //se comprobará si la posición i del nombre es una vocal
                        //por lo tanto se sumará en contador el número de
                        //iteraciones en las que se encuentra una vocal
                        char letra = nombre.charAt(i);
                        if (letra == 'a' || 
                                letra == 'e' ||
                                letra == 'i' || 
                                letra == 'o' ||
                                letra == 'u') {
                            contador++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, 
                            "El número de vocales es: " + contador);
                    break;
                case "3":
                    //joption para la opción de salir
                    JOptionPane.showMessageDialog(null, 
                            "Hasta luegui");
                    break;
                default:
                    //como default dejo un mensaje por si se introduce una opción
                    //que no esté en el panel
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
        
        
        

    }
}
