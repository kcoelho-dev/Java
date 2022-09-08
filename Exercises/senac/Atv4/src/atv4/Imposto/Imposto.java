package atv4.Imposto;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Imposto {
	static Scanner input = new Scanner(System.in);

	private static ArrayList<Imposto> listaImpostos = new ArrayList<Imposto>();

	private double total;
	private String descricao;
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Imposto() {
	
	}

	public double getTotal() {
		return this.total;
	}

	/**
	 * This function sets the total of the taxes.
	 * 
	 * @param total The total amount of the taxes.
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	public static void addImposto(Imposto i) {
		listaImpostos.add(i);
	}
	
	public static void printImpostos(){
		int count = 1;
		for (Imposto imposto : listaImpostos) {
			System.out.println("\nImposto: " + count);
			System.out.println("Tipo do imposto: " + imposto.getDescricao());
			System.out.println("Total do imposto devido: R$"+ imposto.getTotal());
			System.out.println();
			count++;
		}
	}
}
