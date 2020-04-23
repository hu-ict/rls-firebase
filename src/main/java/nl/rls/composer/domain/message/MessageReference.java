package nl.rls.composer.domain.message;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author berend.wilkens
 * This element identifies the message
 */
@ToString
@Entity
@NoArgsConstructor
@Getter @Setter
public class MessageReference {
	@Id 	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
    /**
     * To indicate the message type transmitted or referred to.
     * 3003        TrainCompositionMessage
	 * 9000        ErrorMessage
     */
    private int messageType;
    private String messageTypeVersion;
    /**
     * Identification of the Message
     */
    private String messageIdentifier;
    /**
     * Generated by the common Interface
     */
    private Date messageDateTime;
}
