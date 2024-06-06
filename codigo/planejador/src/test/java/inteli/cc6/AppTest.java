package inteli.cc6;

import inteli.cc5.Cliente;
import inteli.cc5.Fornecedores;
import inteli.cc5.Transportes;
import inteli.cc5.UsinaBriquete;
import org.junit.Test;

import static org.junit.Assert.*;

/**
* Unit test for simple App.
*/
public class AppTest

{
   // Instanciando as classes para teste
   private Fornecedores fornecedor = new Fornecedores();
   private Transportes transporte =  new Transportes();
   private UsinaBriquete usinaBriq = new UsinaBriquete();
   private Cliente cliente = new Cliente();

   // Inicio dos testes para a classe Fornecedores
   @Test
   public void setId() { // testar métodos set e get
       int id = 1; // definir um exemplo
       fornecedor.setId(id);
       assertEquals(id, fornecedor.getId());
   }

   @Test
   public void getCodigoFornecedor() { // testar se o código do fornecedor é nulo
       assertNull(fornecedor.getCodigoFornecedor());
   }

   @Test
   public void setCodigoFornecedor() { // testar métodos set e get
       String codigo = "RIO"; //precisamos ver um exemplo
       fornecedor.setCodigoFornecedor(codigo);
       assertEquals(codigo, fornecedor.getCodigoFornecedor());
   }

   @Test
   public void isAtivo() { // testar se o fornecedor está ativo
       assertTrue(fornecedor.isAtivo());
   }

   @Test
   public void setAtivo() { // testar métodos set e isAtivo
       fornecedor.setAtivo(false);
       assertFalse(fornecedor.isAtivo());
   }
   // Fim dos testes para a classe Fornecedores

   // Inicio dos testes para a classe Transportes
   @Test
   public void testSetIdCadeiaOrigem() { // testar métodos set e get de CadeiaOrigem
       int idCadeiaOrigem = 0;
       transporte.setIdCadeiaOrigem(idCadeiaOrigem);
       assertEquals(idCadeiaOrigem, transporte.getIdCadeiaOrigem());
   }
   // Fim dos testes para a classe Transportes


   
   // Fim dos testes para a classe UsinaDeBriqueto

   // Teste para a classe clientes
   @Test
   public void testSetCodigoRegiao() { // testar get e set de codigoRegiao
       String codigoRegiao = "RIO";
       cliente.setCodigoRegiao(codigoRegiao);
       assertEquals(codigoRegiao, cliente.getCodigoRegiao());
   }

   @Test
   public void TestSetTempoPadraoOperacao() { // testar get e set de codigoRegiao
       int tempo = 15;
       cliente.setTempoPadraoOperacao(tempo);
       assertEquals(tempo, cliente.getTempoPadraoOperacao());
   }
}
