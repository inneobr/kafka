package org.inneo.kafka.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class ProductsDTO {
	
	@JsonProperty(value = "id")
	@JsonIgnore
	private Long id;
	
	@JsonProperty(value = "entity_id")
	private String entityId;
	
	@JsonProperty(value = "title")
	private String nome;
	
	@JsonProperty(value = "price")
	private BigDecimal preco;
	
	@JsonProperty(value = "category")
	private String categoria;
	
	@JsonProperty(value = "description")
	private String descricao;
	
	@JsonProperty(value = "image")
	private String imagem;
}
