
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felipe.reblin
 */
public class TesteMusicas {
    
    @Test
    public void teste1() {
        EscolhaDasMusicas musica = new EscolhaDasMusicas();
        int[] botoes = {3,4};
        final String RESULTADO_ESPERADO = "SALT\nPROXYCITY\nP.Y.N.G.";
        String resultadoObtido = musica.verificarMusica(botoes);
        assertEquals(RESULTADO_ESPERADO, resultadoObtido);
    }
}
