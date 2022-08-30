import java.util.Scanner;

public class ACMETraders {

    CadastroGeral c = new CadastroGeral();
    Scanner in = new Scanner(System.in);

    public void preCadastrar() {
        Participante gabriel = new Participante(1,"gabrielspiandorello@gmail.com");
        c.cadastra(gabriel);
        Livro livro1 = new Livro("Mais Esperto que o Diabo", "Napoleon Hill", 97885);
        c.cadastra(livro1);
        gabriel.addLivro(livro1);
        livro1.addParticipante(gabriel);
        Livro livro2 = new Livro("Pense e Enriqueca", "Napoleon Hill", 97819);
        c.cadastra(livro2);
        gabriel.addLivro(livro2);
        livro2.addParticipante(gabriel);
        Livro livro3 = new Livro("Homem da Arena", "Armando Spiandorello", 91098);
        c.cadastra(livro3);
        gabriel.addLivro(livro3);
        livro3.addParticipante(gabriel);
        Participante enzo = new Participante(2,"enzoomaior@gmail.com");
        c.cadastra(enzo);
        Livro livro4 = new Livro("Harry Potter", "J. K. Rowling", 97804);
        c.cadastra(livro4);
        enzo.addLivro(livro4);
        livro4.addParticipante(enzo);
        Participante felipe = new Participante(3,"felipereinoldi@gmail.com");
        c.cadastra(felipe);
        Livro livro5 = new Livro("O Senhor dos Aneis", "J. R. R. Tolkien", 97888);
        c.cadastra(livro5);
        felipe.addLivro(livro5);
        livro5.addParticipante(felipe);
    }

    public void executa() {
        String opcao;
        do {
            apresentaMenu();
            opcao = in.nextLine();
            switch(opcao) {
                case "1":
                    System.out.println(c.pesquisaTudo());
                    if(c.pesquisaTudo()==null){
                        System.out.println("Nenhum participante cadastrado no sistema..");
                    }
                    break;
                case "2":
                    System.out.println("Digite o código");
                    int cod;
                    cod = in.nextInt();
                    in.nextLine();
                    if(c.pesquisa(cod)!=null){
                        System.out.println(c.pesquisa(cod));
                    }
                    else{
                        System.out.println("Nenhum participante encontrado com este codigo.");
                    }
                    break;
                case "3":
                    System.out.println("Digite o nome do livro");
                    String nome;
                    nome = in.nextLine();
                    if(c.pesquisa(nome)!=null){
                        System.out.println(c.pesquisa(nome));
                    }
                    else{
                        System.out.println("Nenhum item de troca encontrado com este nome.");
                    }
                    break;
                case "4":
                    break;
                default:
                    System.out.println();
                    System.out.println("Opcao inválida! Redigite.");
            }
        } while(!opcao.equals("4"));
    }

    public void apresentaMenu() {
        System.out.println("===============MENU===============");
        System.out.println("Opcões: ");
        System.out.println("[1] Mostrar todas as informações cadastradas");
        System.out.println("[2] Pesquisar participante pelo código");
        System.out.println("[3] Pesquisar item de troca pelo nome");
        System.out.println("[4] Sair");
        System.out.print("Opção desejada: ");
    }
}
