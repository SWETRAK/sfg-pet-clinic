package pl.swetrak.sfgpetclinic.services.map;

import pl.swetrak.sfgpetclinic.model.Pet;
import pl.swetrak.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstarctMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
