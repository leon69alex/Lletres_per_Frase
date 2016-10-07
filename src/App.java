
public class App {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		//Comentari1;
=======
		//Comentari1
>>>>>>> 0416c27828877a819fccaa205c1492c6b3d66536
		String frase = "dwabniubudwaibii";
		String[] array = frase.split("");
		String[] lletres = new String[array.length];
		
		for(int i=0;i<array.length-1;i++){
			int contador = 1;
			for(int j=i+1;j<array.length;j++){

				if(array[i].equals(array[j])){
					contador ++;
				}
			}
			System.out.println(array[i] + ":" + contador);
		}

	}

}
