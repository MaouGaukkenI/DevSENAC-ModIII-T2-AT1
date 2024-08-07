/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.sql.Connection;
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
import persistencia.ConexaoBanco;

/**
 *
 * @author TheDe
 */
public class DadosObrigatoriosTest {
    private boolean testSuccess;
    /*
    public PacienteDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    */

    @Before
    public void setUp() {
        testSuccess = false;
    }

    @Test
    public void DadosObrigatoriosNome() throws SQLException, ParseException {
        System.out.println("Teste de dados obrigatórios do cadastro de pacientes (Nome):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
        */
        Paciente paciente = new Paciente();
        paciente.setEndereco("Teste Nome");
        paciente.setDataNascimento(date.parse("11/07/2005"));
        paciente.setTelefone("(53)98123-8156");
        paciente.setCpf("123.456.789-01");
        paciente.setConvenio(1);
        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @Test
    public void DadosObrigatoriosCPF() throws SQLException, ParseException {
        System.out.println("Teste de dados obrigatórios do cadastro de pacientes (CPF):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
        */
        Paciente paciente = new Paciente();
        paciente.setNome("Teste Cpf");
        paciente.setEndereco("Teste Cpf");
        paciente.setDataNascimento(date.parse("11/07/2005"));
        paciente.setTelefone("(53)98123-8156");
        paciente.setConvenio(1);
        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @Test
    public void DadosObrigatoriosDataNascimento() throws SQLException, ParseException {
        System.out.println("Teste de dados obrigatórios do cadastro de pacientes (Data de Nascimento):");
        PacienteDAO pac = new PacienteDAO();
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*

        Dados obrigatórios*
        */
        Paciente paciente = new Paciente();
        paciente.setNome("Teste DataNasc");
        paciente.setEndereco("Teste DataNasc");
        paciente.setTelefone("(53)98123-8156");
        paciente.setCpf("123.456.789-01");
        paciente.setConvenio(1);
        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @Test
    public void DadosObrigatoriosEndereco() throws SQLException, ParseException {
        System.out.println("Teste de dados obrigatórios do cadastro de pacientes (Endereço):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
        */
        Paciente paciente = new Paciente();
        paciente.setNome("Teste Endereço");
        paciente.setDataNascimento(date.parse("11/07/2005"));
        paciente.setTelefone("(53)98123-8156");
        paciente.setCpf("123.456.789-01");
        paciente.setConvenio(1);
        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @Test
    public void DadosObrigatoriosTelefone() throws SQLException, ParseException {
        System.out.println("Teste de dados obrigatórios do cadastro de pacientes (Telefone):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
        */
        Paciente paciente = new Paciente();
        paciente.setNome("Teste Telefone");
        paciente.setEndereco("Teste Telefone");
        paciente.setDataNascimento(date.parse("11/07/2005"));
        paciente.setCpf("123.456.789-01");
        paciente.setConvenio(1);
        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    /*
    Não é possível utilizar valores nulos numa variável 'int' portanto utilizei um valor negativo para representar um valor que não está na lista de convênios.
    */
    @Test
    public void DadosObrigatoriosConvenio() throws SQLException, ParseException {
        System.out.println("Teste de dados obrigatórios do cadastro de pacientes (Convênio):");
        PacienteDAO pac = new PacienteDAO();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        /* 
        Dados a enviar:
        int idPaciente, String nome*, String endereco*, Date dataNascimento*, String telefone*, String cpf*, String rg*, String email, int convenio*
        
        Dados obrigatórios*
        */
        Paciente paciente = new Paciente();
        paciente.setNome("Teste Convenio");
        paciente.setEndereco("Teste Convenio");
        paciente.setDataNascimento(date.parse("11/07/2005"));
        paciente.setTelefone("(53)98123-8156");
        paciente.setCpf("123.456.789-01");
        paciente.setConvenio(0);
        boolean teste = pac.cadastrarPaciente(paciente);
        assertFalse(teste);
        testSuccess = !teste;
    }

    @After
    public void tearDown() {
        if (testSuccess) {
            System.out.println("Exito: O dado é obrigatório para o cadastro de um paciente.\n");
        } else {
            System.out.println("Falha: O dado não foi considerado como obrigatório para o cadastro.\n");
        }
    }
}
