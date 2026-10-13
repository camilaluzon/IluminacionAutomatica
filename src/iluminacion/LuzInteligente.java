package iluminacion;

public class LuzInteligente {
    private String idLuz;
    private int nivelBrillo;
    private boolean encendido;

    public void setIdLuz(String idLuz){
        if (idLuz != null && !idLuz.isBlank()){
            this.idLuz=idLuz;
        }
    }
    public void setNivelBrillo(int nivelBrillo){
        if (encendido == true){
            if (nivelBrillo <= 100 && nivelBrillo >= 0){
                this.nivelBrillo=nivelBrillo;
            }
        }
    }

    public String getIdLuz(){
        return idLuz;
    }
    public int getNivelBrillo(){
        return nivelBrillo;
    }

    public void encender(){
        encendido=true;
    }
    public void apagar(){
        encendido=false;
    }

    public void ajustarBrillo(int nuevoNivel){
        nivelBrillo=nuevoNivel;

    }

    public void mostrarEstado(){
        System.out.println("ID de la luz: " + getIdLuz());
        System.out.println("Nivel de brillo: " + getNivelBrillo());
    }
}
