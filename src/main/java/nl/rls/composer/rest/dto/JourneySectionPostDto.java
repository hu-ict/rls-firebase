package nl.rls.composer.rest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class JourneySectionPostDto {
    private String journeySectionOrigin;
    private String journeySectionDestination;
    private String responsibilityActualSection;
    private String responsibilityNextSection;
}
