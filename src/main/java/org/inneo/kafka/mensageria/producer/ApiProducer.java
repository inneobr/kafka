package org.inneo.kafka.mensageria.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ApiProducer {
	@Value("api-producer-products")
	private String topico;

	@Autowired
	private final KafkaTemplate<String, String> kafkaTemplate;

	public ApiProducer(KafkaTemplate<String, String> kafkaTemplate) {
	        this.kafkaTemplate = kafkaTemplate;
	    }

	public void enviaRespostaCadastroProdutos(final String mensagem) {
		try {
			kafkaTemplate.send(topico, mensagem);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao produzir mensagem do kafka");
		}
	}
}
