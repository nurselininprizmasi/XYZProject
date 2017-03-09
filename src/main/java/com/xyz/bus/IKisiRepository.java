package com.xyz.bus;

import com.xyz.model.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Nursen on 27.02.2017.
 */
public interface IKisiRepository extends JpaRepository<Kisi,Integer> {
}
