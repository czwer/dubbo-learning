package com.example.learning.service.impl.warehouse;

import com.example.learning.service.user.UserQueryService;
import com.example.learning.service.warehouse.WarehouseQueryService;
import org.springframework.stereotype.Service;

@Service
public class WarehouseQueryServiceImpl implements WarehouseQueryService {
    private final UserQueryService userQueryService;

    //依赖注入：构造函数注入
    public WarehouseQueryServiceImpl(UserQueryService userQueryService) {
        this.userQueryService = userQueryService;
    }
}
