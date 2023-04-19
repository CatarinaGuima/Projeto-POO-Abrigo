import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Animal extends Abstrata {
	
		public Animal() {
		super(vacinado, castrado);
	
	}

		//MÉTODO GERAL
		String novoCadastro() {
			//CRIAÇÃO DO ARRAY
			ArrayList<Object> novoAnimal = new ArrayList<> ();
			animais = 0;			
		int cadastro = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um Pet? [1 - SIM; 0 - NÃO]"));
		if (cadastro == 1) {
			
			
			JOptionPane.showMessageDialog(null, "Certo! Vamos iniciar o cadastro do seu Pet!\n");
			
			this.setTipoAnimal(JOptionPane.showInputDialog("TIPO do Pet: [Cachorro, Gato ou Coelho?"));
			
			this.setNome(JOptionPane.showInputDialog(null, "NOME do seu Pet: "));
			
			this.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "IDADE do seu Pet: ")));
			
			this.setRaça(JOptionPane.showInputDialog(null, "RAÇA do seu Pet: "));
			
			this.setSexo(JOptionPane.showInputDialog(null, "SEXO do seu Pet: "));
			
			Abstrata.vacinado = JOptionPane.showInputDialog("Seu Pet é VACINADO? [S/N]:") != null;
			
			Abstrata.castrado = JOptionPane.showInputDialog("Seu Pet é CASTRADO? [S/N]: ") != null; 
			
			
			animais++;
			
			JOptionPane.showMessageDialog(null, "------------------- NOVO CADASTRO -------------------\n"
					+ "\nTIPO do animal: " + this.getTipoAnimal() + "\nNOME do animal: " + this.getNome() + "\nIDADE do animal: " + this.getIdade() 
			+ "\nSEXO do animal: " + this.getSexo() + "\nRAÇA do animal: " + this.getRaça() + "\nVACINADO? " + this.getVacinado()
			+ "\nCASTRADO? " + this.getCastrado());
		 int resp = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar mais um Pet [1 - SIM ; 0 - NÃO]?"));
		    do {
		    JOptionPane.showMessageDialog(null, "Certo! Vamos iniciar o cadastro do outro Pet!\n");
			novoCadastro(); 
			 }while(resp == 1);
		}else if (cadastro == 0) {
			JOptionPane.showMessageDialog(null, "Processo finalizado com sucesso! Obrigada por escolher o Abrigo Eu Amo Animais PE!");
			JOptionPane.showMessageDialog(null, "Total de Pets cadastrados: " + novoAnimal.size());
		}
		return null;
	}
		
		//MÉTODOS ABSTRATOS (PROVENIENTES DA CLASSE ABSTRATA)
		@Override
		public void locomover() {
			
		}

		@Override
		public void alimentar() {
			
		}

		@Override
		public void emitirSom() {
			
		}
}

