package analiseEstatistica;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		
	    String nome, genero, curso, profissao;
	    int idade, periodo, anoEntrada, semestreEntrada;
	    double maiorNota, menorNota, salario;
	    Aluno aluno; 
	    List <Aluno> listaAluno = new ArrayList<Aluno>();
		
		Scanner sc = new Scanner(System.in);	    
		
		for(int x=0; x<20; x++) {
		System.out.println("Digite seus dados:");	
		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Idade: ");
		idade = sc.nextInt();
		System.out.print("Gênero: ");
		genero = sc.next();
		System.out.print("Curso: ");
		curso = sc.next();
		System.out.print("Período: ");
		periodo = sc.nextInt();
		System.out.print("Ano que entrou na universidade: ");
		anoEntrada = sc.nextInt();
		System.out.print("Semestre que entrou na universidade: ");
		semestreEntrada = sc.nextInt();
		System.out.print("Maior nota: ");
		maiorNota = sc.nextDouble();
		System.out.print("Menor nota: ");
		menorNota = sc.nextDouble();
		System.out.print("Profissão: ");
		profissao = sc.next();
		System.out.print("Salário: ");
		salario = sc.nextDouble();
		aluno = new Aluno(nome, idade, genero, curso, periodo, anoEntrada, semestreEntrada, maiorNota, menorNota, profissao, salario);
		listaAluno.add(aluno);
		System.out.println();
		}
		
	    FileWriter arq = new FileWriter("C:\\Users\\poliveira\\Desktop\\alunos.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);

	    gravarArq.printf("Nome, Idade, Genero, Curso, Periodo, AnoEntrada, SemestreEntrada, MaiorNota, MenorNota, Profissão, Salario,%n");
		for(Aluno alunos : listaAluno) {
			gravarArq.println(alunos);
			System.out.println();
		}
		arq.close();
		sc.close();
	  }

}
