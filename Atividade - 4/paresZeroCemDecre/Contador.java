package paresZeroCemDecre;

public class Contador {
	
	public void contar() {
		for (int i = 100; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
