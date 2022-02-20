import java.util.Scanner;

//Classe criada para identificar se uma senha é forte com base nos requisitos:
//*Possui no mínimo 6 caracteres.
//*Contém no mínimo 1 digito.
//*Contém no mínimo 1 letra em minúsculo.
//*Contém no mínimo 1 letra em maiúsculo.
//*Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
public class Exec2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
			String  senha;
			
			senha = sc.next();
			
//Essa função verifica a quantidade de caracteres e se está cumprindo o critério do tamanho mínimo permitido.
//Após essa verificação informa, caso haja, a quantidade de caracteres faltantes.
			if (senha.length()<6){
				System.out.println("Falta(m) " + senha.length() + " caracteres para sua senha ser segura.");
			   }
			if (senha.length()>=6){
				System.out.println("Sua senha contém a quantidade de digitos considerada segura.");
			}
			
			System.out.println("deseja verificar se sua senha é forte?");	

//Caso o usuário deseje verificar se a senha cumpre os outros requisitos, essa função percorre a entrada e 
//e informa os requisitos que ainda precisam ser cumpridos para a senha ser forte.
			String resposta = sc.next();
			if (resposta.equalsIgnoreCase("sim")) {
				
				//Essa função verifica se a entrada contém digito númerico, caso não tenha, retorna para o usuário 
				//que deve adicionar um número à senha.
				for(int i=0; i<senha.length(); i++) {
					char c = senha.charAt(i);
					
					boolean validacao = Character.isDigit(c);
					
					if (validacao==true) {
						break;
				
					}
					if (senha.length() -1==i){
						System.out.println("Favor inserir um número à sua senha.");
					}
					
				}
				//Essa função verifica se a entrada contém Letra Maiúscula, caso não tenha, retorna para o usuário 
				//que deve adicionar uma Letra Maiúscula à senha.
				for(int i=0; i<senha.length(); i++) {
					char c = senha.charAt(i);
					
					boolean validacao = Character.isUpperCase(c);
					
					if (validacao==true) {
						break;
					}
					if (senha.length() -1==i){
						System.out.println("Favor inserir uma letra maiúscula à sua senha.");
					}
				}
				//Essa função verifica se a entrada contém Letra Minúscula, caso não tenha, retorna para o usuário 
				//que deve adicionar uma Letra Minúscula à senha.
				for(int i=0; i<senha.length(); i++) {
					char c = senha.charAt(i);
					
					boolean validacao = Character.isLowerCase(c);
					
					if (validacao==true) {
						break;
					}
					if (senha.length() -1==i){
						System.out.println("Favor inserir uma letra minúscula à sua senha.");
					}
				}
				//Essa função verifica se a entrada contém caracter especial, caso não tenha, retorna para o usuário 
				//que deve adicionar uma caracter especial à senha, informando também, os caracteres permitidos.
				for(int i=0; i<senha.length(); i++) {
					char c = senha.charAt(i);
					
					boolean validacao = Character.isLetterOrDigit(c);
					
					//Essa função determina, caso a entrada cumpra todos os requisitos, que a senha é segura.
					if (validacao==false) {
						System.out.println("Sua senha é segura. ");
						break;
					}
					if (senha.length() -1==i){
						System.out.println("Favor inserir um caracter especial à sua senha. (Caracteres permitidos: !@#$%^&*()-+");
					}
				}
				
			}
			sc.close();
		}
		

	}