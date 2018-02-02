package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Bootcamp;

import java.util.ArrayList;

public interface BootcampService {

    Bootcamp findById(Integer id);

    void addBootcamp(Bootcamp bootcamp);

    ArrayList<Bootcamp> getAllBootcamps();

    void removeBootcamp(Integer id);
}
