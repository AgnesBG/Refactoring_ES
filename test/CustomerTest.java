import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {
  
    @Test
    public void testStatement() {
            
        Customer usuario = new Customer("Agnes");
        
        Movie um = new Movie("Mulan", 2);
        Movie dois = new Movie("O Rei Leão", 2);
        
        Rental primeiro_aluguel = new Rental(um,3);
        Rental segundo_aluguel = new Rental(dois,7);
        
        usuario.addRental(primeiro_aluguel);
        usuario.addRental(segundo_aluguel);

        String resultadoEsperado = "Rental Record for Agnes\n\tMulan\t1.5\n\tO Rei Leão\t7.5\nAmount owed is 9.0\nYou earned 2 frequent renter points";
        String resultado = usuario.statement();
        
        assertEquals(resultadoEsperado, resultado);
    }
    
}
