package top.huapai.rmp.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import top.huapai.rmp.application.convert.OverviewDTOConvert;
import top.huapai.rmp.application.dto.OverviewDTO;
import top.huapai.rmp.domain.model.RedisInstance;
import top.huapai.rmp.domain.service.RedisMonitorDomainService;

/**
 * @author Cassian Florin
 * @Email flowercard591@gmail.com
 * @Date 2025/5/10 11:20
 * @Description 概览应用服务
 */
@Service
@AllArgsConstructor
public class OverviewAppService {

    private final RedisMonitorDomainService redisMonitorDomainService;

    /**
     * 获取系统概览
     * 
     * @return 概览数据传输对象列表
     */
    public List<OverviewDTO> getSystemOverview() {
        // 调用 Redis 监控域服务获取所有实例状态
        List<RedisInstance> redisInstances = redisMonitorDomainService.fetchAllInstancesStatus();
        return OverviewDTOConvert.INSTANCE.toOverviewDTOList(redisInstances);
    }

}
