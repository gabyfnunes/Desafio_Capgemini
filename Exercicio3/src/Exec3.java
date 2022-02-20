import java.util.Scanner;

//Essa classe verifica se as substrings de um string podem formar um anagrama.
//@author Gabriela de Freitas.

public class Exec3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a palavra");
		String palavra = "";
		palavra = sc.next();
		
		//essa fun��o transforma a string em caracter.
		char letra[]=palavra.toCharArray();
		int count=0;
		int x=0;
		int y=0;
		
		//Esse primeiro 'for' percorre a exten��o da string e identifica se h� letras repetidades, e conta as repeti��es.
		//O segundo for, faz a mesma fun��o, entretanto, enquanto o primeiro verifica a letra[0], o segundo verifica a pr�xima. Assim por diante, at� o fim da string.
		for(int i=0; i < palavra.length(); i++) {
			count = 1;
			for (int j=i+1;j < palavra.length(); j++ ) {
				if (letra[i] == letra[j] && letra[i] != ' ') {
					count++;
					letra[j] = '0';
				}
				
			}
			//Essa fun��o identifica se o count foi incrementado e verifica se a letra j� foi repetida.
			if (count > 1 && letra[i] != '0') {
				x++;
			}
			
		}
		// essa fun��o compara tr�s substrings com as pr�ximas tr�s, para avaliar se as tr�s primeiras est�o dentro das restantes, assim por diante, at� a palavra finalizar.
		for (int i = 0; i < palavra.length(); i++) {
            try {
                int soma = 0;
                if(palavra.length() <=3 ){
                    soma = 2;
                }else {
                    soma = 3;
                }
                String qualquer = palavra.substring(i, i + soma );

                for (int j = i+1; i < palavra.length(); j++){
                    if (palavra.length() < 4){
                        String um = palavra.substring(j, j+1);
                        String dois = palavra.substring(j+1,j+2);
                        if (qualquer.contains(um) && qualquer.contains(dois)) {
                            y++;
                        }
                    }else {
                        String um = palavra.substring(j, j+1);
                        String dois = palavra.substring(j+1,j+2);
                        String tres = palavra.substring(j+2, j+3);

                        if (qualquer.contains(um) && qualquer.contains(dois) && qualquer.contains(tres)) {
                            y++;

                        }
                    }
                }

            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
		//Impress�o dos anagramas.
        System.out.println("A quantidade de anagramas �: " + (x + y));
        
        sc.close();
    }
}
	