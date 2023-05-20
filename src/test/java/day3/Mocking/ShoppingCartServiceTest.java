package day3.Mocking;

import day3.Mocking.Sample2.ProductManager;
import day3.Mocking.Sample2.ShoppingCartService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ShoppingCartServiceTest {

    @Test
    public void testAddProductToCart() {

        ProductManager productManager = mock(ProductManager.class);

        when(productManager.getStockStatus("ABC123")).thenReturn(5);
        // AddProductToCart methodunu test ederken productManager.getStockStatus methoduna
        // sanki "ABC123" vermisiz de; o da 5 return etmis gibi olacak.

        ShoppingCartService shoppingCartService = new ShoppingCartService(productManager);
        // ShoppingCartService(productManager) seklinde constructor olmazsa burada olusturulan
        // 2 obje birbirinden bagimsiz olacagi icin hata verir

        boolean result = shoppingCartService.addProductToCart("ABC123");

        assertTrue(result);

        verify(productManager).getStockStatus("ABC123");
        verify(productManager).decreaseStock("ABC123");
//        verify(productManager).deneme();
        // yukaridaki methodlarin calistirilip-calistirilmadigini kontrol ediyoruz
        // mesela else'de olan deneme() calistirilmaz
    }
}
