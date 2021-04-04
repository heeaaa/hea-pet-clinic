package com.devsdayoff.heapetclinic.service;

import com.devsdayoff.heapetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
