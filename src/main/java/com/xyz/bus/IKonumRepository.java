package com.xyz.bus;

import com.xyz.model.Konum;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Nursen on 4.03.2017.
 */
public interface IKonumRepository extends JpaRepository<Konum,Integer> {
}
