package org.hibernate.sprng_boot_pr_jpa.Repo;



import org.hibernate.sprng_boot_pr_jpa.entity.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepo extends CrudRepository<Orders, Integer> {
    boolean findById(Orders idorder);

}
