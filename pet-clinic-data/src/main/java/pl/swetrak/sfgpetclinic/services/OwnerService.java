package pl.swetrak.sfgpetclinic.services;

import pl.swetrak.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
