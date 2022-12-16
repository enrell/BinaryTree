# BinaryTree
<br>
# A classe BinaryTree possui uma classe interna Node que representa um nó na árvore. Cada nó tem um valor inteiro, um nó esquerdo e um nó direito. Também possui um campo Node chamado 'root' que representa a raiz da árvore. Ela também possui um método privado 'insert' que recebe um Node e um valor inteiro e insere o valor na árvore através no Node definido. Se o Node for nulo, ela cria um novo Node com o valor definido. Se o valor for menor que o valor do Node atual, ela insere o valor no nó esquerdo. Caso contrário, insere o valor no nó direito.
<br>
<br>
# O método público 'insert' chama o método privado 'insert', passando o nó raiz e o valor a ser inserido.
<br>
<br>
# O método privado 'search' recebe um Node e um valor inteiro, e procura o valor na árvore começando no Node definido. Ele retorna 'true' se o valor for encontrado e 'false' caso contrário. O método público chamado 'search' chama o método privado 'search', passando o nó raiz e o valor a ser pesquisado.
<br>
<br>
# O método público 'reset' chama um método privado 'reset', passando no nó raiz. O método 'reset' privado é recursivo e define todos os nós da árvore como 'null', excluindo-os.
