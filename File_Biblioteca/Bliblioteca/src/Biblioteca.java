import java.util.ArrayList;

public class Biblioteca {

    //atributos
    private ArrayList<Libro> arrayLibros;
    private ArrayList<Usuario> arrayUsuarios;
    //constructor
    

    

    public Biblioteca() {
        this.arrayLibros =  librosIniciales();
        this.arrayUsuarios=new ArrayList<>();

        agregarUsuario(101);
        agregarUsuario(102);
        agregarUsuario(103);
    }

    public ArrayList<Libro> librosIniciales(){
        ArrayList<Libro> arrayLibros= new ArrayList<>();

        arrayLibros.add(new Libro("Divina Comedia","Dante Alighieri",1000));
        arrayLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes",1001));
        arrayLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1002));
        arrayLibros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", 1003));
        arrayLibros.add(new Libro("Orgullo y prejuicio", "Jane Austen", 1004));
        arrayLibros.add(new Libro("Matar a un ruiseñor", "Harper Lee", 1005));
        arrayLibros.add(new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", 1006));
        arrayLibros.add(new Libro("El Arte de la Guerra", "Sun Tzu", 1007));
        arrayLibros.add(new Libro("Las 48 Leyes del Poder", "Robert Greene", 1008));

        return arrayLibros;
    }

    public String mostrarLibros(){
        StringBuilder listaLibros_posicion = new StringBuilder();
        for(int i=0; i < arrayLibros.size() ;i ++){
            String nameLibros = arrayLibros.get(i).getTitulo();
            listaLibros_posicion.append(i+1).append(":").append(nameLibros).append("\n");
        }
        return listaLibros_posicion.toString();
    }
    private void agregarUsuario(int id) {
        Usuario usuario = new Usuario(id);
        arrayUsuarios.add(usuario);
    }
    public Usuario buscUsuarioPorId(int id){
        for(Usuario usuario:arrayUsuarios){
            if (usuario.getId_usuario()==id) {
                return usuario;
            }
        }
        return null;
    }
}
