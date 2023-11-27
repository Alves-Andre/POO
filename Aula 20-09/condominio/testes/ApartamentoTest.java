import org.junit.Test;
import junit;

class ApartamentoTeste {
    @Test
    public void TesteaddApartamento(){
        Condominio condoteste = new Condominio("alfavile");
        Apartamento apt1 = new Apartamento(1, true);
        Apartamento apt2 = new Apartamento(2, false);
        ambience.addApto(apt1);
        ambience.addApto(apt2);
        Apartamento ap1 = condoteste.getApartamento(1);
        Apartamento ap2 = condoteste.getApartamento(2);

        Assert.assertEquals(ap1.numero, 1);
        assertThat(ap1.numero, 1);
        assertThat(ap2.numero, 2);
        
    }
}


