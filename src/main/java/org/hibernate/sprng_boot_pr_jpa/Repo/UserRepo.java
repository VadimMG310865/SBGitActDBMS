package org.hibernate.sprng_boot_pr_jpa.Repo;



import org.hibernate.sprng_boot_pr_jpa.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Users, Integer> {
    boolean findById(Users iduser);
}
