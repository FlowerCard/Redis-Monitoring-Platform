package top.huapai.rmp.infrastructure.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import top.huapai.rmp.domain.model.RedisInstance;
import top.huapai.rmp.domain.service.RedisMonitorDomainService;

/**
 * @author Cassian Florin
 * @Email flowercard591@gmail.com
 * @Date 2025/5/10 11:14
 * @Description Mock Redis 客户端
 */
@Service
public class MockRedisClient implements RedisMonitorDomainService {
    @Override
    public List<RedisInstance> fetchAllInstancesStatus() {
        List<RedisInstance> list = new ArrayList<>();
        RedisInstance redisInstanceA = new RedisInstance("1", "Redis-A", "127.0.0.1", "6379", 1024L, 1000L, 10L, 0.9);
        RedisInstance redisInstanceB = new RedisInstance("2", "Redis-B", "127.0.0.1", "6379", 1024L, 1000L, 10L, 0.9);
        return List.of(redisInstanceA, redisInstanceB);
    }
}
