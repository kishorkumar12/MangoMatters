package com.prkat.mangomatters.service;

import com.prkat.mangomatters.model.OrchardDto;
import com.prkat.mangomatters.repository.OrchardRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface OrchardService {
@Autowired

    public OrchardDto saveOrchard();


}
