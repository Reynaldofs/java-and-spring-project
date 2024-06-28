package com.backend.api.repositories;

import com.backend.api.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface addressRepository extends JpaRepository<Address, UUID> {
}
