package nl.rls.ci.aa.controller;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ci.aa.domain.License;
import nl.rls.ci.aa.domain.Owner;
import nl.rls.ci.aa.dto.OwnerDto;
import nl.rls.ci.aa.dto.OwnerDtoMapper;
import nl.rls.ci.aa.dto.OwnerDtoPost;
import nl.rls.ci.aa.repository.LicenseRepository;
import nl.rls.ci.aa.repository.OwnerRepository;

@RestController
@RequestMapping("/aa/owners")
public class OwnerController {
	@Autowired
    private OwnerRepository ownerRepository;
	@Autowired
	private LicenseRepository licenseRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Resources<OwnerDto>> getAll() {
		Iterable<Owner> ownerList = ownerRepository.findAll();
		List<OwnerDto> owners = new ArrayList<OwnerDto>();
		for (Owner owner : ownerList) {
			owners.add(OwnerDtoMapper.map(owner));
		}
	    Link ownersLink = linkTo(methodOn(OwnerController.class).getAll()).withSelfRel();
		Resources<OwnerDto> resourceList = new Resources<OwnerDto>(owners, ownersLink);
		return ResponseEntity.ok(resourceList);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<OwnerDto> getOwner(@PathVariable Integer id) {
		Optional<Owner> owner = ownerRepository.findById(id);
		if (!owner.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(OwnerDtoMapper.map(owner.get()));
	}
	
	@Transactional
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> postOwner(@RequestBody OwnerDtoPost dto) {
		Owner owner = OwnerDtoMapper.map(dto);
		Calendar now = Calendar.getInstance();
		Calendar now3 = Calendar.getInstance();
		now3.add(Calendar.MONTH, 3); 
		ownerRepository.save(owner);
		License license = new License(License.LICENSE_FREE, now.getTime(), now3.getTime(), owner);
		licenseRepository.save(license);
		owner.getLicenses().add(license);
		ownerRepository.save(owner);
		return ResponseEntity.created(linkTo(methodOn(OwnerController.class).getOwner(owner.getId())).toUri()).build();
	}

}