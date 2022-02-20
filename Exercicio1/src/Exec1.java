import java.util.Scanner;
// @author Gabriela de Freitas
//classe criada para imprimir escada cuja a base e altura será informada pelo usuário.
public class Exec1 {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
	 int valorBaseAltura = sc.nextInt();
	 String escada = ("");
	 
// Essa função verifica o tamanho da variável i, enquanto esta for menor que 'valorBaseAltura' 
// (valor informado pelo usuário), imprime mais um '*' à linha impressa.
	 for (int i = 1; i <= valorBaseAltura; i++) {
		 escada += "*";
		 System.out.println(escada);
	 }
	 
	 sc.close();
	 
	}

}
