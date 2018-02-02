package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Bootcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MockBootcampService implements BootcampService {
    private Map<Integer, Bootcamp> bootcamps;

    public MockBootcampService() {

        bootcamps = new HashMap<>();
    }

    @Override
    public void addBootcamp(Bootcamp bootcamp) {
        if (!bootcamps.containsKey(bootcamp.getId())) {
            bootcamps.put(bootcamp.getId(), bootcamp);
        }
    }


    public Map<Integer, Bootcamp> printBootcamps() {
        return bootcamps;
    }

    @Override
    public Bootcamp findById(Integer id) {
        return bootcamps.get(id);
    }  //the # of the bootcamp


    public Map<Integer, Bootcamp> getBootcamps() {
        return bootcamps;
    }

    @Override
    public ArrayList<Bootcamp> getAllBootcamps() {
        return new ArrayList<>(bootcamps.values());
    }

    @Override
    public void removeBootcamp(Integer id) {
        bootcamps.remove(id);

    }

    public void setBootcamps(Map<Integer, Bootcamp> bootcamps) {
        this.bootcamps = bootcamps;
    }
}