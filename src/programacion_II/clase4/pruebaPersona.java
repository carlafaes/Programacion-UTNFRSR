package programacion_II.clase4;

public class pruebaPersona {
    public static void main(String[] args) {
        clase4 persona1;
        persona1 = new clase4();
        persona1.nombre="Carla";
        persona1.apellido="Faes";
        persona1.obtenerInfo();

        clase4 persona2= new clase4();
        //System.out.println("persona2 = "+ persona2);
        persona2.nombre= "Matias";
        persona2.apellido="Faes";
        persona2.obtenerInfo();
    }
    
}
