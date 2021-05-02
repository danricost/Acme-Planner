package acme.entities.customization;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
	public class Customization extends DomainEntity {

		// Serialisation identifier -----------------------------------------------

		protected static final long	serialVersionUID	= 1L;

		// Attributes -------------------------------------------------------------		
		protected List<String>			palabrasSpam;

		@NotEmpty		
		protected Double			tolerancia;
				
		// Derived attributes -----------------------------------------------------

		// Relationships ----------------------------------------------------------

	}