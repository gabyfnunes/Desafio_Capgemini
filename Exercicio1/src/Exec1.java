import java.util.Scanner;
// @author Gabriela de Freitas
//classe criada para imprimir escada cuja a base e altura ser� informada pelo usu�rio.
public class Exec1 {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
	 int valorBaseAltura = sc.nextInt();
	 String escada = ("");
	 
// Essa fun��o verifica o tamanho da vari�vel i, enquanto esta for menor que 'valorBaseAltura' 
// (valor informado pelo usu�rio), imprime mais um '*' � linha impressa.
	 for (int i = 1; i <= valorBaseAltura; i++) {
		 escada += "*";
		 System.out.println(escada);
	 }
	 
	 sc.close();
	 
	}

}
