public class Main {
	 public static void main(String[] args) {
	        Banco banco = new Banco();
	        banco.setNome("Banco Digital");

	        Cliente venilton = new Cliente();
	        venilton.setNome("Venilton");
	        banco.adicionarCliente(venilton);

	        Conta cc = new ContaCorrente(venilton);
	        Conta poupanca = new ContaPoupanca(venilton);

	        cc.depositar(100);
	        cc.transferir(100, poupanca);

	        cc.imprimirExtrato();
	        poupanca.imprimirExtrato();

	        banco.listarClientes();

	        Gerente gerente = new Gerente("Gerente", "senha123");
	        if (gerente.autenticar("senha123")) {
	            System.out.println("Gerente autenticado com sucesso!");
	        } else {
	            System.out.println("Senha incorreta!");
	        }
	    }

}