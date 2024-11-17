package com.coderhouse;

public class Ejercicios21_al_25 {

	public static void main(String[] args) {
		// Ejercicio21
		// Escribir un código que declare variables siguiendo las convenciones de nomenclatura (camelCase).
        int edadEstudiante = 32;
        double promedioNotas = 8.5d;
        String miNombreCompleto = "Gary David Grageda Cruz";
        boolean esEstudianteActivo = true;
		
        System.out.println("Ejercicio 21");
        System.out.println("Edad del estudiante: " + edadEstudiante);
        System.out.println("Promedio de notas: " + promedioNotas);
        System.out.println("Nombre completo: " + miNombreCompleto);
        System.out.println("¿Es estudiante activo?: " + esEstudianteActivo);
        System.out.println("**********************************************************");
        
		// Ejercicio22
		// Agregar comentarios explicativos a un fragmento de código que declare y utilice variables.
        
        /*
         * Creo un mini-codigo para mostrar informacion del alumno, 
         * muestro el nombre, 
         * si id unico 
         * y si tiene mail, lo muestro tambien
        */
		
        // Creo mi variable string para identificar el alumno
        final String alumno = "Gary";
		
		// Seria una clave unica que identificaria, ya que puede haber varios alumnos con el nombre "Gary"
		final int id = 456789;
		
		// Mail para utilizarlo para mandarle mensajes importantes. (opcional)
		String mail = "garygrageda.gg@gmail.com";
		
		// La variable que tendra mi mensaje, dependiendo si cargue mail o no se le agregara esa info
		String mensaje = null;
		
		//Mensaje error
		String mseError = "Ponele Arroba al Email!!!!";
		
		// Booleano que me dira si la variable mail tiene o no arroba
		Boolean tieneArroba;
		
		// Comienzo a armar mi codigo agregando valores al string que ya se siempre vendran
		mensaje = "Mi nombre es: "+ alumno + ", Identificador Nro: " + id;
		
		// En este codigo la variable mail no es obligatorio en caso de que tenga algun valor, verifico que este tengo el @, si no lo tiene es un error
		if(mail != null) {
			if(mail.contains("@")) {
				tieneArroba = true;
			}else {
				tieneArroba = false;
			}
			
			if(tieneArroba) {
				mensaje = mensaje + ", mail: " + mail;
			}else {
				throw new IllegalArgumentException(mseError);
			}
		}
		
		System.out.println("Ejercicio 22");
		System.out.println(mensaje);
		System.out.println("**********************************************************");
		/***************************************************************************************************************/
		// Ejercicio23
		// Refactorizar un código para eliminar variables innecesarias.
		/* Agarro el codigo dle ejercicio 22 y lo mejoro */
        
        final String alumnoRefac = "Gary"; // Creo mi variable string para identificar el alumno
		final int idRefac = 456789; // Seria una clave unica que identificaria, ya que puede haber varios alumnos con el nombre "Gary"
		String mailRefac = "garygrageda.gg@gmail.com"; // Mail para utilizarlo para mandarle mensajes importantes. (opcional)
		
		/* 
		 * La variable que tendra mi mensaje, dependiendo si cargue mail o no se le agregara esa info
		 * Comienzo a armar mi codigo agregando valores al string que ya se siempre vendran
		*/
		String mensajeRefac = "Mi nombre es: "+ alumnoRefac + ", Identificador Nro: " + idRefac; 
		
		// En este codigo la variable mail no es obligatorio en caso de que tenga algun valor, verifico que este tengo el @, si no lo tiene es un error
		if(mailRefac != null) {
			if(!mailRefac.contains("@")) {
				throw new IllegalArgumentException("Ponele Arroba al Email!!!!");
			}
			
			mensajeRefac += ", mail: " + mailRefac;
		}
		
		System.out.println("Ejercicio 23");
		System.out.println(mensajeRefac);
		System.out.println("**********************************************************");
		
		// Ejercicio24
		// Organizar un código en métodos para mejorar su legibilidad.
		/*
		 * Tuve que crear dos clases, mostrarInformacionAlumno y validarEmail ambas retornan String y hace lo mismo que el ejercicio anterior pero separados en dos
		 * */
		String infoAlumno = mostrarInformacionAlumno("David Cruz", 4578);
		String mailAlumno = validarEmail("gcruz@ryaco.com");
		
		System.out.println("Ejercicio 24");
		System.out.println(infoAlumno + mailAlumno);
		System.out.println("**********************************************************");
		
		// Ejercicio25
		// Utilizar nombres descriptivos para las variables en un pequeño programa.
		String misNombres = "Gary David";
		String misApellidos = "Grageda Cruz";
		int totalDeMateriasCursando = 5;
		double promMateriaFilosofia = 7.5d;
		double promMateriaMatematicas = 7.5d;
		double promMateriaHistoria = 8.2d;
		double promMateriaEdFisica = 9.0d;
		double promMateriaQuimica = 6.7d;
		double promTodasMaterias = (promMateriaFilosofia + 
									promMateriaMatematicas + 
									promMateriaHistoria + 
									promMateriaEdFisica + 
									promMateriaQuimica) / totalDeMateriasCursando;
        System.out.println("Nombres del estudiante: " + misNombres);
        System.out.println("Apellidos del estudiante: " + misApellidos);
        System.out.println("Total de materias cursadas: " + totalDeMateriasCursando);
        System.out.println("Promedio de calificaciones: " + promTodasMaterias);
	}

    // Método para mostrar la información del alumno
    public static String mostrarInformacionAlumno(String nombre, int id) {
        return "Mi nombre es: "+ nombre + ", Identificador Nro: " + id;
    }

    // Método para validar el email
    public static String validarEmail(String email) {
        if(email != null){
            if (email.contains("@")) {
            	return ", mail: " + email;
            } else {
            	throw new IllegalArgumentException("Ponele Arroba al Email!!!!");
            }
        }
        return "";
    }
	
}
