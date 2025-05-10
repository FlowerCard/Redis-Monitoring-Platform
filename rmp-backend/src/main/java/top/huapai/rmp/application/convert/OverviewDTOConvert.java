package top.huapai.rmp.application.convert;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import top.huapai.rmp.application.dto.OverviewDTO;
import top.huapai.rmp.domain.model.RedisInstance;

/**
 * @Author HuaPai
 * @Email flowercard591@gmail.com
 * @Date 2025/5/10 11:24
 * @Description 概览数据传输对象转换器
 */
@Mapper
public interface OverviewDTOConvert {

    OverviewDTOConvert INSTANCE = Mappers.getMapper(OverviewDTOConvert.class);

    /**
     * 将 Redis 实例转换为概览数据传输对象
     *
     * @param instance Redis 实例
     * @return 概览数据传输对象
     */
    @Mappings({@Mapping(source = "name", target = "name"), @Mapping(source = "usedMemory", target = "usedMemory"),
        @Mapping(source = "totalKeys", target = "totalKeys"),
        @Mapping(source = "connectedClients", target = "connectedClients"),
        @Mapping(source = "hitRate", target = "hitRate"),})
    OverviewDTO toOverviewDTO(RedisInstance instance);

    /**
     * 将 Redis 实例列表转换为概览数据传输对象列表
     *
     * @param instanceList Redis 实例列表
     * @return 概览数据传输对象列表
     */
    List<OverviewDTO> toOverviewDTOList(List<RedisInstance> instanceList);

    /**
     * 将概览数据传输对象转换为 Redis 实例
     *
     * @param dto 概览数据传输对象
     * @return Redis 实例
     */
    RedisInstance toRedisInstance(OverviewDTO dto);

}
