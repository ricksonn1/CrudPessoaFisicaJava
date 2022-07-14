package br.com.pessoa.fisica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPessoaFisica {

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {

		PessoaFisica pf = new PessoaFisica();
		List<PessoaFisica> list = new ArrayList();
		int opcao = 1;

		while (opcao > 0) {
			Scanner input = new Scanner(System.in);
			System.out.println(
					"1: Cadastrar. " + "\n2: Listar pessoas. " + "\n3: Deletar. " + "\n4: Atualizar cadastro.");
			opcao = input.nextInt();

			switch (opcao) {

			case 1:
				cadastrar(list);

				break;

			case 2:
				listar(list);

				break;

			case 3:
				deletar(list);

				break;
				
			case 4:
				atualizar(list);
				
				break;
			}

		}
		System.out.println("Sistema fechando!...");
	}

	public static void cadastrar(List<PessoaFisica> list) {

		PessoaFisica pf = new PessoaFisica();
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o id: ");
		pf.setId(input.nextInt());
		System.out.println("Digite seu nome: ");
		pf.setNome(input.next());
		System.out.println("Digite seu cpf: ");
		pf.setCpf(input.nextLong());
		System.out.println("Digite sua data de nascimento: ");
		pf.setDataDeNascimento(input.next());
		System.out.println("Digite seu email: ");
		pf.setEmail(input.next());
		System.out.println("Digite seu telefone: ");
		pf.setTelefone(input.nextLong());

		list.add(pf);

		System.out.println(pf.toString());
		System.out.println("Cliente cadastrado com sucesso! ");
	}

	public static void listar(List<PessoaFisica> list) {

		for (PessoaFisica pf : list) {
			System.out.println(pf.toString());
		}

	}

	public static void deletar(List<PessoaFisica> list) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite o ID da Pessoa que deseja deletar: ");
		int id = input.nextInt();

		for (PessoaFisica idbuscado : list) {
			if (id == idbuscado.getId()) {
				list.remove(id);
				System.out.println("Pessoa deletada com sucesso!");
			} else {
				System.out.println("Pessoa nao cadastrada no nosso sistema!");
			}
		}

	}

	public static void atualizar(List<PessoaFisica> list) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite o ID da pessoa que deseja atualizar: ");
		int id = input.nextInt();

		for (PessoaFisica idbuscado : list) {
			if (id == idbuscado.getId()) {
				System.out.println("Digite o novo nome: ");
				String nome = input.next();
				idbuscado.setNome(nome);
				System.out.println("Digite o novo CPF: ");
				Long cpf = input.nextLong();
				idbuscado.setCpf(cpf);
				System.out.println("Digite a nova data de nascimento: ");
				String data = input.next();
				idbuscado.setDataDeNascimento(data);
				System.out.println("Digite o novo email: ");
				String email = input.next();
				idbuscado.setEmail(email);
				System.out.println("Digite o novo telefone: ");
				Long telefone = input.nextLong();
				idbuscado.setTelefone(telefone);

				System.out.println("Dados atualizados com sucesso! ");

			} else {
				System.out.println("Pessoa nao cadastrada no nosso sistema!");
			}
		}

	}
}
