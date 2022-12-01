package proyectoprogramacion;

import java.util.Scanner;

import javax.swing.JOptionPane; 

public class ProyectoProgramacion {

    public static void main(String[] args) {
        Proyectoprogramacion() ;
        
    }

    private static void Proyectoprogramacion() {
        
        String Nombre = "";
        String apellidos  = null;
        String Curp = null;
        int edad = 0; 
        int telefono = 0; 
        int sueldo = 0;
        String direccion = null;
        char genero = 0;
        String nombre = null;
        String estudios = null;
        int experiencia = 0; 
        String experienciaL = null;
        String experienciaLa = null;
        int opcion;
        

        do {
            //datos de la tabla 
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,

                    "   ENTREVISTA DE TRABAJO  \n" +
                            
                            "1.- Datos iniciales \n" +

                            "2.- Acerca del trabajador \n" +

                            "3.- Consulta de datos registrados e imprimir \n" +

                            "4.- Finalizar y salir \n" +

                            "Elija una opcion solo (1-4)",
                    "Base de datos SPASS", JOptionPane.QUESTION_MESSAGE));
            switch (opcion) {
                
                case 1:
                //estos son los primeros datos 
                Scanner in = new Scanner(System.in);    
          
                System.out.println("Ingrese su nombre por favor: ");
                Nombre = in.nextLine();
                System.out.println("");

                System.out.println("Ingrese su apellido paterno: ");
                apellidos = in.nextLine();
                System.out.println("");
                
                System.out.println("Ingrese su apellido materno: ");
                apellidos = in.nextLine();
                System.out.println("");
                   
               
                 
                 break;   
                    
                    
                    
                    
                    
            case 2:
                //datos personales del trabajador y su experiencia 
                Scanner teclado = new Scanner(System.in);
                System.out.print("Ingrese su direccion: ");
                direccion = teclado.nextLine();

                System.out.print("Ingrese su Curp: ");
                Curp = teclado.next();
             
            
                nombre = teclado.nextLine();

                System.out.print("Ingrese su edad (años): ");
                edad = teclado.nextInt();

                System.out.print("Ingrese su telefono: ");
                telefono = teclado.nextInt();

                System.out.print("Ingrese su sueldo a desear: ");
                sueldo = teclado.nextInt();

                
                System.out.print("Ingrese su nivel de estudios alcanzado: ");
                teclado.nextLine();
                estudios = teclado.next();

                System.out.print("Ingrese sus años de experiencia laboral: ");
                teclado.nextLine();
                experiencia = teclado.nextInt(); 
                
                System.out.println("¿En que a trabajado?:");
                teclado.nextLine();
                experienciaL = teclado.next();
                
                System.out.println("¿En que maquinas se especializa?:");
                teclado.nextLine();
                experienciaLa = teclado.next();

                System.out.print("Genero (Masculino o femenino): ");
                teclado.nextLine();
                genero = teclado.next().charAt(0);

               
                teclado.close();
                break;
            case 3:
                //lo que imprime 
                if (genero == 'm' || genero == 'M') {
                    System.out.println("\nSeñor buen dia " + nombre + ",\nSu Curp es: " + Curp + ",\nSu información extraída de la base de datos es la siguiente:");
                    System.out.println("Tiene: " + edad + " años de edad,\nvive en: " + direccion + ",\nSu teléfono es: " + telefono + ""
                            + ",\nSu sueldo a desear " + sueldo + ".\nGrado de estudios alcanzado: " + estudios + " y tiene " + experiencia + " años de experiencia en " + experienciaL +"\na trabajado en las maquinas " + experienciaLa + "\nSe especializa en maquinas " + experienciaLa );
                } else { 
                   System.out.println("\nSeñora buen dia " + nombre + ",\nSu Curp es: " + Curp + ",\nSu información extraída de la base de datos es la siguiente:");
                    System.out.println("Tiene: " + edad + " años de edad,\nvive en: " + direccion + ",\nSu teléfono es: " + telefono + ""
                            + ",\nSu sueldo a desear " + sueldo + ".\nGrado de estudios alcanzado: " + estudios + " y tiene " + experiencia + " años de experiencia en " + experienciaL +"\na trabajado en las maquinas " + experienciaLa + "\nSe especializa en masquinas " + experienciaLa );
                }
       break;

            case 4:
                JOptionPane.showMessageDialog(null, "Que tenga excelente dia gracias");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "ELIJA UNA OPCION VALIDA \n", "ERROR NO SE PUEDE PROCEDER",
                        JOptionPane.WARNING_MESSAGE);
            }
        } while (opcion != 3);
    }

}
    
    

