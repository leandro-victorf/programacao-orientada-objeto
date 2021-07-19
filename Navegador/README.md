# Navegador
O professor **ABC** projetou um Navegador que possui diferentes tipos de abas. Cada tipo de aba será específico para um tipo de aplicação, como buscador e rede social.

Neste exercício, deverão ser submetidos 4 arquivos (todas as classes a seguir são públicas e devem estar no pacote navegador):

`Classe Navegador`

`Classe abstrata AbaNavegador`

Classes AbaBuscador e AbaRedeSocial (ambas subclasses de AbaNavegador)
A seguir são apresentados os métodos necessários em cada classe. Esses métodos podem ser usados pelo sistema de correção e por isso devem seguir a especificação apresentada no enunciado. Você pode incluir atributos e métodos auxiliares adicionais que considerar necessários durante a implementação.

Classe Navegador:

public Navegador(int limiteAbas): construtor que armazena a quantidade limite de abas que podem estar abertas simultaneamente.
public AbaNavegador abrirAba(int tipo, String titulo): instancia uma nova aba no navegador, inclui na lista de abas abertas e retorna esta aba (se atingir o limite de abas, retorna null). A nova aba deve ser do tipo especificado no parâmetro tipo e com o título passado no parâmetro titulo.  Tipos de abas:
tipo 1: AbaBuscador
tipo 2: AbaRedeSocial
public void fecharAba(AbaNavegador aba): rebece uma instância de AbaNavegador e fecha a aba (remove da lista de abas abertas). A instância recebida no parâmetro sempre será uma instância de AbaNavegador que foi instanciada em algum momento anterior pelo método abrirAba.
public String[] getAbas(): retorna uma lista com os tipos e títulos de todas as abas abertas no formato "<tipo aba> <título aba>". A lista deve ser na ordem em que as abas foram abertas (iniciando com a aba aberta mais antiga).
public String[] getHistorico(): retorna uma lista com o histórico do navegador. O histórico deve retornar uma lista com o que foi feito em cada aba em ordem cronológica (iniciando com a ocorrência mais antiga). O histórico deve considerar o que ocorreu em todas abas: tanto as abertas no momento como as que já foram fechadas. Neste exercícios, assuma que haverá no máximo 100 itens/ocorrências no histórico.
Classe abstrata AbaNavegador:

protected String titulo: atributo com o título da aba
public String getTitulo(): retorna o título da aba atual
public abstract String getTipo(): retorna uma string com o tipo da aba. O retorno depende da subclasse que implementar este método.
Classe AbaBuscador: subclasse de AbaNavegador

public void buscar(String expressao): registra operação de busca como "Busca: <expressao>", em que <expressao> é o valor passado no parâmetro expressao. Esse registro vai para o histórico do navegador.
public String getTipo(): retorna a string "Buscador".
Classe AbaRedeSocial: subclasse de AbaNavegador

public void postar(String texto): registra operação de postar texto como "Post: <texto>", em que <texto> é o valor passado no parâmetro texto. Esse registro vai para o histórico do navegador.
public String getTipo(): retorna a string "RedeSocial".


Importante: Submeta apenas as classes públicas descritas no enunciado (todas devem estar no pacote navegador). O programa principal já existe no sistema de correção automática. As classes submetidas não podem realizar impressão de dados ou utilizar import.



Casos de teste
Formato dos casos de teste (que aparecem ao avaliar as classes no sistema de correção automática):

Entrada:

limite de abas abertas simultaneamente no navegador
operações no formato: [nome operação] (paramêtros da operação). Algumas operações utilizam um índice de aba. Esse índice é um controle interno do sistema de correção para identificar as abas, cada aba aberta tem a indicação de um índice, exibido na saída.
operação: abrirAba (parâmetros: tipo e título)
operação: buscar (parâmetros: índice da aba e expressão)
operação: postar (parâmetros: índice da aba e texto)
operação: fecharAba (parâmetros: índice da aba)
operação: getAbas
operação: getHistorico
Saída:

verificação das classes
instanciação da classe Navegador
métodos executados e saídas obtidas


Exercício de Paulo H. Pisani - Programação Orientada a Objetos - 2020 (exercício atualizado em 2021)