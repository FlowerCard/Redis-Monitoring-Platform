package top.huapai.rmp.interfaces.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import top.huapai.rmp.application.dto.OverviewDTO;
import top.huapai.rmp.application.service.OverviewAppService;
import top.huapai.rmp.common.ApiResponse;

/**
 * @author Cassian Florin
 * @Email flowercard591@gmail.com
 * @Date 2025/5/10 11:27
 * @Description 概览控制器
 */
@RestController
@RequestMapping("/api/overview")
@AllArgsConstructor
public class OverviewController {

    private final OverviewAppService overviewAppService;

    /**
     * 获取系统概览
     * 
     * @return 概览数据传输对象列表
     */
    @GetMapping
    public ApiResponse<List<OverviewDTO>> getSystemOverview() {
        // 调用概览应用服务获取系统概览
        return ApiResponse.success(overviewAppService.getSystemOverview());
    }

}
