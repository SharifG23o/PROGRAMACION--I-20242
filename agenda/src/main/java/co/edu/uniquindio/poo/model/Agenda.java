package co.edu.uniquindio.poo.model;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda {

    private String nombre;
    private Contacto[] listaContactos = new Contacto[50];
    private Grupo[] listaGrupos=new Grupo[5];

    public Agenda(String nombre) {

        this.nombre = nombre;
        this.listaContactos = new Contacto[50];
        this.listaGrupos=new Grupo[5];

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contacto[] getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(Contacto[] listaContactos) {
        this.listaContactos = listaContactos;
    }



    public Grupo[] getListaGrupos() {
        return listaGrupos;
    }
    
    public void setListaGrupos(Grupo[] listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    

    @Override
    public String toString() {
        return "\nContactos [nombre=" + nombre + ", listaContactos=" + Arrays.toString(listaContactos) + "]";
    }

    /*
     * Este método almacena un nuevo contacto, solo si hay espacios disponibles y el
     * contacto aun no ha sido registrado.
     */
    public String crearContacto(Contacto nuevoContacto) {

        String mensaje = "";
        int posicionDisponible = 0;
        Contacto contactoEncontrado = null;

        posicionDisponible = buscarPosicionDisponible();

        if (posicionDisponible == -1) {
            mensaje = "\nNo hay espacio para un nuevo contacto.";
            return mensaje;
        } else {
            contactoEncontrado = buscarContacto(nuevoContacto.getNombre(), nuevoContacto.getTelefono());

            if (contactoEncontrado != null) {
                mensaje = "\nEl contacto ya se encuentra registrado.";
            } else {
                listaContactos[posicionDisponible] = nuevoContacto;
                mensaje = "\nEl contacto se a almacenado exitosamente.";
            }
        }

        return mensaje;
    }

    /*
     * Este método busca una posición disponible y la retorna, en caso de no haber,
     * retorna -1.
     */
    private int buscarPosicionDisponible() {
        int posicionDisponible = -1;

        for (int i = 0; i < listaContactos.length; i++) {
            Contacto contacto = listaContactos[i];
            if (contacto == null) {
                posicionDisponible = i;
                return posicionDisponible;
            }
        }

        return posicionDisponible;
    }

    /*
     * Este método busca un contacto un base a su nombre y número de teléfono.
     */
    public Contacto buscarContacto(String nombre, String telefono) {
        Contacto contactoEncontrado = null;

        for (int i = 0; i < listaContactos.length; i++) {
            Contacto contactoAux = listaContactos[i];
            if (contactoAux != null) {
                if (contactoAux.getNombre().equals(nombre) && contactoAux.getTelefono().equals(telefono)) {
                    contactoEncontrado = contactoAux;
                    return contactoEncontrado;
                }
            }
        }

        return contactoEncontrado;
    }

    /*
     * Este método elimina un contacto, si lo encuentra.
     */
    public String eliminarContacto(String nombre, String telefono) {
        String mensaje = "\nEl contacto no existe.";

        for (int i = 0; i < listaContactos.length; i++) {
            Contacto contactoAux = listaContactos[i];
            if (contactoAux != null) {
                if (contactoAux.getNombre().equals(nombre) && contactoAux.getTelefono().equals(telefono)) {
                    listaContactos[i] = null;
                    mensaje = "\nEl contacto ha sido eliminado correctamente.";
                    return mensaje;
                }                
            }           
        }
        return mensaje;
    }

    /*
     * Este método actualiza la información de un contacto, si lo encuentra
     * 
     */
    public String actualizarContancto(String nombre, String alias, String direccion, String telefono, String email) {
        String mensaje = "\nEl contacto no se encuentra registrado.";
        Contacto contactoEncontrado = buscarContacto(nombre, telefono);
        if (contactoEncontrado != null) {
            contactoEncontrado.setNombre(nombre);
            contactoEncontrado.setAlias(alias);
            contactoEncontrado.setDireccion(direccion);
            contactoEncontrado.setTelefono(telefono);
            contactoEncontrado.setEmail(email);
            mensaje = "\nLa información del contacto ha sido actualizada de manera satisfactoria.";
            return mensaje;
        }

        return mensaje;
    }

//1.

public void imprimirContactosPosImpares(){
    for (int i = 0; i < listaContactos.length; i++) {
       if(!(i % 2 == 0)){
            System.out.println(listaContactos[i]);
       } 
    }
}

public double calcularPromedio(){
       
    int sumatoria = 0;
    int cont = 0;
    for (int i = 0; i < listaContactos.length; i++) {
        if(listaContactos[i] != null){
            sumatoria += listaContactos[i].getEdad();//18
            cont++;
         }
    }
    return sumatoria / cont;
}


public void eliminarContactosVocales(){

		
	for(int i = 0; i < listaContactos.length;i++){
		
		Contacto aux = listaContactos[i];
		if(aux != null){
		
			int contadorVocales = aux.cuantasVocalesTiene();
			if(contadorVocales >= 3){
				listaContactos[i] = null;
			}
		}
	
	}
}





public int obtenerEdadMasRepeticiones(){
    int edadMasRepetida = 0;
    int contadorMasRepetida = 0;
    int contador = 1;

    for (int i = 0; i < listaContactos.length; i++) {
        if(listaContactos[i] != null){
            int edadi = listaContactos[i].getEdad();//18
            contador = 0;
            contador = levanteLaManoLosDeEdad(edadi);
            if(contador > contadorMasRepetida){
                contadorMasRepetida = contador;
                edadMasRepetida = edadi;
            }
        }
    }
    return edadMasRepetida;
}

public int obtenerEdadMenosRepeticiones(){
    int edadmenosRepetida = 0;
    int contadormenosRepetida = listaContactos.length;
    int contador = 1;

    for (int i = 0; i < listaContactos.length; i++) {
        if(listaContactos[i] != null){
            int edadi = listaContactos[i].getEdad();//18
            contador = 0;
            contador = levanteLaManoLosDeEdad(edadi);
            if(contador < contadormenosRepetida){
                contadormenosRepetida = contador;
                edadmenosRepetida = edadi;
            }
        }
    }
    return edadmenosRepetida;
}



private int levanteLaManoLosDeEdad(int edadi) {
    int contador = 0;
    for (int j = 0; j < listaContactos.length; j++) {
        if(listaContactos[j] != null){
            int edadJ = listaContactos[j].getEdad();
            if(edadi == edadJ){
                contador++;
            }
        }
    }
    return contador;
}





public Grupo obtenerGrupoConMasContactos() {
    Grupo grupoConMasContactos = null;
    int maxContactos = 0;

    // Recorremos la lista de grupos
    for (Grupo grupo : listaGrupos) {
        if (grupo != null) {
            int contadorContactos = 0;

            // Recorremos la lista de contactos para contar cuántos pertenecen a este grupo
            for (Contacto contacto : listaContactos) {
                if (contacto != null && contacto.getGrupo() != null) {
                    if (contacto.getGrupo().equals(grupo)) {
                        contadorContactos++;
                    }
                }
            }

            // Comparamos si este grupo tiene más contactos que el máximo actual
            if (contadorContactos > maxContactos) {
                maxContactos = contadorContactos;
                grupoConMasContactos = grupo;
            }
        }
    }

    return grupoConMasContactos;
}


public int obtenerMenoresDe18(){

    int contador=0;

    for (int i = 0; i < listaContactos.length; i++) {

        if (listaContactos[i]!=null) {

            int edad=listaContactos[i].getEdad();
            if (edad<18) {
                contador++;
                
            }
            
        }
        
    }

    return contador;
}



public double calcularDesviacionEstandar() {
    // Primero, calculamos la media de las edades de los contactos
    double sumatoria = 0.0;
    int contador = 0;

    for (Contacto contacto : listaContactos) {
        if (contacto != null) {
            sumatoria += contacto.getEdad();
            contador++;
        }
    }

    double media = sumatoria / contador;

    // Ahora, calculamos la suma de las diferencias cuadradas
    double sumaDiferenciasCuadradas = 0.0;
    for (Contacto contacto : listaContactos) {
        if (contacto != null) {
            sumaDiferenciasCuadradas += Math.pow(contacto.getEdad() - media, 2);
        }
    }

    // Finalmente, calculamos la desviación estándar
    return Math.sqrt(sumaDiferenciasCuadradas / contador);
}



public void imprimirContactosInvertidos() {
   
    String listaContactosInvertidos = "";

   
    for (int i = listaContactos.length - 1; i >= 0; i--) {
        if (listaContactos[i] != null) {
           
            listaContactosInvertidos += listaContactos[i].toString() + "\n";
        }
    }


    System.out.println(listaContactosInvertidos);
}


public void inicializarEdadesAleatorias() {
    int minEdad = 15;
    int maxEdad = 60;

    
    for (int i = 0; i < listaContactos.length; i++) {
        if (listaContactos[i] != null) {
           
            int edadAleatoria = minEdad + (int)(Math.random() * (maxEdad - minEdad + 1));
           
            listaContactos[i].setEdad(edadAleatoria);
        }
    }
}


public void fraseCaracteres() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce una frase: ");
    String frase = scanner.nextLine();

    char[] arregloDeCaracteres = frase.toCharArray();

    System.out.println("El arreglo de caracteres es:");
    for (char c : arregloDeCaracteres) {
        System.out.print(c + " ");
    }
    System.out.println(); 

    scanner.close();
}


public String asociarContactoAGrupo(String nombreContacto, String telefonoContacto, String nombreGrupo) {
    Contacto contacto = buscarContacto(nombreContacto, telefonoContacto);
    if (contacto == null) {
        return "Contacto no encontrado.";
    }

    Grupo grupo = grupo.buscarContacto(contacto);
    if (grupo == null) {
        return "Grupo no encontrado.";
    }

    contacto.setGrupo(grupo);
    return "Contacto asociado al grupo exitosamente.";
}

public void ordenarContactosPorEdad() {
    int n = listaContactos.length;
    boolean intercambiado;

    for (int i = 0; i < n - 1; i++) {
        intercambiado = false;

        for (int j = 0; j < n - i - 1; j++) {
            
            if (listaContactos[j] != null && listaContactos[j + 1] != null) {
                if (listaContactos[j].getEdad() > listaContactos[j + 1].getEdad()) {
                    
                    Contacto temp = listaContactos[j];
                    listaContactos[j] = listaContactos[j + 1];
                    listaContactos[j + 1] = temp;
                    intercambiado = true;
                }
            }
        }

       
        if (!intercambiado) {
            break;
        }
    }
}



}
























