package top.huapai.rmp.domain.service;

import java.util.List;

import top.huapai.rmp.domain.model.RedisInstance;

/**
 * @author Cassian Florin
 * @Email flowercard591@gmail.com
 * @Date 2025/5/10 11:12
 * @Description Redis 监控域服务
 */
public interface RedisMonitorDomainService {

    /**
     * 获取所有实例状态
     * 
     * @return Redis 实例列表
     */
    List<RedisInstance> fetchAllInstancesStatus();

}
