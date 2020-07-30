package cadastropage;

import base.BaseTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.ConfirmacaoPage;
import pages.EnderecoPage;
import pages.PerfilPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CadastroPageTests extends BaseTests {
    EnderecoPage enderecoPage;
    ConfirmacaoPage confirmacaoPage;
    PerfilPage perfilPage;


    @ParameterizedTest
    @CsvFileSource(resources = "/massaTeste.csv", numLinesToSkip = 1, delimiter = ';')
    public void inserirDados(String nome, String sobrenome, String nomeDaLoja, String celular,
                             String cpf, String dataNascimento, String opcaoLocalVenda,
                             String vendaPorMes, String email, String confirmarEmail,
                             String senha, String confirmarSenha, String cep, String numeroCasa,String resultado) {

        abrirPagina();

        cadastroPage.inserirNome(nome);
        cadastroPage.inserirSobreNome(sobrenome);
        cadastroPage.inserirNomeDaLoja(nomeDaLoja);
        cadastroPage.inserirCelular(celular);
        cadastroPage.inserirCpf(cpf);
        cadastroPage.inserirDataNascimento(dataNascimento);
        cadastroPage.ondeVoceVendeDropDown(opcaoLocalVenda);
        cadastroPage.vendasPorMes(vendaPorMes);
        cadastroPage.inserirEmail(email);
        cadastroPage.inserirConfirmacaoEmail(confirmarEmail);
        cadastroPage.inserirSenha(senha);
        cadastroPage.inserirConfirmacaoSenha(confirmarSenha);
        cadastroPage.aceitarTermos();

        enderecoPage = cadastroPage.avancar();

        boolean esperadoResultadoOk;
        if (resultado.equals("positivo")) {
            esperadoResultadoOk = true;

            enderecoPage.inserirCep(cep);
            enderecoPage.inserirNumeroCasa(numeroCasa);

            confirmacaoPage = enderecoPage.clicarAvancar();

            String mensagemEsperada = "Cadastro realizado com sucesso!";
            System.out.println(confirmacaoPage.mensagemConfirmacao());
            assertThat(confirmacaoPage.mensagemConfirmacao().toUpperCase(), is(mensagemEsperada.toUpperCase()));

            perfilPage = confirmacaoPage.clicarBotaoComecar();

            perfilPage.sair();
            abrirPagina();

        }else{
            esperadoResultadoOk = false;
        }

        capturarTela(nome, nomeDaLoja, resultado);

    }
}
