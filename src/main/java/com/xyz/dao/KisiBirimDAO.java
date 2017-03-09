package com.xyz.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Nursen on 3.03.2017.
 */
@Repository
@Transactional
public class KisiBirimDAO implements IKisiBirimDAO{
    @PersistenceContext
    EntityManager em;
}
