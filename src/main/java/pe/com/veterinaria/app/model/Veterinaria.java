package pe.com.veterinaria.app.model;

public class Veterinaria {
    private int id;
    private String nombre;
    private String horarioAtencion;
    private String descripcion;
    private String direccion;
    private String correoElectronico;
    private Integer destacado;

    // Agregando propiedad de imagen
    private String imagen;

    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getHorarioAtencion() {
        return horarioAtencion;
    }
    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public Integer getDestacado() {
        return destacado;
    }
    public void setDestacado(Integer destacado) {
        this.destacado = destacado;
    }
    @Override
    public String toString() {
        return "Veterinaria [id=" + id + ", nombre=" + nombre + ", horarioAtencion=" + horarioAtencion
                + ", descripcion=" + descripcion + ", direccion=" + direccion + ", correoElectronico="
                + correoElectronico + ", destacado=" + destacado + "]";
    }
    public Veterinaria(int id, String nombre, String horarioAtencion, String descripcion, String direccion,
            String correoElectronico, Integer destacado, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.horarioAtencion = horarioAtencion;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.destacado = destacado;
        this.imagen = imagen;
    }
    

    
}
