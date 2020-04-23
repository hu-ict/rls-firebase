package nl.rls.composer.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.NoArgsConstructor;

/**
 * @author berend.wilkens
 * 
 *         Train relevant data for a running train
 */
@Entity
@NoArgsConstructor
public class TrainRunningData extends OwnedEntity {
	public TrainRunningData(Integer ownerId) {
		super(ownerId);
	}

	@OneToOne(mappedBy = "trainRunningData")
	private TrainCompositionJourneySection train;
	private Boolean exceptionalGaugingInd;
	private Boolean dangerousGoodsIndicator;
	/*
	 * TrainRunningTechData:
	 */
	/**
	 * 1 Passenger train Commercial train with passenger coaches or trainsets Empty
	 * run of Train with passenger coaches or trainsets Including Crew train (for
	 * Train Crew Members) 2 Freight train Train with freight wagons 3 Light engine
	 * (locomotive train) One or more engines without any carriages 4 Engineering
	 * train Train for measurement, maintenance, instructions, homologation, etc 0
	 * Other Train types that are not covered with the four codes given above can be
	 * codified as "other" in the messages Passenger with Freight - military trains,
	 * the Overnight Express; Royalty, Head of States
	 */
	private int trainType;
	/**
	 * Type of Train Control System.
	 */
	// @ManyToMany
	// private List<TrainCC_System> trainCCSystem;
	// private TrainRadioSystem trainRadioSystem;
	private int trainMaxSpeed;

	// private BigDecimal maxAxleWeight;
	// private String brakeType;
	// private int brakeWeight;
	public TrainCompositionJourneySection getTrain() {
		return train;
	}

	public void setTrain(TrainCompositionJourneySection train) {
		this.train = train;
	}

	public Boolean getExceptionalGaugingInd() {
		return exceptionalGaugingInd;
	}

	public void setExceptionalGaugingInd(Boolean exceptionalGaugingInd) {
		this.exceptionalGaugingInd = exceptionalGaugingInd;
	}

	public Boolean getDangerousGoodsIndicator() {
		return dangerousGoodsIndicator;
	}

	public void setDangerousGoodsIndicator(Boolean dangerousGoodsIndicator) {
		this.dangerousGoodsIndicator = dangerousGoodsIndicator;
	}

	public int getTrainType() {
		return trainType;
	}

	public void setTrainType(int trainType) {
		this.trainType = trainType;
	}

	public int getTrainMaxSpeed() {
		return trainMaxSpeed;
	}

	public void setTrainMaxSpeed(int trainMaxSpeed) {
		this.trainMaxSpeed = trainMaxSpeed;
	}

	/**
	 * The sum of all weights of wagons and traction units
	 */
	public int getTrainWeight() {
		int trainWeight = 0;
		if (train != null) {
			for (WagonInTrain wagon : train.getWagons()) {
				trainWeight += wagon.getWagon().getWagonNumberFreight().getWagonTechData().getWagonWeightEmpty();
				trainWeight += wagon.getWagon().getTotalLoadWeight();
			}
			for (TractionInTrain traction : train.getTractions()) {
				trainWeight += traction.getTraction().getWeight();
			}
		}
		return trainWeight;
	}

	/**
	 * The calculated Length of a train (sum of all length over buffer of the wagons
	 * and traction units). Expressed in Metres
	 */
	public int getTrainLength() {
		int trainLength = 0;
		for (WagonInTrain wagon : train.getWagons()) {
			trainLength += wagon.getWagon().getWagonNumberFreight().getWagonTechData().getLengthOverBuffers();
		}
		for (TractionInTrain traction : train.getTractions()) {
			trainLength += traction.getTraction().getLengthOverBuffers();
		}
		return trainLength;
	}

	public int getNumberOfVehicles() {
		int numberOfVehicles = train.getWagons().size();
		numberOfVehicles += train.getTractions().size();
		return numberOfVehicles;
	}

	public int getNumberOfAxles() {
		int numberOfAxles = 0;
		for (WagonInTrain wagon : train.getWagons()) {
			numberOfAxles += wagon.getWagon().getWagonNumberFreight().getWagonTechData().getWagonNumberOfAxles();
		}
		for (TractionInTrain traction : train.getTractions()) {
			numberOfAxles += traction.getTraction().getNumberOfAxles();
		}
		return numberOfAxles;
	}
}
