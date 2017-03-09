package com.xyz.bus;

import com.xyz.model.Birim;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Nursen on 4.03.2017.
 */
public interface IBirimRepository extends JpaRepository<Birim,Integer> {
}
