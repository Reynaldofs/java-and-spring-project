package com.backend.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.api.domain.cupom.Cupon;
import java.util.UUID;

public interface CouponRepository extends JpaRepository<Cupon, UUID> {
}
