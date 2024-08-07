/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TheDe
 */
public class RegrasDeNegocioCadastroTest {

    private boolean testSuccess;

    public RegrasDeNegocioCadastroTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testSuccess = false;
    }

    @Test
    public void TesteCampoNome() throws ParseException, SQLException {
        System.out.println("Teste de regra de negocio(Nome):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
         */
        Paciente paciente = new Paciente();
        paciente.setNome("TesteNameLenght50TesteNameLenght50TesteNameLenght50TesteNameLenght50");
        paciente.setEndereco("Rua dos bobos Nº0");
        paciente.setDataNascimento(date.parse("11/07/20"));
        paciente.setTelefone("(53)98123-8156");
        paciente.setCpf("123.456.789-01");
        paciente.setConvenio(1);
        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @Test
    public void TesteCampoEndereco() throws ParseException, SQLException {
        System.out.println("Teste de regra de negocio(Endereço):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
         */
        Paciente paciente = new Paciente();
        paciente.setNome("Diogo");
        paciente.setEndereco("TesteEndereço200TesteEndereço200TesteEndereço200TesteEndereço200TesteEndereço200TesteEndereço200TesteEndereço200TesteEndereço200TesteEndereço200TesteEndereço200TesteEndereço200TesteEndereço200TesteEndereço200");
        paciente.setDataNascimento(date.parse("11/07/20"));
        paciente.setTelefone("(53)98123-8156");
        paciente.setCpf("123.456.789-01");
        paciente.setConvenio(1);
        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @Test
    public void TesteCampoDataNascimento() throws ParseException, SQLException {
        System.out.println("Teste de regra de negocio(Data de nascimento):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
         */
        Paciente paciente = new Paciente();
        paciente.setNome("Diogo");
        paciente.setEndereco("Rua dos bobos Nº0");
        paciente.setDataNascimento(date.parse("11/07/20"));
        paciente.setTelefone("(53)98123-8156");
        paciente.setCpf("123.456.789-01");
        paciente.setConvenio(1);

        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @Test
    public void TesteCampoDataTelefone() throws ParseException, SQLException {
        System.out.println("Teste de regra de negocio(Telefone):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
         */
        Paciente paciente = new Paciente();
        paciente.setNome("Diogo");
        paciente.setEndereco("Rua dos bobos Nº0");
        paciente.setDataNascimento(date.parse("11/07/2005"));
        paciente.setTelefone("12345678901234567890");
        paciente.setCpf("123.456.789-01");
        paciente.setConvenio(1);

        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @Test
    public void TesteCampoDataCPFLengh() throws ParseException, SQLException {
        System.out.println("Teste de regra de negocio(CPF Lengh):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
         */
        Paciente paciente = new Paciente();
        paciente.setNome("Diogo");
        paciente.setEndereco("Rua dos bobos Nº0");
        paciente.setDataNascimento(date.parse("11/07/2005"));
        paciente.setTelefone("(53)98123-8156");
        paciente.setCpf("123.456.789-0123");
        paciente.setConvenio(1);

        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @Test
    public void TesteCampoDataCPFDuplo() throws ParseException, SQLException {
        System.out.println("Teste de regra de negocio(CPF Duplo):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
         */
        Paciente paciente = new Paciente();
        paciente.setNome("Diogo");
        paciente.setEndereco("Rua dos bobos Nº0");
        paciente.setDataNascimento(date.parse("11/07/2005"));
        paciente.setTelefone("(53)98123-8156");
        paciente.setCpf("123.456.789-01");
        paciente.setConvenio(1);

        //Executando o cadastro duas vezes para analizar se o cpf repetido é aceito!
        pac.cadastrarPaciente(paciente);
        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @Test
    public void TesteCampoDataConvenio() throws ParseException, SQLException {
        System.out.println("Teste de regra de negocio(Convenio):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
         */
        Paciente paciente = new Paciente();
        paciente.setNome("Diogo");
        paciente.setEndereco("Rua dos bobos Nº0");
        paciente.setDataNascimento(date.parse("11/07/2005"));
        paciente.setTelefone("(53)98123-8156");
        paciente.setCpf("123.456.789-01");
        //Adicionei um convenio fora da lista de cadastro para verificar se ele segue as regras de negocio!
        paciente.setConvenio(10);

        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @After
    public void tearDown() {
        if (testSuccess) {
            System.out.println("Exito: O campo obedece as regras de negocio.\n");
        } else {
            System.out.println("Falha: O campo não obedece as regras de negocio.\n");
        }
    }
}
