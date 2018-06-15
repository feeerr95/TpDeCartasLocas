package fiuba.algo3.tp2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlGoOhTest {


    @Test
    public void AtacarAMonstruoConMayorAtaqueAmbosPoscionAtaque() {

        //Seteo el atacante
        Campo campo1 = new Campo();
        Jugador atacante = new Jugador(campo1);
        CartaMonstruo insectoComeHombres = new CartaMonstruo("Insecto Come-Hombres", 450, 600, new NivelBasico());
        insectoComeHombres.cambiarEstado(new PosicionVertical());
        insectoComeHombres.asignarDuenio(atacante);

        //Seteo el atacado
        Campo campo2 = new Campo();
        Jugador atacado = new Jugador(campo2);
        CartaMonstruo huevoMonstruoso = new CartaMonstruo("Huevo Monstruoso", 600, 900, new NivelBasico() );
        huevoMonstruoso.cambiarEstado(new PosicionVertical());
        huevoMonstruoso.asignarDuenio(atacado);

        insectoComeHombres.atacarOtraCarta(huevoMonstruoso);

        //Los puntos de vida del atacante tienen que disminuir 150
        assertEquals(7850,atacante.puntosDeVida());

        //Confirmo que la carta atacante fue destruida
        assertEquals(true, insectoComeHombres.estaDestruida());
    }

    @Test
    public void AtacarAMonstruoConMenorAtaqueAmbosPoscionAtaque() {

        //Seteo el atacante
        Campo campo2 = new Campo();
        Jugador atacante = new Jugador(campo2);
        CartaMonstruo huevoMonstruoso = new CartaMonstruo("Huevo Monstruoso", 600, 900, new NivelBasico() );
        huevoMonstruoso.cambiarEstado(new PosicionVertical());
        huevoMonstruoso.asignarDuenio(atacante);

        //Seteo el atacado
        Campo campo1 = new Campo();
        Jugador atacado = new Jugador(campo1);
        CartaMonstruo insectoComeHombres = new CartaMonstruo("Insecto Come-Hombres", 450, 600, new NivelBasico());
        insectoComeHombres.cambiarEstado(new PosicionVertical());
        insectoComeHombres.asignarDuenio(atacado);

        huevoMonstruoso.atacarOtraCarta(insectoComeHombres);

        //Los puntos de vida del atacado tienen que disminuir 150
        assertEquals(7850, atacado.puntosDeVida());

        //Confirmo que la carta atacada fue destruida
        assertEquals(true, insectoComeHombres.estaDestruida());
    }

    @Test
    public void AtacarAMonstruoConIgualAtaqueAmbosEnPosicionAtaque() {

        //Seteo el atacante
        Campo campo1 = new Campo();
        Jugador atacante = new Jugador(campo1);
        CartaMonstruo insectoComeHombres = new CartaMonstruo("Insecto Come-Hombres", 450, 600, new NivelBasico());
        insectoComeHombres.cambiarEstado(new PosicionVertical());
        insectoComeHombres.asignarDuenio(atacante);

        //Seteo el atacado
        Campo campo2 = new Campo();
        Jugador atacado = new Jugador(campo2);
        CartaMonstruo insectoComeHombres2 = new CartaMonstruo("Insecto Come-Hombres", 450, 600, new NivelBasico());
        insectoComeHombres2.cambiarEstado(new PosicionVertical());
        insectoComeHombres2.asignarDuenio(atacado);

        insectoComeHombres.atacarOtraCarta(insectoComeHombres2);

        assertEquals(8000, atacado.puntosDeVida());
        assertEquals(8000,atacante.puntosDeVida());

        assertEquals(true, insectoComeHombres.estaDestruida());
        assertEquals(true, insectoComeHombres2.estaDestruida());
    }

    @Test
    public void AtacarMonstruoEnModoDefensaConMenorDefensaQueElAtaqueDelAtacante() {

       //Seteo el atacante
        Campo campo1 = new Campo();
        Jugador atacante = new Jugador(campo1);
        CartaMonstruo abismoReluciente = new CartaMonstruo("Abismo Reluciente", 1600, 1800, new NivelBasico());
        abismoReluciente.cambiarEstado(new PosicionVertical());
        abismoReluciente.asignarDuenio(atacante);

        //Seteo el atacado
        Campo campo2 = new Campo();
        Jugador atacado = new Jugador(campo2);
        CartaMonstruo insectoComeHombres = new CartaMonstruo("Insecto Come-Hombres", 450, 600, new NivelBasico());
        insectoComeHombres.cambiarEstado(new PosicionHorizontal());
        insectoComeHombres.asignarDuenio(atacado);

        abismoReluciente.atacarOtraCarta(insectoComeHombres);

        assertEquals(8000,atacado.puntosDeVida());
        assertEquals(true, insectoComeHombres.estaDestruida());

    }



    @Test
    public void AtacarMonstruoEnModoDefensaConMayorDefensaQueElAtaqueDelAtacante() {

        //Seteo el atacante
        Campo campo2 = new Campo();
        Jugador atacante = new Jugador(campo2);
        CartaMonstruo insectoComeHombres = new CartaMonstruo("Insecto Come-Hombres", 450, 600, new NivelBasico());
        insectoComeHombres.cambiarEstado(new PosicionVertical());
        insectoComeHombres.asignarDuenio(atacante);

        //Seteo el atacado
        Campo campo1 = new Campo();
        Jugador atacado = new Jugador(campo1);
        CartaMonstruo abismoReluciente = new CartaMonstruo("Abismo Reluciente", 1600, 1800, new NivelBasico());
        abismoReluciente.cambiarEstado(new PosicionHorizontal());
        abismoReluciente.asignarDuenio(atacado);

        insectoComeHombres.atacarOtraCarta(abismoReluciente);

        //El atacante recibe daño por tenes menor puntos de ataque que la defensa del atacado
        assertEquals(8000, atacado.puntosDeVida());
        assertEquals(6650, atacante.puntosDeVida());

        //La carta atacante es destruida
        assertEquals(false, abismoReluciente.estaDestruida());
        assertEquals(true, insectoComeHombres.estaDestruida());
    }

//    @Test
//    public void test11ColocarAgujeroNegro() {
//        Campo campo1 = new Campo();
//        Jugador jugador1 = new Jugador(campo1);
//        jugador1.jugarCarta("Huevo Monstruoso", "PA");
//        Campo campo2 = new Campo();
//        Jugador jugador2 = new Jugador(campo2);
//        jugador2.jugarCarta("Insecto Come-Hombres", "PA");
//
//        jugador1.jugarCarta("Agujero Negro", "PA");
//
//        assertEquals(true, jugador1.campoVacio());
//        assertEquals(true, jugador2.campoVacio());
//        assertEquals(8000, jugador1.obtenerPuntosDeVida());
//        assertEquals(8000, jugador2.obtenerPuntosDeVida());
//
//    }
//
    @Test
    public void ColocarMonstruoConUnSacrificio() {

    Campo campo = new Campo();
    CartaMonstruo insectoComeHombres = new CartaMonstruo("Insecto Come-Hombres", 450, 600, new NivelBasico());
    insectoComeHombres.colocarEnCampo(campo);
    CartaMonstruo chicaMagaOscura = new CartaMonstruo("Chica Maga Oscura", 2000, 1700, new NivelMedio());
    chicaMagaOscura.colocarEnCampo(campo);

    assertEquals(true, insectoComeHombres.estaDestruida());
}

    @Test
    public void ColocarMonstruoConDosSacrificios(){

        Campo campo = new Campo();
        CartaMonstruo insectoComeHombres = new CartaMonstruo("Insecto Come-Hombres", 450, 600, new NivelBasico());
        insectoComeHombres.colocarEnCampo(campo);
        CartaMonstruo abismoReluciente = new CartaMonstruo("Abismo Reluciente", 1600, 1800, new NivelBasico());
        abismoReluciente.colocarEnCampo(campo);
        CartaMonstruo dragonBlancoDeOjosAzules = new CartaMonstruo("Dragon Blanco De Ojos Azules", 3000, 2500, new NivelAlto());
        dragonBlancoDeOjosAzules.colocarEnCampo(campo);


        assertEquals(true, insectoComeHombres.estaDestruida());
        assertEquals(true, abismoReluciente.estaDestruida());
    }


}



