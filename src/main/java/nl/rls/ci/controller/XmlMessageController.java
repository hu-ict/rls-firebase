package nl.rls.ci.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.rls.ci.aa.security.SecurityContext;
import nl.rls.ci.domain.XmlMessage;
import nl.rls.ci.url.BaseURL;
import nl.rls.composer.repository.XmlMessageRepository;

@RestController
@RequestMapping(BaseURL.BASE_PATH+XmlMessageController.PATH)
public class XmlMessageController {
	public static final String PATH = "xmlmessages";
	@Autowired
	private SecurityContext securityContext;
	@Autowired
	private XmlMessageRepository xmlMessageRepository;
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	@Transactional
	public ResponseEntity<String> getById(@PathVariable Integer id) {
		int ownerId = securityContext.getOwnerId();
		Optional<XmlMessage> xmlMessage = xmlMessageRepository.findByIdAndOwnerId(id, ownerId);
		System.out.println("xmlMessage: "+ xmlMessage.get().getId());
		if (xmlMessage.isPresent()) {
			return ResponseEntity.ok(xmlMessage.get().getMessage());
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
