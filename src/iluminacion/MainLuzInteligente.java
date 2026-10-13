package iluminacion;

public class MainLuzInteligente {
    static void main() {
        LuzInteligente luz1 = new LuzInteligente();
        LuzInteligente luz2 = new LuzInteligente();

        luz1.setIdLuz("LOOO1");
        luz1.setNivelBrillo(59);

        luz2.setIdLuz("L002");
        luz2.setNivelBrillo(98);

        luz1.encender();
        luz1.ajustarBrillo(80);

        luz2.apagar();

        System.out.println("PRIMERA LUZ");
        luz1.mostrarEstado();

        System.out.println("SEGUNDA LUZ");
        luz2.mostrarEstado();

    }
}
