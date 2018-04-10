package kz.kaznitu.lessons.repositories;

import kz.kaznitu.lessons.models.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepositories extends JpaRepository<TestModel, Integer>{

}
