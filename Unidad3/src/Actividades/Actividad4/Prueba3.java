package Actividades.Actividad4;

public class Prueba3 {
    public static void main(String[] args) {
        // 1. Creamos objetos con constructor por defecto y modificamos sus datos
        Categoria cat1 = new Categoria();
        cat1.setCodigo(10);
        cat1.setNombre("Tornillería");

        Pieza pieza1 = new Pieza();
        pieza1.setCodigo(101);
        pieza1.setNombre("Tornillo hexagonal M8");
        pieza1.setColor("Acero");
        pieza1.setPrecio(0.45);
        pieza1.setCategoria(cat1);

        Proveedor prov1 = new Proveedor();
        prov1.setCodigo(501);
        prov1.setDireccion("Polígono Industrial Sur, Nave 4");
        prov1.setCiudad("Almería");
        prov1.setProvincia("Almería");

        Suministra suministro1 = new Suministra();
        suministro1.setProveedor(prov1);
        suministro1.setPieza(pieza1);
        suministro1.setFecha("23/11/2026");
        suministro1.setCantidad(500);

        System.out.println("SUMINISTRO 1 (Creado por defecto y modificado):");
        suministro1.mostrarInformacion();

        // 2. Creamos objetos usando constructores con parámetros
        Categoria cat2 = new Categoria(20, "Electrónica");
        Pieza pieza2 = new Pieza(202, "Sensor óptico", "Negro", 14.90, cat2);
        Proveedor prov2 = new Proveedor(502, "Calle Industria 18", "Granada", "Granada");
        Suministra suministro2 = new Suministra(prov2, pieza2, "23/11/2026", 120);

        System.out.println(" ");
        System.out.println("SUMINISTRO 2 (Con parámetros):");
        suministro2.mostrarInformacion();

        // Modificamos atributos del suministro 2
        suministro2.setCantidad(150);
        suministro2.getPieza().setPrecio(13.50);

        System.out.println(" ");
        System.out.println("SUMINISTRO 2 (Tras modificaciones):");
        suministro2.mostrarInformacion();
    }
}
