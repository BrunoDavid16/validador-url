# Relatório do Projeto: Validador de Parâmetros de URL

## Resumo

Este projeto implementa um algoritmo de validação para parâmetros de consulta em URLs, desenvolvido como parte dos desafios da Digital Innovation One (DIO). O objetivo principal é criar uma função que verifique se os parâmetros de uma URL seguem um formato específico e bem definido.

## Tecnologias Utilizadas

- **Linguagem:** Java 8+
- **Ferramentas:** JUnit 5 (para testes)
- **Padrões:** Regex (Pattern/Matcher)
- **Metodologia:** TDD (Test-Driven Development)

## Detalhes de Implementação

### Estrutura Principal

A classe `ValidadorParametrosURL` contém:
- **Método principal:** `validarParametrosUrl(String url)`
- **Métodos auxiliares:** Validação de componentes individuais
- **Constantes:** Padrões regex para validação

### Algoritmo de Validação

1. **Verificação inicial:** URL deve começar com '?'
2. **Extração de parâmetros:** Remove '?' e divide por '&'
3. **Validação individual:** Cada parâmetro deve ter exatamente um '='
4. **Validação de nomes:** Apenas caracteres alfanuméricos
5. **Validação de valores:** Alfanuméricos + '@' e '.'

### Casos de Teste Implementados

| Categoria | Exemplo | Resultado |
|-----------|---------|-----------|
| **Válidos** | `?usuario=joao&idade=30` | ✅ Parametros validos |
| **Válidos** | `?email=ana@mail.com` | ✅ Parametros validos |
| **Inválidos** | `usuario=joao` (sem ?) | ❌ Parametros invalidos |
| **Inválidos** | `?nome espaço=valor` | ❌ Parametros invalidos |

## Desafios Encontrados

### 1. **Interpretação das Regras**
- **Problema:** Definir exatamente quais caracteres são permitidos nos valores
- **Solução:** Análise dos exemplos fornecidos, permitindo '@' e '.' para emails

### 2. **Validação de Múltiplos Iguais**
- **Problema:** URLs como `?param==valor` devem ser inválidas
- **Solução:** Implementação de contador manual de caracteres '='

### 3. **Casos Extremos**
- **Problema:** Valores vazios, nulos, apenas '?'
- **Solução:** Validações específicas para cada caso

## Melhorias Implementadas

### Código Original vs. Versão Final

**Melhorias aplicadas:**
- ✅ Separação em métodos auxiliares
- ✅ Documentação completa (JavaDoc)
- ✅ Tratamento de casos nulos/vazios
- ✅ Testes unitários abrangentes
- ✅ Constantes para padrões regex
- ✅ Validação de entrada mais robusta

### Performance
- **Complexidade:** O(n) onde n é o comprimento da URL
- **Memória:** O(k) onde k é o número de parâmetros

## Resultados dos Testes

```
✅ Casos válidos - Exemplos do desafio: PASSED
✅ Casos inválidos - Exemplos do desafio: PASSED
✅ URL sem interrogação inicial: PASSED
✅ URL vazia ou nula: PASSED
✅ Parâmetros com valores vazios: PASSED
✅ Múltiplos sinais de igual: PASSED
✅ Caracteres especiais inválidos no nome: PASSED
✅ Caracteres válidos no valor: PASSED
✅ Espaços em branco: PASSED
✅ Múltiplos parâmetros válidos: PASSED

Total: 10/10 testes passaram
```

## Aprendizados

### Técnicos
1. **Regex em Java:** Uso eficiente de Pattern/Matcher
2. **Validação robusta:** Tratamento de casos extremos
3. **TDD:** Desenvolvimento orientado por testes
4. **Clean Code:** Código legível e bem documentado

### Metodológicos
1. **Análise de requisitos:** Importância de entender exatamente o que é esperado
2. **Casos de teste:** Pensar além dos exemplos fornecidos
3. **Refatoração:** Evolução incremental do código

## Conclusão

O projeto foi concluído com sucesso, atendendo a todos os requisitos especificados. A implementação resultou em:

- ✅ **Funcionalidade completa:** Validação correta conforme especificação
- ✅ **Código de qualidade:** Bem estruturado e documentado
- ✅ **Cobertura de testes:** Casos válidos, inválidos e extremos
- ✅ **Performance adequada:** Algoritmo eficiente
- ✅ **Extensibilidade:** Fácil manutenção e evolução

## Links e Recursos

- **Repositório GitHub:** [https://github.com/seu-usuario/validador-url](https://github.com/seu-usuario/validador-url)
- **Documentação Técnica:** Ver JavaDoc no código
- **Testes:** Executar `mvn test` ou usando IDE

## Próximos Passos

### Possíveis Melhorias
1. **Suporte a mais caracteres:** Extensão dos padrões regex
2. **Validação de tipos:** Verificar se valores numéricos são realmente números
3. **Performance:** Cache de padrões regex
4. **Logging:** Adicionar logs para debugging

---

**Autor:** Seu Nome  
**Data:** Setembro 2025  
**Curso:** [Nome do Curso] - DIO  
**Status:** ✅ Concluído