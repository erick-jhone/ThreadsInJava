# Projeto de Exemplo: Threads em Java

## Introdução

Este projeto demonstra o uso de Threads em Java. Threads são unidades básicas de execução que permitem a execução de múltiplas tarefas simultaneamente dentro de um programa. Em Java, a classe `Thread` e a interface `Runnable` são usadas para criar e gerenciar threads.

## Estrutura do Projeto

O projeto consiste em duas classes principais:

1. `MyRunnable`: Implementa a interface `Runnable` e define o método `run`, que contém o código que será executado pela thread.
2. `Main`: Contém o método `main` que cria e inicia várias threads.

### Classe `MyRunnable`

A classe `MyRunnable` implementa a interface `Runnable` e sobrescreve o método `run`. Este método imprime o nome da thread atual.

```java
package org.example;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Rodando a thread: " + Thread.currentThread().getName());
    }
}
```


### Classe `Main`

A classe Main contém o método main, que cria e inicia várias threads. Aqui está uma explicação detalhada do que cada parte do código faz:

1. `Thread Atual`: Obtém a thread atual e imprime seu nome.
2. `Nova Thread com Runnable:` Cria uma nova thread usando uma instância de MyRunnable e a inicia.
3. `Thread com Expressão Lambda:` Cria e inicia uma nova thread usando uma expressão lambda.
4. `Várias Threads:` Cria e inicia várias threads usando a mesma instância de MyRunnable

```java

package org.example;

public class Main {
    public static void main(String[] args) {

        // Objeto que instancia a Thread atual
        Thread myCurrentThread = Thread.currentThread();

        // Get name para coletar o nome da Thread atual
        System.out.println(myCurrentThread.getName());

        // Nova Thread com Runnable
        Thread otherThread = new Thread(new MyRunnable());
        otherThread.start();

        // Passando o Runnable para Thread como uma expressão Lambda
        Thread thirdThread = new Thread(() -> System.out.println("Rodando terceira Thread"));
        thirdThread.start();

        // Criando várias Threads
        Thread fourthThread = new Thread(new MyRunnable());
        fourthThread.start();

        Thread fiveThread = new Thread(new MyRunnable());
        fiveThread.start();

        Thread sixThread = new Thread(new MyRunnable());
        sixThread.start();
    }
}
```

### Considerações Finais

Este projeto é um exemplo básico de como criar e gerenciar threads em Java.
Ele demonstra como usar a interface Runnable e a classe Thread para executar tarefas simultaneamente.
É importante lembrar que o controle de quando uma thread será executada é do sistema operacional e da JVM, e não do programador.
Para mais informações sobre threads em Java, consulte a [documentação oficial](https://docs.oracle.com/javase/tutorial/essential/concurrency/).
