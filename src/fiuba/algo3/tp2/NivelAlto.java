package fiuba.algo3.tp2;

public class NivelAlto extends Nivel {

    @Override
    public void colocarEnCampo(Campo campo, CartaMonstruo carta) {
        if(campo.cantidadDeMonstruos() >= 2){
            campo.eliminarUnaCarta();
            campo.eliminarUnaCarta();
            campo.agregarCartaMonstruo(carta);
        }
        else{
            //EXCEPCION NO TIENE MONSTRUOS EN EL CAMPO PARA SACRIFICAR
        }
    }
}