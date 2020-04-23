package nl.rls.composer.rest.dto;

import org.springframework.hateoas.ResourceSupport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Identifies the mode of deployment of a traction within a train First digit –
 * traction role Second digit – position in group of traction units with the
 * same role
 */
@ToString
@NoArgsConstructor
@Getter @Setter
public class TractionModeDto extends ResourceSupport  {
	private String code;
	private String description;

}
