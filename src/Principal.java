
public class Principal {
	
	public static void main(String[] args) {
		
		Cliente lays = new Cliente();
		lays.setNome("Lays Maiara Assunção Alves");
		
		Cliente ada = new Cliente();
		ada.setNome("Ada Lovelace");

		ContaCorrente cc = new ContaCorrente(lays);
		ContaPoupanca poupanca = new ContaPoupanca(ada);

		cc.depositar(2500);
		cc.transferir(250, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}
}
