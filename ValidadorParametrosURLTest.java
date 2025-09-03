/**
 * Classe de testes para ValidadorParametrosURL
 * 
 * Esta classe testa todas as funcionalidades do validador sem dependências externas.
 * Pode ser executada diretamente com 'java ValidadorParametrosURLTest'
 */
public class ValidadorParametrosURLTest {
    
    private static int testesExecutados = 0;
    private static int testesPassaram = 0;
    
    /**
     * Método principal para executar todos os testes
     */
    public static void main(String[] args) {
        System.out.println("=== Executando Testes do Validador de Parâmetros URL ===\n");
        
        // Executa todos os testes
        testCasosValidosExemplos();
        testCasosInvalidosExemplos();
        testUrlSemInterrogacao();
        testUrlVaziaOuNula();
        testParametrosComValoresVazios();
        testMultiplosIguais();
        testCaracteresEspeciaisNome();
        testCaracteresValidosValor();
        testEspacosEmBranco();
        testMultiplosParametrosValidos();
        testParametrosAlfanumericos();
        
        // Relatório final
        System.out.println("\n=== Resultados dos Testes ===");
        System.out.println("Testes executados: " + testesExecutados);
        System.out.println("Testes passaram: " + testesPassaram);
        System.out.println("Taxa de sucesso: " + (double)testesPassaram/testesExecutados * 100 + "%");
        
        if (testesPassaram == testesExecutados) {
            System.out.println("✅ Todos os testes passaram!");
        } else {
            System.out.println("❌ Alguns testes falharam!");
        }
    }
    
    /**
     * Método auxiliar para verificar se o resultado esperado é igual ao atual
     */
    private static void assertEquals(String esperado, String atual, String nomeDoTeste) {
        testesExecutados++;
        if (esperado.equals(atual)) {
            testesPassaram++;
            System.out.println("✅ PASS: " + nomeDoTeste);
        } else {
            System.out.println("❌ FAIL: " + nomeDoTeste);
            System.out.println("   Esperado: '" + esperado + "'");
            System.out.println("   Atual: '" + atual + "'");
        }
    }
    
    public static void testCasosValidosExemplos() {
        System.out.println("📋 Testando casos válidos - Exemplos do desafio");
        
        assertEquals("Parametros validos", 
            ValidadorParametrosURL.validarParametrosUrl("?usuario=joao&idade=30"),
            "Exemplo 1: ?usuario=joao&idade=30");
        
        assertEquals("Parametros validos", 
            ValidadorParametrosURL.validarParametrosUrl("?nome=ana&email=ana@mail.com"),
            "Exemplo 2: ?nome=ana&email=ana@mail.com");
            
        System.out.println();
    }

    public static void testCasosInvalidosExemplos() {
        System.out.println("📋 Testando casos inválidos - Exemplos do desafio");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("usuario=joao&idade=abc"),
            "Exemplo 3: usuario=joao&idade=abc (sem ?)");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("?usuario=sabrina idade=30"),
            "Exemplo 4: ?usuario=sabrina idade=30 (espaço no nome)");
            
        System.out.println();
    }

    public static void testUrlSemInterrogacao() {
        System.out.println("🔍 Testando URL sem interrogação inicial");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("param=valor"),
            "URL sem ? inicial");
            
        System.out.println();
    }

    public static void testUrlVaziaOuNula() {
        System.out.println("🔍 Testando URL vazia ou nula");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl(""),
            "String vazia");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl(null),
            "String nula");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("?"),
            "Apenas ? sem parâmetros");
            
        System.out.println();
    }

    public static void testParametrosComValoresVazios() {
        System.out.println("🔍 Testando parâmetros com valores vazios");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("?param="),
            "Valor vazio");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("?=valor"),
            "Nome vazio");
            
        System.out.println();
    }

    public static void testMultiplosIguais() {
        System.out.println("🔍 Testando múltiplos sinais de igual");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("?param==valor"),
            "Dois sinais de igual seguidos");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("?param=val=or"),
            "Sinal de igual no valor");
            
        System.out.println();
    }

    public static void testCaracteresEspeciaisNome() {
        System.out.println("🔍 Testando caracteres especiais inválidos no nome");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("?param@=valor"),
            "@ no nome do parâmetro");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("?param-name=valor"),
            "Hífen no nome do parâmetro");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("?param_name=valor"),
            "Underscore no nome do parâmetro");
            
        System.out.println();
    }

    public static void testCaracteresValidosValor() {
        System.out.println("🔍 Testando caracteres válidos no valor");
        
        assertEquals("Parametros validos", 
            ValidadorParametrosURL.validarParametrosUrl("?email=user@domain.com"),
            "@ e . no valor (email)");
        
        assertEquals("Parametros validos", 
            ValidadorParametrosURL.validarParametrosUrl("?site=www.exemplo.com"),
            ". no valor (domínio)");
            
        System.out.println();
    }

    public static void testEspacosEmBranco() {
        System.out.println("🔍 Testando espaços em branco");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("?param nome=valor"),
            "Espaço no nome do parâmetro");
        
        assertEquals("Parametros invalidos", 
            ValidadorParametrosURL.validarParametrosUrl("?param=valor espaço"),
            "Espaço no valor do parâmetro");
            
        System.out.println();
    }

    public static void testMultiplosParametrosValidos() {
        System.out.println("🔍 Testando múltiplos parâmetros válidos");
        
        assertEquals("Parametros validos", 
            ValidadorParametrosURL.validarParametrosUrl("?a=1&b=2&c=3"),
            "Múltiplos parâmetros simples");
        
        assertEquals("Parametros validos", 
            ValidadorParametrosURL.validarParametrosUrl("?nome=joao&email=joao@test.com&idade=25"),
            "Múltiplos parâmetros complexos");
            
        System.out.println();
    }

    public static void testParametrosAlfanumericos() {
        System.out.println("🔍 Testando parâmetros alfanuméricos");
        
        assertEquals("Parametros validos", 
            ValidadorParametrosURL.validarParametrosUrl("?param1=valor1&param2=123"),
            "Nomes e valores alfanuméricos");
        
        assertEquals("Parametros validos", 
            ValidadorParametrosURL.validarParametrosUrl("?abc123=xyz789"),
            "Parâmetro totalmente alfanumérico");
            
        System.out.println();
    }
}