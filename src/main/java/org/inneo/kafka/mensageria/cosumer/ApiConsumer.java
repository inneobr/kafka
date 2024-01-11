package org.inneo.kafka.mensageria.cosumer;


import lombok.AllArgsConstructor;

import org.inneo.kafka.model.ProductsDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ApiConsumer {
	
	@KafkaListener(topics = "api-consumer-products", groupId = "service-prod")
	public void recebeProdutosDTO(ProductsDTO productsDTO) {
		try {
			System.out.println(productsDTO.getDescricao());			
		} catch (Exception exception) {
			throw new RuntimeException("Erro ao consumir mensagem do kafka ");
		}
	}
}
