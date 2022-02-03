package com.frow.designers.Repository;

import com.frow.designers.Model.Designers;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesignersRepo {
    List<Designers> findDesignersByLine(String designersLine);

    List<Designers> findAll();
}
