package com.xyz.bus;

import com.xyz.model.Adres;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Nursen on 6.03.2017.
 */
public interface IAdresRepository extends JpaRepository<Adres,Integer> {
}
