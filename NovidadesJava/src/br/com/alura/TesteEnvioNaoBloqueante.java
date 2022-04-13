package br.com.alura;

import java.time.LocalDate;
import java.util.Scanner;

import java.util.concurrent.SubmissionPublisher;

import br.com.alura.model.NotaFiscal;
import br.com.alura.subscriber.NotaFiscalSubscriber;

public class TesteEnvioNaoBloqueante {

	public static void main(String[] args) {
		//ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		NotaFiscal primeiraNotaFiscal = new NotaFiscal("Jo�o", 39.99, LocalDate.now());
		NotaFiscal segundaNotaFiscal = new NotaFiscal("Jo�o", 39.99, LocalDate.now());
		NotaFiscal terceiraNotaFiscal = new NotaFiscal("Jo�o", 39.99, LocalDate.now());
		
		SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
		NotaFiscalSubscriber subscriber = new NotaFiscalSubscriber();
		publisher.subscribe(subscriber);
//		publisher.consume(data -> {
//			System.out.println("Outra Thread" + Thread.currentThread().getName());
//
//		});
//		publisher.consume(data -> {
//			System.out.println("Mais uma thread" + Thread.currentThread().getName());
//
//		});
		publisher.submit(primeiraNotaFiscal);
		publisher.submit(segundaNotaFiscal);
		publisher.submit(terceiraNotaFiscal);
		System.out.println("Voc� ir� receber a nota fiscal no seu e-mail");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.close();
		publisher.close();
	}
}
