import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class App {

    // Caminho do banco de dados SQLite
    private static final String DATABASE_URL = "jdbc:sqlite:estacionamento.db";

    public static void main(String[] args) {
        // Criação da janela principal
        JFrame janela = new JFrame("Sistema de Estacionamento");
        janela.setSize(400, 300);
        janela.setLayout(new GridLayout(6, 1)); // Organizando componentes

        JLabel labelNome = new JLabel("Nome do Dono do Carro:");
        labelNome.setFont(new Font("Calibri", Font.PLAIN, 18));
        JTextField inputNome = new JTextField();

        JLabel labelPlaca = new JLabel("Placa do Carro:");
        labelPlaca.setFont(new Font("Calibri", Font.PLAIN, 18));
        JTextField inputPlaca = new JTextField();

        // Botão para registrar o cliente
        JButton botaoRegistrar = new JButton("Registrar Entrada");
        botaoRegistrar.setFont(new Font("Calibri", Font.BOLD, 18));

        // Botão para visualizar clientes
        JButton botaoVisualizar = new JButton("Visualizar Clientes");
        botaoVisualizar.setFont(new Font("Calibri", Font.BOLD, 18));

        // Ação ao clicar no botão de registrar
        botaoRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = inputNome.getText();
                String placa = inputPlaca.getText();

                if (!nome.isEmpty() && !placa.isEmpty()) {
                    // Inserindo no banco de dados
                    inserirCliente(nome, placa);
                } else {
                    JOptionPane.showMessageDialog(janela, "Por favor, preencha todos os campos.");
                }
            }
        });

        // Ação ao clicar no botão de visualizar clientes
        botaoVisualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibe os dados dos clientes em um JOptionPane
                visualizarClientes();
            }
        });

        // Adicionando os componentes à janela
        janela.add(labelNome);
        janela.add(inputNome);
        janela.add(labelPlaca);
        janela.add(inputPlaca);
        janela.add(botaoRegistrar);
        janela.add(botaoVisualizar);

        // Configurações da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    // Método para inserir um cliente no banco de dados
    private static void inserirCliente(String nome, String placa) {
        String sql = "INSERT INTO clientes(nome, placa) VALUES(?, ?)";

        try (Connection conn = DriverManager.getConnection(DATABASE_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, placa);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente registrado com sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para visualizar clientes
    private static void visualizarClientes() {
        String sql = "SELECT nome, placa FROM clientes";
        StringBuilder clientes = new StringBuilder();

        try (Connection conn = DriverManager.getConnection(DATABASE_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                clientes.append("Nome: ").append(rs.getString("nome"))
                        .append(", Placa: ").append(rs.getString("placa"))
                        .append("\n");
            }

            // Exibe os clientes cadastrados
            JOptionPane.showMessageDialog(null, clientes.length() > 0 ? clientes.toString() : "Nenhum cliente cadastrado.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
