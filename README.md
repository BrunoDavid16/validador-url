# 🔗 Validador de Parâmetros de URL

## 📋 Descrição do Projeto

Este projeto implementa um algoritmo para validação de parâmetros de consulta em URLs, seguindo regras específicas de formato. Desenvolvido como parte dos desafios da DIO (Digital Innovation One).

## 🎯 Objetivo

Criar uma função que valide se os parâmetros de uma URL estão no formato correto, retornando "Parametros validos" ou "Parametros invalidos".

## 📐 Regras de Validação

- **Formato Padrão:** `?parametro1=valor1&parametro2=valor2`
- O **nome do parâmetro** deve ser alfanumérico (sem espaços ou caracteres especiais)
- O **valor do parâmetro** pode ser alfanumérico ou número inteiro
- O separador entre parâmetros deve ser o caractere `&`
- O parâmetro e seu valor devem ser separados por `=`
- A URL deve começar com `?`

## 🚀 Tecnologias Utilizadas

- **Java** - Linguagem principal
- **Regex (Pattern)** - Para validação de caracteres
- **JUnit** - Para testes unitários

## 📁 Estrutura do Projeto

```
validador-url/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ValidadorParametrosURL.java
│   └── test/
│       └── java/
│           └── ValidadorParametrosURLTest.java
├── README.md
├── modelo-relatorio.md
└── .gitignore
```

## 💻 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/validador-url.git
cd validador-url
```

2. Compile e execute:
```bash
javac src/main/java/ValidadorParametrosURL.java
java -cp src/main/java ValidadorParametrosURL
```

## 📊 Exemplos de Uso

| Entrada | Saída |
|---------|-------|
| `?usuario=joao&idade=30` | Parametros validos |
| `?nome=ana&email=ana@mail.com` | Parametros validos |
| `usuario=joao&idade=abc` | Parametros invalidos |
| `?usuario=sabrina idade=30` | Parametros invalidos |

## 🧪 Executando os Testes

```bash
javac -cp .:junit-5.jar src/test/java/ValidadorParametrosURLTest.java
java -cp .:junit-5.jar org.junit.runner.JUnitCore ValidadorParametrosURLTest
```

## 🤝 Contribuições

Contribuições são bem-vindas! Por favor:

1. Fork o projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor

**Bruno David Ribeiro de Souza**
- GitHub: [@seu-usuario](https://github.com/BrunoDavid16)
- LinkedIn: [seu-perfil](https://linkedin.com/in/BrunoDavid)

## 🎓 Certificação DIO

Este projeto foi desenvolvido como parte do curso **[JAVA - AWS]** da [Digital Innovation One](https://dio.me/).

---

⭐ **Se este projeto foi útil para você, deixe uma estrela!**

