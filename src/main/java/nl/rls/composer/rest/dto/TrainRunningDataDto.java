package nl.rls.composer.rest.dto;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TrainRunningDataDto extends ResourceSupport {
	protected Boolean exceptionalGaugingInd;
	protected Boolean dangerousGoodsIndicator;
	protected List<ActivityInTrainDto> activities;
	private int trainType;
	private int trainWeight;
	private int trainLength;
	// private List<TrainCC_System> trainCCSystem;
	// private TrainRadioSystemDto trainRadioSystem;
	private int trainMaxSpeed;
	private int maxAxleWeight;
	private String brakeType;
	private int brakeWeight;
	private int numberOfVehicles;
	private int numberOfAxles;

}
