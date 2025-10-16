package com.example.learning.service.impl.warehouse;

import com.example.learning.service.user.UserQueryService;
import com.example.learning.service.warehouse.WarehouseQueryService;
import com.example.learning.service.warehouse.WarehouseUpdateService;
import org.springframework.stereotype.Service;

@Service
public class WarehouseUpdateServiceImpl implements WarehouseUpdateService {
    private final UserQueryService userQueryService;

    private final WarehouseQueryService warehouseQueryService;

    //依赖注入：构造函数注入
    public WarehouseUpdateServiceImpl(UserQueryService userQueryService, WarehouseQueryService warehouseQueryService) {
        this.userQueryService = userQueryService;
        this.warehouseQueryService = warehouseQueryService;
    }
}
