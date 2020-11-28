Pode-se dizer que as classes abstratas servem como “modelo” para outras classes que dela herdem, não podendo ser instanciada por si só. Para ter um objeto de uma classe abstrata é necessário criar uma classe mais especializada herdando dela e então instanciar essa nova classe. Os métodos da classe abstrata devem então serem sobrescritos nas classes filhas.

Os métodos abstratos não podem ter corpo, ou seja, deve-se declarar apenas a assinatura do método e eles obrigatoriamente terão que ser implementados na classe filha (a classe que herda), já os métodos que não forem assinados como abstract devem ter corpo e podem ou não ser sobrescritos na classe filha.

Classes abstratas não podem ser instanciadas e são projetadas para serem subclasses. Eles são usados ​​para fornecer algumas funcionalidades comuns em um conjunto de classes relacionadas, permitindo também implementações de métodos padrão.

