package top.huapai.rmp.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author HuaPai
 * @Email flowercard591@gmail.com
 * @Date 2025/5/10 11:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RedisInstance {

    /**
     * Redis instance ID（Redis 实例 ID）
     */
    private String id;

    /**
     * Redis instance name（Redis 实例名称）
     */
    private String name;

    /**
     * Redis instance host（Redis 实例主机地址）
     */
    private String host;

    /**
     * Redis instance port（Redis 实例端口）
     */
    private String port;

    /**
     * Redis instance used memory（Redis 实例已使用内存）
     */
    private Long usedMemory;

    /**
     * Redis instance total keys（Redis 总Key数量）
     */
    private Long totalKeys;

    /**
     * Redis instance connected clients（Redis 实例连接的客户端数量）
     */
    private Long connectedClients;

    /**
     * Redis instance hit rate（Redis 实例命中率）
     */
    private Double hitRate;

}
