/*Casseb é um médico renomado que se formou em matemática na UNICU (Universidade de Cuiabá). E graças a sua formação em exatas ele possui uma maneira diferenciada de atender os
seus clientes. Basicamente, cada cliente possui uma prioridade única de atendimento que depende da sua idade. Caso um cliente possua uma idade que seja um número primo maior que 2 
ele sempre será atendido primeiro que os outros, caso não possua nenhum cliente com idade de um número primo a prioridade é para os clientes de 
idade ímpar. E por fim os clientes de idade Par são sempre os últimos a serem atendidos. Caso dois clientes de mesma prioridade sejam colocados na lista de espera, a prioridade é do 
cliente que entrou primeiro. Baseando-se nessa metodologia, crie uma classe cliente que possui um atributo idade e outros de sua preferência. Após isso crie uma classe clínica que 
possui uma fila de espera que é um  array com clientes,crie também um atributo que diz quantos clientes a fila de espera possui no momento.
Após isso desenvolva um método de inserção que coloque um cliente na posição adequada do array de acordo com os critérios previamente estabelecidos no texto. Também faça uma função 
de remoção que remove e retorna o próximo cliente a ser atendido na fila. Ajude Casseb a atender seus clientes na ordem que ele deseja, você consegue!
	
 */

public class App {
    public static void main(String[] args) throws Exception {
        Clinica c1 = new Clinica("Cassebs");

        c1.addClientes(new Cliente("Carlos", 20));
        c1.addClientes(new Cliente("Isaac", 17));
        c1.addClientes(new Cliente("Girotto", 21));
        c1.addClientes(new Cliente("Alessandra", 17));

        c1.imprimirClientes();
        System.out.println("---------------------------------");
        c1.filaDeEspera();

    }
}
