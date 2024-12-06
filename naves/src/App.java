import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Naves> navesNaoUsadas = new ArrayList<>();
        ArrayList<Naves> navesTotais = new ArrayList<>();
        ArrayList<Tripulacao> tripulantes = new ArrayList<>();
        ArrayList<Missoes> missoes = new ArrayList<>();
        Tripulacao tripulante1 = new Tripulacao();
        Naves nave1 = new Naves();

        char n;

        do {
            for(Missoes missao : missoes){
                System.out.println("--------------------");
                System.out.println("Nome da missão: " +  missao.getNome());
                System.out.println("Data de lançamento: " + missao.getDataDeLancamento());
            }

            for(Naves nave : navesNaoUsadas){
                System.out.println("------------------------------------");
                System.out.println("Nome da nave: " + nave.getNomeDaNave());
            }
            System.out.println("------------------------------------");
            for (Tripulacao tripulante : tripulantes) {
                System.out.println("Index do tripulante: " + tripulantes.indexOf(tripulante));
                System.out.println("Nome: " + tripulante.getNome());
                System.out.println("Função: " + tripulante.getFuncao());
                System.out.println("--------------------------");
            }


            System.out.println("Sistema de Gerenciamento de Expedições Espaciais\n\n(1)Cadastrar Missão\n(2)Cadastrar Nave\n(3)Cadastrar Tripulantes\n(4)Imprimir Naves Disponíveis\n(5)Colocar nave em uma missão\n(6)Associar tripulante a uma nave\n(7)Sair");

            n = sc.nextLine().charAt(0);

            switch (n) {
                case '1':
                    System.out.println("Qual o nome da missão?:");
                    String nomeMissao = sc.nextLine();
                    System.out.println("Qual o objetivo?:");
                    String objetivo = sc.nextLine();
                    System.out.println("Qual a data da missão?");
                    String data = sc.nextLine();
                    System.out.println("Qual o destino da missão ?(Marte | Lua | Estação Estrela | Estação Espacial) :");
                    String destino = sc.nextLine();

                    boolean lugarErrado = false;
                    if (!(destino.equalsIgnoreCase("Marte") || destino.equalsIgnoreCase("Lua") || destino.equalsIgnoreCase("Estacao Espacial"))) {
                        lugarErrado = true;
                    }

                    if(lugarErrado){
                        System.out.println("Você não pode ir para esse lugar...");
                        
                    } else {
                        boolean dataDuplicada = false;
                        for (Missoes missao : missoes) {
                            if (missao.getDataDeLancamento().equals(data)) {
                                dataDuplicada = true;
                                break;
                            }
                        }

                        if (dataDuplicada) {
                            System.out.println("Já existe uma missão com essa data de lançamento!");
                        } else {
                            missoes.add(new Missoes(nomeMissao, objetivo, data, destino));
                        }
                    }
                    break;
                case '2':
                    System.out.println("Qual o nome da nave?:");
                    String identificacao = sc.nextLine();
                    System.out.println("Qual o tipo da nave?:");
                    String tipo = sc.nextLine();
                    System.out.println("Qual a capacidade da tripulação?:");
                    int capacidadeTripulacao = Integer.parseInt(sc.nextLine());
                    System.out.println("Qual a capacidade de peso dos recursos?:");
                    int capacidadeRecursos = Integer.parseInt(sc.nextLine());

                    try {
                        Naves novaNave = new Naves(identificacao, tipo, capacidadeTripulacao, capacidadeRecursos);
                        navesNaoUsadas.add(novaNave);
                        navesTotais.add(novaNave);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case '3':
                    System.out.println("Qual o nome desse tripulante?:");
                    String nome = sc.nextLine();
                    System.out.println("Qual a função desse tripulante?:");
                    String funcao = sc.nextLine();
                    System.out.println("Qual o nivel de experiencia desse tripulante?:");
                    int nivelExperiencia = Integer.parseInt(sc.nextLine());
                    System.out.println("Qual a especialidade desse tripulante?:");
                    String especialidade = sc.nextLine();
                    System.out.println("CADASTRO COM SUCESSO!");
                    tripulantes.add(new Tripulacao(nome, funcao, nivelExperiencia, especialidade));
                    break;

                case '4':
                    if (navesNaoUsadas.isEmpty()) {
                        System.out.println("Ainda não há naves disponíveis.");
                    } else {
                        for (Naves nave : navesNaoUsadas) {
                            System.out.println("Nome da nave: " + nave.getNomeDaNave());
                            System.out.println("Tipo da nave: " + nave.getTipoDaNave());
                            System.out.println("Capacidade de tripulação: " + nave.getCapacidadeDaNave());
                            System.out.println("Capacidade de recursos: " + nave.getCapacidadeDeRecursos());
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;

                case '5':
                    if (!navesNaoUsadas.isEmpty()) {
                        for (Naves nave : navesNaoUsadas) {
                            System.out.println("Index da nave: " + navesNaoUsadas.indexOf(nave));
                            System.out.println("Nome da nave: " + nave.getNomeDaNave());
                            System.out.println("Tipo da nave: " + nave.getTipoDaNave());
                            System.out.println("Capacidade de armazenamento de recursos da nave: " + nave.getCapacidadeDeRecursos());
                            System.out.println("Capacidade de tripulação máxima da nave: " + nave.getCapacidadeDaNave());
                            System.out.println("Levando " + nave.getPesoDeRecurso() + "kg de recursos!");
                            System.out.println("Quantidade de pessoas: " + nave.getQuantidadeDePessoas());
                            System.out.println("-----------------------------------");
                        }
                        System.out.println("Qual nave você quer em missão? Coloque o index");
                        String naveEscolha = sc.nextLine();

                        for (Naves nave : navesNaoUsadas) {
                            if (String.valueOf(navesNaoUsadas.indexOf(nave)).equals(naveEscolha)) {
                                nave1 = nave;
                            }
                        }

                        System.out.println("Qual missão você quer colocar a nave?");
                        String missaoEscolha = sc.nextLine();

                        if (navesNaoUsadas.contains(nave1)) {
                            for (Missoes missao : missoes) {
                                if (missao.getNome().equals(missaoEscolha)) {
                                    missao.adicionarNave(nave1);
                                    navesNaoUsadas.remove(nave1);
                                }
                            }
                        } else {
                            System.out.println("Essa nave não está disponível!");
                        }
                    } else {
                        System.out.println("Ainda não tem nenhuma nave!");
                    }
                    break;

                case '6':
                    for (Tripulacao tripulante : tripulantes) {
                        System.out.println("Index do tripulante: " + tripulantes.indexOf(tripulante));
                        System.out.println("Nome: " + tripulante.getNome());
                        System.out.println("Função: " + tripulante.getFuncao());
                        System.out.println("--------------------------");
                    }
                    System.out.println("Qual tripulante você quer em uma nave? Coloque o index");
                    String tripulanteEscolha = sc.nextLine();

                    for (Tripulacao tripulante : tripulantes) {
                        if (String.valueOf(tripulantes.indexOf(tripulante)).equals(tripulanteEscolha)) {
                            tripulante1 = tripulante;
                        }
                    }

                    System.out.println("Qual nave você quer colocar o tripulante? coloque o nome");
                    String naveEscolha = sc.nextLine();

                    for (Naves nave : navesNaoUsadas) {
                        if (nave.getNomeDaNave().equals(naveEscolha)) {
                            nave.adicionarTripulacao(tripulante1);
                        }
                    }
                    break;

                case '7':
                    break;

                default:
                    System.out.println("Digite um comando válido");
                    break;
            }
        } while (n != '7');
        sc.close();
    }
}
