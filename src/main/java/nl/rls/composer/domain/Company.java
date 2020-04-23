package nl.rls.composer.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author berend.wilkens
 * Identifies the RU, IM or other company involved in the Rail Transport Chain
 */
@Entity
@NoArgsConstructor
@Getter @Setter
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id 	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	@Column(unique=true)
	@NaturalId
	private String code;
	private String name;
	private String shortName;
	private String url;
	private String countryIso;
//	private Date startValidity;
//	private Date endValidity;
//	private Date addDate;
//	private Date modifiedDate;
	private int passengerFlag;
	private int freightFlag;
	private int infrastructureFlag;
	private int otherCompanyFlag;
	private int nationalEntityFlag;
	private int centralEntityFlag;
	private int activeFlag;

}
