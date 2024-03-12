import java.util.Scanner;
public class App {
    
    /*Actividad Biblioteca

    Hacer biblioteca con usuarios y libros que simule el alquiler de libros por parte de los usuarios.
    Un usuario tiene atributos de: nombre, apellido, teléfono, email y libros pendientes de devolver.
    Un libro tiene atributos de: título, autor y isbn.
    Debe mostrar un menú que permita las opciones de: acceder a un usuario, ver libros disponibles, 
    ver libros pendientes de devolver(por el usuario), pedir un libro y devolver un libro.
    Todo esto se debe subir a un repositorio del cual me compartiréis el enlace. */
    public static void main(String[] args) throws Exception {
        

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int option=0;
    
        Biblioteca biblioteca1= new Biblioteca();
        
        
        while (option!=4) {
            System.out.println(
                "introduca el numero de opcion que desea \n"+
                "(1): Acceder a un usuario \n"+//\3
                "(2): Ver libros disponibles \n"+
                "(3): Devolver un libro \n"+
                "(4): Salir/Exit"
            
            );
            option=sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Introduzca su id de usuario para acceder ");
                    int LaID =sc.nextInt();
                    Usuario usuario1 = biblioteca1.buscUsuarioPorId(LaID);
                    if (usuario1 != null) {
                        System.out.println("¡Usuario encontrado!");
                        // Acceder a la información del usuario (nombre, apellido, etc.) y sus libros por devolver
                        System.out.println("Nombre: " + usuario1.getNombre());
                        System.out.println("Apellido: " + usuario1.getApellido());
                        System.out.println("Libros por devolver: " + usuario1.getLibrosDevolverArray());
                    } else {
                        System.out.println("Usuario no encontrado. Verifica el ID.");
                    }
                    break;
                case 2:
                    System.out.println(biblioteca1.mostrarLibros());
                    int pidiendoLibro=sc.nextInt();
                    break;

                case 3:

                    break;

                case 4:
                    System.out.println("Porfavor recuerde devolver sus libros Gracias");
                    System.out.println("Gracias,buen dia vuelva pronto");
                    break;
                default:
                    System.out.println("Digito o valor invalido, Porfavor introduzca un numero valido");
                    break;
            }
        }
    }
}
