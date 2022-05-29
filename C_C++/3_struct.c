/**
 * @file Struct
 * @author junowoz.xyz
 * @brief training with structs. Different applications
 * @date 2022-03-01
 * 
 * 1) Criar uma estrutura chamada DadosAluno, que armazena
    a média e idade de um aluno. Na função main: criar uma
    variável que é uma estrutura DadosAluno; ler a média e a idade
    de um aluno e armazenar na variável criada; exibir na tela a
    média e a idade do aluno.

    2) Considerando o exercício 1, criar uma variável que é um
    vetor da estrutura DadosAluno. O programa deve obter a
    média e a idade de 10 alunos. Depois, estes dados devem ser
    exibidos

    3) Fazer um programa que cria uma estrutura livro, que
    contém os elementos título, ano de edição, número de
    páginas e preço. Criar uma variável desta estrutura que é
    um vetor de 5 elementos. Ler os valores para a estrutura e
    imprimir a média do número de páginas do livros.
    
    4) Foi realizada uma pesquisa entre 500 habitantes de uma
    certa região. De cada habitante foram coletados os dados:
    idade, sexo, salário e número de filhos. Crie a estrutura de
    dados adequada para armazenar estas informações e faça
    uma função que armazene as informações digitadas pelo
    usuário na estrutura de dados criada. Faça também uma
    função que calcula a média do salário dos habitantes.
 */

#include <stdio.h>
#include <string.h>

//O struct se declara antes da função main
struct aluno 
{
    char nome[40];
    float P1, P2, T;
    int faltas;
}; //como definição de estrutura é comando, precisa ";”

main() 
{
struct aluno joao, maria;
    joao.P1 = 9.5;
    joao.P2 = 8.5;
    joao.T = 9.0;
    joao.faltas = 4;
    maria = joao;
}

//exemplo 2

struct endereco 
{
    char rua[40];
    int num;
    int complemento;
    char cep[10];
};

main() 
{
struct endereco e1; // declaração de variáveis do tipo
struct endereco e2; // "endereco" compilador aloca mem.para todos os campos

// inicialização dos campos de e1...
    strcpy(e1.rua, "Avenida Ipiranga");
        e1.num = 1234; e1.complemento = 101;
    strcpy(e1.cep, "90000-123");
// inicialização dos campos de e2...
    strcpy(e2.rua, "Rua Lima e Silva");
        e2.num = 1987; e2.complemento = 308;
    strcpy(e2.cidade, "Porto Alegre");
    strcpy(e2.estado, "RS");
    strcpy(e2.cep, "90000-345");
// exibe os dados
    printf("\n%s %d/%d", e1.rua, e1.num, e1.complemento);
    printf("\n%s, %s/%s", e1.cep, e1.cidade, e1.estado);
    printf("\n\n%s %d/%d", e2.rua, e2.num, e2.complemento);
    printf("\n%s, %s/%s", e2.cep, e2.cidade, e2.estado);
}