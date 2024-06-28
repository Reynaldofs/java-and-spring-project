package com.backend.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.api.domain.event.Event;
import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {

}
