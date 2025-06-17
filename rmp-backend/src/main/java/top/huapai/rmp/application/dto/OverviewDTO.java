package top.huapai.rmp.application.dto;

import lombok.Data;

/**
 * @author Cassian Florin
 * @Email flowercard591@gmail.com
 * @Date 2025/5/10 11:16
 * @Description 概览数据传输对象
 */
@Data
public class OverviewDTO {

    /**
     * Redis 实例名称
     */
    private String name;

    /**
     * Redis 实例已使用的内存
     */
    private Long usedMemory;

    /**
     * Redis 实例总KEY数量
     */
    private Long totalKeys;

    /**
     * Redis 实例连接的客户端数量
     */
    private Long connectedClients;

    /**
     * Redis 实例命中率
     */
    private Double hitRate;

}
