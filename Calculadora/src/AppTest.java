import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void test(){
        
        float passaValor1, passaValor2;
        passaValor1 = 20;
        passaValor2 = 30;

        float RetornoEsperado = 50;
        float RetornoObtido = passaValor1+passaValor2;
        assertEquals(RetornoEsperado, RetornoObtido);

    }

}
