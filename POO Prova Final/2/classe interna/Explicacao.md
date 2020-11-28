Em Java, também é possível aninhar classes (uma classe dentro de uma classe). O objetivo das classes aninhadas é agrupar classes que pertencem umas às outras, o que torna seu código mais legível e sustentável.

As classes internas podem ser usadas em muitos casos funcionais. Eles algumas vantagens:

1. Uma classe interna pode ver os campos da classe externa (se não for estática). Isso significa que você não precisa lidar com os campos da classe externa como se viessem de uma classe externa. Isso implica que sua classe interna precisa de uma instância da classe externa para funcionar. Se sua classe for estática, ela se comportará como uma classe independente.

2. Uma classe interna está estreitamente relacionada à classe proprietária. Portanto, mesmo que seja estático, você sabe pelo nome que está relacionado à sua classe proprietária.

3. A classe interna fornece uma maneira de agrupar as classes e interfaces em um lugar que logicamente pertençam.

4. É usado para desenvolver um código mais legível e sustentável.

5. Precisa de menos código para escrever.

6. Aumenta o encapsulamento.