package org.example;

public class Main {
    public static void main(String[] args) {

        // Objeto que instancia a Thread atual
        Thread myCurrentThread = Thread.currentThread();

        // Get name para coletar o nome da Thread atual
        System.out.println(myCurrentThread.getName());

        // Nova Thread com Runnable
        Thread otherThread = new Thread(new MyRunnable());

        // Instruo a JVM a chamar o método run que está sendo implementado em MyRunnable
        // Com a espcificidade que não há garantia de que vai ser chamado agora, mas quando o SO puder
        // O start sinaliza ao sistema operacional que o thread está pronto para execução
        // O controle de quando a thread vai ser executada é do sistema operacional e da JVM
        otherThread.start();

        // Passando o Runnable para Thread como uma expressão Lambda
        Thread thirdThread = new Thread(() -> System.out.println("Rodando terceira Thread"));
        thirdThread.start();

        // Esse código está comentado por conta de que ele exemplifica o caso de tentar chamar o start() 2 vezes
        // Isso ocasionará a exception "Thread is already started"
        // Para validar isso basta descomentar o código e tentar rodar o projeto
//        thirdThread.start();


        // Criando várias Threads

        // Eu não posso dar start na mesma thread duas vezes
        // Mas posso rodar o mesmo Runnable em threads diferentes
        Thread fourthThread = new Thread(new MyRunnable());
        fourthThread.start();

        Thread fiveThread = new Thread(new MyRunnable());
        fiveThread.start();

        Thread sixThread = new Thread(new MyRunnable());
        sixThread.start();
    }
}