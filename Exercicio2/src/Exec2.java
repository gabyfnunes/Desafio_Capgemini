import java.util.Scanner;

//Classe criada para identificar se uma senha � forte com base nos requisitos:
//*Possui no m�nimo 6 caracteres.
//*Cont�m no m�nimo 1 digito.
//*Cont�m no m�nimo 1 letra em min�sculo.
//*Cont�m no m�nimo 1 letra em mai�sculo.
//*Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
public class Exec2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
			String  senha;
			
			senha = sc.next();
			
//Essa fun��o verifica a quantidade de caracteres e se est� cumprindo o crit�rio do tamanho m�nimo permitido.
//Ap�s essa verifica��o informa, caso haja, a quantidade de caracteres faltantes.
			if (senha.length()<6){
				System.out.println("Falta(m) " + senha.length() + " caracteres para sua senha ser segura.");
			   }
			if (senha.length()>=6){
				System.out.println("Sua senha cont�m a quantidade de digitos considerada segura.");
			}
			
			System.out.println("deseja verificar se sua senha � forte?");	

//Caso o usu�rio deseje verificar se a senha cumpre os outros requisitos, essa fun��o percorre a entrada e 
//e informa os requisitos que ainda precisam ser cumpridos para a senha ser forte.
			String resposta = sc.next();
			if (resposta.equalsIgnoreCase("sim")) {
				
				//Essa fun��o verifica se a entrada cont�m digito n�merico, caso n�o tenha, retorna para o usu�rio 
				//que deve adicionar um n�mero � senha.
				for(int i=0; i<senha.length(); i++) {
					char c = senha.charAt(i);
					
					boolean validacao = Character.isDigit(c);
					
					if (validacao==true) {
						break;
				
					}
					if (senha.length() -1==i){
						System.out.println("Favor inserir um n�mero � sua senha.");
					}
					
				}
				//Essa fun��o verifica se a entrada cont�m Letra Mai�scula, caso n�o tenha, retorna para o usu�rio 
				//que deve adicionar uma Letra Mai�scula � senha.
				for(int i=0; i<senha.length(); i++) {
					char c = senha.charAt(i);
					
					boolean validacao = Character.isUpperCase(c);
					
					if (validacao==true) {
						break;
					}
					if (senha.length() -1==i){
						System.out.println("Favor inserir uma letra mai�scula � sua senha.");
					}
				}
				//Essa fun��o verifica se a entrada cont�m Letra Min�scula, caso n�o tenha, retorna para o usu�rio 
				//que deve adicionar uma Letra Min�scula � senha.
				for(int i=0; i<senha.length(); i++) {
					char c = senha.charAt(i);
					
					boolean validacao = Character.isLowerCase(c);
					
					if (validacao==true) {
						break;
					}
					if (senha.length() -1==i){
						System.out.println("Favor inserir uma letra min�scula � sua senha.");
					}
				}
				//Essa fun��o verifica se a entrada cont�m caracter especial, caso n�o tenha, retorna para o usu�rio 
				//que deve adicionar uma caracter especial � senha, informando tamb�m, os caracteres permitidos.
				for(int i=0; i<senha.length(); i++) {
					char c = senha.charAt(i);
					
					boolean validacao = Character.isLetterOrDigit(c);
					
					//Essa fun��o determina, caso a entrada cumpra todos os requisitos, que a senha � segura.
					if (validacao==false) {
						System.out.println("Sua senha � segura. ");
						break;
					}
					if (senha.length() -1==i){
						System.out.println("Favor inserir um caracter especial � sua senha. (Caracteres permitidos: !@#$%^&*()-+");
					}
				}
				
			}
			sc.close();
		}
		

	}