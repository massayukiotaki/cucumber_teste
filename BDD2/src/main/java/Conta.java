import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Conta {

    private String tipoConta;
    private int saldoInicial;

    @Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
    public void umClienteEspecialComSaldoAtualDeReais(int int$) {
        saldoInicial = int$;
        tipoConta = "Cliente especial";
    }

    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void forSolicitadoUmSaqueNoValorDeReais(int int$) {
        System.out.println("Saldo atual da conta: " + saldoInicial);
        System.out.println("Saque realizado: " + int$);
        saldoInicial -= int$;
    }

    @Then("^deve efetuar o saque e atualizar o saldo para -(\\d+) reais$")
    public void deveEfetuarOSaqueEAtualizarOSaldoParaReais(int arg1) {
        Assert.assertEquals(arg1, saldoInicial);
    }

    @Then("^check more outcomes$")
    public void checkMoreOutcomes() throws Throwable {
        // Adicione verificações adicionais, se necessário
    }
}