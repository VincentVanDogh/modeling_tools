package at.ac.tuwien.sepm.groupphase.backend.datagenerator;

import org.springframework.stereotype.Component;

@Component
public class TicketDataGenerator {/*
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private final EventRepository eventRepository;
    private final ActRepository actRepository;
    private final StageRepository stageRepository;
    private final SectorRepository sectorRepository;
    private final SectorMapRepository sectorMapRepository;
    private final LocationRepository locationRepository;
    private final AddressRepository addressRepository;

    public TicketDataGenerator(EventRepository eventRepository,
                               ActRepository actRepository,
                               StageRepository stageRepository,
                               SectorRepository sectorRepository,
                               SectorMapRepository sectorMapRepository,
                               LocationRepository locationRepository,
                               AddressRepository addressRepository) {
        this.eventRepository = eventRepository;
        this.actRepository = actRepository;
        this.stageRepository = stageRepository;
        this.sectorRepository = sectorRepository;
        this.sectorMapRepository = sectorMapRepository;
        this.locationRepository = locationRepository;
        this.addressRepository = addressRepository;
    }

    @PostConstruct
    private void generateEvents() {
        if (addressRepository.findAll().size() <= 0) {
            generateAddress(1L, "Favoritenstrasse 8", "Vienna", "Austria", 1111, null);
            generateAddress(1L, "Gusshausstrasse 3", "Vienna", "Austria", 2222, null);
        } else LOGGER.debug("Address already generated");

        if (locationRepository.findAll().size() <= 0) {
            generateLocation(1L, "AudiMax", null);
            generateLocation(2L, "Allianz Arena", null);
        } else LOGGER.debug("Locations already generated");

        System.out.println();
        // Location tmp = locationRepository.getReferenceById(1L);
        System.out.println(locationRepository.existsById(1L));
        System.out.println(locationRepository.existsById(1000L));
        System.out.println(locationRepository.findAll().get(0).toString());
        System.out.println("FINDING LOCATIONS BY ADDRESS ID");
        System.out.println(locationRepository.findLocationByAddressId(1L));
        System.out.println(addressRepository.getAddressById(1L).getLocation());
        System.out.println(addressRepository.getAddressById(1L).getCity());
        System.out.println();
        System.out.println(locationRepository.getReferenceById(1L).getId());
        System.out.println();*/
        /*
        locationRepository.getReferenceById(1L).setAddress(addressRepository.getReferenceById(1L));
        locationRepository.getReferenceById(2L).setAddress(addressRepository.getReferenceById(2L));

        addressRepository.getReferenceById(1L).setLocation(locationRepository.getReferenceById(1L));
        addressRepository.getReferenceById(2L).setLocation(locationRepository.getReferenceById(2L));
         */

        /*if (eventRepository.findAll().size() <= 0) {
            generateEvent(1L, "Alfa's Birthday", "Celebration of his achievements", EventType.CONCERT,
                    60, locationRepository.getReferenceById(1L));
            generateEvent(2L, "Bravo's Concert", "Rock'n Roll", EventType.SPORT,
                    90, locationRepository.getReferenceById(2L));
        } else LOGGER.debug("Events already generated");

    }

    // Could be useful for when generating locations
    private void generateAddress(Long id, String street, String city, String country, int postalCode, Location location) {
        Address address = Address.AddressBuilder.anAddress()
                .withId(id)
                .withStreet(street)
                .withCity(city)
                .withPostalCode(postalCode)
                .withCountry(country)
                .withLocation(location)
                .build();
        LOGGER.debug("Saving address{}", address);
        addressRepository.save(address);
    }

    private void generateLocation(Long id, String venueName, Address address) {
        Location location = Location.LocationBuilder.aLocation()
                .withId(id)
                .withVenueName(venueName)
                .withAddress(address)
                .build();
        LOGGER.debug("Saving location{}", location);
        locationRepository.save(location);
    }

    private void generateEvent(Long id, String name, String description, EventType type, int duration, Location location) {
        Event event = Event.EventBuilder.anEvent()
                .withId(id)
                .withName(name)
                .withDescription(description)
                .withType(type)
                .withDuration(duration)
                .withLocation(location)
                .build();
        LOGGER.debug("Saving event{}", event);
        eventRepository.save(event);
    }*/
}
