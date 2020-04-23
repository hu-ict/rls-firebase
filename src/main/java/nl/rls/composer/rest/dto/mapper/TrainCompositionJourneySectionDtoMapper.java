package nl.rls.composer.rest.dto.mapper;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldsMappingOptions;

import nl.rls.composer.controller.CompanyController;
import nl.rls.composer.controller.LocationIdentController;
import nl.rls.composer.controller.TractionInTrainController;
import nl.rls.composer.controller.TrainCompositionJourneySectionController;
import nl.rls.composer.controller.WagonInTrainController;
import nl.rls.composer.domain.TractionInTrain;
import nl.rls.composer.domain.TrainCompositionJourneySection;
import nl.rls.composer.domain.WagonInTrain;
import nl.rls.composer.domain.code.TrainActivityType;
import nl.rls.composer.rest.dto.TractionInTrainDto;
import nl.rls.composer.rest.dto.TrainActivityTypeDto;
import nl.rls.composer.rest.dto.TrainCompositionJourneySectionDto;
import nl.rls.composer.rest.dto.TrainCompositionJourneySectionPostDto;
import nl.rls.composer.rest.dto.WagonInTrainDto;

public class TrainCompositionJourneySectionDtoMapper {

	public static TrainCompositionJourneySectionDto map(TrainCompositionJourneySection entity) {
		DozerBeanMapper mapper = new DozerBeanMapper();
		BeanMappingBuilder mappingBuilder = new BeanMappingBuilder() {
			protected void configure() {
				mapping(TrainCompositionJourneySection.class, TrainCompositionJourneySectionDto.class)
				.fields("trainRunningData.exceptionalGaugingInd", "exceptionalGaugingInd")
				.fields("trainRunningData.dangerousGoodsIndicator", "dangerousGoodsIndicator")
				.fields("trainRunningData", "trainRunningData", FieldsMappingOptions.customConverter("nl.rls.composer.rest.dto.mapper.TrainRunningDataConverter"))

				;
			}
		};
		mapper.addMapping(mappingBuilder);
		TrainCompositionJourneySectionDto dto = mapper.map(entity, TrainCompositionJourneySectionDto.class);

		List<TractionInTrainDto> dtoList = new ArrayList<TractionInTrainDto>();
		for (TractionInTrain tractionInTrain : entity.getTractions()) {
			TractionInTrainDto tractionInTrainDto = new TractionInTrainDto();
			tractionInTrainDto.setLocomotive(TractionDtoMapper.map(tractionInTrain.getTraction()));
			tractionInTrainDto.setDriverIndication(tractionInTrain.getDriverIndication());
			tractionInTrainDto.setTractionPositionInTrain(tractionInTrain.getTractionPositionInTrain());
			dtoList.add(tractionInTrainDto);
		}
		dto.setTractions(dtoList);

		List<WagonInTrainDto> wagonDtoList = new ArrayList<WagonInTrainDto>();
		System.out.println("entity.getWagons(): "+entity.getWagons());
		for (WagonInTrain wagonInTrain : entity.getWagons()) {
			WagonInTrainDto wagonInTrainDto = WagonInTrainDtoMapper.map(wagonInTrain);
			wagonDtoList.add(wagonInTrainDto);
		}
		dto.setWagons(wagonDtoList);
		
		List<TrainActivityTypeDto> trainActivityTypeDtoList = new ArrayList<TrainActivityTypeDto>();
		for (TrainActivityType trainActivityType : entity.getActivities()) {
			TrainActivityTypeDto trainActivityTypeDto = TrainActivityTypeDtoMapper.map(trainActivityType);
			trainActivityTypeDtoList.add(trainActivityTypeDto);
		}
		dto.setActivities(trainActivityTypeDtoList);

		dto.add(linkTo(methodOn(CompanyController.class).getById(entity.getJourneySection().getResponsibilityActualSection().getResponsibleRU().getId())).withRel("responsibilityActualSectionRU").withTitle(entity.getJourneySection().getResponsibilityActualSection().getResponsibleRU().getName()));
		dto.add(linkTo(methodOn(CompanyController.class).getById(entity.getJourneySection().getResponsibilityActualSection().getResponsibleIM().getId())).withRel("responsibilityActualSectionIM").withTitle(entity.getJourneySection().getResponsibilityActualSection().getResponsibleIM().getName()));
		dto.add(linkTo(methodOn(CompanyController.class).getById(entity.getJourneySection().getResponsibilityNextSection().getResponsibleRU().getId())).withRel("responsibilityNextSectionRU").withTitle(entity.getJourneySection().getResponsibilityNextSection().getResponsibleRU().getName()));
		dto.add(linkTo(methodOn(CompanyController.class).getById(entity.getJourneySection().getResponsibilityNextSection().getResponsibleIM().getId())).withRel("responsibilityNextSectionIM").withTitle(entity.getJourneySection().getResponsibilityNextSection().getResponsibleIM().getName()));
		dto.add(linkTo(methodOn(LocationIdentController.class).getById(entity.getJourneySection().getJourneySectionOrigin().getLocationPrimaryCode())).withRel("journeySectionOrigin").withTitle(entity.getJourneySection().getJourneySectionOrigin().getPrimaryLocationName()));
		dto.add(linkTo(methodOn(LocationIdentController.class).getById(entity.getJourneySection().getJourneySectionDestination().getLocationPrimaryCode())).withRel("journeySectionDestination").withTitle(entity.getJourneySection().getJourneySectionDestination().getPrimaryLocationName()));

		dto.add(linkTo(methodOn(WagonInTrainController.class).getAllWagonInTrain(entity.getId())).withRel("wagons"));
		dto.add(linkTo(methodOn(TractionInTrainController.class).getAllTractionInTrain(entity.getId())).withRel("tractions"));

		dto.add(linkTo(methodOn(TrainCompositionJourneySectionController.class).getById(entity.getId())).withSelfRel());
		return dto;
	}

	public static TrainCompositionJourneySection map(TrainCompositionJourneySectionPostDto dto) {
		DozerBeanMapper mapper = new DozerBeanMapper();
		BeanMappingBuilder mappingBuilder = new BeanMappingBuilder() {
			protected void configure() {
			}
		};
		mapper.addMapping(mappingBuilder);
		TrainCompositionJourneySection entity = mapper.map(dto, TrainCompositionJourneySection.class);
		return entity;
	}

}
