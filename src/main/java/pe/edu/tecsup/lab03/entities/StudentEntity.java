package pe.edu.tecsup.lab03.entities;

public class StudentEntity {
    private Long id;
    private String nombre;
    private String programa;

    // Actualización de branch 2, Constructor
    public StudentEntity(Long id, String nombre, String programa) {
        this.id = id;
        this.nombre = nombre;
        this.programa = programa;
    }

    // Método simple
    @Override
    public String toString() {
        return "Student: " + nombre;
    }
}