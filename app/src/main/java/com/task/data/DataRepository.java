package com.task.data;

import com.task.data.local.LocalRepository;
import com.task.data.remote.ApiRepository;
import com.task.data.remote.ServiceResponse;

import javax.inject.Inject;

/**
 * Created by AhmedEltaher on 5/12/2016
 */

public class DataRepository {
    private ApiRepository apiRepository;
    private LocalRepository localRepository;

    @Inject
    public DataRepository(ApiRepository apiRepository, LocalRepository localRepository) {
        this.apiRepository = apiRepository;
        this.localRepository = localRepository;
    }

    public ServiceResponse requestNews() {
        return apiRepository.getNews();
    }
}
