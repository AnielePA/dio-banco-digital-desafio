
public class Gerente extends Cliente {
	  private String senha;

	    public Gerente(String nome, String senha) {
	        super(nome);
	        this.senha = senha;
	    }

	    public boolean autenticar(String senha) {
	        return this.senha.equals(senha);
	    }

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
	}

