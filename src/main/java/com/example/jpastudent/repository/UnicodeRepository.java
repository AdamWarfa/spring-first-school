package com.example.jpastudent.repository;

import com.example.jpastudent.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {
    Unicode findByUnicode(int unicode);

}
